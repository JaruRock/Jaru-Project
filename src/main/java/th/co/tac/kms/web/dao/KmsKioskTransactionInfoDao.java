// All needed DAO to be implemented

//KMStransactionDAO to render all the transactions in master_transaction table using transaction_ID

package th.co.tac.kms.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.dao.model.KmsKioskMachineInfo;
import th.co.tac.kms.web.dao.model.KmsKioskTransactionInfo;


@Repository("KmsKioskTransactionInfoDao")
public class KmsKioskTransactionInfoDao extends AbstractDao { 
	
	private static final long serialVersionUID = 8258736330960952034L;
	
	public String listToString(List<String> kioskId){
		String output = kioskId.toString();
		output = output.replaceAll("\\[", "('").replaceAll("\\]", "')").replaceAll(",", "','");
		return output;
	}
	
	public List<KmsKioskTransactionInfo> getTransaction(String startDate, String endDate,List<String> kioskId,String status,String payeePhone) {

		String kioskIdToString = listToString(kioskId);
		
		// If province_id given, find kiosk_id
		String transactionSql = " select * from kms_transaction"
				+ " where kiosk_id in " + kioskIdToString 
				+ " and trx_datetime >= to_timestamp(:startDate, 'YYYY-MM-DD') "
				+ " and trx_datetime <= to_timestamp(:endDate, 'YYYY-MM-DD') "
				+ " and trx_status =:status ";

		Map<String, String> parameters = new HashMap<String, String>(); 
		parameters.put("startDate", startDate);
		parameters.put("endDate", endDate);
		parameters.put("status", status);
		
		if(payeePhone != null){
			transactionSql = transactionSql + " and payee_phone =:payeePhone ";
			parameters.put("payeePhone", payeePhone);
		}
		else{
			log_debug("input is invalid");
		}

		//List<KmsKioskMachineInfo> kioskIds = new ArrayList<KmsKioskMachineInfo>();

		try{
			
		
		return parameterJdbcTemplate.query(transactionSql, parameters, new RowMapper<KmsKioskTransactionInfo>() {
			public KmsKioskTransactionInfo mapRow(ResultSet row, int rowNum) throws SQLException {
				KmsKioskTransactionInfo transactionInfo = new KmsKioskTransactionInfo();

				transactionInfo.setNumberOfRows(row.getString("no"));
				transactionInfo.setTrxDateTime(row.getString("trx_dateTime"));
				transactionInfo.setKioskId(row.getString("kiosk_id"));
				transactionInfo.setStatus(row.getString("trx_status"));
				transactionInfo.setServiceId(row.getString("service_id"));
				transactionInfo.setPayeePhone(row.getString("payee_phone"));
				transactionInfo.setTransactionId(row.getString("tx_id"));
				transactionInfo.setBeforeCreditAmount(row.getBigDecimal("before_credit_amount"));
				transactionInfo.setPurchaseAmount(row.getBigDecimal("purchase_amount"));
				transactionInfo.setKioskFee(row.getBigDecimal("kiosks_fee"));		
				transactionInfo.setPaymentAmount(row.getBigDecimal("payment_amount"));		
				transactionInfo.setStatus(row.getString("result"));
				
				return transactionInfo;
			}
		});
		}catch(EmptyResultDataAccessException e)
		
		{
			return null;}
		}

	}
	
