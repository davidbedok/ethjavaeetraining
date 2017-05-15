package com.ericsson.ci.ejbserviceclient.domain;

import java.io.Serializable;

public class CoinStub implements Serializable {

	private static final long serialVersionUID = -5796410003037896957L;

	private String catalogNumber;
	private DrawerStub drawer;
	private int issuingYear;
	private int value;
	private boolean whole;
	private String description;
	private String observe;
	private String reverse;
	private double weight;
	private CoinTypeStub type;
	private QualityStub quality;
	private int quantity;

	public CoinStub(String catalogNumber, DrawerStub drawer, int issuingYear, int value, boolean whole, String description, String observe, String reverse,
			double weight, CoinTypeStub type, QualityStub quality, int quantity) {
		super();
		this.catalogNumber = catalogNumber;
		this.drawer = drawer;
		this.issuingYear = issuingYear;
		this.value = value;
		this.description = description;
		this.observe = observe;
		this.reverse = reverse;
		this.weight = weight;
		this.type = type;
		this.quality = quality;
		this.quantity = quantity;
		this.whole = whole;
	}

	public String getCatalogNumber() {
		return this.catalogNumber;
	}

	public void setCatalogNumber(String catalogNumber) {
		this.catalogNumber = catalogNumber;
	}

	public DrawerStub getDrawer() {
		return this.drawer;
	}

	public void setDrawer(DrawerStub drawer) {
		this.drawer = drawer;
	}

	public int getIssuingYear() {
		return this.issuingYear;
	}

	public void setIssuingYear(int issuingYear) {
		this.issuingYear = issuingYear;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getObserve() {
		return this.observe;
	}

	public void setObserve(String observe) {
		this.observe = observe;
	}

	public String getReverse() {
		return this.reverse;
	}

	public void setReverse(String reverse) {
		this.reverse = reverse;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public CoinTypeStub getType() {
		return this.type;
	}

	public void setType(CoinTypeStub type) {
		this.type = type;
	}

	public QualityStub getQuality() {
		return this.quality;
	}

	public void setQuality(QualityStub quality) {
		this.quality = quality;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isWhole() {
		return this.whole;
	}

	public void setWhole(boolean whole) {
		this.whole = whole;
	}

	public String getFullName() {
		return this.value + " " + this.getDenomination();
	}

	public String getDenomination() {
		return this.drawer.getDenomination(this.whole);
	}

	@Override
	public String toString() {
		return "CoinStub [catalogNumber=" + this.catalogNumber + ", drawer=" + this.drawer + ", issuingYear=" + this.issuingYear + ", value=" + this.value
				+ ", description=" + this.description + ", observe=" + this.observe + ", reverse=" + this.reverse + ", weight=" + this.weight + ", type="
				+ this.type + ", quality=" + this.quality + ", quantity=" + this.quantity + ", whole=" + this.whole + "]";
	}

}
