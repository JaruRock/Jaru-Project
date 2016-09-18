package th.co.tac.kms.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import th.co.tac.kms.web.controller.model.KioskShift;
import th.co.tac.kms.web.controller.model.KioskShiftCritiria;

@Controller
public class KioskShiftReportController {

	@ModelAttribute("navClassActiveReport")
	public String menuActive() {
		return "active"; // TODO: active navigate menu
	}
	
	@RequestMapping(value = { "/report-shift" }, method = RequestMethod.GET)
	public String kioskMovementReportList(ModelMap model) {
		
		KioskShiftCritiria kioskShiftCritiria = new KioskShiftCritiria(); 
		model.addAttribute("kioskShiftCritiria", kioskShiftCritiria);
 
		return "report.shift";
	}
	
	
	@RequestMapping(value = { "/report-shift" }, method = RequestMethod.POST)
	public String kioskMovementReportListPOST(KioskShiftCritiria kioskShiftCritiria,ModelMap model) {
		
		List<KioskShift> kioskShiftList = new ArrayList(); 
		
	    for(int i=0;i<9;i++){
	    	
	    	KioskShift tmp = new KioskShift();
	    	tmp.setShiftId("1543233"+i);
	    	tmp.setOpenShiftDate("1/7/2016 19:00:0"+i);
	    	tmp.setCloseShiftDate("1/8/2016 15:00:0"+i);
	    	tmp.setTelephoneNo("0987564336");
	    	tmp.setKioskId("00"+i);
	    	tmp.setAddress(i+"56 ซ.พหลโธธิน 8 สามเสนใน พญาไท กรุงเทพฯ ");
	 
	    	kioskShiftList.add(tmp);
	    }
		 
		
		model.addAttribute("kioskShiftCritiria", kioskShiftCritiria);
		model.addAttribute("kioskShiftList", kioskShiftList);
 
		return "report.shift";
	}
	
}
