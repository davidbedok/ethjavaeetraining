package com.ericsson.ci.ejbmanagement.domain;

import java.util.Date;

public class FailureStub {

	private ComponentStub component;
	private String className;
	private String details;
	private Date timestamp;

	public FailureStub(ComponentStub component, String className, String details) {
		super();
		this.component = component;
		this.className = className;
		this.details = details;
		this.timestamp = new Date();
	}

	public ComponentStub getComponent() {
		return this.component;
	}

	public void setComponent(ComponentStub component) {
		this.component = component;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "FailureStub [component=" + this.component + ", className=" + this.className + ", details=" + this.details + ", timestamp=" + this.timestamp
				+ "]";
	}

}
