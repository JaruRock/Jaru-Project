-- create group
INSERT INTO kms_group (group_name,group_code,group_type) VALUES ('DTAC Admin Group','G00001', 'AM');

-- create role
INSERT INTO kms_role (role_name,role_code,group_code) VALUES ('Super Admin','R000001','G00001');

-- create permission
INSERT INTO kms_permission (perm_name,perm_code,perm_detl) VALUES ('user list page permission','01', '["01001","01002","01003"]');
INSERT INTO kms_permission (perm_name,perm_code,perm_detl) VALUES ('group list page permission','02', '["02001","02002","02003"]');

-- create user
INSERT INTO kms_user (user_name,password,first_name,last_name,email,group_code) VALUES ('admin','$2a$10$8BI9qNXGJW5jy86xwZgQIulBiLxYFPrZJBg6ERLlw1tOCSOcdtos2','Administrator', '', 'admin@kms.co.th', '00000');

-- role mapping
INSERT INTO kms_role_perm (role_code,perm_code) VALUES ('R000001','01');
INSERT INTO kms_role_perm (role_code,perm_code) VALUES ('R000001','02');

-- role mapping
INSERT INTO kms_role_user (role_code,user_name) VALUES ('R000001','admin');
