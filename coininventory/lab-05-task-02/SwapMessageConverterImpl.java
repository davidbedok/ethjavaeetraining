package com.ericsson.ci.ejbservice.converter;

import javax.ejb.Stateless;

import com.ericsson.ci.ejbservice.domain.SwapCoinStub;
import com.ericsson.ci.ejbservice.exception.StubConverterException;
import com.ericsson.ci.ejbserviceclient.domain.QualityStub;

@Stateless
public class SwapMessageConverterImpl implements SwapMessageConverter {

	private static final String MESSAGE_SEPARATOR = ";";

	@Override
	public SwapCoinStub from(String jmsMessage) throws StubConverterException {
		try {
			final String[] parts = jmsMessage.split(MESSAGE_SEPARATOR);
			String sellerUserName = parts[0];
			String catalogNumber = parts[1];
			QualityStub quality = QualityStub.valueOf(parts[2]);
			String buyerUserName = parts[3];
			return new SwapCoinStub(sellerUserName, catalogNumber, quality, buyerUserName);
		} catch (Exception e) {
			throw new StubConverterException(
					"Cannot convert JMS message into SwapCoinStub (" + jmsMessage + "). Expected format: seller;catalogNumber;quality;buyer");
		}
	}

}
