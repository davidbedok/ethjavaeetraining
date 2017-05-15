package com.ericsson.ci.ejbservice.converter;

import java.util.List;

import javax.ejb.Local;

import com.ericsson.ci.ejbservice.domain.CoinStub;
import com.ericsson.ci.persistence.entity.Coin;

@Local
public interface CoinStubConverter {

	CoinStub from(Coin coin);

	List<CoinStub> from(List<Coin> coins);

}
