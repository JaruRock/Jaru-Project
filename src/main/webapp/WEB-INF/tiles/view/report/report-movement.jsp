<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" href="${cPath}/resources/css/dataTables.bootstrap.min.css">
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

<div class="container" style="margin-top: 30px">
	<div class="row">
		<div class="form-group col-md-12">
			<h4>
				<label class="col-md-6 control-lable">Kiosk Movement Report</label>
			</h4>
		</div>
	</div>
	<form:form method="POST" action="${cPath}/report-movement"
		modelAttribute="kioskMovementCritiria" class="form-horizontal">

		<div class="row well">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="networkMAName">ชื่อ
					Network MA</label>
				<div class="col-md-4">
					<form:input type="text" path="networkMAName"
						class="form-control input-sm" />
				</div>
			</div>

			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="phoneNumber">หมายเลขโทรศัพท์ที่สมัครตัวแทน</label>
				<div class="col-md-4">
					<form:input type="text" path="phoneNumber"
						class="form-control input-sm" />
				</div>
			</div>

			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="district">อำเภอ</label>
				<div class="col-md-3">
					<form:input type="text" path="district"
						class="form-control input-sm" />
				</div>
			</div>

			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="province">จังหวัด</label>
				<div class="col-md-3">
					<form:input type="text" path="province"
						class="form-control input-sm" />
				</div>
			</div>

			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="number">Kiosk ID</label>
				<div class="col-md-4">
					<form:input type="text" path="kioskId"
						class="form-control input-sm" />
				</div>
			</div>

			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="dateFrom">ตั้งแต่วันที่</label>
				<div class="col-md-4">
					<form:input type="text" path="fromDate"
						class="form-control input-sm" />
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
					<form:input type="text" path="telphoneNo"
						class="form-control input-sm" />
				</div>
			</div>

			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="status">สถานะการทำรายการ</label>
				<div class="radio" style="float: left; margin: 0 10px;">
					<label><input type="radio" name="operator" value="AWN">สำเร็จ</label>
				</div>
				<div class="radio" style="float: left; margin: 0 10px;">
					<label><input type="radio" name="operator" value="DTAC">ไม่สำเร็จ</label>
				</div>
				<div class="radio" style="float: left; margin: 0 10px;">
					<label><input type="radio" name="operator" value="DTAC">ทั้งหมด</label>
				</div>
			</div>

			<div class="form-group col-md-12 text-center">
				<button type="submit" class="btn btn-primary">
					Search <i class="fa fa-search"></i>
				</button>
				&nbsp;&nbsp;
				<button type="reset" class="btn btn-default">
					Print <i class="fa fa-ban"></i>
				</button>
				&nbsp;&nbsp;
				<button type="button" class="btn btn-warning" disabled>
					Export <i class="fa fa-file-excel-o"></i>
				</button>
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
								<th>No.</th>
								<th nowrap>วัน-เวลาที่ทำรายการ</th>
								<th nowrap>เลขที่เครื่อง KIOSK</th>
								<th nowrap>บริการ</th>
								<th nowrap>หมายเลขผู้ทำรายการ</th>
								<th nowrap>หมายเลขโทรศัพท์ลูกค้า</th>
								<th nowrap>TXID</th>
								<th nowrap>Credit ยกมา</th>
								<th nowrap>Product AMT</th>
								<th nowrap>ค่าธรรมเนียม</th>
								<th nowrap>จำนวนที่ต้องชำระ</th>
								<th nowrap>Credit ถูกใช้</th>
								<th nowrap>ยอดที่ต้องชำระ</th>
								<th nowrap>จำนวนเงินที่หยอด</th>
								<th nowrap>Credit เพิ่ม</th>
								<th nowrap>Credit ยกไป</th>
								<th nowrap>Result</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${kioskMovementList}" var="kioskMovement">
								<tr>
									<td nowrap>${kioskMovement.no}</td>
									<td nowrap>${kioskMovement.transactionDate}</td>
									<td nowrap>${kioskMovement.kioskId}</td>
									<td nowrap>${kioskMovement.service}</td>
									<td nowrap>${kioskMovement.operationUserId}</td>
									<td nowrap>${kioskMovement.customerPhoneNumber}</td>
									<td nowrap>${kioskMovement.transactionId}</td>
									<td nowrap>${kioskMovement.balanceCreditAmount}</td>
									<td nowrap>${kioskMovement.productAmountAmount}</td>
									<td nowrap>${kioskMovement.feeAmount}</td>
									<td nowrap>${kioskMovement.expenseAmount}</td>
									<td nowrap>${kioskMovement.usedCreditAmount}</td>
									<td nowrap>${kioskMovement.netExpenseAmount}</td>
									<td nowrap>${kioskMovement.coinAndBankAmout}</td>
									<td nowrap>${kioskMovement.addedCreditAmount}</td>
									<td nowrap>${kioskMovement.movedCreditAmount}</td>
									<td nowrap>${kioskMovement.result}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</form:form>
</div>