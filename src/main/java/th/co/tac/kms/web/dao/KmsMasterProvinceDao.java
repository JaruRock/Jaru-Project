package th.co.tac.kms.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

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
	
}
