package com.ericsson.ci.ejbmanagement.facade;

import java.util.List;

import javax.ejb.Local;

import com.ericsson.ci.ejbmanagement.domain.ComponentStub;
import com.ericsson.ci.ejbmanagement.domain.FailureStub;

@Local
public interface FailureStatisticsHolder {

	void reportFailure(ComponentStub component, String className, String details);

	FailureStub getLastFailure();

	int getNumberOfFailures();

	int getNumberOfFailures(ComponentStub component);

	List<FailureStub> getAllFailures();

}
