CREATE SEQUENCE drawer_sequence;

CREATE TABLE drawer (
	drawer_id INTEGER NOT NULL DEFAULT NEXTVAL('drawer_sequence'),
	drawer_identifier CHARACTER VARYING(100) NOT NULL,
	drawer_country_id INTEGER NOT NULL,
	drawer_period CHARACTER VARYING(100) NOT NULL,
	drawer_start_year INTEGER NOT NULL,
	drawer_end_year INTEGER NOT NULL,
	drawer_denomination_whole CHARACTER VARYING(100) NOT NULL,
	drawer_denomination_part CHARACTER VARYING(100) NOT NULL,
	CONSTRAINT PK_DRAWER_ID PRIMARY KEY (drawer_id) 
);

ALTER TABLE drawer OWNER TO postgres;

CREATE UNIQUE INDEX UI_DRAWER_IDENTIFIER ON drawer USING btree (drawer_identifier);
CREATE UNIQUE INDEX UI_DRAWER ON drawer USING btree (drawer_country_id, drawer_period);
