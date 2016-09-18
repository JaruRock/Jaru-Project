package th.co.tac.kms.web.controller.model;

import java.io.Serializable;

public class KioskShift implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3389420796763161469L;

	
	private String shiftId;
	private String openShiftDate;
	private String closeShiftDate; 
	private String telephoneNo;  
	private String kioskId; 
	private String address;
	public String getShiftId() {
		return shiftId;
	}
	public void setShiftId(String shiftId) {
		this.shiftId = shiftId;
	}
	public String getOpenShiftDate() {
		return openShiftDate;
	}
	public void setOpenShiftDate(String openShiftDate) {
		this.openShiftDate = openShiftDate;
	}
	public String getCloseShiftDate() {
		return closeShiftDate;
	}
	public void setCloseShiftDate(String closeShiftDate) {
		this.closeShiftDate = closeShiftDate;
	}
	public String getTelephoneNo() {
		return telephoneNo;
	}
	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
	public String getKioskId() {
		return kioskId;
	}
	public void setKioskId(String kioskId) {
		this.kioskId = kioskId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	} 
	
  
}
