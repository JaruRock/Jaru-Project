// All needed DAO to be implemented

//KMSProvinceDAO to render all the provinces in master_province table using province_ID

package th.co.tac.kms.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.dao.model.KmsKioskProvinceInfo;


@Repository("KmsKioskProvinceInfoDao")
public class KmsKioskProvinceInfoDao extends AbstractDao { 
	
	private static final long serialVersionUID = 8258736330960952034L;
	
	
	public List<KmsKioskProvinceInfo> getProvince(){
	
	String provinceSQL =	"  select * from kms_master_province" ;
	
	List<KmsKioskProvinceInfo> provinceInfos = new ArrayList<KmsKioskProvinceInfo> ();
	Object [] param = {};
	
	
	return jdbcTemplate.query(provinceSQL, param, new RowMapper<KmsKioskProvinceInfo>() {
	
		public KmsKioskProvinceInfo mapRow(ResultSet row, int rowNum) throws SQLException {
			KmsKioskProvinceInfo provinceInfo = new KmsKioskProvinceInfo(); 

			provinceInfo.setProvinceId(row.getString("province_id"));
			provinceInfo.setProvinceNameTh(row.getString("province_name_th"));
			provinceInfo.setProvinceNameEn(row.getString("province_name_en"));

			return provinceInfo;
		}
	});
}}