package th.co.tac.kms.web.dao.model;

public class KmsKioskTransactionInfo {
	
	private String kioskId;
	private String trxDateTime;
	private String trxStatus;
	private String payeePhone;
	
	public String getKioskId() {
		return kioskId;
	}
	public void setKioskId(String kioskId) {
		this.kioskId = kioskId;
	}
	public String getTrxDateTime() {
		return trxDateTime;
	}
	public void setTrxDateTime(String trxDateTime) {
		this.trxDateTime = trxDateTime;
	}
	public String getTrxStatus() {
		return trxStatus;
	}
	public void setTrxStatus(String trxStatus) {
		this.trxStatus = trxStatus;
	}
	public String getPayeePhone() {
		return payeePhone;
	}
	public void setPayeePhone(String payeePhone) {
		this.payeePhone = payeePhone;
	}
	
	
	
	
	
	
}
