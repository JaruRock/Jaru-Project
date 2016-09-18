<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" style="margin-top: 30px; ">
	<div class="row">
		<div class="form-group col-md-12">
			<h3>
				<label class="col-md-5 control-lable">ค้นหาการทำรายการของลูกค้า</label>
			</h3>
		</div>
	</div>
	

	<form:form method="POST" action="report-customer-balance-search" modelAttribute="kiosk"
		class="form-horizontal">
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="">From Date</label>
				<div class="col-md-5">
					<form:input type="text" path="fromDate" id="fromDate"
						class="form-control input-sm" />
					<div class="has-error">
						<form:errors path="fromDate" class="help-inline" />
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="telephoneNo">To Date</label>
				<div class="col-md-5">
					<form:input type="text" path="toDate" id="toDate"
						class="form-control input-sm" />
					<div class="has-error">
						<form:errors path="toDate" class="help-inline" />
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="customerPhoneNo">Customer Phone Number</label>
				<div class="col-md-5">
					<form:input type="text" path="customerPhoneNo" id="customerPhoneNo"
						class="form-control input-sm" />
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="function">Function</label>
				<div class="col-md-5">
					<form:input type="password" path="function" id="function"
						class="form-control input-sm" />
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="province">จังหวัด</label>
				<div class="col-md-5">
					<form:input type="password" path="province" id="province"
						class="form-control input-sm" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="amphur">อำเภอ</label>
				<div class="col-md-5">
					<form:input type="password" path="amphur" id="amphur"
						class="form-control input-sm" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="district">ตำบล</label>
				<div class="col-md-5">
					<form:input type="password" path="district" id="district"
						class="form-control input-sm" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="kioskId">รหัสตู้เติมเงิน (Kiosk ID)</label>
				<div class="col-md-5">
					<form:input type="password" path="kioskId" id="kioskId"
						class="form-control input-sm" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="kioskSerialNo">หมายเลขเครื่องตู้เติมเงิน (Kiosk Serial Number)</label>
				<div class="col-md-5">
					<form:input type="password" path="kioskSerialNo" id="kioskSerialNo"
						class="form-control input-sm" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="clash">จำนวนเงินที่เติม/จำนวนเงินที่ชำระบิล</label>
				<div class="col-md-5">
					<form:input type="password" path="clash" id="clash"
						class="form-control input-sm" />
				</div>
			</div>
		</div>


		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable"></label>
				<div class="col-md-7">
					<button type="submit" class="btn btn-primary">Search <i class="fa fa-search"></i></button>&nbsp;&nbsp;
					<button type="reset" class="btn btn-default"> &nbsp;Clear <i class="fa fa-refresh"></i></button>&nbsp;&nbsp;
				</div>
			</div>
		</div>


		<div class="bs-component">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>No.</th>
						<th>วัน-เวลา ที่ทำรายการ</th>
						<th>หมายเลขโทรศัพท์ลูกค้า + operator owner</th>
						<th>เจ้าของตู้เติมเงิน</th>
						<th>Action</th>
						<th>TransactionID</th>
						<th>รหัสตู้เติมเงิน</th>
						<th>หมายเลขเครื่องเติมเงิน</th>
						<th>Previous Credit</th>
						<th>CashIn</th>
						<th>Transaction Amount</th>
						<th>Transaction Fee</th>
						<th>Remaining Credit</th>
						<th>สถานะรายการ</th>
						<th>Error Code</th>
						<th>จังหวัด</th>
						<th>อำเภอ</th>
						<th>ตำบล</th>

					</tr>
				</thead>
				<tbody>
					
            <c:forEach items="${query}" var="query1">
                <tr>
                    <td>${query1.no}</td>
                    <td>${query1.dateAction}</td>
                    <td>${query1.telephoneNoAndOperator}</td>
                    <td>${query1.kioskOwner}</td>
                     <td>${query1.action}</td>
                    <td>${query1.transactionId}</td>
                    <td>${query1.kioskSerialNo}</td>
                    <td>${query1.kioskId}</td>
                     <td>${query1.previousCradit}</td>
                    <td>${query1.cashIn}</td>
                    <td>${query1.transactionAmout}</td>
                    <td>${query1.transectionFee}</td>
                    <td>${query1.remainingCredit}</td>
                    <td>${query1.statusAction}</td>
                    <td>${query1.errorCode}</td>
                    <td>${query1.province}</td>
                    <td>${query1.amphur}</td>
                    <td>${query1.district}</td>
                </tr>
            </c:forEach>  
				</tbody>
			</table>
		</div>

	</form:form>
</div>