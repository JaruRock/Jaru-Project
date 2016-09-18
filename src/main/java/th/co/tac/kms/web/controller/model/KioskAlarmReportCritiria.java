package th.co.tac.kms.web.controller.model;

import java.io.Serializable;

public class KioskAlarmReportCritiria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -477575547772327719L;




	
	
	private String operator;//Operator
	private String networkMa;//ชื่อ Network MA *
	private String netWorkTa ;//ชื่อ Network TA *
	private String province;//จังหวัด
	private String district;//อำเภอ
	private String subDistri;//ตำบล
	private String model;//Model
	private String vendor;//Vendor
	private String kioskId;//รหัสตู้เติมเงิน (Kiosk ID)
	private String kioskSerialNumber ;//หมายเลขเครื่องตู้เติมเงิน (Kiosk Serial Number)
	private String statusKiosk;//สถานะตู้เติมเงิน
	private String startDateFrom;
	private String startDateTo;
	private String clearDateFrom;
	private String clearDateTo;
	

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getStartDateFrom() {
		return startDateFrom;
	}
	public void setStartDateFrom(String startDateFrom) {
		this.startDateFrom = startDateFrom;
	}
	public String getStartDateTo() {
		return startDateTo;
	}
	public void setStartDateTo(String startDateTo) {
		this.startDateTo = startDateTo;
	}
	public String getClearDateFrom() {
		return clearDateFrom;
	}
	public void setClearDateFrom(String clearDateFrom) {
		this.clearDateFrom = clearDateFrom;
	}
	public String getClearDateTo() {
		return clearDateTo;
	}
	public void setClearDateTo(String clearDateTo) {
		this.clearDateTo = clearDateTo;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getNetworkMa() {
		return networkMa;
	}
	public void setNetworkMa(String networkMa) {
		this.networkMa = networkMa;
	}
	public String getNetWorkTa() {
		return netWorkTa;
	}
	public void setNetWorkTa(String netWorkTa) {
		this.netWorkTa = netWorkTa;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getSubDistri() {
		return subDistri;
	}
	public void setSubDistri(String subDistri) {
		this.subDistri = subDistri;
	}
	public String getKioskId() {
		return kioskId;
	}
	public void setKioskId(String kioskId) {
		this.kioskId = kioskId;
	}
	public String getKioskSerialNumber() {
		return kioskSerialNumber;
	}
	public void setKioskSerialNumber(String kioskSerialNumber) {
		this.kioskSerialNumber = kioskSerialNumber;
	}
	public String getStatusKiosk() {
		return statusKiosk;
	}
	public void setStatusKiosk(String statusKiosk) {
		this.statusKiosk = statusKiosk;
	}

	
}
