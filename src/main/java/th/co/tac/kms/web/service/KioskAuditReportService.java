package th.co.tac.kms.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.tac.kms.web.controller.model.KioskAlarmReport;
import th.co.tac.kms.web.controller.model.KioskAlarmReportCritiria;
import th.co.tac.kms.web.controller.model.KioskAuditReport;
import th.co.tac.kms.web.controller.model.KioskAuditReportCritiria;

@Service("kioskAuditReportService")
@Transactional
public class KioskAuditReportService {

	 public List<KioskAuditReport> findByKioskAuditReport(KioskAuditReportCritiria kioskAuditReportCritiria) {
		  //List<KioskAuditReport> kioskAuditReportList = new ArrayList<KioskAuditReport>();

		  //return kioskAuditReportList;
		  
		  return mockFindByKioskAuditReport();
	}
		 
 

 
 private  List<KioskAuditReport> mockFindByKioskAuditReport(){
  
  List<KioskAuditReport> kioskAuditReportList = new ArrayList<KioskAuditReport>();
  
  for(int i=0;i<20;i++){
   KioskAuditReport tmp = new KioskAuditReport();
   
   tmp.setOperator("Operator"+i);
   tmp.setNetworkMa("Network MA"+i);
   tmp.setPhoneMa("08154563"+i);
   tmp.setTypeMa("นิติบุคล");
   tmp.setReferenceName("Somchai");
   tmp.setPhonTa("09854522"+i);
   tmp.setTypeTa("บุคคลธรรมดา");
   tmp.setKioskId("874254"+i);
   tmp.setKioskSerialNumber("KO34235"+i);
   tmp.setFristName(" นายทดสอบ " );
   
   
   
   kioskAuditReportList.add(tmp);
  }
  
  return kioskAuditReportList;
 }
}