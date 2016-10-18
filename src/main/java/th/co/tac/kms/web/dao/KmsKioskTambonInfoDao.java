// All needed DAO to be implemented

//KMSdistrictDAO to render all the districts in master_district table using district_ID

package th.co.tac.kms.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.dao.model.KmsKioskTambonInfo;

@Repository("KmsKioskTambonInfoDao")
public class KmsKioskTambonInfoDao extends AbstractDao { 
	
	private static final long serialVersionUID = 8258736330960952034L;
	
	
	public List<KmsKioskTambonInfo> getDistrict(){
	
	String TambonSQL = "  select * from kms_master_Tambon" ;
	
	List<KmsKioskTambonInfo> TambonInfos = new ArrayList<KmsKioskTambonInfo> ();
	Object [] param = {};
	
	
	return jdbcTemplate.query(TambonSQL, param, new RowMapper<KmsKioskTambonInfo>() {
	
		public KmsKioskTambonInfo mapRow(ResultSet row, int rowNum) throws SQLException {
			KmsKioskTambonInfo TambonInfo = new KmsKioskTambonInfo(); 

			TambonInfo.settambonId(row.getString("tambonInfo_id"));
			TambonInfo.settambonNameTh(row.getString("tambonInfo_name_th"));
			TambonInfo.settambonNameEn(row.getString("tambonInfo_name_en"));

			return TambonInfo;
		}
	});
}}