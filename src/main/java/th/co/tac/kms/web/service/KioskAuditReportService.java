package th.co.tac.kms.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.tac.kms.web.controller.model.KioskAuditReport;
import th.co.tac.kms.web.controller.model.KioskAuditReportCritiria;

@Service("kioskAuditReportService")
@Transactional
public class KioskAuditReportService {

	public List<KioskAuditReport> findByKioskAuditReport(KioskAuditReportCritiria kioskAuditReportCritiria) {
		List<KioskAuditReport> kioskAuditReportList = new ArrayList<KioskAuditReport>();

		return kioskAuditReportList;
	}
	

}
