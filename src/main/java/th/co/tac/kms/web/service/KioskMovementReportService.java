package th.co.tac.kms.web.service;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.co.tac.kms.web.controller.model.KioskMovement;
import th.co.tac.kms.web.controller.model.KioskMovementCritiria;
import th.co.tac.kms.web.dao.KmsKioskTransactionInfoDao;
import th.co.tac.kms.web.dao.KmsMasterDistrictDao;
import th.co.tac.kms.web.dao.KmsMasterProvinceDao;
import th.co.tac.kms.web.dao.KmsMasterTambonDao;
import th.co.tac.kms.web.dao.MachineInfoDao;
import th.co.tac.kms.web.dao.model.KmsKioskTransactionInfo;

@Service("KioskMovementReportService")
public class KioskMovementReportService extends AbstractService {

	@Autowired
	KmsMasterProvinceDao kmsMasterProvinceDao;

	@Autowired
	KmsMasterDistrictDao kmsMasterDistrictDao;

	@Autowired
	KmsMasterTambonDao kmsMasterTambonDao;

	@Autowired
	KmsKioskTransactionInfoDao transactionInfoDao;

	@Autowired
	MachineInfoDao machineInfoDao;

	public List<KioskMovement> getMovementReportList(KioskMovementCritiria critiria) {
		Long beginTime = System.currentTimeMillis();
		try {
			List<String> kioskIdList = null;
			//Integer provinceId = critiria.
			String newToDate = addDay(critiria.getToDate());
			
			String kioskId = critiria.getKioskId();
			if (kioskId != null && !kioskId.equals("")) {
				
				kioskIdList = new ArrayList<String>();
				kioskIdList.add(kioskId);
			} else {
				
				//machineInfoDao.getKioskId(provinceId, districtId, tambonId);
			}

			List<KmsKioskTransactionInfo> kioskMovementreports = transactionInfoDao.getTransaction(
					critiria.getFromDate(), newToDate, kioskIdList, critiria.getStatus(),
					critiria.getTelphoneNo());

			List<KioskMovement> kioskMovements = new ArrayList<>();
			KioskMovement kioskMovement = null;

			for (KmsKioskTransactionInfo transactionInfo : kioskMovementreports) {
				kioskMovement = new KioskMovement();
				try {
					// Clone bean
					BeanUtils.copyProperties(kioskMovement, transactionInfo);

					kioskMovement.setInsertedAmount(transactionInfo.getPurchaseAmount().add(transactionInfo.getKioskFee()) );
					

				} catch (IllegalAccessException e) {
					log_error("", e);
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					log_error("", e);
				}
			}
			return kioskMovements;
		} finally {
			Long endTime = System.currentTimeMillis();
			Long difference = endTime - beginTime;
			log_info("getShiftReportList Method Time:" + difference);
		}
	}
	
	private String addDay(String dt){
		log_info("addDay dt"+ dt);
		Long beginTime = System.currentTimeMillis();
		try {
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		    Calendar c = Calendar.getInstance(); 
		    
				c.setTime(sdf.parse(dt));
				c.add(Calendar.DATE, 1); // number of days to add 
			    dt = sdf.format(c.getTime()); // dt is now the new date
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				log_error("", e);
			}
			finally{
			    Long endTime = System.currentTimeMillis(); 
				Long difference = endTime - beginTime;
				log_info("addDay Method Time:" + difference);
			}

		    return dt;	
	}
}

// kioskShift.setCoin2Value(kioskShift.getCoin2()*2);
// kioskShift.setCoin5Value(kioskShift.getCoin5()*5);
// kioskShift.setCoin10Value(kioskShift.getCoin10()*10);
// kioskShift.setBill20Value(kioskShift.getBill20()*20);
// kioskShift.setBill50Value(kioskShift.getBill50()*50);
// kioskShift.setBill100Value(kioskShift.getBill100()*100);
// kioskShift.setBill500Value(kioskShift.getBill500()*500);
// kioskShift.setBill1000Value(kioskShift.getBill1000()*1000);
// kioskShift.setBillAmount(kioskShift.getBill20()+kioskShift.getBill50()+kioskShift.getBill100()+kioskShift.getBill500()+kioskShift.getBill1000());
// kioskShift.setCoinAmount(kioskShift.getCoin1()+kioskShift.getCoin2()+kioskShift.getCoin5()+kioskShift.getCoin10());
// kioskShift.setCoinTotal(kioskShift.getCoin1Value()+kioskShift.getCoin2Value()+kioskShift.getCoin5Value()+kioskShift.getCoin10Value());
// kioskShift.setBillTotal(kioskShift.getBill20Value()+kioskShift.getBill50Value()+kioskShift.getBill100Value()+kioskShift.getBill500Value()+kioskShift.getBill1000Value());
// kioskShift.setAllTotal(kioskShift.getCoinTotal()+kioskShift.getBillTotal());
// kioskShifts.add(kioskShift);
// } catch (IllegalAccessException e) {
// log_error("", e);
// e.printStackTrace();
// } catch (InvocationTargetException e) {
// log_error("", e);
// }
// }
// return kioskShifts;
// }
// finally{
// Long endTime = System.currentTimeMillis();
// Long difference = endTime - beginTime;
// log_info("getShiftReportList Method Time:" + difference);
// }
// }
