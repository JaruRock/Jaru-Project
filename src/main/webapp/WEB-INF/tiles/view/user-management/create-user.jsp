<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<div class="container" style="margin-top: 50px">	
	<div class="row">
		<div class="form-group col-md-12">
			<h4>
				<label class="col-md-3 control-lable">รายงานตู้เติมเงิน</label>
			</h4>
		</div>
	</div>
	<div class="well">
		<div class="row">
			<div class="form-group">
				<div class="row">
						<label for="name" class="col-lg-4 control-label">Operator</label>
						<div class="col-lg-6">
							<div class="radio" style="float: left; margin: 0 10px;">
								<label><input type="radio" name="operator" value="AWN">AIS</label>
							</div>
							<div class="radio" style="float: left; margin: 0 10px;">
								<label><input type="radio" name="operator" value="DTAC">DTAC</label>
							</div>
						</div>
				</div>
			</div>
			<div class="form-group">
						<label for="" class="col-lg-4 control-label">ชื่อ Network MA *</label>
						<div class="col-lg-6">
							<input type="text" class="form-control" id="">
						</div>
			</div>
			<div class="form-group">
						<label for="" class="col-lg-4 control-label">ชื่อ Network TA *</label>
						<div class="col-lg-6">
							<input type="text" class="form-control" id="">
						</div>
			</div>
			<div class="form-group">
						<label for="" class="col-lg-4 control-label">หมายเลขโทรศัพท์ที่สมัครตัวแทนTA*</label>
						<div class="col-lg-6">
							<input type="text" class="form-control" id="">
						</div>
			</div>
			<div class="form-group">
						<label for="" class="col-lg-4 control-label">หน้าที่ในการเข้าใช้งาน*</label>
						<div class="col-lg-6">
							<select class="form-control" id="">
								<option value="">All</option>
							</select>
						</div>
			</div>
			<div class="form-group">
						<label for="" class="col-lg-4 control-label">ชื่อ-นามสกุลผู้เข้าใช้งาน*</label>
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
						<label for="" class="col-lg-4 control-label">กรุณาระบุ ชื่อล๊อคอิน ที่ต้องการ:</label>
						<div class="col-lg-6">
							<input type="text" class="form-control" id="">
						</div>
			</div>
			<div class="form-group">
						<label for="" class="col-lg-4 control-label">กรุณาระบุ รหัสผ่าน:</label>
						<div class="col-lg-6">
							<input type="text" class="form-control" id="">
						</div>
			</div>
			<div class="form-group">
						<label for="" class="col-lg-4 control-label">กรุณาระบุ รหัสผ่าน อีกครั้ง:</label>
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
									บันทึก <i class="fa fa-search"></i>
								</button>
								<button type="button" class="btn btn-warning" disabled>
									ยกเลิก<i class="fa fa-file-excel-o"></i>
								</button>
							</div>
						</div>
					</div>
				</div>
	</div>
</div>

