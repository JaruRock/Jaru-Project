package th.co.tac.kms.web.controller.model;

import java.sql.Timestamp;

public class VendorInfo {
	 
	private Long vendorId;
	private String vendorNameTH;
	private String vendorNameEN;
	private Timestamp orderedDate;
	private Timestamp createDate;
	public Long getVendorId() {
		return vendorId;
	}
	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorNameTH() {
		return vendorNameTH;
	}
	public void setVendorNameTH(String vendorNameTH) {
		this.vendorNameTH = vendorNameTH;
	}
	public String getVendorNameEN() {
		return vendorNameEN;
	}
	public void setVendorNameEN(String vendorNameEN) {
		this.vendorNameEN = vendorNameEN;
	}
	public Timestamp getOrderedDate() {
		return orderedDate;
	}
	public void setOrderedDate(Timestamp orderedDate) {
		this.orderedDate = orderedDate;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	
	
	
}
