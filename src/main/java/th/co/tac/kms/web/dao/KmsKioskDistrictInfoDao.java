// All needed DAO to be implemented

//KMSdistrictDAO to render all the districts in master_district table using district_ID

package th.co.tac.kms.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.dao.model.KmsKioskDistrictInfo;

@Repository("KmsKioskDistrictInfoDao")
public class KmsKioskDistrictInfoDao extends AbstractDao { 
	
	private static final long serialVersionUID = 8258736330960952034L;
	
	
	public List<KmsKioskDistrictInfo> getDistrict(){
	
	String districtSQL = "  select * from kms_master_district" ;
	
	List<KmsKioskDistrictInfo> districtInfos = new ArrayList<KmsKioskDistrictInfo> ();
	Object [] param = {};
	
	
	return jdbcTemplate.query(districtSQL, param, new RowMapper<KmsKioskDistrictInfo>() {
	
		public KmsKioskDistrictInfo mapRow(ResultSet row, int rowNum) throws SQLException {
			KmsKioskDistrictInfo districtInfo = new KmsKioskDistrictInfo(); 

			districtInfo.setdistrictId(row.getString("district_id"));
			districtInfo.setdistrictNameTh(row.getString("district_name_th"));
			districtInfo.setdistrictNameEn(row.getString("district_name_en"));

			return districtInfo;
		}
	});
}}