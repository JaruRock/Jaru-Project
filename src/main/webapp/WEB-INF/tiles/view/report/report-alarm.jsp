<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet"
	href="${cPath}/resources/css/dataTables.bootstrap.min.css">
<script src="${cPath}/resources/js/jquery.dataTables.min.js"></script>
<script src="${cPath}/resources/js/dataTables.bootstrap.min.js"></script>

<script>
	$(document).ready(function() {
		$('#result-table,#result-table1').DataTable({
			"paging" : false,
			"searching" : false,
			"ordering" : false,
			"scrollY" : true,
			"scrollX" : true
		});
	});
</script>

<div class="container">
	<div class="panel">
		<h4>Kiosk Alarm Report</h4>
		<p>ค้นหาตู้เติมเงิน</p>
	</div>
	<form:form method="POST" action="/new-user" modelAttribute="user"
		class="form-horizontal">
		<div class="well">
			<form:input type="hidden" path="userId" id="userId" />

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">Operator</label>
					<div class="col-md-4">
						<select class="form-control ">
							<option>All</option>
						</select>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">ชื่อ
						Network MA *</label>
					<div class="col-md-4">
						<select class="form-control ">
							<option>All</option>
						</select>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">ชื่อ
						Network TA *</label>
					<div class="col-md-4">
						<select class="form-control ">
							<option>All</option>
						</select>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">จังหวัด</label>
					<div class="col-md-4">
						<select class="form-control ">
							<option>All</option>
						</select>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">อำเภอ</label>
					<div class="col-md-4">
						<select class="form-control ">
							<option>All</option>
						</select>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">ตำบล</label>
					<div class="col-md-4">
						<select class="form-control ">
							<option>All</option>
						</select>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">Model</label>
					<div class="col-md-4">
						<select class="form-control ">
							<option>All</option>
						</select>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">Vendor</label>
					<div class="col-md-4">
						<select class="form-control ">
							<option>All</option>
						</select>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">รหัสตู้เติมเงิน
						(Kiosk ID)</label>
					<div class="col-md-4">
						<input type="text" id="lastName" class="form-control input-sm" />
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">หมายเลขเครื่องตู้เติมเงิน
						(Kiosk Serial Number)</label>
					<div class="col-md-4">
						<input type="text" id="lastName" class="form-control input-sm" />
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="lastName">สถานะตู้เติมเงิน</label>
					<div class="col-md-4">
						<input type="text" id="lastName" class="form-control input-sm" />
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<div class="col-md-6">
						<div class="row">
							<div class="col-md-4">
								<label class="control-lable" for="lastName">Start Date
									From </label>
							</div>
							<div class="col-md-6">
								<input type="text" id="lastName" class="form-control input-sm" />
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="col-md-4">
							<label class="control-lable" for="lastName">Start Date To
							</label>
						</div>
						<div class="col-md-6">
							<input type="text" id="lastName" class="form-control input-sm" />
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<div class="col-md-6">
						<div class="row">
							<div class="col-md-4">
								<label class="control-lable" for="lastName">Clear Date
									From </label>
							</div>
							<div class="col-md-6">
								<input type="text" id="lastName" class="form-control input-sm" />
							</div>
						</div>
					</div>
					<div class="col-md-6">

						<div class="col-md-4">
							<label class="control-lable" for="lastName">Clear Date To
							</label>
						</div>
						<div class="col-md-6">
							<input type="text" id="lastName" class="form-control input-sm" />
						</div>

					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-actions text-center">
					<a href="${cPath}/report-alarm-search"><button type="button"
							class="btn btn-primary">
							Search <i class="fa fa-search"></i>
						</button>
					</a>
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
							<th>No.</th>
							<th nowrap>Data Time Start</th>
							<th nowrap>Data Time Clear</th>
							<th nowrap>Operator</th>
							<th nowrap>รหัสตู้เติมเงิน</th>
							<th nowrap>สถานะการแจ้งเตือน</th>
							<th nowrap>Error Code</th>
							<th nowrap>Error Description</th>
							<th nowrap>หมายเลขเครื่องตู้เติมเงิน</th>
							<th nowrap>ชื่อ Network MA</th>
							<th nowrap>หมายเลขโทรศัพท์ที่สมัครตัวแทน MA</th>
							<th nowrap>ชื่อ Reference name for TA</th>
							<th nowrap>ชื่อ TA</th>
							<th nowrap>นามสกุล TA</th>
							<th nowrap>หมายเลขโทรศัพท์ที่สมัครตัวแทน TA</th>
							<th nowrap>ชื่อ Vendor</th>
							<th nowrap>ชื่อ Model</th>
							<th nowrap>Software Version</th>
							<th nowrap>ชื่อ</th>
							<th nowrap>นามสกุล</th>
							<th nowrap>หมายเลขโทรศัพท์เคลื่อนที่ที่ติดต่อได้</th>
							<th nowrap>ประเภทสถานที่ตั้งตู้เติมเงิน</th>
							<th nowrap>เลขที่</th>
							<th nowrap>หมู่ที่</th>
							<th nowrap>ซอย</th>
							<th nowrap>ถนน</th>
							<th nowrap>จังหวัด</th>
							<th nowrap>อำเภอ</th>
							<th nowrap>ตำบล</th>
							<th nowrap>รหัสไปรษณีย์</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${kioskAlarmReport}" var="kioskAlarm">
							<tr>
								<td>1</td>
								<td nowrap>${kioskAlarm.dateTimeStart}</td>
								<td nowrap>${kioskAlarm.dateTimeClear}</td>
								<td nowrap>${kioskAlarm.operator}</td>
								<td nowrap><a id="action-button" href="#"
									data-toggle="modal" data-target=".bs-example-modal-lg">${kioskAlarm.kioskId}</a></td>
								<td nowrap>${kioskAlarm.statusNoti}</td>
								<td nowrap>${kioskAlarm.errorCode}</td>
								<td nowrap>${kioskAlarm.errorDescription}</td>
								<td nowrap>${kioskAlarm.kioskSerialNumber}</td>
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



		<div class="modal fade bs-example-modal-lg" tabindex="-1"
			role="dialog" aria-labelledby="myLargeModalLabel">
			<div class="modal-dialog modal-lg" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">Kiosk Hareware
							Status</h4>
					</div>
					<div class="modal-body" style="overflow: auto;">

						<div class="container">
							<table class="table table-striped " id="result-table1">
								<thead>
									<tr>
										<th>No.</th>
										<th nowrap>Date Time Start</th>
										<th nowrap>Date Time Clear</th>
										<th nowrap>Operator</th>
										<th nowrap>ชื่อ Network MA</th>
										<th nowrap>หมายเลขโทรศัพท์ที่สมัครตัวแทน MA</th>
										<th nowrap>ชื่อ Reference name for TA</th>
										<th nowrap>หมายเลขโทรศัพท์ที่สมัครตัวแทน TA</th>
										<th nowrap>รหัสตู้เติมเงิน</th>
										<th nowrap>หมายเลขเครื่องตู้เติมเงิน</th>
										<th nowrap>ชื่อ</th>
										<th nowrap>นามสกุล</th>
										<th nowrap>หมายเลขโทรศัพท์เคลื่อนที่ที่ติดต่อได้</th>
										<th nowrap>ประเภทสถานที่ตั้งตู้เติมเงิน</th>
										<th nowrap>เลขที่</th>
										<th nowrap>หมู่ที่</th>
										<th nowrap>ซอย</th>
										<th nowrap>ถนน</th>
										<th nowrap>จังหวัด</th>
										<th nowrap>อำเภอ</th>
										<th nowrap>ตำบล</th>
										<th nowrap>รหัสไปรษณีย์</th>
										<th nowrap>ชื่อ Vendor</th>
										<th nowrap>ชื่อ Model</th>
										<th nowrap>Software Version</th>
										<th nowrap>สถานะการแจ้งเตือน</th>
										<th nowrap>Error Code</th>
										<th nowrap>Error Description</th>
										<th nowrap>Kiosk Status</th>
										<th nowrap>Door Status</th>
										<th nowrap>Bank Status</th>
										<th nowrap>Coin Status</th>
										<th nowrap>Main Board Status</th>
										<th nowrap>UPS (up/down)</th>
										<th nowrap>Power supply</th>
										<th nowrap>Network</th>
									</tr>
								</thead>

								<tbody>
									<tr>
										<td>1</td>
										<td nowrap>06/09/2553</td>
										<td nowrap>17/09/2553</td>
										<td nowrap>Operator01</td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap>Ki001</td>
										<td nowrap>K002555454</td>
										<td nowrap>ชื่อทดสอบ1</td>
										<td nowrap>นามสกุลทดสอบ1</td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
									</tr>

									<tr>
										<td nowrap>2</td>
										<td nowrap>06/09/2553</td>
										<td nowrap>17/09/2553</td>
										<td nowrap>Operator02</td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap>Ki002</td>
										<td nowrap>K0025545212</td>
										<td nowrap>ชื่อทดสอบ</td>
										<td nowrap>นามสกุลทดสอบ</td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
										<td nowrap></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<!--         <button type="button" class="btn btn-primary">Save changes</button> -->
					</div>
				</div>
			</div>
		</div>

	</div>