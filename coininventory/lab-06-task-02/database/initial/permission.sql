SET CLIENT_ENCODING='utf-8';

INSERT INTO permission (permission_collector_id, permission_role_id ) VALUES (
	( SELECT collector_id FROM collector WHERE collector_username = 'edvibed' ),
	( SELECT role_id FROM role WHERE role_name = 'cieditor' )
);
INSERT INTO permission (permission_collector_id, permission_role_id ) VALUES (
	( SELECT collector_id FROM collector WHERE collector_username = 'ealice' ),
	( SELECT role_id FROM role WHERE role_name = 'ciuser' )
);
INSERT INTO permission (permission_collector_id, permission_role_id ) VALUES (
	( SELECT collector_id FROM collector WHERE collector_username = 'ebob' ),
	( SELECT role_id FROM role WHERE role_name = 'civiewer' )
);
INSERT INTO permission (permission_collector_id, permission_role_id ) VALUES (
	( SELECT collector_id FROM collector WHERE collector_username = 'echarlie' ),
	( SELECT role_id FROM role WHERE role_name = 'ciuser' )
);
INSERT INTO permission (permission_collector_id, permission_role_id ) VALUES (
	( SELECT collector_id FROM collector WHERE collector_username = 'echarlie' ),
	( SELECT role_id FROM role WHERE role_name = 'civiewer' )
);
