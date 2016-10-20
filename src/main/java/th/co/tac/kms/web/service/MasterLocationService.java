package th.co.tac.kms.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.co.tac.kms.web.dao.KmsMasterDistrictDao;
import th.co.tac.kms.web.dao.KmsMasterProvinceDao;
import th.co.tac.kms.web.dao.KmsMasterTambonDao;
import th.co.tac.kms.web.dao.model.ComboboxResponse;
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

	public ComboboxResponse searchProvinceByProvinceName(String q) {
		ComboboxResponse comboboxResponse = new ComboboxResponse();
		ComboboxResponse.Item item;
		
		for (KmsKioskProvinceMaster master : kmsMasterProvinceDao.getProvincesByProvinceName(q)) {
			item = new ComboboxResponse.Item();
			item.setId(master.getProvinceId());
			item.setText(master.getProvinceName());
			comboboxResponse.getItems().add(item);
		}
		return comboboxResponse;
	}
	
	public List<KmsKioskDistrictMaster> getDistricts(Integer provinceId) {
		List<KmsKioskDistrictMaster> list = new ArrayList<KmsKioskDistrictMaster>();
		KmsKioskDistrictMaster a = new KmsKioskDistrictMaster();
		a.setDistrictId("1");
		a.setDistrictName("ห้วยขวาง");
		list.add(a);
		return list;
		//return kmsMasterDistrictDao.getDistrictByProvinceId(provinceId);
	}
	
	public List<KmsKioskTambonMaster> getTambons(Integer districtId) {
		return kmsMasterTambonDao.getTambonByDistrictId(districtId);
	}
	
}
