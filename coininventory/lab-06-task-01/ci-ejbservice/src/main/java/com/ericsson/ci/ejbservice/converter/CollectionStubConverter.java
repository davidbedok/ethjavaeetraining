package com.ericsson.ci.ejbservice.converter;

import java.util.List;

import javax.ejb.Local;

import com.ericsson.ci.ejbservice.domain.CollectionStub;
import com.ericsson.ci.ejbservice.domain.UserCollectionStub;
import com.ericsson.ci.persistence.entity.Collection;

@Local
public interface CollectionStubConverter {

	CollectionStub from(Collection collection);

	List<CollectionStub> from(List<Collection> collections);

	UserCollectionStub fromWithUser(Collection collection);

	List<UserCollectionStub> fromWithUser(List<Collection> collections);

}
