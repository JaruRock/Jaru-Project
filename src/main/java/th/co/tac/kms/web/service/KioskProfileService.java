package th.co.tac.kms.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import th.co.tac.kms.web.dao.model.KioskProfile;
import th.co.tac.kms.web.dao.model.KioskProfileSearchCriterion;

@Service("kioskProfileService")
public class KioskProfileService {
	
	public List <KioskProfile> kioskProfileSearch( KioskProfileSearchCriterion request){
		List <KioskProfile> kioskprofile = new ArrayList<KioskProfile>();
		KioskProfile profile = new KioskProfile();
		profile.setAmphur("เมือง");
		profile.setProvince("ระยอง");
		profile.setDistrict("หาดยาว");
		profile.setKioskSerialNo("112331");
		profile.setKioskStatus("Active");
		profile.setName("rob");
		profile.setLastName("f");
		profile.setTelephoneNo("099332244");
		profile.setNameNetworkMA("Tone");
		profile.setKioskId("7");
		
		kioskprofile.add(profile);
		profile = new KioskProfile();
		profile.setAmphur("เมือง");
		profile.setProvince("พะเยา");
		profile.setDistrict("แม่กา");
		profile.setKioskSerialNo("11232");
		profile.setKioskStatus("Active");
		profile.setName("rob");
		profile.setLastName("f");
		profile.setTelephoneNo("099324093");
		profile.setNameNetworkMA("Tone");
		profile.setKioskId("1");
		
		kioskprofile.add(profile);
		
		return kioskprofile;
	}

}
