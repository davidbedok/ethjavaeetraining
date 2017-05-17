package com.ericsson.ci.ejbservice.domain;

import com.ericsson.ci.ejbserviceclient.domain.QualityStub;

public class SwapCoinStub {

	private String sellerUserName;
	private String catalogNumber;
	private QualityStub quality;
	private String buyerUserName;

	public SwapCoinStub(String sellerUserName, String catalogNumber, QualityStub quality, String buyerUserName) {
		super();
		this.sellerUserName = sellerUserName;
		this.catalogNumber = catalogNumber;
		this.quality = quality;
		this.buyerUserName = buyerUserName;
	}

	public String getSellerUserName() {
		return this.sellerUserName;
	}

	public void setSellerUserName(String sellerUserName) {
		this.sellerUserName = sellerUserName;
	}

	public String getCatalogNumber() {
		return this.catalogNumber;
	}

	public void setCatalogNumber(String catalogNumber) {
		this.catalogNumber = catalogNumber;
	}

	public QualityStub getQuality() {
		return this.quality;
	}

	public void setQuality(QualityStub quality) {
		this.quality = quality;
	}

	public String getBuyerUserName() {
		return this.buyerUserName;
	}

	public void setBuyerUserName(String buyerUserName) {
		this.buyerUserName = buyerUserName;
	}

	@Override
	public String toString() {
		return "SwapCoinStub [sellerUserName=" + this.sellerUserName + ", catalogNumber=" + this.catalogNumber + ", quality=" + this.quality
				+ ", buyerUserName=" + this.buyerUserName + "]";
	}

}
