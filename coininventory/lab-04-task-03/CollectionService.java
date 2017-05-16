package com.ericsson.ci.persistence.service;

import javax.ejb.Local;

import com.ericsson.ci.persistence.entity.Collection;
import com.ericsson.ci.persistence.entity.trunk.Quality;
import com.ericsson.ci.persistence.exception.PersistenceServiceException;

@Local
public interface CollectionService {

	boolean exists(String userName, String catalogNumber, Quality quality) throws PersistenceServiceException;

	Collection readCollection(String userName, String catalogNumber, Quality quality) throws PersistenceServiceException;

	Collection increase(String userName, String catalogNumber, Quality quality) throws PersistenceServiceException;

}
