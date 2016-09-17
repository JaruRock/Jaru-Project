package th.co.tac.kms.web.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import th.co.tac.kms.web.controller.model.KioskAuditReport;
import th.co.tac.kms.web.controller.model.KioskAuditReportCritiria;
import th.co.tac.kms.web.controller.model.UserInfo;
import th.co.tac.kms.web.service.KioskAuditReportService;
import th.co.tac.kms.web.service.UserService;

@Controller
@RequestMapping("/")
public class KioskAuditReportController extends AbstractController {

	@Autowired
	private KioskAuditReportService kioskAuditReport ;
	
	
	@RequestMapping(value = { "/report-audit" }, method = RequestMethod.GET)
	public String kioskAuditReport(ModelMap model,@ModelAttribute KioskAuditReportCritiria kioskAuditReportCritiria) {
		


//		List<KioskAuditReport> kioskAuditReportlist = kioskAuditReport.findByKioskAuditReport(kioskAuditReportCritiria);
//		
//
//		model.addAttribute("kioskAuditReport", kioskAuditReportlist);
		
		return "report.audit";
			
	}
	
	@RequestMapping(value = { "/report-audit-search" }, method = RequestMethod.GET)
	public String kioskAuditReportSearch(ModelMap model,@ModelAttribute KioskAuditReportCritiria kioskAuditReportCritiria) {
		


		List<KioskAuditReport> kioskAuditReportlist = kioskAuditReport.findByKioskAuditReport(kioskAuditReportCritiria);
		

		model.addAttribute("kioskAuditReport", kioskAuditReportlist);
		
		return "report.audit";
			
	}
	
	
}
