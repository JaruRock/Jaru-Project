package th.co.tac.kms.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.dao.model.KmsKioskDistrictInfo;
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
	
	public List<KmsKioskDistrictInfo> getDistrictByProvinceId() {

		String districtSQL = "  select * from kms_master_district where province_id ='?' ";

		List<KmsKioskDistrictInfo> districtInfos = new ArrayList<KmsKioskDistrictInfo>();
		Object[] param = {};

		return jdbcTemplate.query(districtSQL, param, new RowMapper<KmsKioskDistrictInfo>() {

			public KmsKioskDistrictInfo mapRow(ResultSet row, int rowNum) throws SQLException {
				KmsKioskDistrictInfo districtInfo = new KmsKioskDistrictInfo();

				districtInfo.setdistrictId(row.getString("district_id"));
				districtInfo.setdistrictNameTh(row.getString("district_name_th"));
				districtInfo.setdistrictNameEn(row.getString("district_name_en"));

				return districtInfo;
			}
		});
	}

}
