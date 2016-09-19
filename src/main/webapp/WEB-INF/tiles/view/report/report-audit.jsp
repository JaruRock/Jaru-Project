<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


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


<div class="container">

	<div class="page-header">
		<div class="row">
			<div class="col-lg-12">
				<h3>Kiosk Audit Report</h3>
				<p>ค้นหาตู้เติมเงิน</p>
			</div>
		</div>
	</div>


	<form:form method="POST" action="/kiosk-audit-report"
		modelAttribute="kioskAuditReportCritiria" class="form-horizontal">

		<div class="well">
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="firstName">From
						Date</label>
					<div class="col-md-4">
						<div class='input-group date' id='Assigned'>
							<form:input type="text" path="fromDate" id="fromDate"
								class="form-control input-sm" />
							<span class="input-group-addon"> <span
								class="glyphicon glyphicon-calendar"> </span>
							</span>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">To
						Date</label>
					<div class="col-md-4">
						<div class='input-group date' id='Assigned'>
							<form:input type="text" path="toDate" id="toDate"
								class="form-control input-sm" />
							<span class="input-group-addon"> <span
								class="glyphicon glyphicon-calendar"> </span>
							</span>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">Operator</label>
					<div class="col-md-4">
						<form:select path="operator" class="form-control input-sm">
							<form:option value="101">ALL</form:option>
							<form:option value="102">Operator1</form:option>
							<form:option value="103">Operator2</form:option>
							<form:option value="104">Operator3</form:option>
						</form:select>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">ชื่อ
						Network MA *</label>
					<div class="col-md-4">

						<form:select path="networkMa" class="form-control input-sm">
							<form:option value="101">ALL</form:option>
							<form:option value="102">Network MA1</form:option>
							<form:option value="103">Network MA2</form:option>
							<form:option value="104">Network MA3</form:option>
						</form:select>

					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">ชื่อ
						Network TA *</label>
					<div class="col-md-4">
						<form:select path="netWorkTa" class="form-control input-sm">
							<form:option value="101">ALL</form:option>
							<form:option value="102">Network TA1</form:option>
							<form:option value="103">Network TA2</form:option>
							<form:option value="104">Network TA3</form:option>
						</form:select>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">จังหวัด</label>
					<div class="col-md-4">
						<form:select path="province" class="form-control input-sm">
							<form:option value="101">ALL</form:option>
							<form:option value="102">จังหวัด 1</form:option>
							<form:option value="103">จังหวัด 2</form:option>
							<form:option value="104">จังหวัด 3</form:option>
						</form:select>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">อำเภอ</label>
					<div class="col-md-4">
						<form:select path="district" class="form-control input-sm">
							<form:option value="101">ALL</form:option>
							<form:option value="102">อำเภอ 1</form:option>
							<form:option value="103">อำเภอ 2</form:option>
							<form:option value="104">อำเภอ 3</form:option>
						</form:select>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">ตำบล</label>
					<div class="col-md-4">
						<form:select path="subDistri" class="form-control input-sm">
							<form:option value="101">ALL</form:option>
							<form:option value="102">ตำบล 1</form:option>
							<form:option value="103">ตำบล 2</form:option>
							<form:option value="104">ตำบล 3</form:option>
						</form:select>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">รหัสตู้เติมเงิน
						(Kiosk ID)</label>
					<div class="col-md-4">
						<form:input type="text" path="kioskId" id="kioskId"
							class="form-control input-sm" />
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">หมายเลขเครื่องตู้เติมเงิน
						(Kiosk Serial Number)</label>
					<div class="col-md-4">
						<form:input type="text" path="kioskSerialNumber"
							id="kioskSerialNumber" class="form-control input-sm" />
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">สถานะตู้เติมเงิน</label>
					<div class="col-md-4">

						<form:select path="statusKiosk" class="form-control input-sm">
							<form:option value="101">ALL</form:option>
							<form:option value="102">Active</form:option>
							<form:option value="103">Inactive</form:option>
							<form:option value="104">TBC</form:option>

						</form:select>

					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12 text-center">
				   <a href="${cPath}/report-audit-search"><button type="button" class="btn btn-primary">
						 Search <i class="fa fa-search"></i>
					</button></a>
					<a href="<c:url value='/welcome' />" class="btn btn-default">
                        <span class="glyphicon glyphicon-remove" aria-hidden="true"></span> Cancel
                    </a>
					<button type="button" class="btn btn-warning" disabled>
						Export <i class="fa fa-file-excel-o"></i>
					</button>
				</div>
			</div>
		</div>
	</form:form>

	<div class="row">
		<div class="col-lg-12">
			<div class="page-header">
				<h4>ผลการค้นหา</h4>
			</div>
			<div class="bs-component">
				<table class="table table-striped " id="result-table">
					<thead>
						<tr>
							<th nowrap>No.</th>
							<th nowrap>Operator.</th>
							<th nowrap>ชื่อ Network MA</th>
							<th nowrap>หมายเลขโทรศัพท์ที่สมัครตัวแทน MA</th>
							<th nowrap>ประเภทสมาชิก MA</th>
							<th nowrap>ชื่อ Reference name for TA</th>
							<th nowrap>หมายเลขโทรศัพท์ที่สมัครตัวแทน TA</th>
							<th nowrap>ประเภทสมาชิก TA</th>
							<th nowrap>รหัสตู้เติมเงิน</th>
							<th nowrap>หมายเลขเครื่องตู้เติมเงิน</th>
							<th nowrap>ชื่อ</th>
							<th nowrap>นามสกุล</th>
							<th nowrap>ประเภทสถานที่ตั้งตู้เติมเงิน</th>
							<th nowrap>เลขที่</th>
							<th nowrap>หมู่ที่</th>
							<th nowrap>ซอย</th>
							<th nowrap>จังหวัด</th>
							<th nowrap>อำเภอ</th>
							<th nowrap>ตำบล</th>
							<th nowrap>รหัสไปรษณี</th>
							<th nowrap>สถานะตู้เติมเงิน</th>
							<th nowrap>Open Shift Date</th>
							<th nowrap>Open Shift Time</th>
							<th nowrap>Close Shift Date</th>
							<th nowrap>Close Shift Time</th>
							<th nowrap>User Name ที่เปิดตู้</th>
							<th nowrap>Action</th>
							<th nowrap>Total Amount</th>
							<th nowrap>1</th>
							<th nowrap>2</th>
							<th nowrap>5</th>
							<th nowrap>10</th>
							<th nowrap>20</th>
							<th nowrap>50</th>
							<th nowrap>100</th>
							<th nowrap>500</th>
							<th nowrap>1000</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${kioskAuditReport}" var="kioskAudit">
							<tr>
								<td></td>
								<td nowrap>${kioskAudit.operator}</td>
								<td nowrap>${kioskAudit.networkMa}</td>
								<td nowrap>${kioskAudit.phoneMa}</td>
								<td nowrap>${kioskAudit.typeMa}</td>
								<td nowrap>${kioskAudit.referenceName}</td>
								<td nowrap>${kioskAudit.phonTa}</td>
								<td nowrap>${kioskAudit.typeTa}</td>
								<td nowrap>${kioskAudit.kioskId}</td>
								<td nowrap>${kioskAudit.kioskSerialNumber}</td>
								<td nowrap>${kioskAudit.fristName}</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
								<td nowrap>&nbsp;</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
