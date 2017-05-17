SET CLIENT_ENCODING='utf-8';

INSERT INTO drawer (drawer_identifier, drawer_country_id, drawer_period, drawer_start_year, drawer_end_year, drawer_denomination_whole, drawer_denomination_part) VALUES 
	( 'Hungary-AHE', ( SELECT country_id FROM country WHERE country_national_identifier = 'HUN'), 
	'Austro-Hungarian Empire', 1892, 1926, 'Korona', U&'fillér');
INSERT INTO drawer (drawer_identifier, drawer_country_id, drawer_period, drawer_start_year, drawer_end_year, drawer_denomination_whole, drawer_denomination_part) VALUES 
	( 'Hungary-KH', ( SELECT country_id FROM country WHERE country_national_identifier = 'HUN'), 
	'Kingdom of Hungary', 1926, 1946, U&'Pengő', U&'fillér');
INSERT INTO drawer (drawer_identifier, drawer_country_id, drawer_period, drawer_start_year, drawer_end_year, drawer_denomination_whole, drawer_denomination_part) VALUES 
	( 'Hungary-RH2', ( SELECT country_id FROM country WHERE country_national_identifier = 'HUN'), 
	'Second republic of Hungary', 1946, 1949, 'Forint', U&'fillér');		
INSERT INTO drawer (drawer_identifier, drawer_country_id, drawer_period, drawer_start_year, drawer_end_year, drawer_denomination_whole, drawer_denomination_part) VALUES 
	( 'Hungary-PR', ( SELECT country_id FROM country WHERE country_national_identifier = 'HUN'), 
	'People''s Repuplic', 1949, 1989, 'Forint', U&'fillér');
INSERT INTO drawer (drawer_identifier, drawer_country_id, drawer_period, drawer_start_year, drawer_end_year, drawer_denomination_whole, drawer_denomination_part) VALUES 
	( 'Hungary-RH3', ( SELECT country_id FROM country WHERE country_national_identifier = 'HUN'), 
	'Third republic of Hungary', 1989, 2020, 'Forint', U&'fillér');	
