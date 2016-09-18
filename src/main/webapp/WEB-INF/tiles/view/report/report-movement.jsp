<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" style="margin-top: 50px">
	<div class="row">
		<div class="form-group col-md-12">
			<h3>
				<label class="col-md-6 control-lable">Kiosk Movement Report</label>
			</h3>
		</div>
	</div> 
<form:form method="POST" action="${cPath}/report-movement" modelAttribute="kioskMovementCritiria" class="form-horizontal"> 
	
	<div class="row">
	    <div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="networkMAName">ชื่อ Network MA</label>
	        <div class="col-md-4">
	            <form:input type="text" path="networkMAName" class="form-control input-sm" />
	        </div>
	    </div>

	    <div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="phoneNumber">หมายเลขโทรศัพท์ที่สมัครตัวแทน</label>
	        <div class="col-md-4">
	            <form:input type="text" path="phoneNumber" class="form-control input-sm" />
	        </div>
	    </div>

	    <div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="district">อำเภอ</label>
	        <div class="col-md-3">
	            <form:input type="text" path="district" class="form-control input-sm" />
	        </div>
	    </div>
	    
	    <div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="province">จังหวัด</label>
	        <div class="col-md-3">
	            <form:input type="text" path="province" class="form-control input-sm" />
	        </div>
	    </div>
	    
	    <div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="number">Kiosk ID</label>
	        <div class="col-md-4">
	            <form:input type="text" path="kioskId" class="form-control input-sm" />
	        </div>
	    </div>
	    
	   	<div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="dateFrom">ตั้งแต่วันที่</label>
	        <div class="col-md-4">
	            <form:input type="text" path="fromDate" class="form-control input-sm" />
	        </div>
	    </div>
	    
	    <div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="dateTo">ถึงวันที่</label>
	        <div class="col-md-4">
	            <form:input type="text" path="toDate" class="form-control input-sm" />
	        </div>
	    </div>
	    
	   	<div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="telNo">หมายเลขโทรศัพท์ที่ได้รับบริการ</label>
	        <div class="col-md-4">
	            <form:input type="text" path="telphoneNo" class="form-control input-sm" />
	        </div>
	    </div>

	   	<div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="status">สถานะการทำรายการ</label>
	        <div class="col-md-2">
	            <input type="radio"></input> สำเร็จ
	        </div>
      	    <div class="col-md-2">
	            <input type="radio"></input> ไม่สำเร็จ
	        </div>
	        <div class="col-md-2">
	            <input type="radio"></input> ทั้งหมด
	        </div>
	    </div>
	    
	    <div class="form-group col-md-12 text-center">
	    <button type="submit" class="btn btn-primary">Search <i class="fa fa-search"></i></button>&nbsp;&nbsp;
	    	<a href="#" class="btn btn-primary custom-width">Print</a>
	    	<a href="#" class="btn btn-primary custom-width">Export</a>
	    </div>
	</div>
	  
    <div class="panel panel-default">
        <table class="table table-hover">
            <thead>
                <tr>
                    <th>No.</th>
					<th>วัน-เวลาที่ทำรายการ</th>
					<th>เลขที่เครื่อง KIOSK</th>
					<th>บริการ</th>
					<th>หมายเลขผู้ทำรายการ</th>
					<th>หมายเลขโทรศัพท์ลูกค้า</th>
					<th>TXID</th>
					<th>Credit ยกมา</th>
					<th>Product AMT</th>
					<th>ค่าธรรมเนียม</th>
					<th>จำนวนที่ต้องชำระ</th>
					<th>Credit ถูกใช้</th>
					<th>ยอดที่ต้องชำระ</th>
					<th>จำนวนเงินที่หยอด</th>
					<th>Credit เพิ่ม</th>
					<th>Credit ยกไป</th>
					<th>Result</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${kioskMovementList}" var="kioskMovement">
                <tr>
					<td>${kioskMovement.no}</td>
					<td>${kioskMovement.transactionDate}</td>
					<td>${kioskMovement.kioskId}</td>
					<td>${kioskMovement.service}</td>
					<td>${kioskMovement.operationUserId}</td>
					<td>${kioskMovement.customerPhoneNumber}</td>
					<td>${kioskMovement.transactionId}</td>
					<td>${kioskMovement.balanceCreditAmount}</td>
					<td>${kioskMovement.productAmountAmount}</td>
					<td>${kioskMovement.feeAmount}</td>
					<td>${kioskMovement.expenseAmount}</td>
					<td>${kioskMovement.usedCreditAmount}</td>
					<td>${kioskMovement.netExpenseAmount}</td>
					<td>${kioskMovement.coinAndBankAmout}</td>
					<td>${kioskMovement.addedCreditAmount}</td>
					<td>${kioskMovement.movedCreditAmount}</td>
					<td>${kioskMovement.result}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    
 </form:form>   
</div>