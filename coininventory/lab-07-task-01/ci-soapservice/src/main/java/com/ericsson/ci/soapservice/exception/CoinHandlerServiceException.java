package com.ericsson.ci.soapservice.exception;

import javax.xml.ws.WebFault;

import com.ericsson.ci.ejbservice.domain.ErrorStub;

@WebFault(name = "CoinHandlerServiceFault", targetNamespace = "http://www.ericsson.com/CoinHandler")
public class CoinHandlerServiceException extends Exception {

	private static final long serialVersionUID = 536014448507939548L;

	private final ErrorStub faultInfo;

	public CoinHandlerServiceException(String message, ErrorStub faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}

	public CoinHandlerServiceException(String message, ErrorStub faultInfo, Throwable cause) {
		super(message, cause);
		this.faultInfo = faultInfo;
	}

	public ErrorStub getFaultInfo() {
		return this.faultInfo;
	}

}
