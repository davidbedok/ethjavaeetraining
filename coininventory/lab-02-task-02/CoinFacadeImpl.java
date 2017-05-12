package com.ericsson.ci.ejbservice.facade;

import java.util.ArrayList;
import java.util.List;

import com.ericsson.ci.ejbservice.domain.CoinStub;
import com.ericsson.ci.ejbservice.domain.CoinTypeStub;
import com.ericsson.ci.ejbservice.domain.DrawerStub;
import com.ericsson.ci.ejbservice.domain.QualityStub;

public class CoinFacadeImpl implements CoinFacade {

	public CoinStub getCoin(String catalogNumber) {
		return this.getMockCoin1(catalogNumber);
	}

	public CoinStub getCoin(String drawer, int issuingYear, int value) {
		return this.getMockCoin1("HUNPR-1976-10", drawer, issuingYear, value, QualityStub.VG);
	}

	public List<CoinStub> getCoins() {
		List<CoinStub> result = new ArrayList<>();
		result.add(this.getMockCoin1("HUNPR-1976-10"));
		result.add(this.getMockCoin2(QualityStub.EF));
		return result;
	}

	public List<CoinStub> getCoins(QualityStub quality) {
		List<CoinStub> result = new ArrayList<>();
		result.add(this.getMockCoin1("HUNPR-1976-10", "Hungary-PR", 1976, 10, quality));
		result.add(this.getMockCoin2(quality));
		return result;
	}

	private CoinStub getMockCoin1(String catalogNumber) {
		return this.getMockCoin1(catalogNumber, "Hungary-PR", 1976, 10, QualityStub.VG);
	}

	private CoinStub getMockCoin1(String catalogNumber, String drawer, int issuingYear, int value, QualityStub quality) {
		DrawerStub drawerStub = new DrawerStub("Hungary-PR", "Hungary", "People’s Republic", 1949, 1989, "Forint", "fillér");
		return new CoinStub(catalogNumber, drawerStub, 1976, 10, "designers: Dezső Kovács and Sándor Boldogfai Farkas", "value, year, crest",
				"Magyar Népköztársaság", 8.83, CoinTypeStub.CIRCULATION_COIN, quality, 2, true);
	}

	private CoinStub getMockCoin2(QualityStub quality) {
		DrawerStub drawerStub = new DrawerStub("Hungary-RH2", "Hungary", "Republic of Hungary", 1946, 1949, "Forint", "fillér");
		return new CoinStub("HUNRH2-1946-5", drawerStub, 1946, 5, "Munka a Nemzeti Jólét Alapja", "Magyar Köztársaság", "Kossuth 1802-1894", 20,
				CoinTypeStub.CIRCULATION_COIN, quality, 1, true);
	}

}
