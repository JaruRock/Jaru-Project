package th.co.tac.kms.web.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

import th.co.tac.kms.web.controller.model.KioskMovement;
import th.co.tac.kms.web.controller.model.KioskMovementCritiria;
import th.co.tac.kms.web.service.MasterLocationService;

@Controller
@RequestMapping("/")
public class KioskMovementReportController {
	
	@Autowired MasterLocationService masterLocationService;
	
	@ModelAttribute("navClassActiveReport")
	public String menuActive() {
		return "active"; // TODO: active navigate menu
	}
	
	@RequestMapping(value = { "/report-movement" }, method = RequestMethod.GET)
	public String kioskMovementReportListGet(ModelMap model) {	 
		KioskMovementCritiria kioskMovementCritiria = new KioskMovementCritiria(); 
		model.addAttribute("kioskMovementCritiria", kioskMovementCritiria);
		return "report.movement";
	}
	
	@RequestMapping(value = { "/report-movement" }, method = RequestMethod.POST)
	public String kioskMovementReportListPost(KioskMovementCritiria criteria,ModelMap model) {
		
		System.out.println(new Gson().toJson(criteria));
		List<KioskMovement> kioskMovementList = new ArrayList<KioskMovement>();
		
		KioskMovement kioskMovement = new KioskMovement();

		System.out.println(" kioskMovementList Start ");
		kioskMovement.setNumberOfRows("1");// ตั้งว่ามีกี่บรรทัด
		kioskMovement.setTrxDateTime("9 7 2015 13:50");//วัน-เวลาที่ทำรายการ
		kioskMovement.setKioskId("89-PHP Fl.21");//เลขที่เครื่อง KIOSK
		kioskMovement.setServiceId("วันทูคอล");//บริการ
		kioskMovement.setAgentId("2011090001");//หมายเลขผู้ทำรายการ
		kioskMovement.setPayeePhone("817576217");//หมายเลขโทรศัพท์ลูกค้า
		kioskMovement.setTransactionId("2911811839");//TXID
		kioskMovement.setBeforeCreditAmount(new BigDecimal("4"));//Credit ยกมา
		kioskMovement.setPurchaseAmount(new BigDecimal("20"));//Product AMT
		kioskMovement.setKioskFee(new BigDecimal("0"));//ค่าธรรมเนียม
		kioskMovement.setInsertedAmount(new BigDecimal("20"));//จำนวนที่ต้องชำระ
		kioskMovement.setUsedCredit(new BigDecimal("4"));//Credit ถูกใช้
		kioskMovement.setNetAmount(new BigDecimal("16"));//ยอดที่ต้องชำระ
		kioskMovement.setPaymentAmount(new BigDecimal("20"));//จำนวนเงินที่หยอด
		kioskMovement.setAddedCredit(new BigDecimal("4"));//Credit เพิ่ม
		kioskMovement.setRollOveredCredit(new BigDecimal("4"));//Credit ยกไป
		kioskMovement.setStatus("Success");//Result
		
		kioskMovementList.add(kioskMovement);
		model.addAttribute("kioskMovementList", kioskMovementList);
		
		System.out.println(" kioskMovementList Start ");
		return "report.movement";
	}
	
	
}
