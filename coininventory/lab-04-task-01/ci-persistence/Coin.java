package com.ericsson.ci.persistence.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.ericsson.ci.persistence.entity.trunk.CoinType;

@Entity
@Table(name = "coin")
@NamedQueries(value = { //
		@NamedQuery(name = Coin.GET_BY_CATALOG_NUMBER, query = "SELECT c FROM Coin c JOIN FETCH c.drawer WHERE c.catalogNumber=:catalogNumber"),
		@NamedQuery(name = Coin.GET_ALL, query = "SELECT c FROM Coin c JOIN FETCH c.drawer ORDER BY c.issuingYear"),
		@NamedQuery(name = Coin.GET_BY_QUALITY, query = "SELECT c FROM Coin c JOIN FETCH c.drawer d JOIN FETCH d.country JOIN c.collections cs WHERE cs.quality=:quality"),
		@NamedQuery(name = Coin.GET_BY_COUNTRY, query = "SELECT c FROM Coin c JOIN FETCH c.drawer d WHERE d.country.nationalIdentifier=:nationalIdentifier")
		//
})
@SequenceGenerator(name = "generatorCoin", sequenceName = "coin_sequence", allocationSize = 1)
public class Coin implements Serializable {

	private static final long serialVersionUID = -7153270540448784998L;

	public static final String GET_BY_CATALOG_NUMBER = "Coin.getByIdentificationFields";
	public static final String GET_ALL = "Coin.getAll";
	public static final String GET_BY_QUALITY = "Coin.getByQuality";
	public static final String GET_BY_COUNTRY = "Coin.getByCountry";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generatorCoin")
	@Column(name = "coin_id", nullable = false)
	private Long id;

	@Column(name = "coin_catalog_number", nullable = false)
	private String catalogNumber;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "coin_drawer_id", referencedColumnName = "drawer_id", nullable = false)
	private Drawer drawer;

	@Column(name = "coin_issuing_year", nullable = false)
	private Integer issuingYear;

	@Column(name = "coin_value", nullable = false)
	private Integer value;

	@Column(name = "coin_iswhole", nullable = false)
	private Boolean whole;

	@Column(name = "coin_description")
	private String description;

	@Column(name = "coin_obverse")
	private String obverse;

	@Column(name = "coin_reverse")
	private String reverse;

	@Column(name = "coin_weight", nullable = false)
	private Double weight;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "coin")
	private Set<Collection> collections;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "coin_cointype_id", nullable = false)
	private CoinType coinType;

	public Coin() {
		this(null, null, null, null, null, null, null, null, null, CoinType.CIRCULATION_COIN);
	}

	public Coin(String catalogNumber, Drawer drawer, Integer issuingYear, Integer value, Boolean whole, String description, String obverse, String reverse,
			Double weight, CoinType coinType) {
		super();
		this.catalogNumber = catalogNumber;
		this.drawer = drawer;
		this.issuingYear = issuingYear;
		this.value = value;
		this.whole = whole;
		this.description = description;
		this.obverse = obverse;
		this.reverse = reverse;
		this.weight = weight;
		this.coinType = coinType;
		this.collections = new HashSet<>();
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCatalogNumber() {
		return this.catalogNumber;
	}

	public void setCatalogNumber(String catalogNumber) {
		this.catalogNumber = catalogNumber;
	}

	public Drawer getDrawer() {
		return this.drawer;
	}

	public void setDrawer(Drawer drawer) {
		this.drawer = drawer;
	}

	public Integer getIssuingYear() {
		return this.issuingYear;
	}

	public void setIssuingYear(Integer issuingYear) {
		this.issuingYear = issuingYear;
	}

	public Integer getValue() {
		return this.value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Boolean getWhole() {
		return this.whole;
	}

	public void setWhole(Boolean whole) {
		this.whole = whole;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getObverse() {
		return this.obverse;
	}

	public void setObverse(String obverse) {
		this.obverse = obverse;
	}

	public String getReverse() {
		return this.reverse;
	}

	public void setReverse(String reverse) {
		this.reverse = reverse;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public CoinType getCoinType() {
		return this.coinType;
	}

	public void setCoinType(CoinType coinType) {
		this.coinType = coinType;
	}

	@Override
	public String toString() {
		return "Coin [id=" + this.id + ", catalogNumber=" + this.catalogNumber + ", drawer=" + this.drawer + ", issuingYear=" + this.issuingYear + ", value="
				+ this.value + ", whole=" + this.whole + ", description=" + this.description + ", obverse=" + this.obverse + ", reverse=" + this.reverse
				+ ", weight=" + this.weight + ", coinType=" + this.coinType + "]";
	}

}
