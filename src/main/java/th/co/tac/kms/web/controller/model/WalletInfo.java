package th.co.tac.kms.web.controller.model;

import java.sql.Timestamp;

public class WalletInfo {
 
	private Long walletId;
	private AgentInfo agentInfo;
	private String contactSubrnum;
	private String pinCode;
	private String ownerAddress;
	private String walletStatus;
	private String createBy;
	private Timestamp createDate;
	private String updateBy;
	private Timestamp updateDate;
	
	private String maName;
	private String maTel;
	private String taTel;
	private String memberType;
	private String taName;
	private String taLastName;
	
	public Long getWalletId() {
		return walletId;
	}
	public void setWalletId(Long walletId) {
		this.walletId = walletId;
	}
	public AgentInfo getAgentInfo() {
		return agentInfo;
	}
	public void setAgentInfo(AgentInfo agentInfo) {
		this.agentInfo = agentInfo;
	}
	public String getContactSubrnum() {
		return contactSubrnum;
	}
	public void setContactSubrnum(String contactSubrnum) {
		this.contactSubrnum = contactSubrnum;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	public String getWalletStatus() {
		return walletStatus;
	}
	public void setWalletStatus(String walletStatus) {
		this.walletStatus = walletStatus;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Timestamp getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}
	public String getMaName() {
		return maName;
	}
	public void setMaName(String maName) {
		this.maName = maName;
	}
	public String getMaTel() {
		return maTel;
	}
	public void setMaTel(String maTel) {
		this.maTel = maTel;
	}
	public String getTaTel() {
		return taTel;
	}
	public void setTaTel(String taTel) {
		this.taTel = taTel;
	}
	public String getMemberType() {
		return memberType;
	}
	//   
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public String getTaName() {
		return taName;
	}
	public void setTaName(String taName) {
		this.taName = taName;
	}
	public String getTaLastName() {
		return taLastName;
	}
	public void setTaLastName(String taLastName) {
		this.taLastName = taLastName;
	}
	
	
}
