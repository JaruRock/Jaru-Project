<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet"
	href="${cPath}/resources/css/dataTables.bootstrap.min.css">
<script src="${cPath}/resources/js/jquery.dataTables.min.js"></script>
<script src="${cPath}/resources/js/dataTables.bootstrap.min.js"></script>

<script>
	$(document).ready(function() {
		$('#result-table').DataTable({
			"paging" : false,
			"searching" : false,
			"ordering" : false,
			"scrollY" : true,
			"scrollX" : true
		});
	});
</script>

<div class="container" style="margin-top: 30px;">
	<div class="row">
		<div class="form-group col-md-12">
			<h3>
				<label class="col-md-5 control-lable">ค้นหาการทำรายการของลูกค้า</label>
			</h3>
		</div>
	</div>


	<form:form method="POST" action="report-customer-balance-search"
		modelAttribute="kiosk" class="form-horizontal">
		<div class="well">
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
					<label class="col-md-3 control-lable" for="telephoneNo">To
						Date</label>
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
					<label class="col-md-3 control-lable" for="customerPhoneNo">Customer
						Phone Number</label>
					<div class="col-md-5">
						<form:input type="text" path="customerPhoneNo"
							id="customerPhoneNo" class="form-control input-sm" />
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
					<label class="col-md-3 control-lable" for="kioskId">รหัสตู้เติมเงิน
						(Kiosk ID)</label>
					<div class="col-md-5">
						<form:input type="password" path="kioskId" id="kioskId"
							class="form-control input-sm" />
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="kioskSerialNo">หมายเลขเครื่องตู้เติมเงิน
						(Kiosk Serial Number)</label>
					<div class="col-md-5">
						<form:input type="password" path="kioskSerialNo"
							id="kioskSerialNo" class="form-control input-sm" />
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
						<button type="submit" class="btn btn-primary">
							Search <i class="fa fa-search"></i>
						</button>
						<a href="<c:url value='/welcome' />" class="btn btn-default">
                        	<span class="glyphicon glyphicon-remove" aria-hidden="true"></span> Cancel
                        </a>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				<div class=" ">
					<h4>ผลการค้นหา</h4>
				</div>
				<div class="bs-component">
					<table class="table table-striped" id="result-table">
						<thead>
							<tr>
								<th nowrap>No.</th>
								<th nowrap>วัน-เวลา ที่ทำรายการ</th>
								<th nowrap>หมายเลขโทรศัพท์ลูกค้า + operator owner</th>
								<th nowrap>เจ้าของตู้เติมเงิน</th>
								<th nowrap>Action</th>
								<th nowrap>TransactionID</th>
								<th nowrap>รหัสตู้เติมเงิน</th>
								<th nowrap>หมายเลขเครื่องเติมเงิน</th>
								<th nowrap>Previous Credit</th>
								<th nowrap>CashIn</th>
								<th nowrap>Transaction Amount</th>
								<th nowrap>Transaction Fee</th>
								<th nowrap>Remaining Credit</th>
								<th nowrap>สถานะรายการ</th>
								<th nowrap>Error Code</th>
								<th nowrap>จังหวัด</th>
								<th nowrap>อำเภอ</th>
								<th nowrap>ตำบล</th>

							</tr>
						</thead>
						<tbody>

							<c:forEach items="${query}" var="query1">
								<tr>
									<td nowrap>${query1.no}</td>
									<td nowrap>${query1.dateAction}</td>
									<td nowrap>${query1.telephoneNoAndOperator}</td>
									<td nowrap>${query1.kioskOwner}</td>
									<td nowrap>${query1.action}</td>
									<td nowrap>${query1.transactionId}</td>
									<td nowrap>${query1.kioskSerialNo}</td>
									<td nowrap>${query1.kioskId}</td>
									<td nowrap>${query1.previousCradit}</td>
									<td nowrap>${query1.cashIn}</td>
									<td nowrap>${query1.transactionAmout}</td>
									<td nowrap>${query1.transectionFee}</td>
									<td nowrap>${query1.remainingCredit}</td>
									<td nowrap>${query1.statusAction}</td>
									<td nowrap>${query1.errorCode}</td>
									<td nowrap>${query1.province}</td>
									<td nowrap>${query1.amphur}</td>
									<td nowrap>${query1.district}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>

	</form:form>
</div>