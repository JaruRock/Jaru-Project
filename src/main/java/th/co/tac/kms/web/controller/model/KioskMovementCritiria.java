package th.co.tac.kms.web.controller.model;

import java.io.Serializable;

public class KioskMovementCritiria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3389420796763161469L;

	
	private String networkMAName;
	private String phoneNumber;
	private String district;//อำเภอ
	private String province;//จังหวัด	
	private String tambon;//ตำบล
	private String kioskId;//รหัสตู้เติมเงิน (Kiosk ID) 
	private String fromDate ;//From Date
	private String toDate;//To Date
	private String telphoneNo;//หมายเลขโทรศัพท์ที่ได้รับบริการ
	private String status;//สถานะ 
	
	
	public String getNetworkMAName() {
		return networkMAName;
	}
	public void setNetworkMAName(String networkMAName) {
		this.networkMAName = networkMAName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getTambon() {
		return tambon;
	}
	public void setTambon(String tambon) {
		this.tambon = tambon;
	}
	public String getKioskId() {
		return kioskId;
	}
	public void setKioskId(String kioskId) {
		this.kioskId = kioskId;
	}
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
	public String getTelphoneNo() {
		return telphoneNo;
	}
	public void setTelphoneNo(String telphoneNo) {
		this.telphoneNo = telphoneNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
 
	
 
	
}
