GRANT SELECT, INSERT, UPDATE, DELETE ON 
	cointype, 
	quality, 
	drawer, 
	coin 
TO coininv_role;
    
GRANT USAGE, SELECT, UPDATE ON 
	drawer_sequence, 
	coin_sequence 
TO coininv_role;