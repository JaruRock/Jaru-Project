CREATE SEQUENCE kms_group_id_seqn INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1;
CREATE SEQUENCE kms_role_id_seqn INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1;
CREATE SEQUENCE kms_perm_id_seqn INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1;
CREATE SEQUENCE kms_user_id_seqn INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1;

CREATE TABLE kms_user (
  user_id bigint NOT NULL,
  user_name character varying(30) NOT NULL,
  password character varying(100) NOT NULL,
  first_name character varying(30) NOT NULL,
  last_name character varying(30) NULL,
  email character varying(30) NULL,
  group_code character varying(50) NOT NULL,
  PRIMARY KEY (user_id),
  CONSTRAINT uc_user_name UNIQUE (user_name)
)

CREATE TABLE kms_group (
  group_id bigint NOT NULL,
  group_name character varying(30) NOT NULL,
  group_code character varying(50) NOT NULL,
  group_type character varying(5) NOT NULL,
  PRIMARY KEY (group_id),
  CONSTRAINT uc_group_name_code UNIQUE (group_name, group_code)
) 

CREATE TABLE kms_role (
  role_id bigint NOT NULL,
  role_name character varying(30) NOT NULL,
  role_code character varying(50) NOT NULL,
  group_code character varying(50) NOT NULL,
  PRIMARY KEY (role_id),
  CONSTRAINT uc_role_code UNIQUE (role_code) 
) 

CREATE TABLE kms_permission (
  perm_id bigint NOT NULL,
  perm_name character varying(250) NOT NULL,
  perm_code character varying(50) NOT NULL,
  perm_detl character varying(250) NOT NULL,
  PRIMARY KEY (perm_id)
) 


CREATE TABLE kms_role_perm (
  role_code character varying(50) NOT NULL,
  perm_code character varying(50) NOT NULL,
  PRIMARY KEY (role_code, perm_code)
) 

CREATE TABLE kms_role_user (
  role_code character varying(50) NOT NULL,
  user_name character varying(30) NOT NULL,
  PRIMARY KEY (role_code, user_name)
) 

CREATE TABLE kms_persistent_login (
  series character varying(255) NOT NULL,
  last_used timestamp(6) without time zone DEFAULT NULL,
  token character varying(255) NOT NULL,
  username character varying(255) NOT NULL,
  PRIMARY KEY (series),
  CONSTRAINT uc_tocken UNIQUE (token),
  CONSTRAINT uc_username UNIQUE (username)
) 
