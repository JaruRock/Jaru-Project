package th.co.tac.kms.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.dao.model.KmsKioskShiftReport;

@Repository("KmsKioskShiftReportDao")
public class KmsKioskShiftReportDao extends AbstractDao {

	private static final long serialVersionUID = 8258736330960952034L;
	
	public List<KmsKioskShiftReport> getShiftReportList(String kioskId , String startShiftDate, String endShiftDate){
		
		String sql = " select * from kioskdev.kms_shift where kiosk_id= ? "
				+ "and start_shift_date >= to_timestamp(?, 'YYYY-MM-DD') "
				+ "and end_shift_date <= to_timestamp(?, 'YYYY-MM-DD') ";

		List<KmsKioskShiftReport> shiftReports = new ArrayList<KmsKioskShiftReport>();
		Object [] param = {kioskId,startShiftDate, endShiftDate};
		//Object[] types = {String.class};
		return jdbcTemplate.query(sql, param, new RowMapper<KmsKioskShiftReport>() {
			
			
			public KmsKioskShiftReport mapRow(ResultSet row, int rowNum) throws SQLException {
				KmsKioskShiftReport shiftReport = new KmsKioskShiftReport();
                
				shiftReport.setShiftId(row.getString("shift_id"));
				shiftReport.setKioskId(row.getString("kiosk_id"));
				shiftReport.setShiftDate(row.getString("shift_date"));
				shiftReport.setStartShiftDate(row.getString("start_shift_date"));
				shiftReport.setEndShiftDate(row.getString("end_shift_date"));
				shiftReport.setBillAmount(row.getInt("bill20"));
				shiftReport.setCoinAmount(row.getInt("bill50"));
				shiftReport.setBill20(row.getInt("bill20"));
				shiftReport.setBill50(row.getInt("bill50"));
				shiftReport.setBill100(row.getInt("bill100"));
				shiftReport.setBill500(row.getInt("bill500"));
				shiftReport.setBill1000(row.getInt("bill1000"));
				shiftReport.setCoin1(row.getInt("coin1"));
				shiftReport.setCoin2(row.getInt("coin2"));
				shiftReport.setCoin5(row.getInt("coin5"));
				shiftReport.setCoin10(row.getInt("coin10"));

				return shiftReport;

            }
        }); 
	}
}