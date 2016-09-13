package th.co.tac.kms.web.controller.model;

import java.sql.Timestamp;

public class SimCardInfo { 

	private Long simcardId;
	private String imeiNo;
	private String status;
	private String providerName;
	private String mobileNo;
	private Timestamp createDate;
	private String creatyBy;
	private String imsiOn;
	public Long getSimcardId() {
		return simcardId;
	}
	public void setSimcardId(Long simcardId) {
		this.simcardId = simcardId;
	}
	public String getImeiNo() {
		return imeiNo;
	}
	public void setImeiNo(String imeiNo) {
		this.imeiNo = imeiNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public String getCreatyBy() {
		return creatyBy;
	}
	public void setCreatyBy(String creatyBy) {
		this.creatyBy = creatyBy;
	}
	public String getImsiOn() {
		return imsiOn;
	}
	public void setImsiOn(String imsiOn) {
		this.imsiOn = imsiOn;
	}
	
	
	
}
