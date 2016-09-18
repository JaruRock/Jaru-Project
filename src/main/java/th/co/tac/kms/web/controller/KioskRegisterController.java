package th.co.tac.kms.web.controller;

import javax.validation.Valid;

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
		kmsinfo.setKioskId(String.format("KD-%06d", 1));
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
		String successMesg = " registered successfully";
		model.addAttribute("success", successMesg);
		
		return "redirect:/kiosk-register";
	}

}
