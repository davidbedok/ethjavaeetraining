CREATE SEQUENCE collection_sequence;

CREATE TABLE collection (
	collection_id INTEGER NOT NULL DEFAULT NEXTVAL('collection_sequence'),
	collection_collector_id INTEGER NOT NULL,
	collection_coin_id INTEGER NOT NULL,
	collection_quality_id INTEGER NOT NULL,
	collection_quantity INTEGER DEFAULT 1,
	CONSTRAINT PK_COLLECTION_ID PRIMARY KEY (collection_id),
	CONSTRAINT FK_COLLECTION_COLLECTOR FOREIGN KEY (collection_collector_id)
		REFERENCES collector (collector_id) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE RESTRICT,
	CONSTRAINT FK_COLLECTION_COIN FOREIGN KEY (collection_coin_id)
		REFERENCES coin (coin_id) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE RESTRICT,	
	CONSTRAINT FK_COLLECTION_QUALITY FOREIGN KEY (collection_quality_id)
		REFERENCES quality (quality_id) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE RESTRICT		
);

ALTER TABLE collection OWNER TO postgres;

CREATE UNIQUE INDEX UI_COLLECTION ON collection USING btree (collection_collector_id, collection_coin_id, collection_quality_id);