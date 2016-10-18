// All needed DAO to be implemented

//KMStransactionDAO to render all the transactions in master_transaction table using transaction_ID

package th.co.tac.kms.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.dao.model.KmsKioskTransactionInfo;


@Repository("KmsKioskTransactionInfoDao")
public class KmsKioskTransactionInfoDao extends AbstractDao { 
	
	private static final long serialVersionUID = 8258736330960952034L;
	
	
	public List<KmsKioskTransactionInfo> gettransaction(String kioskId, String startDate, String endDate,String status){
		
		//If ID given
		String transactionSql = " select trx_datetime, payee_phone, trx_status from kms_transaction where kiosk_id= ? "
				+ "and trx_datetime >= to_timestamp(?, 'YYYY-MM-DD') "
				+ "and trx_datetime <= to_timestamp(?, 'YYYY-MM-DD') "
				+ "and trx_status = ?";
		
		//If No ID given
		String transactionSql2 = " select trx_datetime, payee_phone, trx_status from kms_transaction"
				+ "where trx_datetime >= to_timestamp(?, 'YYYY-MM-DD') "
				+ "and trx_datetime <= to_timestamp(?, 'YYYY-MM-DD') "
				+ "and trx_status = ?";
		
		//If province and district given only, no kiosk_id
		String 	transactionSql3 = "select kms_kiosk_machine_info.kiosk_id from kms_kiosk_machine_info" 
				+ "Inner join kms_kiosk_location_info "
				+ "on kms_kiosk_machine_info.location_id = kms_kiosk_location_info.location_id"
				+ "where kms_kiosk_location_info.province_id = ?"
				+ "and kms_kiosk_location_info.district_id= ? ";
		
		//If Phone number given
				String transactionSql4 = " select trx_datetime, payee_phone, trx_status from kms_transaction"
						+ "where trx_datetime >= to_timestamp(?, 'YYYY-MM-DD') "
						+ "and trx_datetime <= to_timestamp(?, 'YYYY-MM-DD') "
						+ "and trx_status = ?"
						+ "and payee_phone = '?' ";
		
		
	
	List<KmsKioskTransactionInfo> transactionInfos = new ArrayList<KmsKioskTransactionInfo> ();
	Object [] param = {kioskId,startDate,endDate,status};
	
	
	return jdbcTemplate.query(transactionSql, param, new RowMapper<KmsKioskTransactionInfo>() {
	
		public KmsKioskTransactionInfo mapRow(ResultSet row, int rowNum) throws SQLException {
			KmsKioskTransactionInfo transactionInfo = new KmsKioskTransactionInfo(); 

			transactionInfo.setKioskId(row.getString("kiosk_id"));
			transactionInfo.setTrxDateTime(row.getString("trx_dateTime"));
			transactionInfo.setTrxStatus(row.getString("trx_status"));
			transactionInfo.setPayeePhone(row.getString("payee_phone"));

			return transactionInfo;
		}
	});
}}