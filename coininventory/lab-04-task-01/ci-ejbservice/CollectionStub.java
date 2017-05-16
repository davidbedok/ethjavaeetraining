package com.ericsson.ci.ejbservice.domain;

import com.ericsson.ci.ejbserviceclient.domain.CoinStub;
import com.ericsson.ci.ejbserviceclient.domain.QualityStub;

public class CollectionStub {

	private CoinStub coin;
	private QualityStub quality;
	private int quantity;

	public CollectionStub(CoinStub coin, QualityStub quality, int quantity) {
		super();
		this.coin = coin;
		this.quality = quality;
		this.quantity = quantity;
	}

	public CoinStub getCoin() {
		return this.coin;
	}

	public void setCoin(CoinStub coin) {
		this.coin = coin;
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

	@Override
	public String toString() {
		return "CollectionStub [coin=" + this.coin + ", quality=" + this.quality + ", quantity=" + this.quantity + "]";
	}

}
