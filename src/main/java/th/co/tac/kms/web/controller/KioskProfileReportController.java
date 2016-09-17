package th.co.tac.kms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class KioskProfileReportController extends AbstractController  {

	@RequestMapping(value = { "/report-profile" }, method = RequestMethod.GET)
	public String init() {
//		model.addAttribute("keyform",  new KioskRegisterInfo());
		return "report.profile";
	}

}
