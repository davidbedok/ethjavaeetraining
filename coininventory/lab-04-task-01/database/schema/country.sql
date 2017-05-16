CREATE SEQUENCE country_sequence;

CREATE TABLE country (
	country_id INTEGER NOT NULL DEFAULT NEXTVAL('country_sequence'),
	country_national_identifier CHARACTER VARYING(100) NOT NULL,
	country_name CHARACTER VARYING(100) NOT NULL,
	CONSTRAINT PK_COUNTRY_ID PRIMARY KEY (country_id)
);

ALTER TABLE country OWNER TO postgres;

CREATE UNIQUE INDEX UI_COUNTRY_NATIONAL_IDENTIFIER ON country USING btree (country_national_identifier);