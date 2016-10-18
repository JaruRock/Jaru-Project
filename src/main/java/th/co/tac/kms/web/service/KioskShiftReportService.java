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

import th.co.tac.kms.web.controller.model.KioskShift;
import th.co.tac.kms.web.controller.model.KioskShiftCritiria;
import th.co.tac.kms.web.dao.KmsKioskLocationInfoDao;
import th.co.tac.kms.web.dao.KmsKioskShiftReportDao;
import th.co.tac.kms.web.dao.KmsMasterDistrictDao;
import th.co.tac.kms.web.dao.KmsMasterProvinceDao;
import th.co.tac.kms.web.dao.KmsMasterTambonDao;
import th.co.tac.kms.web.dao.MachineInfoDao;
import th.co.tac.kms.web.dao.model.KmsKioskDistrictMaster;
import th.co.tac.kms.web.dao.model.KmsKioskLocationInfo;
import th.co.tac.kms.web.dao.model.KmsKioskMachineInfo;
import th.co.tac.kms.web.dao.model.KmsKioskProvinceMaster;
import th.co.tac.kms.web.dao.model.KmsKioskShiftReport;
import th.co.tac.kms.web.dao.model.KmsKioskTambonMaster;

@Service("KioskShiftReportService")
public class KioskShiftReportService extends AbstractService {
	
	@Autowired
	KmsKioskShiftReportDao shiftReportDao;
	
	@Autowired
	MachineInfoDao machineInfoDao;
	
	@Autowired
	KmsKioskLocationInfoDao kmsLocationDao;
	
	@Autowired
	KmsMasterProvinceDao kmsMasterProvinceDao;
	
	@Autowired
	KmsMasterDistrictDao kmsMasterDistrictDao;
	
	@Autowired
	KmsMasterTambonDao kmsMasterTambonDao;
	/*
 	Class kms_Bean = dao.kms_shift,
	Class location_bean = dao.location
	  */
	public String getKioskLocation(String kioskId){
		String location=null;
		KmsKioskMachineInfo kmsMachine = machineInfoDao.getAddress(kioskId);
		String locationId = kmsMachine.getLocationId();
		KmsKioskLocationInfo locationInfo = kmsLocationDao.getLocation(locationId);		
		String address = locationInfo.getKioskAddress();
		String soi = locationInfo.getSoi();
		String road = locationInfo.getRoad();
		String moo = locationInfo.getMoo();
		Integer postal = locationInfo.getPostalCode();
		Integer provinceId = locationInfo.getProvinceId();
		KmsKioskProvinceMaster province = kmsMasterProvinceDao.getProvince(provinceId);
		Integer districtId = locationInfo.getDistrictId();
		KmsKioskDistrictMaster district = kmsMasterDistrictDao.getDistrict(districtId);
		Integer tambonId = locationInfo.getTambonId();
		KmsKioskTambonMaster tambon = kmsMasterTambonDao.getTambon(tambonId);
		location = address + " " + soi + " " + road + " " + moo + " "  + tambon.getTambonName() + " " + district.getDistrictName() + " " + province.getProvinceName() + " " + postal;
		//log_info(location);
		return location;
	
		
	}
	
	public List<KioskShift> getShiftReportList(KioskShiftCritiria critiria) {
		
		String newToDate = addDay(critiria.getToDate());
		List<KmsKioskShiftReport> kioskShiftReports = shiftReportDao.getShiftReportList(
				critiria.getKioskId(), critiria.getFromDate(), newToDate);
		List<KioskShift> kioskShifts = new ArrayList<>();
		KioskShift kioskShift = null;
		for (KmsKioskShiftReport kmsKioskShiftReport : kioskShiftReports) {
			kioskShift = new KioskShift();
			try {
//				Clone bean
				BeanUtils.copyProperties(kioskShift, kmsKioskShiftReport);
				
				kioskShift.setCoin1Value(kioskShift.getCoin1()*1);
				kioskShift.setCoin2Value(kioskShift.getCoin2()*2);
				kioskShift.setCoin5Value(kioskShift.getCoin5()*5);
				kioskShift.setCoin10Value(kioskShift.getCoin10()*10);
				kioskShift.setBill20Value(kioskShift.getBill20()*20);
				kioskShift.setBill50Value(kioskShift.getBill50()*50);
				kioskShift.setBill100Value(kioskShift.getBill100()*100);
				kioskShift.setBill500Value(kioskShift.getBill500()*500);
				kioskShift.setBill1000Value(kioskShift.getBill1000()*1000);
				kioskShift.setBillAmount(kioskShift.getBill20()+kioskShift.getBill50()
					+kioskShift.getBill100()+kioskShift.getBill500()+kioskShift.getBill1000());
				
				kioskShift.setCoinAmount(kioskShift.getCoin1()+kioskShift.getCoin2()
					+kioskShift.getCoin5()+kioskShift.getCoin10());
				kioskShift.setCoinTotal(kioskShift.getCoin1Value()+kioskShift.getCoin2Value()+kioskShift.getCoin5Value()+kioskShift.getCoin10Value());
				kioskShift.setBillTotal(kioskShift.getBill20Value()+kioskShift.getBill50Value()
				+kioskShift.getBill100Value()+kioskShift.getBill500Value()+kioskShift.getBill1000Value());
				
				kioskShift.setAllTotal(kioskShift.getCoinTotal()+kioskShift.getBillTotal());
				
				kioskShifts.add(kioskShift);
			} catch (IllegalAccessException e) {
				log_error("", e);
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				log_error("", e);
			}
		}
		return kioskShifts;
	}
	
	private String addDay(String dt){
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
	    Calendar c = Calendar.getInstance(); 
	    try {
			c.setTime(sdf.parse(dt));
			c.add(Calendar.DATE, 1); // number of days to add 
		    dt = sdf.format(c.getTime()); // dt is now the new date
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			log_error("", e);
		} 	    
	    return dt;
	}
}
