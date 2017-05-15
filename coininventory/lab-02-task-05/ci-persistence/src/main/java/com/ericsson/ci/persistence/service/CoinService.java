package com.ericsson.ci.persistence.service;

import java.util.List;

import javax.ejb.Local;

import com.ericsson.ci.persistence.entity.Coin;
import com.ericsson.ci.persistence.entity.trunk.Quality;
import com.ericsson.ci.persistence.exception.PersistenceServiceException;

@Local
public interface CoinService {

	Coin readCoin(String catalogNumber) throws PersistenceServiceException;

	List<Coin> readCoins() throws PersistenceServiceException;

	List<Coin> readCoins(Quality quality) throws PersistenceServiceException;

	List<Coin> readCoins(String country) throws PersistenceServiceException;

}
