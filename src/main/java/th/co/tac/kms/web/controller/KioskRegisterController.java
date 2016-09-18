package th.co.tac.kms.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import th.co.tac.kms.web.controller.model.KioskRegisterInfo;
import th.co.tac.kms.web.service.KioskRegisterService;

@Controller
@RequestMapping("/")
public class KioskRegisterController extends AbstractController  {
	

	@Autowired
	private KioskRegisterService kioskRegisterService;
	
	
	@RequestMapping(value = { "/kiosk-register" }, method = RequestMethod.GET)
	public String keyForm(@ModelAttribute KioskRegisterInfo keyform , ModelMap model) {
		KioskRegisterInfo kmsinfo = new KioskRegisterInfo();
		Random random = new Random();
		kmsinfo.setKioskId(String.format("KD-%06d", random.nextInt(100000)));
		kmsinfo.setPinCode("adc7f1919df8595ac054cb944aa6a470fa5884a8b272877780ac97b488cf879");
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		kmsinfo.setHardwareRegisterDate(df.format(new Date()));
		model.addAttribute("keyform", kmsinfo);
		return "kiosk.register";
	}
	
	

	@RequestMapping(value = { "/kiosk-register" }, method = RequestMethod.POST)
	public String saveForm(@ModelAttribute("keyform") KioskRegisterInfo keyform , ModelMap model, BindingResult result) {
		
		kioskRegisterService.validate(keyform,result);
		model.addAttribute("keyform",  keyform);
		
		if(result.hasErrors()){
			return "kiosk.register";
		}
		
		//save
		kioskRegisterService.save(keyform);
		String successMesg = " Registered successfully";
		model.addAttribute("success", successMesg);
		
		return "redirect:/kiosk-register";
	}

}
