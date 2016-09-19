package th.co.tac.kms.web.dao.model;

public class KmsWalletInfo {
	
	private String agentId;
	private String pinCode;
	private String maName;
	private String maTel;
	private String taTel;
	private String memberType;
	private String taName;
	private String taLastName;
	

	public String getTaTel() {
		return taTel;
	}

	public void setTaTel(String taTel) {
		this.taTel = taTel;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
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

	public String getMemberType() {
		return memberType;
	}

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
