package th.co.tac.kms.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import th.co.tac.kms.web.dao.model.KmsKioskProvinceMaster;

@Repository("kmsMasterProvinceDao")
public class KmsMasterProvinceDao extends AbstractDao {
	private static final long serialVersionUID = 8282593160170589278L;
	
	public KmsKioskProvinceMaster getProvince(Integer provinceId){
		String sql = "select province_name_th from kms_master_province where province_id= ? ";
		Object [] param = {provinceId};
		log_info(" ProvinceID:"+provinceId);
		//Object[] types = {String.class};
		
		return jdbcTemplate.queryForObject(sql, param, new RowMapper<KmsKioskProvinceMaster>()  {
			
			
			public KmsKioskProvinceMaster mapRow(ResultSet row, int rowNum) throws SQLException {
				KmsKioskProvinceMaster province = new KmsKioskProvinceMaster();
                
				province.setProvinceName(row.getString("province_name_th"));

				return province;

            }
        }); 
	}
	
	public List<KmsKioskProvinceMaster> getAllProvince() {

		String provinceSQL = " select * from kms_master_province ";

		Object[] param = {};

		return jdbcTemplate.query(provinceSQL, param, new RowMapper<KmsKioskProvinceMaster>() {

			public KmsKioskProvinceMaster mapRow(ResultSet row, int rowNum) throws SQLException {
				KmsKioskProvinceMaster provinceInfo = new KmsKioskProvinceMaster();

				provinceInfo.setProvinceId(row.getString("province_id"));
				provinceInfo.setProvinceName(row.getString("province_name_th"));
				provinceInfo.setProvinceNameEn(row.getString("province_name_en"));

				return provinceInfo;
			}
		});
	}
	
	public List<KmsKioskProvinceMaster> getProvinceByName(String q) {
		
		String sql = 
				" select province_id, province_name_th "
				+ " from kms_master_province ";
		
		Object[] param = {};
		
		if (!StringUtils.isEmpty(q)) {
			sql += " where province_name_th like ? ";
			param = new Object[] {"%"+q+"%"};
		}

		return jdbcTemplate.query(sql, param, new RowMapper<KmsKioskProvinceMaster>() {

			public KmsKioskProvinceMaster mapRow(ResultSet row, int rowNum) throws SQLException {
				KmsKioskProvinceMaster provinceInfo = new KmsKioskProvinceMaster();

				provinceInfo.setProvinceId(row.getString("province_id"));
				provinceInfo.setProvinceName(row.getString("province_name_th"));

				return provinceInfo;
			}
		});
	}
}
