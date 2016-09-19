<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
			<h4>
				<label class="col-md-3 control-lable">Kiosk Shift Report</label>
			</h4>
		</div>
	</div>

	<form:form method="POST" action="report-shift"
		modelAttribute="kioskShiftCritiria" class="form-horizontal">

		<div class="well">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="number">ชื่อ
					Network MA *</label>
				<div class="col-md-4">
					<form:input type="text" path="networkMAName"
						class="form-control input-sm" />
				</div>
			</div>

			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="number">หมายเลขโทรศัพท์ที่สมัครตัวแทน</label>
				<div class="col-md-4">
					<form:input type="text" path="telphoneNo"
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
					<table class="table table-striped" id="result-table" width="100%">
						<thead>
							<tr>
								<th>ลำดับที่</th>
								<th>Shift ID</th>
								<th nowrap>วันที่เปิด Shift</th>
								<th nowrap>วันที่ปิด Shift</th>
								<th nowrap>หมายเลขโทรศัพท์มือถือ</th>
								<th nowrap>Kiosk ID</th>
								<th nowrap>สถานที่ตั้ง</th>
								<th nowrap>Action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${kioskShiftList}" var="domain">
								<tr>
									<td>&nbsp;</td>
									<td nowrap>${domain.shiftId}</td>
									<td nowrap>${domain.openShiftDate}</td>
									<td nowrap>${domain.closeShiftDate}</td>
									<td nowrap>${domain.telephoneNo}</td>
									<td nowrap>${domain.kioskId}</td>
									<td nowrap>${domain.address}</td>
									<td><a href="#">View</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</form:form>
</div>

