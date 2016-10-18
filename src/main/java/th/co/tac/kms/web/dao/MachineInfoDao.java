package th.co.tac.kms.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.controller.model.MachineInfo;
import th.co.tac.kms.web.dao.model.KmsKioskMachineInfo;

 
@Repository("machineInfoDao")
public class MachineInfoDao extends AbstractDao { 

 
	private static final long serialVersionUID = 1219394814890557546L;
	
	String insertMachineInfoSQL =	" INSERT INTO kms_kiosk_machine_info( "
			+ "kiosk_id , vendor_id , kiosk_status , registed_date , wallet_id , renter_id , location_id)"
			+ "values ( ? , ? , ? , ? , ? , ? , ?) ";
	
	public Long create(final MachineInfo machineInfo) { 
		KeyHolder keyHolder = new GeneratedKeyHolder(); 		
		jdbcTemplate.update(new PreparedStatementCreator() {  
			public PreparedStatement createPreparedStatement(Connection connection)throws SQLException {  
				PreparedStatement ps = connection.prepareStatement(insertMachineInfoSQL , new String[]{ "machine_id" });   
				ps.setString(1,machineInfo.getKioskId());
				ps.setInt(2,machineInfo.getVendorId());
				ps.setString(3,machineInfo.getKioskSerialNo());
				ps.setTimestamp(4,machineInfo.getRegistedDate());
				ps.setString(5,machineInfo.getWalletId().toString());
				ps.setInt(6,machineInfo.getRenterId());
				ps.setInt(7,machineInfo.getLocationId());

				return ps;
				}
			}, 	keyHolder); 	
		Long returnid =  keyHolder.getKey().longValue();		
		log_info("ID=", returnid);
		return returnid;
	}

	public KmsKioskMachineInfo getAddress(String kioskId){
		String sql = " select location_id from kms_kiosk_machine_info where kiosk_id= ? ";
		Object [] param = {kioskId};
		//Object[] types = {String.class};
		return jdbcTemplate.queryForObject(sql, param, new RowMapper<KmsKioskMachineInfo>()  {
			
			
			public KmsKioskMachineInfo mapRow(ResultSet row, int rowNum) throws SQLException {
				KmsKioskMachineInfo location = new KmsKioskMachineInfo();
                
				//location.setKioskId(row.getString("kiosk_id"));
				location.setLocationId(row.getString("location_id"));

				return location;

            }
        }); 
	}
	/*
	 * 	Class kms_Bean = dao.kms_shift,
		Class location_bean = dao.location

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
