package th.co.tac.kms.web.controller.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class KioskMovement implements Serializable {

	private static final long serialVersionUID = -8589678733994588771L;
	
	private String numberOfRows;//No
	private String trxDateTime;//วัน-เวลาที่ทำรายการ
	private String kioskId;//เลขที่เครื่อง KIOSK
	private String serviceId;//บริการ
	private String agentId;//หมายเลขผู้ทำรายการ
	private String payeePhone;//หมายเลขโทรศัพท์ลูกค้า
	private String transactionId;//TXID
	private BigDecimal beforeCreditAmount;//Credit ยกมา
	private BigDecimal purchaseAmount;//Product AMT
	private BigDecimal kioskFee;//ค่าธรรมเนียม
	private BigDecimal insertedAmount;//จำนวนที่ต้องชำระ
	private BigDecimal usedCredit;//Credit ถูกใช้
	private BigDecimal netAmount;//ยอดที่ต้องชำระ
	private BigDecimal paymentAmount;//จำนวนเงินที่หยอด
	private BigDecimal addedCredit;//Credit เพิ่ม
	private BigDecimal rollOveredCredit;//Credit ยกไป
	private String status;//Result
	

	public String getNumberOfRows() {
		return numberOfRows;
	}


	public void setNumberOfRows(String numberOfRows) {
		this.numberOfRows = numberOfRows;
	}


	public String getTrxDateTime() {
		return trxDateTime;
	}


	public void setTrxDateTime(String trxDateTime) {
		this.trxDateTime = trxDateTime;
	}


	public String getKioskId() {
		return kioskId;
	}


	public void setKioskId(String kioskId) {
		this.kioskId = kioskId;
	}


	public String getServiceId() {
		return serviceId;
	}


	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}


	public String getAgentId() {
		return agentId;
	}


	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}


	public String getPayeePhone() {
		return payeePhone;
	}


	public void setPayeePhone(String payeePhone) {
		this.payeePhone = payeePhone;
	}


	public String getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}


	public BigDecimal getBeforeCreditAmount() {
		return beforeCreditAmount;
	}


	public void setBeforeCreditAmount(BigDecimal beforeCreditAmount) {
		this.beforeCreditAmount = beforeCreditAmount;
	}


	public BigDecimal getPurchaseAmount() {
		return purchaseAmount;
	}


	public void setPurchaseAmount(BigDecimal purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}


	public BigDecimal getKioskFee() {
		return kioskFee;
	}


	public void setKioskFee(BigDecimal kioskFee) {
		this.kioskFee = kioskFee;
	}


	public BigDecimal getInsertedAmount() {
		return insertedAmount;
	}


	public void setInsertedAmount(BigDecimal insertedAmount) {
		this.insertedAmount = insertedAmount;
	}


	public BigDecimal getUsedCredit() {
		return usedCredit;
	}


	public void setUsedCredit(BigDecimal usedCredit) {
		this.usedCredit = usedCredit;
	}


	public BigDecimal getNetAmount() {
		return netAmount;
	}


	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
	}


	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}


	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}


	public BigDecimal getAddedCredit() {
		return addedCredit;
	}


	public void setAddedCredit(BigDecimal addedCredit) {
		this.addedCredit = addedCredit;
	}


	public BigDecimal getRollOveredCredit() {
		return rollOveredCredit;
	}


	public void setRollOveredCredit(BigDecimal rollOveredCredit) {
		this.rollOveredCredit = rollOveredCredit;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("KioskMovement [numberOfRows=");
		builder.append(numberOfRows);
		builder.append(", trxDateTime=");
		builder.append(trxDateTime);
		builder.append(", kioskId=");
		builder.append(kioskId);
		builder.append(", serviceId=");
		builder.append(serviceId);
		builder.append(", agentId=");
		builder.append(agentId);
		builder.append(", payeePhone=");
		builder.append(payeePhone);
		builder.append(", transactionId=");
		builder.append(transactionId);
		builder.append(", beforeCreditAmount=");
		builder.append(beforeCreditAmount);
		builder.append(", purchaseAmount=");
		builder.append(purchaseAmount);
		builder.append(", kioskFee=");
		builder.append(kioskFee);
		builder.append(", insertedAmount=");
		builder.append(insertedAmount);
		builder.append(", usedCredit=");
		builder.append(usedCredit);
		builder.append(", netAmount=");
		builder.append(netAmount);
		builder.append(", paymentAmount=");
		builder.append(paymentAmount);
		builder.append(", addedCredit=");
		builder.append(addedCredit);
		builder.append(", rollOveredCredit=");
		builder.append(rollOveredCredit);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}

}
