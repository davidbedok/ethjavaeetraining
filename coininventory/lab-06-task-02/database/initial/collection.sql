SET CLIENT_ENCODING='utf-8';

INSERT INTO collection ( collection_collector_id, collection_coin_id, collection_quality_id, collection_quantity ) VALUES (
	( SELECT collector_id FROM collector WHERE ( collector_username = 'edvibed' ) ),
	( SELECT coin_id FROM coin WHERE ( coin_catalog_number = 'HUNRH2-1946-5' ) ), 3, 2
);	

INSERT INTO collection ( collection_collector_id, collection_coin_id, collection_quality_id, collection_quantity ) VALUES (
	( SELECT collector_id FROM collector WHERE ( collector_username = 'edvibed' ) ),
	( SELECT coin_id FROM coin WHERE ( coin_catalog_number = 'HUNRH2-1946-5' ) ), 4, 1
);	

INSERT INTO collection ( collection_collector_id, collection_coin_id, collection_quality_id, collection_quantity ) VALUES (
	( SELECT collector_id FROM collector WHERE ( collector_username = 'edvibed' ) ),
	( SELECT coin_id FROM coin WHERE ( coin_catalog_number = 'HUNPR-1976-10' ) ), 7, 5
);	

INSERT INTO collection ( collection_collector_id, collection_coin_id, collection_quality_id, collection_quantity ) VALUES (
	( SELECT collector_id FROM collector WHERE ( collector_username = 'edvibed' ) ),
	( SELECT coin_id FROM coin WHERE ( coin_catalog_number = 'HUNPR-1961-5c' ) ), 5, 1
);	

INSERT INTO collection ( collection_collector_id, collection_coin_id, collection_quality_id, collection_quantity ) VALUES (
	( SELECT collector_id FROM collector WHERE ( collector_username = 'edvibed' ) ),
	( SELECT coin_id FROM coin WHERE ( coin_catalog_number = 'HUNRH3-1994-20' ) ), 10, 3
);	

INSERT INTO collection ( collection_collector_id, collection_coin_id, collection_quality_id, collection_quantity ) VALUES (
	( SELECT collector_id FROM collector WHERE ( collector_username = 'edvibed' ) ),
	( SELECT coin_id FROM coin WHERE ( coin_catalog_number = 'HUNRH3-1994-20' ) ), 8, 2
);		

INSERT INTO collection ( collection_collector_id, collection_coin_id, collection_quality_id, collection_quantity ) VALUES (
	( SELECT collector_id FROM collector WHERE ( collector_username = 'ealice' ) ),
	( SELECT coin_id FROM coin WHERE ( coin_catalog_number = 'HUNRH2-1946-5' ) ), 3, 1
);	

INSERT INTO collection ( collection_collector_id, collection_coin_id, collection_quality_id, collection_quantity ) VALUES (
	( SELECT collector_id FROM collector WHERE ( collector_username = 'ealice' ) ),
	( SELECT coin_id FROM coin WHERE ( coin_catalog_number = 'HUNRH2-1946-5' ) ), 6, 4
);	

INSERT INTO collection ( collection_collector_id, collection_coin_id, collection_quality_id, collection_quantity ) VALUES (
	( SELECT collector_id FROM collector WHERE ( collector_username = 'ebob' ) ),
	( SELECT coin_id FROM coin WHERE ( coin_catalog_number = 'HUNRH3-1994-20' ) ), 3, 1
);	

INSERT INTO collection ( collection_collector_id, collection_coin_id, collection_quality_id, collection_quantity ) VALUES (
	( SELECT collector_id FROM collector WHERE ( collector_username = 'echarlie' ) ),
	( SELECT coin_id FROM coin WHERE ( coin_catalog_number = 'HUNPR-1961-5c' ) ), 6, 2
);	