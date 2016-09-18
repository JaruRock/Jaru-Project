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

import th.co.tac.kms.web.controller.model.KioskAlarmReport;
import th.co.tac.kms.web.controller.model.KioskAlarmReportCritiria;
import th.co.tac.kms.web.controller.model.KioskAuditReport;
import th.co.tac.kms.web.controller.model.KioskAuditReportCritiria;
import th.co.tac.kms.web.controller.model.KioskHarewareStatusReport;
import th.co.tac.kms.web.controller.model.UserInfo;
import th.co.tac.kms.web.service.KioskAlarmReportService;
import th.co.tac.kms.web.service.KioskAuditReportService;
import th.co.tac.kms.web.service.UserService;

@Controller
@RequestMapping("/")
public class KioskAlarmReportController extends AbstractController {

	@Autowired
	private KioskAlarmReportService kioskAlarmReport ;
	
	
	@RequestMapping(value = { "/report-alarm" }, method = RequestMethod.GET)
	public String kioskAlarmReport(ModelMap model,@ModelAttribute KioskAlarmReportCritiria kioskAlarmReportCritiria) {
		



		
		return "report.alarm";
			
	}
	
	@RequestMapping(value = { "/report-alarm-search" }, method = RequestMethod.GET)
	public String kioskAlarmReportSearch(ModelMap model,@ModelAttribute KioskAlarmReportCritiria kioskAlarmReportCritiria) {
		


		List<KioskAlarmReport> kioskAlarmReportlist = kioskAlarmReport.findByKioskAlarmReport(kioskAlarmReportCritiria);
		

		model.addAttribute("kioskAlarmReport", kioskAlarmReportlist);
		
		return "report.alarm";
			
	}
	
	@RequestMapping(value = { "/report-hardware-status" }, method = RequestMethod.GET)
	public String kioskHardwareStatus(ModelMap model) {
		
		
		List<KioskHarewareStatusReport> kioskHarewareStatusReportlist = kioskAlarmReport.getHardwareStatusDetail();
		

		model.addAttribute("kioskHarewareStatusReportlist", kioskHarewareStatusReportlist);


		
		return "report.alarm";
			
	}
	
}
