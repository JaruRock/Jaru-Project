package th.co.tac.kms.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.co.tac.kms.web.dao.KmsMasterDistrictDao;
import th.co.tac.kms.web.dao.KmsMasterProvinceDao;
import th.co.tac.kms.web.dao.KmsMasterTambonDao;
import th.co.tac.kms.web.dao.MachineInfoDao;
import th.co.tac.kms.web.dao.model.ComboboxResponse;
import th.co.tac.kms.web.dao.model.KmsKioskDistrictMaster;
import th.co.tac.kms.web.dao.model.KmsKioskMachineInfo;
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

	@Autowired
	MachineInfoDao machineInfoDao;
	
	public ComboboxResponse getProvinceCombobox(String q) {
		ComboboxResponse comboboxResponse = new ComboboxResponse();
		ComboboxResponse.Item item;
		
		for (KmsKioskProvinceMaster master : kmsMasterProvinceDao.getProvinceByName(q)) {
			item = new ComboboxResponse.Item();
			item.setId(master.getProvinceId());
			item.setText(master.getProvinceName());
			comboboxResponse.getItems().add(item);
		}
		return comboboxResponse;
	}
	
	public ComboboxResponse getDistrictCombobox(String q, Integer provinceId) {
		ComboboxResponse comboboxResponse = new ComboboxResponse();
		ComboboxResponse.Item item;
		
		for (KmsKioskDistrictMaster master : kmsMasterDistrictDao.getDistrictByName(q, provinceId)) {
			item = new ComboboxResponse.Item();
			item.setId(master.getDistrictId());
			item.setText(master.getDistrictName());
			comboboxResponse.getItems().add(item);
		}
		return comboboxResponse;
	}
	
	public ComboboxResponse getTambonCombobox(String q, Integer districtId) {
		ComboboxResponse comboboxResponse = new ComboboxResponse();
		ComboboxResponse.Item item;
		
		for (KmsKioskTambonMaster master : kmsMasterTambonDao.getTambonByName(q, districtId)) {
			item = new ComboboxResponse.Item();
			item.setId(master.getTambonId());
			item.setText(master.getTambonName());
			comboboxResponse.getItems().add(item);
		}
		return comboboxResponse;
	}

	public ComboboxResponse getKioskIdCombobox(String q, Integer provinceId, Integer districtId, Integer tambonId) {
		ComboboxResponse comboboxResponse = new ComboboxResponse();
		ComboboxResponse.Item item;
		
		for (KmsKioskMachineInfo master : machineInfoDao.getKioskIdById(q, provinceId, districtId, tambonId)) {
			item = new ComboboxResponse.Item();
			item.setId(master.getKioskId());
			item.setText(master.getKioskId());
			comboboxResponse.getItems().add(item);
		}
		return comboboxResponse;
	}
	
}