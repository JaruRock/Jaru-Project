package th.co.tac.kms.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.tac.kms.web.controller.model.KioskAuditReport;
import th.co.tac.kms.web.controller.model.KioskAuditReportCritiria;
import th.co.tac.kms.web.controller.model.UserInfo;
import th.co.tac.kms.web.dao.UserDao;
import th.co.tac.kms.web.dao.model.User;

@Service("kioskAuditReportCritiriaService")
@Transactional
public class KioskAuditReportCritiriaService {


	
	public List<KioskAuditReportCritiria> findByKioskAuditReportCritiria(String username) {
		List<KioskAuditReportCritiria> kioskAuditReportCritiriaList = new ArrayList<KioskAuditReportCritiria>();

		return kioskAuditReportCritiriaList;
	}
	
}
