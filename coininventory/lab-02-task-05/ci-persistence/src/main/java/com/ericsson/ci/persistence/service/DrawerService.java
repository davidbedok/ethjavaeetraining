package com.ericsson.ci.persistence.service;

import java.util.List;

import javax.ejb.Local;

import com.ericsson.ci.persistence.entity.Drawer;
import com.ericsson.ci.persistence.exception.PersistenceServiceException;

@Local
public interface DrawerService {

	List<Drawer> readDrawers() throws PersistenceServiceException;

	Drawer readDrawer(String identifier) throws PersistenceServiceException;

	List<String> readPeriods(String country) throws PersistenceServiceException;

}
