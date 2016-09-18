package th.co.tac.kms.web.controller.model;

import java.io.Serializable;

public class KioskAlarmReport implements Serializable {


	

	/**
	 * 
	 */
	private static final long serialVersionUID = 4447978534152900912L;
	

private String dateTimeStart ;//Date Time Start
private String dateTimeClear ;//Date Time Clear
private String operator ;//Operator
private String kioskId ;//รหัสตู้เติมเงิน (คลิ๊กเพื่อเปิด pop up ไปยังหน้า Jiosk HW Status)
private String statusNoti ;//สถานะการแจ้งเตือน
private String errorCode ;//Error Code
private String errorDescription ;//Error Description
private String kioskSerialNumber ;//หมายเลขเครื่องตู้เติมเงิน
private String phoneMa ;//หมายเลขโทรศัพท์ที่สมัครตัวแทน MA
private String typeMa;//ประเภทสมาชิก MA
private String referenceName;//ชื่อ Reference name for TA
private String nameTa;//ชื่อ TA 
private String lastNameTa ;//นามสกุล TA
private String phoneTa ;//หมายเลขโทรศัพท์ที่สมัครตัวแทน TA
private String vendor ;//ชื่อ Vendor
private String model ;//ชื่อ Model
private String softwareVersion ;//Software Version
private String firstName ;//ชื่อ
private String lastName ;//นามสกุล
private String phone ;//หมายเลขโทรศัพท์เคลื่อนที่ที่ติดต่อได้
private String  typeLocatKiosk;//ประเภทสถานที่ตั้งตู้เติมเงิน
private String  number;//เลขที่
private String  villageNo;//หมู่ที่
private String  lane;//ซอย
private String  road;//ถนน
private String  province;//จังหวัด
private String  district;//อำเภอ
private String  subDistrict;//ตำบล
private String  postalCode;//รหัสไปรษณีย์






public String getDateTimeStart() {
	return dateTimeStart;
}
public void setDateTimeStart(String dateTimeStart) {
	this.dateTimeStart = dateTimeStart;
}
public String getDateTimeClear() {
	return dateTimeClear;
}
public void setDateTimeClear(String dateTimeClear) {
	this.dateTimeClear = dateTimeClear;
}
public String getOperator() {
	return operator;
}
public void setOperator(String operator) {
	this.operator = operator;
}
public String getKioskId() {
	return kioskId;
}
public void setKioskId(String kioskId) {
	this.kioskId = kioskId;
}
public String getStatusNoti() {
	return statusNoti;
}
public void setStatusNoti(String statusNoti) {
	this.statusNoti = statusNoti;
}
public String getErrorCode() {
	return errorCode;
}
public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
}
public String getErrorDescription() {
	return errorDescription;
}
public void setErrorDescription(String errorDescription) {
	this.errorDescription = errorDescription;
}
public String getKioskSerialNumber() {
	return kioskSerialNumber;
}
public void setKioskSerialNumber(String kioskSerialNumber) {
	this.kioskSerialNumber = kioskSerialNumber;
}
public String getPhoneMa() {
	return phoneMa;
}
public void setPhoneMa(String phoneMa) {
	this.phoneMa = phoneMa;
}
public String getTypeMa() {
	return typeMa;
}
public void setTypeMa(String typeMa) {
	this.typeMa = typeMa;
}
public String getReferenceName() {
	return referenceName;
}
public void setReferenceName(String referenceName) {
	this.referenceName = referenceName;
}
public String getNameTa() {
	return nameTa;
}
public void setNameTa(String nameTa) {
	this.nameTa = nameTa;
}
public String getLastNameTa() {
	return lastNameTa;
}
public void setLastNameTa(String lastNameTa) {
	this.lastNameTa = lastNameTa;
}
public String getPhoneTa() {
	return phoneTa;
}
public void setPhoneTa(String phoneTa) {
	this.phoneTa = phoneTa;
}
public String getVendor() {
	return vendor;
}
public void setVendor(String vendor) {
	this.vendor = vendor;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getSoftwareVersion() {
	return softwareVersion;
}
public void setSoftwareVersion(String softwareVersion) {
	this.softwareVersion = softwareVersion;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getTypeLocatKiosk() {
	return typeLocatKiosk;
}
public void setTypeLocatKiosk(String typeLocatKiosk) {
	this.typeLocatKiosk = typeLocatKiosk;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getVillageNo() {
	return villageNo;
}
public void setVillageNo(String villageNo) {
	this.villageNo = villageNo;
}
public String getLane() {
	return lane;
}
public void setLane(String lane) {
	this.lane = lane;
}
public String getRoad() {
	return road;
}
public void setRoad(String road) {
	this.road = road;
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
public String getSubDistrict() {
	return subDistrict;
}
public void setSubDistrict(String subDistrict) {
	this.subDistrict = subDistrict;
}
public String getPostalCode() {
	return postalCode;
}
public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}

	
}
