package com.ericsson.ci.ejbservice.domain;

import java.io.Serializable;

public class DrawerStub implements Serializable {

	private static final long serialVersionUID = 7606029835434524844L;

	private String identifier;
	private String country;
	private String period;
	private int startYear;
	private int endYear;
	private String denominationWhole;
	private String denominationPart;

	public DrawerStub() {
		this(null, null, null, 0, 0, null, null);
	}

	public DrawerStub(String identifier, String country, String period, int startYear, int endYear, String denominationWhole, String denominationPart) {
		this.identifier = identifier;
		this.country = country;
		this.period = period;
		this.startYear = startYear;
		this.endYear = endYear;
		this.denominationWhole = denominationWhole;
		this.denominationPart = denominationPart;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public int getStartYear() {
		return this.startYear;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	public int getEndYear() {
		return this.endYear;
	}

	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}

	public String getDenominationWhole() {
		return this.denominationWhole;
	}

	public void setDenominationWhole(String denominationWhole) {
		this.denominationWhole = denominationWhole;
	}

	public String getDenominationPart() {
		return this.denominationPart;
	}

	public void setDenominationPart(String denominationPart) {
		this.denominationPart = denominationPart;
	}

	@Override
	public String toString() {
		return "DrawerStub [identifier=" + this.identifier + ", country=" + this.country + ", period=" + this.period + ", startYear=" + this.startYear
				+ ", endYear=" + this.endYear + ", denominationWhole=" + this.denominationWhole + ", denominationPart=" + this.denominationPart + "]";
	}

}
