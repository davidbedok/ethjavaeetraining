SET CLIENT_ENCODING='utf-8';

INSERT INTO coin ( coin_catalog_number, coin_drawer_id, coin_issuing_year, coin_value, coin_iswhole, coin_description, coin_obverse, coin_reverse, coin_weight, coin_cointype_id ) VALUES 
	(
		'HUNRH2-1946-5', ( SELECT drawer_id FROM drawer WHERE drawer_identifier = 'Hungary-RH2'), 1946, 5, TRUE, 
		U&'Munka a Nemzeti Jólét Alapja', U&'Magyar Köztársaság', 'Kossuth 1802-1894', 20, 0
	);
	
INSERT INTO coin ( coin_catalog_number, coin_drawer_id, coin_issuing_year, coin_value, coin_iswhole, coin_description, coin_obverse, coin_reverse, coin_weight, coin_cointype_id ) VALUES 
	(
		'HUNPR-1976-10', ( SELECT drawer_id FROM drawer WHERE drawer_identifier = 'Hungary-PR'), 1976, 10, TRUE, 
		U&'designers: Dezső Kovács and Sándor Boldogfai Farkas', U&'Magyar Népköztársaság', 'value, year, crest', 8.83, 0
	);	
	
INSERT INTO coin ( coin_catalog_number, coin_drawer_id, coin_issuing_year, coin_value, coin_iswhole, coin_description, coin_obverse, coin_reverse, coin_weight, coin_cointype_id ) VALUES 
	(
		'HUNPR-1961-5c', ( SELECT drawer_id FROM drawer WHERE drawer_identifier = 'Hungary-PR'), 1961, 5, FALSE, 
		U&'designers: József Reményi and Lajos Berán', U&'Magyar Népköztársaság', 'value, year, crest', 0.6, 0
	);	

INSERT INTO coin ( coin_catalog_number, coin_drawer_id, coin_issuing_year, coin_value, coin_iswhole, coin_description, coin_obverse, coin_reverse, coin_weight, coin_cointype_id ) VALUES 
	(
		'HUNRH3-1994-20', ( SELECT drawer_id FROM drawer WHERE drawer_identifier = 'Hungary-RH3'), 1994, 20, TRUE, 
		U&'designers: István Kósa and István Bartos', U&'Magyar Köztársaság', 'value, year, crest', 6.9, 0
	);

