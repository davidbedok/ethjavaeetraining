GRANT SELECT, INSERT, UPDATE, DELETE ON 
	cointype, 
	quality, 
	country,
	drawer, 
	coin,
	collection 
TO coininv_role;
    
GRANT USAGE, SELECT, UPDATE ON 
	country_sequence,
	drawer_sequence, 
	coin_sequence,
	collection_sequence 
TO coininv_role;