package com.ericsson.ci.ejbservice.converter;

import javax.ejb.Local;

import com.ericsson.ci.ejbservice.domain.SwapCoinStub;
import com.ericsson.ci.ejbservice.exception.StubConverterException;

@Local
public interface SwapMessageConverter {

	SwapCoinStub from(String jmsMessage) throws StubConverterException;

}
