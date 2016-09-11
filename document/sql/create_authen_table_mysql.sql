CREATE TABLE kms_user (
  user_id bigint(20) NOT NULL AUTO_INCREMENT,
  user_name varchar(30) NOT NULL,
  password varchar(100) NOT NULL,
  first_name varchar(30) NOT NULL,
  last_name varchar(30) NOT NULL,
  email varchar(30) NOT NULL,
  group_code varchar(50) NOT NULL,
  PRIMARY KEY (user_id),
  UNIQUE KEY uc_user_id (user_name)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE kms_group (
  group_id bigint(20) NOT NULL AUTO_INCREMENT,
  group_name varchar(30) NOT NULL,
  group_code varchar(50) NOT NULL,
  group_type varchar(5) NOT NULL,
  PRIMARY KEY (group_id),
  UNIQUE KEY uc_group_id (group_name, group_code)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE kms_role (
  role_id bigint(20) NOT NULL AUTO_INCREMENT,
  role_name varchar(30) NOT NULL,
  role_code varchar(50) NOT NULL,
  group_code varchar(50) NOT NULL,
  PRIMARY KEY (role_id),
  UNIQUE KEY uc_role_id (role_code)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE kms_permission (
  perm_id bigint(20) NOT NULL AUTO_INCREMENT,
  perm_name varchar(250) NOT NULL,
  perm_code varchar(50) NOT NULL,
  perm_detl varchar(250) NOT NULL,
  PRIMARY KEY (perm_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


CREATE TABLE kms_role_perm (
  role_code varchar(50) NOT NULL,
  perm_code varchar(50) NOT NULL,
  PRIMARY KEY (role_code, perm_code)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE kms_role_user (
  role_code varchar(50) NOT NULL,
  user_name varchar(30) NOT NULL,
  PRIMARY KEY (role_code, user_name)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE kms_persistent_login (
  series varchar(255) NOT NULL,
  last_used datetime DEFAULT NULL,
  token varchar(255) NOT NULL,
  username varchar(255) NOT NULL,
  PRIMARY KEY (series),
  UNIQUE KEY UK_bqa9l0go97v49wwyx4c0u3kpd (token),
  UNIQUE KEY UK_f8t9fsfwc17s6qcbx0ath6l3h (username)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
