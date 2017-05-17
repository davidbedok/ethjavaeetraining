CREATE SEQUENCE permission_sequence;

CREATE TABLE permission (
	permission_id INTEGER NOT NULL DEFAULT NEXTVAL('permission_sequence'),
	permission_collector_id INTEGER NOT NULL,
	permission_role_id INTEGER NOT NULL,
	CONSTRAINT PK_PERMISSION_ID PRIMARY KEY (permission_id),
	CONSTRAINT FK_PERMISSION_COLLECTOR FOREIGN KEY (permission_collector_id)
	  REFERENCES collector (collector_id) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE RESTRICT,
	CONSTRAINT FK_PERMISSION_ROLE FOREIGN KEY (permission_role_id)
	  REFERENCES role (role_id) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE RESTRICT
);

ALTER TABLE permission OWNER TO postgres;

CREATE UNIQUE INDEX UI_PERMISSION ON permission USING btree (permission_collector_id, permission_role_id);