package th.co.tac.kms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class KioskShiftReportController {

	@ModelAttribute("navClassActiveReport")
	public String menuActive() {
		return "active"; // TODO: active navigate menu
	}
	
	@RequestMapping(value = { "/report-shift" }, method = RequestMethod.GET)
	public String kioskMovementReportList(ModelMap model) {
		return "report.shift";
	}
	
}
