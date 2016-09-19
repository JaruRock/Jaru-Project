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
				<label class="col-md-3 control-lable">ค้นหาตู้เติมเงิน</label>
			</h4>
		</div>
	</div>


	<form:form method="POST" action="kiosk-search" modelAttribute="kiosk"
		class="form-horizontal">
		<div class="well">
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="">ชื่อ Network
						MA</label>
					<div class="col-md-5">
						<form:input type="text" path="nameNetworkMA" id="nameNetworkMA"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="nameNetworkMA" class="help-inline" />
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="telephoneNo">หมายเลขโทรศัพท์ที่สมัครตัวแทน</label>
					<div class="col-md-5">
						<form:input type="text" path="telephoneNo" id="telephoneNo"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="telephoneNo" class="help-inline" />
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="kioskId">รหัสตู้เติมเงิน
						(Kiosk ID)</label>
					<div class="col-md-5">
						<form:input type="text" path="kioskId" id="kioskId"
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
					<label class="col-md-3 control-lable" for="kioskStatus">สถานะตู้เติมเงิน
						(Kiosk Status)</label>
					<div class="col-md-5">
						<form:select path="kioskStatus" class="form-control input-sm">
							<form:option value="101">All</form:option>
							<form:option value="102">Active</form:option>
							<form:option value="103">Inactive</form:option>
						</form:select>
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
								<th nowrap>ชื่อ Network MA</th>
								<th nowrap>หมายเลขโทรศัพท์ที่สมัครตัวแทน</th>
								<th nowrap>ชื่อขนามสกุล TA</th>
								<th nowrap>TA Reference Name</th>
								<th nowrap>รหัสตู้เติมเงิน</th>
								<th nowrap>ชื่อ</th>
								<th nowrap>นามสกุล</th>
								<th nowrap>หมายเลขเครื่องตู้เติมเงิน</th>
								<th nowrap>ประเภทสถานที่ตั้ง</th>
								<th nowrap>จังหวัด</th>
								<th nowrap>อำเภอ</th>
								<th nowrap>ตำบล</th>
								<th nowrap>สถานะ</th>
								<th nowrap>Action</th>

							</tr>
						</thead>
						<tbody>

							<c:forEach items="${kiosks}" var="kiosk1">
								<tr>
									<td nowrap>${kiosk1.kioskId}</td>
									<td nowrap>${kiosk1.nameNetworkMA}</td>
									<td nowrap>${kiosk1.telephoneNo}</td>
									<td nowrap>${kiosk1.nameTA}</td>
									<td nowrap>${kiosk1.taReferenceName}</td>
									<td nowrap>${kiosk1.kioskID}</td>
									<td nowrap>${kiosk1.name}</td>
									<td nowrap>${kiosk1.lastName}</td>
									<td nowrap>${kiosk1.kioskSerialNo}</td>
									<td nowrap>${kiosk1.typeZone}</td>
									<td nowrap>${kiosk1.province}</td>
									<td nowrap>${kiosk1.amphur}</td>
									<td nowrap>${kiosk1.district}</td>
									<td nowrap>${kiosk.kioskStatus}</td>
									<td nowrap><a href="<c:url value='/kiosk-register' />">View</a> <a
										href="<c:url value='/kiosk-register' />">Edit</a></td>

								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>

	</form:form>
</div>