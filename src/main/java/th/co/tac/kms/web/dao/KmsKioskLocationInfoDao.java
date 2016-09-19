package th.co.tac.kms.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.dao.model.KmsKioskLocationInfo;

@Repository("kmsKioskLocationInfoDao")
public class KmsKioskLocationInfoDao extends AbstractDao  {

	private static final long serialVersionUID = -2849893285832481113L;

	public Integer create(final KmsKioskLocationInfo kioskLocationInfo) { 
		String sql = "insert into kms_kiosk_location_info ("
				+ " location_type_id, kiosk_address, moo, soi,road, province_id,district_id,tambon_id, postal_code,remark_address ) "
				+ " values (?,?,?,?,?,?,?,?,?,?)";
		KeyHolder keyHolder = new GeneratedKeyHolder(); 		
		jdbcTemplate.update(new PreparedStatementCreator() {  
			public PreparedStatement createPreparedStatement(Connection connection)throws SQLException {  
				PreparedStatement ps = connection.prepareStatement(sql , new String[]{ "location_id" });   
				int index = 1;
				
				ps.setInt(index++, kioskLocationInfo.getLocationTypeId());
				ps.setString(index++, kioskLocationInfo.getKioskAddress());
				ps.setString(index++, kioskLocationInfo.getMoo());
				ps.setString(index++, kioskLocationInfo.getSoi());
				ps.setString(index++, kioskLocationInfo.getRoad());
				ps.setInt(index++, kioskLocationInfo.getProvinceId());
				ps.setInt(index++, kioskLocationInfo.getDistrictId());
				ps.setInt(index++, kioskLocationInfo.getTambonId());
				ps.setInt(index++, kioskLocationInfo.getPostalCode());
				ps.setString(index++, kioskLocationInfo.getRemarkAddress());
				
				return ps;
				}
			}, 	keyHolder); 	
		Long returnid =  keyHolder.getKey().longValue();		
		log_info("ID=", returnid);
		return returnid.intValue();
	}

}
