package th.co.tac.kms.web.controller.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class KioskMovement implements Serializable {

	private static final long serialVersionUID = -8589678733994588771L;
	
	private String no;//No
	private String transactionDate;//วัน-เวลาที่ทำรายการ
	private String kioskId;//เลขที่เครื่อง KIOSK
	private String service;//บริการ
	private String operationUserId;//หมายเลขผู้ทำรายการ
	private String customerPhoneNumber;//หมายเลขโทรศัพท์ลูกค้า
	private String transactionId;//TXID
	private BigDecimal balanceCreditAmount;//Credit ยกมา
	private BigDecimal productAmountAmount;//Product AMT
	private BigDecimal feeAmount;//ค่าธรรมเนียม
	private BigDecimal expenseAmount;//จำนวนที่ต้องชำระ
	private BigDecimal usedCreditAmount;//Credit ถูกใช้
	private BigDecimal netExpenseAmount;//ยอดที่ต้องชำระ
	private BigDecimal coinAndBankAmout;//จำนวนเงินที่หยอด
	private BigDecimal addedCreditAmount;//Credit เพิ่ม
	private BigDecimal movedCreditAmount;//Credit ยกไป
	private String result;//Result
	
	public String getNo() {
		return no;
	}


	public void setNo(String no) {
		this.no = no;
	}


	public String getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}


	public String getKioskId() {
		return kioskId;
	}


	public void setKioskId(String kioskId) {
		this.kioskId = kioskId;
	}


	public String getService() {
		return service;
	}


	public void setService(String service) {
		this.service = service;
	}


	public String getOperationUserId() {
		return operationUserId;
	}


	public void setOperationUserId(String operationUserId) {
		this.operationUserId = operationUserId;
	}


	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}


	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}


	public String getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}


	public BigDecimal getBalanceCreditAmount() {
		return balanceCreditAmount;
	}


	public void setBalanceCreditAmount(BigDecimal balanceCreditAmount) {
		this.balanceCreditAmount = balanceCreditAmount;
	}


	public BigDecimal getProductAmountAmount() {
		return productAmountAmount;
	}


	public void setProductAmountAmount(BigDecimal productAmountAmount) {
		this.productAmountAmount = productAmountAmount;
	}


	public BigDecimal getFeeAmount() {
		return feeAmount;
	}


	public void setFeeAmount(BigDecimal feeAmount) {
		this.feeAmount = feeAmount;
	}


	public BigDecimal getExpenseAmount() {
		return expenseAmount;
	}


	public void setExpenseAmount(BigDecimal expenseAmount) {
		this.expenseAmount = expenseAmount;
	}


	public BigDecimal getUsedCreditAmount() {
		return usedCreditAmount;
	}


	public void setUsedCreditAmount(BigDecimal usedCreditAmount) {
		this.usedCreditAmount = usedCreditAmount;
	}


	public BigDecimal getNetExpenseAmount() {
		return netExpenseAmount;
	}


	public void setNetExpenseAmount(BigDecimal netExpenseAmount) {
		this.netExpenseAmount = netExpenseAmount;
	}


	public BigDecimal getCoinAndBankAmout() {
		return coinAndBankAmout;
	}


	public void setCoinAndBankAmout(BigDecimal coinAndBankAmout) {
		this.coinAndBankAmout = coinAndBankAmout;
	}


	public BigDecimal getAddedCreditAmount() {
		return addedCreditAmount;
	}


	public void setAddedCreditAmount(BigDecimal addedCreditAmount) {
		this.addedCreditAmount = addedCreditAmount;
	}


	public BigDecimal getMovedCreditAmount() {
		return movedCreditAmount;
	}


	public void setMovedCreditAmount(BigDecimal movedCreditAmount) {
		this.movedCreditAmount = movedCreditAmount;
	}


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("KioskMovement [no=");
		builder.append(no);
		builder.append(", transactionDate=");
		builder.append(transactionDate);
		builder.append(", kioskId=");
		builder.append(kioskId);
		builder.append(", service=");
		builder.append(service);
		builder.append(", operationUserId=");
		builder.append(operationUserId);
		builder.append(", customerPhoneNumber=");
		builder.append(customerPhoneNumber);
		builder.append(", transactionId=");
		builder.append(transactionId);
		builder.append(", balanceCreditAmount=");
		builder.append(balanceCreditAmount);
		builder.append(", productAmountAmount=");
		builder.append(productAmountAmount);
		builder.append(", feeAmount=");
		builder.append(feeAmount);
		builder.append(", expenseAmount=");
		builder.append(expenseAmount);
		builder.append(", usedCreditAmount=");
		builder.append(usedCreditAmount);
		builder.append(", netExpenseAmount=");
		builder.append(netExpenseAmount);
		builder.append(", coinAndBankAmout=");
		builder.append(coinAndBankAmout);
		builder.append(", addedCreditAmount=");
		builder.append(addedCreditAmount);
		builder.append(", movedCreditAmount=");
		builder.append(movedCreditAmount);
		builder.append(", result=");
		builder.append(result);
		builder.append("]");
		return builder.toString();
	}

}
