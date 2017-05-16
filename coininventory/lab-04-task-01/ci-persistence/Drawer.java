package com.ericsson.ci.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "drawer")
@NamedQueries(value = { //
		@NamedQuery(name = Drawer.GET_ALL, query = "SELECT d FROM Drawer d"),
		@NamedQuery(name = Drawer.GET_BY_IDENTIFIER, query = "SELECT d FROM Drawer d WHERE d.identifier=:identifier"),
		@NamedQuery(name = Drawer.GET_COUNTRIES, query = "SELECT DISTINCT d.country FROM Drawer d"),
		@NamedQuery(name = Drawer.GET_PERIODS, query = "SELECT d.period FROM Drawer d WHERE d.country=:country")
		//
})
@SequenceGenerator(name = "generatorDrawer", sequenceName = "drawer_sequence", allocationSize = 1)
public class Drawer implements Serializable {

	private static final long serialVersionUID = -2234668489807748788L;

	public static final String GET_ALL = "Drawer.getAll";
	public static final String GET_BY_IDENTIFIER = "Drawer.getByIdentifier";
	public static final String GET_COUNTRIES = "Drawer.getCountries";
	public static final String GET_PERIODS = "Drawer.getPeriods";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generatorDrawer")
	@Column(name = "drawer_id", nullable = false)
	private Long id;

	@Column(name = "drawer_identifier", nullable = false)
	private String identifier;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "drawer_country_id", referencedColumnName = "country_id", nullable = false)
	private Country country;

	@Column(name = "drawer_period", nullable = false)
	private String period;

	@Column(name = "drawer_start_year", nullable = false)
	private Integer startYear;

	@Column(name = "drawer_end_year", nullable = false)
	private Integer endYear;

	@Column(name = "drawer_denomination_whole", nullable = false)
	private String denominationWhole;

	@Column(name = "drawer_denomination_part", nullable = false)
	private String denominationPart;

	public Drawer() {
		this(null, null, null, null, null, null, null);
	}

	public Drawer(String identifier, Country country, String period, Integer startYear, Integer endYear, String denominationWhole, String denominationPart) {
		super();
		this.identifier = identifier;
		this.country = country;
		this.period = period;
		this.startYear = startYear;
		this.endYear = endYear;
		this.denominationWhole = denominationWhole;
		this.denominationPart = denominationPart;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Integer getStartYear() {
		return this.startYear;
	}

	public void setStartYear(Integer startYear) {
		this.startYear = startYear;
	}

	public Integer getEndYear() {
		return this.endYear;
	}

	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}

	public String getDenominationWhole() {
		return this.denominationWhole;
	}

	public void setDenominationWhole(String denominationWhole) {
		this.denominationWhole = denominationWhole;
	}

	public String getDenominationPart() {
		return this.denominationPart;
	}

	public void setDenominationPart(String denominationPart) {
		this.denominationPart = denominationPart;
	}

	@Override
	public String toString() {
		return "Drawer [id=" + this.id + ", identifier=" + this.identifier + ", country=" + this.country + ", period=" + this.period + ", startYear="
				+ this.startYear + ", endYear=" + this.endYear + ", denominationWhole=" + this.denominationWhole + ", denominationPart=" + this.denominationPart
				+ "]";
	}

}
