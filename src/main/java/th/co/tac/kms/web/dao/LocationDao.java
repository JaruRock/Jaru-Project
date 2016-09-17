package th.co.tac.kms.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.tomcat.util.codec.binary.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.controller.model.LocationInfo;

 
@Repository("locationDao")
public class LocationDao extends AbstractDao { 
	@Autowired
	private JdbcTemplate jdbcTemplate;	
	
	String insertLocationSQL =	"  INSERT INTO kms_kiosk_location_info(" +
			"   location_id, longitude, latitude, kiosk_address, remark_address, " +
			"        location_status, region_id, created_by, created_date, updated_by, " +
			"         updated_date, id_province, id_district, id_tambon, moo, soi, " +
			"         road, postal_code, id_location_type, other_location)" +
			"   VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?)" ;
	
	
	public Long create(final LocationInfo locationInfo) { 
		KeyHolder keyHolder = new GeneratedKeyHolder(); 		
		jdbcTemplate.update(new PreparedStatementCreator() {  
			public PreparedStatement createPreparedStatement(Connection connection)throws SQLException {  
				PreparedStatement ps = connection.prepareStatement(insertLocationSQL , Statement.RETURN_GENERATED_KEYS);   
				ps.setInt(1,locationInfo.getLocationId());
			//	ps.setString(2,finalRole.getRoleDesc());
				ps.setBoolean(3,true);		 			
				return ps;  
				}
			}, 	keyHolder); 	
		Long returnid =  keyHolder.getKey().longValue();		
 
		return returnid;
	}


	/*
	 * kms_kiosk_location_info.location_type_id
kms_kiosk_location_info.other_location
kms_kiosk_location_info.kiosk_address
kms_kiosk_location_info.moo
kms_kiosk_location_info.soi
kms_kiosk_location_info.road
kms_kiosk_location_info.province_id
kms_kiosk_location_info.district_id
kms_kiosk_location_info.tambon_id
kms_kiosk_location_info.postal_code
kms_kiosk_location_info.remark_address

## Table
  location_id integer NOT NULL,
  longitude character varying(100),
  latitude character varying(100),
  kiosk_address character varying(255),
  remark_address character varying(255),
  location_status character varying(45) NOT NULL DEFAULT 'N'::character varying,
  region_id integer,
  created_by character varying(45),
  created_date timestamp(6) without time zone,
  updated_by character varying(45),
  updated_date timestamp(6) without time zone,
  id_province integer,
  id_district integer,
  id_tambon integer,
  moo character varying(50),
  soi character varying(50),
  road character varying(50),
  postal_code integer,
  id_location_type integer,
  other_location character varying(100),

	 */

}
