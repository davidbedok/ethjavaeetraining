package com.ericsson.ci.persistence.entity;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.ericsson.ci.persistence.entity.trunk.Quality;

@Entity
@Table(name = "collection")
@SequenceGenerator(name = "generatorCollection", sequenceName = "collection_sequence", allocationSize = 1)
public class Collection {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generatorCollection")
	@Column(name = "collection_id", nullable = false)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "collection_coin_id", referencedColumnName = "coin_id", nullable = false)
	private Coin coin;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "collection_quality_id", nullable = false)
	private Quality quality;

	@Column(name = "collection_quantity", nullable = false)
	private Integer quantity;

	public Collection() {
		this(null, Quality.F, null);
	}

	public Collection(Coin coin, Quality quality, Integer quantity) {
		super();
		this.coin = coin;
		this.quality = quality;
		this.quantity = quantity;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Coin getCoin() {
		return this.coin;
	}

	public void setCoin(Coin coin) {
		this.coin = coin;
	}

	public Quality getQuality() {
		return this.quality;
	}

	public void setQuality(Quality quality) {
		this.quality = quality;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Collection [id=" + this.id + ", coin=" + this.coin + ", quality=" + this.quality + ", quantity=" + this.quantity + "]";
	}

}
