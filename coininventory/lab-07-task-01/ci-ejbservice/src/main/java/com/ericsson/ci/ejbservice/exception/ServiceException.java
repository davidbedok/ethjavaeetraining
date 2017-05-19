package com.ericsson.ci.ejbservice.exception;

import com.ericsson.ci.ejbservice.domain.ErrorStub;
import com.ericsson.ci.ejbservice.util.ApplicationError;
import com.ericsson.ci.ejbserviceclient.exception.FacadeException;

public class ServiceException extends FacadeException {

	private static final long serialVersionUID = 6791823269155412515L;

	private final ApplicationError error;
	private final String field;

	public ServiceException(String message) {
		this(null, message, null);
	}

	public ServiceException(ApplicationError error, String message) {
		this(error, message, null);
	}

	public ServiceException(ApplicationError error, String message, String field) {
		this(error, message, null, field);
	}

	public ServiceException(ApplicationError error, String message, Throwable cause, String field) {
		super(message, cause);
		this.error = error;
		this.field = field;
	}

	public ApplicationError getErrorCode() {
		return this.error;
	}

	public ErrorStub build() {
		return this.error.build(this.field);
	}

}
