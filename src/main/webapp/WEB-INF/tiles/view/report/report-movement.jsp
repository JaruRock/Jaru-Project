<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<div class="container" style="margin-top: 50px">
 
	
	<div class="row">
	    <div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="networkMAName">ชื่อ Network MA</label>
	        <div class="col-md-4">
	            <form:input type="text" id="networkMAName" class="form-control input-sm" />
	        </div>
	    </div>

	    <div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="phoneNumber">หมายเลขโทรศัพท์ที่สมัครตัวแทน</label>
	        <div class="col-md-4">
	            <form:input type="text" id="phoneNumber" class="form-control input-sm" />
	        </div>
	    </div>

	    <div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="district">อำเภอ</label>
	        <div class="col-md-3">
	            <form:input type="text" id="district" class="form-control input-sm" />
	        </div>
	    </div>
	    
	    <div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="province">จังหวัด</label>
	        <div class="col-md-3">
	            <form:input type="text" id="province" class="form-control input-sm" />
	        </div>
	    </div>
	    
	    <div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="number">Kiosk ID</label>
	        <div class="col-md-4">
	            <form:input type="text" id="number" class="form-control input-sm" />
	        </div>
	    </div>
	    
	   	<div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="dateFrom">ตั้งแต่วันที่</label>
	        <div class="col-md-4">
	            <form:input type="text" id="dateFrom" class="form-control input-sm" />
	        </div>
	    </div>
	    
	    <div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="dateTo">ถึงวันที่</label>
	        <div class="col-md-4">
	            <form:input type="text" id="dateTo" class="form-control input-sm" />
	        </div>
	    </div>
	    
	   	<div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="dateTo">หมายเลขโทรศัพท์ที่ได้รับบริการ</label>
	        <div class="col-md-4">
	            <form:input type="text" id="dateTo" class="form-control input-sm" />
	        </div>
	    </div>

	   	<div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="dateTo">สถานะการทำรายการ</label>
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
	    	<a href="#" class="btn btn-primary custom-width">Search</a>
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
</div>