package th.co.tac.kms.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.dao.model.KmsKioskDistrictMaster;

@Repository("kmsMasterDistrictDao")
public class KmsMasterDistrictDao extends AbstractDao{
	private static final long serialVersionUID = -3196789976572747259L;
	
	public KmsKioskDistrictMaster getDistrict(Integer districtId){
		String sql = " select district_name_th from kms_master_district where district_id= ? ";
		Object [] param = {districtId};
		//Object[] types = {String.class};
		log_info(" DistrictID:"+districtId);
		return jdbcTemplate.queryForObject(sql, param, new RowMapper<KmsKioskDistrictMaster>()  {
			
			
			public KmsKioskDistrictMaster mapRow(ResultSet row, int rowNum) throws SQLException {
				KmsKioskDistrictMaster district = new KmsKioskDistrictMaster();
                
				district.setDistrictName(row.getString("district_name_th"));

				return district;
            }
        }); 
	}
	
	public List<KmsKioskDistrictMaster> getDistrictByProvinceId(String provinceId) {

		String districtSQL = "  select * from kms_master_district where province_id ='?' ";

		List<KmsKioskDistrictMaster> districtInfos = new ArrayList<KmsKioskDistrictMaster>();
		Object[] param = {provinceId};

		return jdbcTemplate.query(districtSQL, param, new RowMapper<KmsKioskDistrictMaster>() {

			public KmsKioskDistrictMaster mapRow(ResultSet row, int rowNum) throws SQLException {
				KmsKioskDistrictMaster districtInfo = new KmsKioskDistrictMaster();

				districtInfo.setDistrictId(row.getString("district_id"));
				districtInfo.setDistrictName(row.getString("district_name_th"));
				districtInfo.setDistrictNameEn(row.getString("district_name_en"));

				return districtInfo;
			}
		});
	}

}
