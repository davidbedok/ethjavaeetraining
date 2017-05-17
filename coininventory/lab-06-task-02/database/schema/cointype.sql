CREATE TABLE cointype (
	cointype_id INTEGER NOT NULL,
	cointype_name CHARACTER VARYING(100) NOT NULL,
	CONSTRAINT PK_COINTYPE_ID PRIMARY KEY (cointype_id)
);

ALTER TABLE cointype OWNER TO postgres;