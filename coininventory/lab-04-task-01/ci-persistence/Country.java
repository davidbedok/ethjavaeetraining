package com.ericsson.ci.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "country")
@SequenceGenerator(name = "generatorCountry", sequenceName = "country_sequence", allocationSize = 1)
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generatorCountry")
	@Column(name = "country_id", nullable = false)
	private Long id;

	@Column(name = "country_national_identifier", nullable = false)
	private String nationalIdentifier;

	@Column(name = "country_name", nullable = false)
	private String name;

	public Country() {
		this(null, null);
	}

	public Country(String nationalIdentifier, String name) {
		super();
		this.nationalIdentifier = nationalIdentifier;
		this.name = name;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNationalIdentifier() {
		return this.nationalIdentifier;
	}

	public void setNationalIdentifier(String nationalIdentifier) {
		this.nationalIdentifier = nationalIdentifier;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [id=" + this.id + ", nationalIdentifier=" + this.nationalIdentifier + ", name=" + this.name + "]";
	}

}
