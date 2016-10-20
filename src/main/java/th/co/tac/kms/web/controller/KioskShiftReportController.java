package th.co.tac.kms.web.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import th.co.tac.kms.web.controller.model.KioskShift;
import th.co.tac.kms.web.controller.model.KioskShiftCritiria;
import th.co.tac.kms.web.service.KioskShiftReportService;

@Controller
public class KioskShiftReportController extends AbstractController {
	
	@Autowired
	private KioskShiftReportService shiftReportService;
	
	@ModelAttribute("navClassActiveReport")
	public String menuActive() {
		return "active"; // TODO: active navigate menu
	}
	
	@RequestMapping(value = { "/report-shift" }, method = RequestMethod.GET)
	public String kioskMovementReportList(ModelMap model) {
		log_info("IN kioskMovementReportList RequestMethodGET");
		KioskShiftCritiria kioskShiftCritiria = new KioskShiftCritiria(); 
		model.addAttribute("kioskShiftCritiria", kioskShiftCritiria);
		model.addAttribute("showModal", "hide");
		log_info("OUT kioskMovementReportList RequestMethodGET");
		return "report.shift";
	}
	
	@RequestMapping(value = { "/report-shift" }, method = RequestMethod.POST)
	public String kioskMovementReportListPOST(KioskShiftCritiria kioskShiftCritiria,ModelMap model) {
		Long beginTime = System.currentTimeMillis();
		log_info("IN kioskMovementReportListPOST ");
		try{
		List<KioskShift> kioskShiftList = shiftReportService.getShiftReportList(kioskShiftCritiria);
		//String kioskAddr = shiftReportService.getKioskLocation(kioskShiftCritiria.getKioskId());
		for (KioskShift kioskShift : kioskShiftList) {
			
			kioskShift.setKioskAddr(shiftReportService.getKioskLocation(kioskShift.getKioskId()));
		}
		
		model.addAttribute("kioskShiftCritiria", kioskShiftCritiria);
		model.addAttribute("kioskShiftList", kioskShiftList);   
		model.addAttribute("showModal", "show");
		log_info("OUT kioskMovementReportListPOST ");
		return "report.shift";
		}finally{
			Long endTime = System.currentTimeMillis(); 
			Long difference = endTime - beginTime;
			log_info("KioskShiftReportService Time:" + difference);
		}
	}
	

    
//	@RequestMapping(value = { "/report-shift-detail" }, method = RequestMethod.GET)
//	public String kioskMovementReportDetailListPOST(KioskShiftCritiria kioskShiftCritiria,ModelMap model, @RequestParam(value="a") String a) {
//		logger.debug("IN kioskMovementReportDetailListPOST >>  " + a );
//		List<KioskShift> kioskShiftList = new ArrayList<KioskShift>(); 
//		
//    	
//    	KioskShift tmp = new KioskShift();
//    	tmp.setShiftId("1543233");
//    	tmp.setOpenShiftDate("1/7/2016 19:00:0");
//    	tmp.setCloseShiftDate("1/8/2016 15:00:0");
//    	tmp.setTelephoneNo("0987564336");
//    	tmp.setKioskId("001");
//    	tmp.setAddress("56 ซ.พหลโธธิน 8 สามเสนใน พญาไท กรุงเทพฯ ");
// 
//    	kioskShiftList.add(tmp);
//
//		model.addAttribute("kioskShiftCritiria", kioskShiftCritiria);
//		model.addAttribute("kioskShiftList", kioskShiftList);
//		model.addAttribute("showModal", "show");
//		model.addAttribute("a", a);
//		logger.debug("OUT kioskMovementReportDetailListPOST ");
//		return "report.shift.detail";
//	}
	
}