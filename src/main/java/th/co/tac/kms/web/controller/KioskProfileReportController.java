package th.co.tac.kms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import th.co.tac.kms.web.controller.model.KioskRegisterInfo;

@Controller
public class KioskProfileReportController extends AbstractController  {

	@RequestMapping(value = { "/report-profile" }, method = RequestMethod.GET)
	public String init(@ModelAttribute KioskRegisterInfo keyform , ModelMap model) {
//		model.addAttribute("keyform",  new KioskRegisterInfo());
		return "report.profile";
	}

}
