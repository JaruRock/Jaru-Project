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

<div class="container">

	<div class="page-header">
		<div class="row">
			<div class="col-lg-12">
				<h4>รายงานตู้เติมเงิน</h4>
			</div>
		</div>
	</div>

	<div class="row">

		<fieldset>

			<div class="col-lg-12">
				<div class=" ">
					<h4>ค้นหาตู้เติมเงิน</h4>
				</div>
			</div>

			<form class="form-horizontal well">
				<div class="col-lg-6">
					<div class="form-group">
						<label for="name" class="col-lg-5 control-label">Operator</label>
						<div class="col-lg-6">
							<!--                       <input type="text" class="form-control" id="name"  > -->
							<div class="radio" style="float: left; margin: 0 10px;">
								<label><input type="radio" name="operator" value="AWN">AWN</label>
							</div>
							<div class="radio" style="float: left; margin: 0 10px;">
								<label><input type="radio" name="operator" value="DTAC">DTAC</label>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label for="" class="col-lg-5 control-label">TA Name </label>
						<div class="col-lg-6">
							<input type="text" class="form-control" id="" list="TAName">
							<datalist id="TAName">
								<option value="Something"></option>
								<option value="Something Else"></option>
								<option value="Another One"></option>
								<option value="Alpha"></option>
								<option value="Bravo"></option>
							</datalist>
						</div>
					</div>
					<div class="form-group">
						<label for="" class="col-lg-5 control-label"> อำเภอ</label>
						<div class="col-lg-6">
							<select class="form-control" id="">
								<option value="">All</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="" class="col-lg-5 control-label">รหัสตู้เติมเงิน
							(Kiosk ID)</label>
						<div class="col-lg-6">
							<input type="text" class="form-control" id="">
						</div>
					</div>
					<div class="form-group">
						<label for="" class="col-lg-5 control-label">สถานะตู้เติมเงินผูกกับ
							Wallet</label>
						<div class="col-lg-6">
							<select class="form-control" id="">
								<option value="">All</option>
							</select>
						</div>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="form-group">
						<label for="" class="col-lg-4 control-label required">ชื่อ
							Network MA </label>
						<div class="col-lg-6">
							<input type="text" class="form-control" required="required" id=""
								list="Network">
							<datalist id="Network">
								<option value="Something"></option>
								<option value="Something Else"></option>
								<option value="Another One"></option>
								<option value="Alpha"></option>
								<option value="Bravo"></option>
							</datalist>
						</div>
					</div>
					<div class="form-group">
						<label for="" class="col-lg-4 control-label"> จังหวัด</label>
						<div class="col-lg-6">
							<select class="form-control" id="">
								<option value="">All</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="" class="col-lg-4 control-label"> ตำบล</label>
						<div class="col-lg-6">
							<select class="form-control" id="">
								<option value="">All</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="" class="col-lg-4 control-label">หมายเลขเครื่องตู้เติมเงิน
							(Kiosk Serial Number)</label>
						<div class="col-lg-6">
							<input type="text" class="form-control" id="">
						</div>
					</div>

				</div>


				<div class="row">
					<div class="col-lg-12">
						<div class="form-group ">
							<div class="col-lg-12 text-center">
								<button type="button" class="btn btn-primary">
									Search <i class="fa fa-search"></i>
								</button>
								<a href="<c:url value='/welcome' />" class="btn btn-default">
		                        	<span class="glyphicon glyphicon-remove" aria-hidden="true"></span> Cancel
		                        </a>
								<button type="button" class="btn btn-warning" disabled>
									Export<i class="fa fa-file-excel-o"></i>
								</button>
							</div>
						</div>
					</div>
				</div>

			</form>
		</fieldset>

	</div>


	<div class="bs-docs-section">

		<div class="row">
			<div class="col-lg-12">
				<div class=" ">
					<h4>ผลการค้นหา</h4>
				</div>

				<div class="bs-component">
					<table class="table table-striped" id="result-table"
						cellspacing="0" width="350%">
						<thead>
							<tr>
								<th class="text-center">No.</th>
								<th class="text-center" nowrap>Operator</th>
								<th class="text-center" nowrap>ชื่อ Network MA</th>
								<th class="text-center" nowrap>หมายเลขโทรศัพท์ที่สมัครตัวแทน MA</th>
								<th class="text-center" nowrap>ประเภทสมาชิก MA</th>
								<th class="text-center" nowrap>ชื่อ Reference name for TA</th>
								<th class="text-center" nowrap>หมายเลขโทรศัพท์ที่สมัครตัวแทน TA</th>
								<th class="text-center" nowrap>ประเภทสมาชิก TA</th>
								<th class="text-center" nowrap>รหัสตู้เติมเงิน</th>
								<th class="text-center" nowrap>หมายเลขเครื่องตู้เติมเงิน</th>
								<th class="text-center" nowrap>ชื่อ</th>
								<th class="text-center" nowrap>นามสกุล</th>
								<th class="text-center" nowrap>หมายเลขโทรศัพท์เคลื่อนที่ที่ติดต่อได้</th>
								<th class="text-center" nowrap>ประเภทสถานที่ตั้งตู้เติมเงิน</th>
								<th class="text-center" nowrap>เลขที่</th>
								<th class="text-center" nowrap>หมู่ที่</th>
								<th class="text-center" nowrap>ซอย</th>
								<th class="text-center" nowrap>ถนน</th>
								<th class="text-center" nowrap>จังหวัด</th>
								<th class="text-center" nowrap>อำเภอ</th>
								<th class="text-center" nowrap>ตำบล</th>
								<th class="text-center" nowrap>รหัสไปรษณีย์</th>
								<th class="text-center" nowrap>ชื่อ Vendor</th>
								<th class="text-center" nowrap>ชื่อ Model</th>
								<th class="text-center" nowrap>ละติจูด</th>
								<th class="text-center" nowrap>ลองจิจูด</th>
								<th class="text-center" nowrap>เบอร์โทรศัพท์ที่ใช้เชื่อมต่อ</th>
								<th class="text-center" nowrap>Mainboard Serial No.</th>
								<th class="text-center" nowrap>Coin Acceptor Serial No.</th>
								<th class="text-center" nowrap>Bank Acceptor Serial No.</th>
								<th class="text-center" nowrap>วันที่ลงทะเบียนตู้เติมเงิน</th>
								<th class="text-center" nowrap>วันที่มีการเปิดใช้งานครั้งแรก</th>
								<th class="text-center" nowrap>สถานะตู้เติมเงิน</th>
							</tr>
						</thead>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>



