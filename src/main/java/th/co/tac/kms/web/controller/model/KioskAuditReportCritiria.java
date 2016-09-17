package th.co.tac.kms.web.controller.model;

import java.io.Serializable;

public class KioskAuditReportCritiria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3389420796763161469L;

	
	private String fromDate ;//From Date
	private String toDate;//To Date
	private String operator;//Operator
	private String networkMa;//ชื่อ Network MA *
	private String netWorkTa ;//ชื่อ Network TA *
	private String province;//จังหวัด
	private String district;//อำเภอ
	private String subDistri;//ตำบล
	private String kioskId;//รหัสตู้เติมเงิน (Kiosk ID)
	private String kioskSerialNumber ;//หมายเลขเครื่องตู้เติมเงิน (Kiosk Serial Number)
	private String statusKiosk;//สถานะตู้เติมเงิน
	
	
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
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
