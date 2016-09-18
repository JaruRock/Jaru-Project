package th.co.tac.kms.web.service;

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
import th.co.tac.kms.web.dao.MachineInfoDao;

@Service("kioskRegisterService")
public class KioskRegisterService {

	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private MachineInfoDao machineInfoDao;

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
		MachineInfo machineInfo = new MachineInfo();
		machineInfo.setKioskId(1111111);
		//save DAO
		machineInfoDao.create(machineInfo );
	}

}
