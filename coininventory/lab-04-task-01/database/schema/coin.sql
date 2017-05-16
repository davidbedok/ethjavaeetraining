CREATE SEQUENCE coin_sequence;

CREATE TABLE coin (
	coin_id INTEGER NOT NULL DEFAULT NEXTVAL('coin_sequence'),
	coin_catalog_number CHARACTER VARYING(100) NOT NULL,
	coin_drawer_id INTEGER NOT NULL,
	coin_issuing_year INTEGER NOT NULL,
	coin_value INTEGER NOT NULL,
	coin_iswhole BOOLEAN NOT NULL DEFAULT TRUE,
	coin_description CHARACTER VARYING(100),
	coin_obverse CHARACTER VARYING(100),
	coin_reverse CHARACTER VARYING(100),
	coin_weight REAL NOT NULL,
	coin_cointype_id INTEGER NOT NULL,
	CONSTRAINT PK_COIN_ID PRIMARY KEY (coin_id),
	CONSTRAINT FK_COIN_DRAWER FOREIGN KEY (coin_drawer_id)
		REFERENCES drawer (drawer_id) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE RESTRICT,
	CONSTRAINT FK_COIN_COINTYPE FOREIGN KEY (coin_cointype_id)
		REFERENCES cointype (cointype_id) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE RESTRICT 
);

ALTER TABLE coin OWNER TO postgres;

CREATE UNIQUE INDEX UI_COIN_CATALOG_NUMBER ON coin USING btree (coin_catalog_number);
CREATE UNIQUE INDEX UI_COIN ON coin USING btree (coin_drawer_id, coin_issuing_year, coin_value, coin_iswhole);