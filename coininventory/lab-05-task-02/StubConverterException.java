package com.ericsson.ci.ejbservice.exception;

public class StubConverterException extends Exception {

	private static final long serialVersionUID = 6791823269155412515L;

	public StubConverterException(String message) {
		super(message);
	}

	public StubConverterException(String message, Throwable cause) {
		super(message, cause);
	}

}
