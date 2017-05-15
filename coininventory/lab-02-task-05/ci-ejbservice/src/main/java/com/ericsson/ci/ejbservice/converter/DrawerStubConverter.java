package com.ericsson.ci.ejbservice.converter;

import javax.ejb.Local;

import com.ericsson.ci.ejbservice.domain.DrawerStub;
import com.ericsson.ci.persistence.entity.Drawer;

@Local
public interface DrawerStubConverter {

	DrawerStub from(Drawer drawer);

}
