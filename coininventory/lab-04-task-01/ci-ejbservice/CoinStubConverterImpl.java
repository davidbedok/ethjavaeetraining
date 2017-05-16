package com.ericsson.ci.ejbservice.converter;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.ericsson.ci.ejbserviceclient.domain.CoinStub;
import com.ericsson.ci.ejbserviceclient.domain.CoinTypeStub;
import com.ericsson.ci.ejbserviceclient.domain.DrawerStub;
import com.ericsson.ci.persistence.entity.Coin;

@Stateless
public class CoinStubConverterImpl implements CoinStubConverter {

	@EJB
	private DrawerStubConverter drawerStubConverter;

	@Override
	public CoinStub from(Coin coin) {
		DrawerStub drawer = this.drawerStubConverter.from(coin.getDrawer());
		CoinTypeStub type = CoinTypeStub.valueOf(coin.getCoinType().name());
		return new CoinStub(coin.getCatalogNumber(), drawer, coin.getIssuingYear(), coin.getValue(), coin.getWhole(), coin.getDescription(), coin.getObverse(),
				coin.getReverse(), coin.getWeight(), type);
	}

	@Override
	public List<CoinStub> from(List<Coin> coins) {
		List<CoinStub> result = new ArrayList<>();
		for (Coin coin : coins) {
			result.add(this.from(coin));
		}
		return result;
	}

}
