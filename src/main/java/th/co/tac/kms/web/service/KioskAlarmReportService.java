package th.co.tac.kms.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import th.co.tac.kms.web.controller.model.KioskAlarmReport;
import th.co.tac.kms.web.controller.model.KioskAlarmReportCritiria;
import th.co.tac.kms.web.controller.model.KioskHarewareStatusReport;

@Service("kioskAlarmReportService")
public class KioskAlarmReportService {
	
	public List<KioskAlarmReport> findByKioskAlarmReport(KioskAlarmReportCritiria kioskAlarmReportCritiria) {
		// List<KioskAuditReport> kioskAuditReportList = new
		// ArrayList<KioskAuditReport>();

		// return kioskAuditReportList;

		return mockFindByKioskAlarmReport();
	}

	private List<KioskAlarmReport> mockFindByKioskAlarmReport() {

		List<KioskAlarmReport> kioskAlarmReportList = new ArrayList<KioskAlarmReport>();

		for (int i = 0; i < 20; i++) {
			KioskAlarmReport tmp = new KioskAlarmReport();

			tmp.setDateTimeStart("01/06/2556");
			tmp.setDateTimeClear("06/06/2556");
			tmp.setOperator("Operator" + i);
			tmp.setKioskId("Kiosk 0" + i);
			tmp.setStatusNoti("Normal");
			tmp.setErrorCode("PW-001");
			tmp.setErrorDescription("Lost Power Supply");
			tmp.setKioskSerialNumber("KO34235" + i);

			kioskAlarmReportList.add(tmp);
		}

		return kioskAlarmReportList;
	}

	// HardWare Status Detail
	public List<KioskHarewareStatusReport> getHardwareStatusDetail() {

		return mockHardwareStatusDetail();
	}

	private List<KioskHarewareStatusReport> mockHardwareStatusDetail() {

		List<KioskHarewareStatusReport> kioskHarewareStatusReport = new ArrayList<KioskHarewareStatusReport>();

		for (int i = 0; i < 10; i++) {
			KioskHarewareStatusReport tmp = new KioskHarewareStatusReport();

			tmp.setDateTimeStart("06/09/2556");
			tmp.setDateTimeClear("15/10/2557");
			tmp.setOperator("Operator" + i);
			tmp.setNameTa("ชื่อสมมุติTa" + 1);
			tmp.setPhoneMa("08154563" + i);
			tmp.setReferenceName("Somchai");
			tmp.setKioskId("874254" + i);
			tmp.setKioskSerialNumber("KO34235" + i);
			tmp.setFristName("ชื่อจริง");
			tmp.setLastName("นามสกุล");

			kioskHarewareStatusReport.add(tmp);
		}

		return kioskHarewareStatusReport;
	}
}