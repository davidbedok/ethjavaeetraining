package com.ericsson.ci.persistence.service;

import javax.ejb.Local;

import com.ericsson.ci.persistence.entity.Collector;
import com.ericsson.ci.persistence.exception.PersistenceServiceException;

@Local
public interface CollectorService {

	boolean exists(String name) throws PersistenceServiceException;

	Collector readCollector(String userName) throws PersistenceServiceException;

}
