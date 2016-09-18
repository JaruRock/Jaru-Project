package th.co.tac.kms.web.service;

import java.sql.Timestamp;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import th.co.tac.kms.web.controller.model.KioskRegisterInfo;
import th.co.tac.kms.web.controller.model.MachineInfo;
import th.co.tac.kms.web.dao.KmsKioskLocationInfoDao;
import th.co.tac.kms.web.dao.KmsKioskRenterInfoDao;
import th.co.tac.kms.web.dao.KmsWalletInfoDao;
import th.co.tac.kms.web.dao.MachineInfoDao;
import th.co.tac.kms.web.dao.model.KmsKioskLocationInfo;
import th.co.tac.kms.web.dao.model.KmsKioskRenterInfo;
import th.co.tac.kms.web.dao.model.KmsWalletInfo;

@Service("kioskRegisterService")
public class KioskRegisterService {

	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private MachineInfoDao machineInfoDao;
	
	@Autowired
	private KmsWalletInfoDao kmsWalletInfoDao;
	
	@Autowired
	private KmsKioskRenterInfoDao kmsKioskRenterInfoDao;

	@Autowired
	private KmsKioskLocationInfoDao kmsKioskLocationInfoDao;

	public void validate(KioskRegisterInfo keyform, BindingResult result) {
		this.checkEmptyFeild("networkMa", keyform.getNetworkMa(), result);
		this.checkEmptyFeild("mobileMa", keyform.getMobileMa(), result);
		this.checkEmptyFeild("referentTaName", keyform.getReferentTaName(), result);
		this.checkEmptyFeild("customerType", keyform.getCustomerType(), result);
		
		this.checkEmptyFeild("areaTitleName", keyform.getAreaTitleName(), result);
		this.checkEmptyFeild("areaFirstName", keyform.getAreaFirstName(), result);
		this.checkEmptyFeild("areaLastName", keyform.getAreaLastName(), result);
		this.checkEmptyFeild("areaMobileNo", keyform.getAreaMobileNo(), result);

		this.checkEmptyFeild("kioskAreaType", keyform.getKioskAreaType(), result);
		this.checkEmptyFeild("kioskAreaAddress", keyform.getKioskAreaAddress(), result);
		this.checkEmptyFeild("kioskAreaProvice", keyform.getKioskAreaProvice(), result);
		this.checkEmptyFeild("kioskAreaDistrict", keyform.getKioskAreaDistrict(), result);
		this.checkEmptyFeild("kioskAreaTambon", keyform.getKioskAreaTambon(), result);
		this.checkEmptyFeild("kioskAreaPostalCode", keyform.getKioskAreaPostalCode(), result);

	}

	private void checkEmptyFeild(String fieldName, String value, BindingResult result) {
		if (StringUtils.isEmpty(value) || value.trim().length() == 0) {
			String message = messageSource.getMessage("message.field.require", new String[] { fieldName },	Locale.getDefault());
			FieldError usernameError = new FieldError(fieldName, fieldName, message);
			result.addError(usernameError);
		}
	}

	@Transactional()
	public void save(KioskRegisterInfo keyform) {
		
		KmsWalletInfo kmsWalletInfo = new KmsWalletInfo();
		kmsWalletInfo.setAgentId("A" + System.currentTimeMillis());
		kmsWalletInfo.setPinCode(keyform.getPinCode());
		Integer walletId = kmsWalletInfoDao.create(kmsWalletInfo);
		
		//KmsKioskRenterInfo
		KmsKioskRenterInfo kioskRenterInfo = new KmsKioskRenterInfo();
		kioskRenterInfo.setTitleId(keyform.getAreaTitleName());
		kioskRenterInfo.setFirstName(keyform.getAreaFirstName());
		kioskRenterInfo.setLastName(keyform.getAreaLastName());
		kioskRenterInfo.setContactNumber(keyform.getAreaMobileNo());
		Integer renterId = kmsKioskRenterInfoDao.create(kioskRenterInfo);
		
		
		KmsKioskLocationInfo kioskLocationInfo = new KmsKioskLocationInfo();
		kioskLocationInfo.setLocationTypeId(Integer.parseInt(keyform.getKioskAreaType()));
		kioskLocationInfo.setKioskAddress(keyform.getKioskAreaAddress());
		kioskLocationInfo.setMoo(keyform.getKioskAreaMoo());
		kioskLocationInfo.setSoi(keyform.getKioskAreaSoi());
		kioskLocationInfo.setRoad(keyform.getKioskAreaRoad());
		kioskLocationInfo.setProvinceId(Integer.parseInt(keyform.getKioskAreaProvice()));
		kioskLocationInfo.setDistrictId(Integer.parseInt(keyform.getKioskAreaDistrict()));
		kioskLocationInfo.setTambonId(Integer.parseInt(keyform.getKioskAreaTambon()));
		kioskLocationInfo.setPostalCode(Integer.parseInt(keyform.getKioskAreaPostalCode()));
		kioskLocationInfo.setRemarkAddress(keyform.getKioskAreaRemarkAddr());
		Integer locationId = kmsKioskLocationInfoDao.create(kioskLocationInfo);
		
		MachineInfo machineInfo = new MachineInfo();
		machineInfo.setKioskId(keyform.getKioskId());
		machineInfo.setVendorId(10);
		machineInfo.setKioskStatus(keyform.getKioskStatus());
		machineInfo.setWalletId(walletId);
		machineInfo.setRenterId(renterId);
		machineInfo.setLocationId(locationId);
		machineInfo.setRegistedDate(new Timestamp(System.currentTimeMillis()));

		
		//save DAO
		machineInfoDao.create(machineInfo );
	}

}
