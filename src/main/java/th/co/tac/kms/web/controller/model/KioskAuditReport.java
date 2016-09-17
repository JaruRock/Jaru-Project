package th.co.tac.kms.web.controller.model;

import java.io.Serializable;

public class KioskAuditReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7376028423639000587L;

	
	private String operator ;//Operator
	private String networkMa ;//ชื่อ Network MA
	private String phoneMa ;//หมายเลขโทรศัพท์ที่สมัครตัวแทน MA
	private String typeMa;//ประเภทสมาชิก MA
	private String referenceName ;//ชื่อ Reference name for TA
	private String  phonTa;//หมายเลขโทรศัพท์ที่สมัครตัวแทน TA
	private String  typeTa;//ประเภทสมาชิก TA
	private String  kioskId;//รหัสตู้เติมเงิน
	private String  kioskSerialNumber;//หมายเลขเครื่องตู้เติมเงิน
	private String  fristName;//ชื่อ
	private String  lastName;//นามสกุล
	private String  typeLocatKiosk;//ประเภทสถานที่ตั้งตู้เติมเงิน
	private String  number;//เลขที่
	private String  villageNo;//หมู่ที่
	private String  lane;//ซอย
	private String  road;//ถนน
	private String  province;//จังหวัด
	private String  district;//อำเภอ
	private String  subDistrict;//ตำบล
	private String  postalCode;//รหัสไปรษณีย์
	private String  statusKiosk;//สถานะตู้เติมเงิน
	private String openShiftDate;//Open Shift Date
	private String openShiftTime;//Open Shift Time
	private String closeShiftDate;//Close Shift Date
	private String closeShiftTime;//Close Shift Time
	private String username;//User Name ที่เปิดตู้
	private String action;//Action
	private String totalAmonut;//Total Amount
	private String money1;//1
	private String money2;//2
	private String money5;//5
	private String money10;//10
	private String money20;//20
	private String money50;//50
	private String money100;//100
	private String money500;//500
	private String money1000;//1000
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
	public String getPhonTa() {
		return phonTa;
	}
	public void setPhonTa(String phonTa) {
		this.phonTa = phonTa;
	}
	public String getTypeTa() {
		return typeTa;
	}
	public void setTypeTa(String typeTa) {
		this.typeTa = typeTa;
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
	public String getStatusKiosk() {
		return statusKiosk;
	}
	public void setStatusKiosk(String statusKiosk) {
		this.statusKiosk = statusKiosk;
	}
	public String getOpenShiftDate() {
		return openShiftDate;
	}
	public void setOpenShiftDate(String openShiftDate) {
		this.openShiftDate = openShiftDate;
	}
	public String getOpenShiftTime() {
		return openShiftTime;
	}
	public void setOpenShiftTime(String openShiftTime) {
		this.openShiftTime = openShiftTime;
	}
	public String getCloseShiftDate() {
		return closeShiftDate;
	}
	public void setCloseShiftDate(String closeShiftDate) {
		this.closeShiftDate = closeShiftDate;
	}
	public String getCloseShiftTime() {
		return closeShiftTime;
	}
	public void setCloseShiftTime(String closeShiftTime) {
		this.closeShiftTime = closeShiftTime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getTotalAmonut() {
		return totalAmonut;
	}
	public void setTotalAmonut(String totalAmonut) {
		this.totalAmonut = totalAmonut;
	}
	public String getMoney1() {
		return money1;
	}
	public void setMoney1(String money1) {
		this.money1 = money1;
	}
	public String getMoney2() {
		return money2;
	}
	public void setMoney2(String money2) {
		this.money2 = money2;
	}
	public String getMoney5() {
		return money5;
	}
	public void setMoney5(String money5) {
		this.money5 = money5;
	}
	public String getMoney10() {
		return money10;
	}
	public void setMoney10(String money10) {
		this.money10 = money10;
	}
	public String getMoney20() {
		return money20;
	}
	public void setMoney20(String money20) {
		this.money20 = money20;
	}
	public String getMoney50() {
		return money50;
	}
	public void setMoney50(String money50) {
		this.money50 = money50;
	}
	public String getMoney100() {
		return money100;
	}
	public void setMoney100(String money100) {
		this.money100 = money100;
	}
	public String getMoney500() {
		return money500;
	}
	public void setMoney500(String money500) {
		this.money500 = money500;
	}
	public String getMoney1000() {
		return money1000;
	}
	public void setMoney1000(String money1000) {
		this.money1000 = money1000;
	}
	
	

	
	
}
