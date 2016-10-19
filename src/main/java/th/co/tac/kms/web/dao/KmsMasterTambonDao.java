package th.co.tac.kms.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.dao.model.KmsKioskTambonInfo;
import th.co.tac.kms.web.dao.model.KmsKioskTambonMaster;

@Repository("kmsMasterTambonDao")
public class KmsMasterTambonDao extends AbstractDao{
	private static final long serialVersionUID = -44788106062517580L;
	
	public KmsKioskTambonMaster getTambon(Integer tambonId){
		String sql = " select tambon_name_th from kms_master_tambon where tambon_id= ? ";
		Object [] param = {tambonId};
		//Object[] types = {String.class};
		log_info(" TambonID:"+tambonId);
		return jdbcTemplate.queryForObject(sql, param, new RowMapper<KmsKioskTambonMaster>()  {
			
			
			public KmsKioskTambonMaster mapRow(ResultSet row, int rowNum) throws SQLException {
				KmsKioskTambonMaster tambon = new KmsKioskTambonMaster();
                
				tambon.setTambonName(row.getString("tambon_name_th"));

				return tambon;

            }
        }); 
	}
	
	public List<KmsKioskTambonInfo> getDistrictByDistrictId() {

		String TambonSQL = "  select * from kms_master_Tambon where district_id= '?' ";

		List<KmsKioskTambonInfo> TambonInfos = new ArrayList<KmsKioskTambonInfo>();
		Object[] param = {};

		return jdbcTemplate.query(TambonSQL, param, new RowMapper<KmsKioskTambonInfo>() {

			public KmsKioskTambonInfo mapRow(ResultSet row, int rowNum) throws SQLException {
				KmsKioskTambonInfo TambonInfo = new KmsKioskTambonInfo();

				TambonInfo.settambonId(row.getString("tambonInfo_id"));
				TambonInfo.settambonNameTh(row.getString("tambonInfo_name_th"));
				TambonInfo.settambonNameEn(row.getString("tambonInfo_name_en"));

				return TambonInfo;
			}
		});
	}

}
