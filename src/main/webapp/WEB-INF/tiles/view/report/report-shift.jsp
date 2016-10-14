<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" href="${cPath}/resources/css/dataTables.bootstrap.min.css">
<script src="${cPath}/resources/js/jquery.dataTables.min.js"></script>
<script src="${cPath}/resources/js/dataTables.bootstrap.min.js"></script>
<script src="${cPath}/resources/js/report-shift.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
	$('#datepicker').datepicker({ dateFormat: "yy-mm-dd" }).val()
    $( "#datepicker2" ).datepicker({ dateFormat: "yy-mm-dd" }).val()
  } );
  </script>

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
<style>
.dataTables_scrollHeadInner{
	width:100% !important;
}
.table.table-striped.dataTable.no-footer{
	width:100% !important;
}
</style>

<div class="container" style="margin-top: 30px;">
	<div class="row">
		<div class="form-group col-md-12">
			<h4>
				<label class="col-md-3 control-lable">Kiosk Shift Report</label>
			</h4>
		</div>
	</div>
	<input type="hidden" id="showModal" value="${showModal}"/>
	<form:form method="POST" action="report-shift"
		modelAttribute="kioskShiftCritiria" class="form-horizontal" id="reportShiftForm">

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
						class="form-control input-sm" id="datepicker" />
				</div>
			</div>

			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="dateTo">ถึงวันที่</label>
				<div class="col-md-4">
					<form:input type="text" path="toDate" class="form-control input-sm" id="datepicker2" />
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable"></label>
					<div class="col-md-7">
						<button type="submit" class="btn btn-primary">ค้นหา <i class="fa fa-search"></i>
						</button>
						<a href="<c:url value='/welcome' />" class="btn btn-default">
                        	<span class="glyphicon glyphicon-remove" aria-hidden="true"></span> ยกเลิก
                        </a>
					</div>
				</div>
			</div>
		</div>
	</form:form>
	<div class="row">
		<div class="col-lg-12">
			<div class="bs-component">
		      <table class="table table-striped" id="result-table" width="100%">
					<thead>
						<tr>
							<th>ลำดับที่</th>
							<th nowrap>Shift ID</th>
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
								<td nowrap>${domain.startShiftDate}</td>
								<td nowrap>${domain.endShiftDate}</td>
								<td nowrap></td>
								<td nowrap>${domain.kioskId}</td>
								<td nowrap></td>
								<td><a href="#"  data-toggle="modal" data-target="#myModal">View</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

<div class="modal fade" id="myModal">
<div class="modal-dialog modal-lg">
  <div class="modal-content">
    <div class="modal-header">
      <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
      <h4 class="modal-title">ผลการค้นหา</h4>
    </div>
    <div class="modal-body">
	<c:forEach items="${kioskShiftList}" var="domain">
		 หมายเลขโทรศัพท์มือถือ :  <br>
		Kiosk ID: ${domain.kioskId}<br>
		วันที่เปิด Shift: ${domain.startShiftDate}<br>
		วันที่ปิด Shift: ${domain.endShiftDate} <br>
		ยอดเงินรวมทั้งหมด: ${domain.allTotal}<br>
	</c:forEach>
	
	<div class="row">
		<div class="col-lg-6">
			<table class="table table-striped" id="result-table" width="100%">
				<thead>
					<tr>
						<th class="text-center"><b>ธนบัตร</b></th>
						<th class="text-center" colspan="2"><b>ในตู้ KIOSK</b></th>
					</tr>
				</thead>
				<tbody>
						<tr>
							<td class="text-center"><b></b></td>
							<td class="text-center"><b>จำนวนเงิน</b></td>
							<td class="text-center"><b>จำนวนฉบับ</b></td>
						</tr>
						<c:forEach items="${kioskShiftList}" var="domain">
							<tr><td>ธนบัตรมูลค่า 20บาท</td><td class="text-right">${domain.bill20Value}</td><td class="text-right">${domain.bill20}</td></tr>
							<tr><td>ธนบัตรมูลค่า 50บาท</td><td class="text-right">${domain.bill50Value}</td><td class="text-right">${domain.bill50}</td></tr>
							<tr><td>ธนบัตรมูลค่า 100บาท</td><td class="text-right">${domain.bill100Value}</td><td class="text-right">${domain.bill100}</td></tr>
							<tr><td>ธนบัตรมูลค่า 500บาท</td><td class="text-right">${domain.bill500Value}</td><td class="text-right">${domain.bill500}</td></tr>
							<tr><td>ธนบัตรมูลค่า 1000บาท</td><td class="text-right">${domain.bill1000Value}</td><td class="text-right">${domain.bill1000}</td></tr>
						
							<tr>
								<td><b>รวม</b></td>
								<td class="text-right">${domain.billTotal}</td>
								<td class="text-right">${domain.billAmount}</td>
							</tr>
						</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="col-lg-6">
			<table class="table table-striped" id="result-table" width="100%" style="margin-top:7px;">
				<thead>
					<tr>
						<th class="text-center"><b>เหรียญ</b></th>
						<th class="text-center" colspan="2"><b>ในตู้ KIOSK</b></th>
					</tr>					
				</thead>
				<tbody>
					<tr>
						<td class="text-center"><b></b></td>
						<td class="text-center"><b>จำนวนเงิน</b></td>
						<td class="text-center"><b>จำนวนเหรียญ</b></td>
					</tr>
					<c:forEach items="${kioskShiftList}" var="domain">
						<tr><td>เหรียญมูลค่า 1บาท</td><td class="text-right">${domain.coin1Value}</td><td class="text-right">${domain.coin1}</td></tr>
						<tr><td>เหรียญมูลค่า 2บาท</td><td class="text-right">${domain.coin2Value}</td><td class="text-right">${domain.coin2}</td></tr>
						<tr><td>เหรียญมูลค่า 5บาท</td><td class="text-right">${domain.coin5Value}</td><td class="text-right">${domain.coin5}</td></tr>
						<tr><td>เหรียญมูลค่า 10บาท</td><td class="text-right">${domain.coin10Value}</td><td class="text-right">${domain.coin10}</td></tr>
					
						<tr>
							<td><b>รวม</b></td>
							<td class="text-right">${domain.coinTotal}</td>
							<td class="text-right">${domain.coinAmount}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
    </div>
    <div class="modal-footer">
      <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
    </div>
  </div><!-- /.modal-content -->
</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
