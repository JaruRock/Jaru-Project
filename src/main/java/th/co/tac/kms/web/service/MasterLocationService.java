package th.co.tac.kms.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.co.tac.kms.web.dao.KmsMasterDistrictDao;
import th.co.tac.kms.web.dao.KmsMasterProvinceDao;
import th.co.tac.kms.web.dao.KmsMasterTambonDao;
import th.co.tac.kms.web.dao.model.KmsKioskDistrictMaster;
import th.co.tac.kms.web.dao.model.KmsKioskProvinceMaster;
import th.co.tac.kms.web.dao.model.KmsKioskTambonMaster;

@Service("masterLocationService")
public class MasterLocationService extends AbstractService {
	
	@Autowired
	KmsMasterProvinceDao kmsMasterProvinceDao;
	
	@Autowired
	KmsMasterDistrictDao kmsMasterDistrictDao;
	
	@Autowired
	KmsMasterTambonDao kmsMasterTambonDao;

	public List<KmsKioskProvinceMaster> getAllProvince() {
		return kmsMasterProvinceDao.getAllProvince();
	}
	
	public List<KmsKioskDistrictMaster> getDistricts(Integer provinceId) {
		return kmsMasterDistrictDao.getDistrictByProvinceId(provinceId);
	}
	
	public List<KmsKioskTambonMaster> getTambons(Integer districtId) {
		return kmsMasterTambonDao.getTambonByDistrictId(districtId);
	}
	
}
