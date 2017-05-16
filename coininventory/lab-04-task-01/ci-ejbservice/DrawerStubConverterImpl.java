package com.ericsson.ci.ejbservice.converter;

import javax.ejb.Stateless;

import com.ericsson.ci.ejbserviceclient.domain.DrawerStub;
import com.ericsson.ci.persistence.entity.Drawer;

@Stateless
public class DrawerStubConverterImpl implements DrawerStubConverter {

	@Override
	public DrawerStub from(Drawer drawer) {
		return new DrawerStub(drawer.getIdentifier(), drawer.getCountry().getName(), drawer.getPeriod(), drawer.getStartYear(), drawer.getEndYear(),
				drawer.getDenominationWhole(), drawer.getDenominationPart());
	}

}
