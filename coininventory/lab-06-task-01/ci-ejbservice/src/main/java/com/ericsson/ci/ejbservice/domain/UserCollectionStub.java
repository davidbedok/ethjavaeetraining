package com.ericsson.ci.ejbservice.domain;

import com.ericsson.ci.ejbserviceclient.domain.CoinStub;
import com.ericsson.ci.ejbserviceclient.domain.QualityStub;

public class UserCollectionStub extends CollectionStub {

	private CollectorStub collector;

	public UserCollectionStub(CollectorStub collector, CoinStub coin, QualityStub quality, int quantity) {
		super(coin, quality, quantity);
		this.collector = collector;
	}

	public CollectorStub getCollector() {
		return this.collector;
	}

	public void setCollector(CollectorStub collector) {
		this.collector = collector;
	}

	@Override
	public String toString() {
		return "UserCollectionStub [collector=" + this.collector + ", " + super.toString() + "]";
	}

}
