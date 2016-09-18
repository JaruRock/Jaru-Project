package th.co.tac.kms.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import th.co.tac.kms.web.dao.model.QueryCustomerBalance;

@Service("customerBalnceService")
public class CustomerBalanceService {
	
	public List<QueryCustomerBalance> queryCustomerBalnce(){
		
		List<QueryCustomerBalance> customerList = new ArrayList<QueryCustomerBalance>();
		QueryCustomerBalance customer = new QueryCustomerBalance();
		customer.setNo("1");
		customer.setDateAction("8/16/2016 16:59");
		customer.setTelephoneNoAndOperator("081-431-7322 (AIS)");
		customer.setKioskOwner("AIS");
		customer.setAction("เติมเงิน");
		customer.setTransactionId("xxxxxx");
		customer.setKioskId("xxx");
		customer.setKioskSerialNo("xxxx-xx");
		customer.setPreviousCradit("200");
		customer.setCashIn("20");
		customer.setTransactionAmout("80");
		customer.setTransectionFee("2");
		customer.setRemainingCredit("80");
		customer.setStatusAction("Fail");
		customer.setErrorCode("xx-xxx");
		customerList.add(customer);
		return customerList;
	}

}
