package th.co.tac.kms.web.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import th.co.tac.kms.web.dao.model.QueryCustomerBalance;
import th.co.tac.kms.web.dao.model.QueryCustomerBlanceSearchCriterion;
import th.co.tac.kms.web.service.CustomerBalanceService;

@Controller
@RequestMapping("/")
public class CustomerBalanceController {
	
	@Autowired
	private CustomerBalanceService customerBalnceService;
	
	@RequestMapping(value = { "/report-customer-balance" }, method = RequestMethod.GET)
	public String queryCustomerBalance(ModelMap model) {
		//List <KioskProfile> kioskprofile = new ArrayList<KioskProfile>();
		model.addAttribute("kiosk",new QueryCustomerBlanceSearchCriterion() );
		return "report.customerBalance";
	}
	
	@RequestMapping(value = { "/report-customer-balance-search" }, method = RequestMethod.POST)
	public String queryCustomerBalanceSearch( QueryCustomerBlanceSearchCriterion kiosk ,ModelMap model) {
		List <QueryCustomerBalance> kioskprofile = new ArrayList<QueryCustomerBalance>();
		kioskprofile = customerBalnceService.queryCustomerBalnce();
		model.addAttribute("kiosk", kiosk);
		model.addAttribute("query",kioskprofile );
		return "report.customerBalance";
	}

}
