package com.ericsson.ci.ejbservice.converter;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.ericsson.ci.ejbservice.domain.CollectionStub;
import com.ericsson.ci.ejbservice.domain.CollectorStub;
import com.ericsson.ci.ejbservice.domain.UserCollectionStub;
import com.ericsson.ci.ejbserviceclient.domain.CoinStub;
import com.ericsson.ci.ejbserviceclient.domain.QualityStub;
import com.ericsson.ci.persistence.entity.Collection;

@Stateless
public class CollectionStubConverterImpl implements CollectionStubConverter {

	@EJB
	private CoinStubConverter coinStubConverter;

	@EJB
	private CollectorStubConverter collectorStubConverter;

	@Override
	public CollectionStub from(Collection collection) {
		QualityStub quality = QualityStub.valueOf(collection.getQuality().name());
		CoinStub coin = this.coinStubConverter.from(collection.getCoin());
		return new CollectionStub(coin, quality, collection.getQuantity());
	}

	@Override
	public List<CollectionStub> from(List<Collection> collections) {
		List<CollectionStub> result = new ArrayList<>();
		for (Collection collection : collections) {
			result.add(this.from(collection));
		}
		return result;
	}

	@Override
	public UserCollectionStub fromWithUser(Collection collection) {
		QualityStub quality = QualityStub.valueOf(collection.getQuality().name());
		CoinStub coin = this.coinStubConverter.from(collection.getCoin());
		CollectorStub collector = this.collectorStubConverter.from(collection.getCollector());
		return new UserCollectionStub(collector, coin, quality, collection.getQuantity());
	}

	@Override
	public List<UserCollectionStub> fromWithUser(List<Collection> collections) {
		List<UserCollectionStub> result = new ArrayList<>();
		for (Collection collection : collections) {
			result.add(this.fromWithUser(collection));
		}
		return result;
	}

}
