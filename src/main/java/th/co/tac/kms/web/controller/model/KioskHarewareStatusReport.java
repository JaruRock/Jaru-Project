package th.co.tac.kms.web.controller.model;

import java.io.Serializable;

public class KioskHarewareStatusReport implements Serializable {

	

/**
	 * 
	 */
	private static final long serialVersionUID = -44423815454304102L;
	
	
	
	private String dateTimeStart ;//Date Time Start
	private String dateTimeClear ;//Date Time Clear
	private String operator ;//Operator
	private String nameTa ;//ชื่อ Network MA
	private String phoneMa ;//หมายเลขโทรศัพท์ที่สมัครตัวแทน MA
	private String referenceName ;//ชื่อ Reference name for TA
	private String phoneTa ;//หมายเลขโทรศัพท์ที่สมัครตัวแทน TA
	private String kioskId ;//รหัสตู้เติมเงิน
	private String kioskSerialNumber ;//หมายเลขเครื่องตู้เติมเงิน
	private String fristName ;//ชื่อ
	private String lastName ;//นามสกุล
	private String phone ;//หมายเลขโทรศัพท์เคลื่อนที่ที่ติดต่อได้
	private String typeLocationKiosk ;//ประเภทสถานที่ตั้งตู้เติมเงิน
	private String  number;//เลขที่
	private String  villageNo;//หมู่ที่
	private String  lane;//ซอย
	private String  road;//ถนน
	private String  province;//จังหวัด
	private String  district;//อำเภอ
	private String  subDistrict;//ตำบล
	private String  postalCode;//รหัสไปรษณีย์
	private String  vendor;//ชื่อ Vendor
	private String  model;//ชื่อ Model
	private String  softwareVersion;//Software Version
	private String  statusNoti;//สถานะการแจ้งเตือน
	private String  errorCode;//Error Code
	private String  errorDescription;//Error Description
	private String  kioskStatus;//Kiosk Status
	private String  doorStatus;//Door Status
	private String  bank;//"Bank 
	private String  status;//Status"
	private String  coin;//Coin Status
	private String  mainBoardStatus;//Main Board Status 
	private String  ups;//"UPS
	private String  upDown;//(up/down)"
	private String  powerSupply;//Power supply
	private String  netWork;//Network
	
	
	
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
	public String getNameTa() {
		return nameTa;
	}
	public void setNameTa(String nameTa) {
		this.nameTa = nameTa;
	}
	public String getPhoneMa() {
		return phoneMa;
	}
	public void setPhoneMa(String phoneMa) {
		this.phoneMa = phoneMa;
	}
	public String getReferenceName() {
		return referenceName;
	}
	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}
	public String getPhoneTa() {
		return phoneTa;
	}
	public void setPhoneTa(String phoneTa) {
		this.phoneTa = phoneTa;
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
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
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
	public String getTypeLocationKiosk() {
		return typeLocationKiosk;
	}
	public void setTypeLocationKiosk(String typeLocationKiosk) {
		this.typeLocationKiosk = typeLocationKiosk;
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
	public String getKioskStatus() {
		return kioskStatus;
	}
	public void setKioskStatus(String kioskStatus) {
		this.kioskStatus = kioskStatus;
	}
	public String getDoorStatus() {
		return doorStatus;
	}
	public void setDoorStatus(String doorStatus) {
		this.doorStatus = doorStatus;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCoin() {
		return coin;
	}
	public void setCoin(String coin) {
		this.coin = coin;
	}
	public String getMainBoardStatus() {
		return mainBoardStatus;
	}
	public void setMainBoardStatus(String mainBoardStatus) {
		this.mainBoardStatus = mainBoardStatus;
	}
	public String getUps() {
		return ups;
	}
	public void setUps(String ups) {
		this.ups = ups;
	}
	public String getUpDown() {
		return upDown;
	}
	public void setUpDown(String upDown) {
		this.upDown = upDown;
	}
	public String getPowerSupply() {
		return powerSupply;
	}
	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}
	public String getNetWork() {
		return netWork;
	}
	public void setNetWork(String netWork) {
		this.netWork = netWork;
	}




}