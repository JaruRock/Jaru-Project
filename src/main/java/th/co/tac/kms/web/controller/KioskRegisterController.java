package th.co.tac.kms.web.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import th.co.tac.kms.web.controller.model.KioskRegisterInfo;

@Controller
@RequestMapping("/")
public class KioskRegisterController extends AbstractController  {
	

	@RequestMapping(value = { "/kiosk-register" }, method = RequestMethod.GET)
	public String newUser(@ModelAttribute KioskRegisterInfo keyform , ModelMap model) {
		model.addAttribute("keyform",  new KioskRegisterInfo());
		return "kiosk.register";
	}

}
