package com.ericsson.ci.ejbserviceclient;

import java.util.List;

import com.ericsson.ci.ejbserviceclient.domain.CoinStub;
import com.ericsson.ci.ejbserviceclient.exception.FacadeException;

public interface InventoryCommonService {

	List<CoinStub> getCoins(String nationalIdentifier) throws FacadeException;

}
