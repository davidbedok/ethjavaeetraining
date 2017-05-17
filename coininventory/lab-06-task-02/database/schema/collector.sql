CREATE SEQUENCE collector_sequence;

CREATE TABLE collector (
	collector_id INTEGER NOT NULL DEFAULT NEXTVAL('collector_sequence'),
	collector_username CHARACTER VARYING(100) NOT NULL,
	collector_password CHARACTER VARYING(100) NOT NULL,
	collector_name CHARACTER VARYING(100) NOT NULL,
	collector_year_of_birth INTEGER NOT NULL,
	CONSTRAINT PK_COLLECTOR_ID PRIMARY KEY (collector_id) 		
);

ALTER TABLE collector OWNER TO postgres;

CREATE UNIQUE INDEX UI_COLLECTOR_USERNAME ON collector USING btree (collector_username);