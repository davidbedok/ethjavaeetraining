package com.ericsson.diskstore.client;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;

import com.ericsson.ci.ejbserviceclient.InventoryService;
import com.ericsson.ci.ejbserviceclient.domain.CoinStub;
import com.ericsson.ci.ejbserviceclient.exception.FacadeException;

public class CoinInventoryClient {

	private static final String JBOSS_INITIAL_CONTEXT_FACTORY = "org.jboss.naming.remote.client.InitialContextFactory";
	private static final String JBOSS_PROVIDER_URL = "remote://localhost:4447";
	private static final String JBOSS_URL_PKG_PREFIXES = "org.jboss.ejb.client.naming";

	private static final String JBOSS_NAMING_CLIENT_EJB_CONTEXT_KEY = "jboss.naming.client.ejb.context";
	private static final String JBOSS_NAMING_CLIENT_EJB_CONTEXT_VALUE = "true";

	private static final Logger LOGGER = Logger.getLogger(CoinInventoryClient.class);

	public static void main(final String[] args) throws Exception {
		new CoinInventoryClient().invoke("HUN");
	}

	private void invoke(String nationalIdentifier) {
		try {
			final InventoryService facade = this.lookup();
			List<CoinStub> coins = facade.getCoins(nationalIdentifier);
			for (CoinStub coin : coins) {
				LOGGER.info(coin);
			}
		} catch (final FacadeException e) {
			e.printStackTrace();
		} catch (final NamingException e) {
			e.printStackTrace();
		}
	}

	private InventoryService lookup() throws NamingException {
		final Hashtable<String, String> jndiProperties = new Hashtable<String, String>();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, JBOSS_INITIAL_CONTEXT_FACTORY);
		jndiProperties.put(Context.PROVIDER_URL, JBOSS_PROVIDER_URL);
		jndiProperties.put(Context.URL_PKG_PREFIXES, JBOSS_URL_PKG_PREFIXES);
		jndiProperties.put(JBOSS_NAMING_CLIENT_EJB_CONTEXT_KEY, JBOSS_NAMING_CLIENT_EJB_CONTEXT_VALUE);
		final Context context = new InitialContext(jndiProperties);
		return (InventoryService) context.lookup("ciapp/ciservices/CoinInventoryService!com.ericsson.ci.ejbserviceclient.InventoryService");
	}

}