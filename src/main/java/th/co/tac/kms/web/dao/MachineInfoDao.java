package th.co.tac.kms.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.controller.model.MachineInfo;

 
@Repository("machineInfoDao")
public class MachineInfoDao extends AbstractDao { 
	@Autowired
	private JdbcTemplate jdbcTemplate;	
 
	
	String insertMachineInfoSQL =	" INSERT INTO kms_kiosk_machine_info(  " +
			"    kiosk_id, ref_kiosk_id, wallet_id, location_id, kiosk_status, " +
			"   project_code, sim_card_id, kiosk_serial_no, renter_id, vendor_id, " +
			"   registed_date, activate_date, created_by, created_date, updated_by, " +
			"   updated_date)" +
			"    VALUES (?, ?, ?, ?, ?, ?,  ?, ?, ?, ?, ?,  ?, ?, ?, ?, ?,  ?)";

	
	
	public Long create(final MachineInfo machineInfo) { 
		KeyHolder keyHolder = new GeneratedKeyHolder(); 		
		jdbcTemplate.update(new PreparedStatementCreator() {  
			public PreparedStatement createPreparedStatement(Connection connection)throws SQLException {  
				PreparedStatement ps = connection.prepareStatement(insertMachineInfoSQL , Statement.RETURN_GENERATED_KEYS);   
				ps.setInt(1,machineInfo.getKioskId());
				ps.setInt(2,machineInfo.getRefKioskId());
				ps.setInt(3,machineInfo.getWalletId());
				ps.setInt(4,machineInfo.getLocationId());
				ps.setString(5,machineInfo.getKioskStatus());
				ps.setString(6,machineInfo.getProjectCode());
				ps.setInt(7,machineInfo.getSimCardId());
				ps.setString(8,machineInfo.getKioskSerialNo());
				ps.setInt(9,machineInfo.getRenterId());
				ps.setInt(10,machineInfo.getVendorId());
				ps.setTimestamp(11,machineInfo.getRegistedDate());
				ps.setTimestamp(12,machineInfo.getActivateDate());
				ps.setString(13,machineInfo.getCreateBy());
				ps.setTimestamp(14,machineInfo.getCreateDate());
				ps.setString(15,machineInfo.getUpdateBy());
				ps.setTimestamp(16,machineInfo.getUpdateDate());
			 	 			
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
