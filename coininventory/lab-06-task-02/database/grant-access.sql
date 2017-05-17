GRANT SELECT, INSERT, UPDATE, DELETE ON 
	cointype, 
	quality, 
	country,
	role,
	drawer, 
	coin,
	collector,
	collection,
	permission 
TO coininv_role;
    
GRANT USAGE, SELECT, UPDATE ON 
	country_sequence,
	drawer_sequence, 
	coin_sequence,
	collector_sequence,
	collection_sequence,
	permission_sequence 
TO coininv_role;