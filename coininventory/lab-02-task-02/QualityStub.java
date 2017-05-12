package com.ericsson.ci.ejbservice.domain;

public enum QualityStub {

	PO("Poor"),
	FR("Fair"),
	AG("Almost Good"),
	G("Good"),
	VG("Very Good"),
	F("Fine"),
	VF("Very Fine"),
	EF("Extremely Fine"),
	AU("About Uncirculated"),
	UNC("Uncirculated"),
	BU("Brilliant Uncirculated"),
	PP("Polierte Platte");

	private final String label;

	private QualityStub(String label) {
		this.label = label;
	}

	public String getLabel() {
		return this.label;
	}

}
