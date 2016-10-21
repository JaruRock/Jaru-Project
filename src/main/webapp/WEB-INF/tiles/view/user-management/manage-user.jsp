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
				<label class="col-md-3 control-lable">ค้นหา ล๊อคอิน ผู้เข้าใช้งาน</label>
			</h4>
		</div>
	</div>
	<div class="well">
		<div class="row">
			<div class="form-group col-md-12">
						<label for="" class="col-lg-4 control-label">ชื่อ Network MA *</label>
						<div class="col-lg-4">
							<input type="text" class="form-control" id="" list="TAName">
							<datalist id="TAName">
								<option value="0"></option>								
							</datalist>
						</div>
			</div>
			<div class="form-group col-md-12">
						<label for="" class="col-lg-4 control-label">ชื่อ Network TA *</label>
						<div class="col-lg-4">
							<input type="text" class="form-control" id="" list="TAName">
							<datalist id="TAName">
								<option value="0"></option>								
							</datalist>
						</div>
			</div>
			<div class="form-group col-md-12">
						<label for="" class="col-lg-4 control-label">หมายเลขโทรศัพท์ที่สมัครตัวแทนTA*</label>
						<div class="col-lg-4">
							<input type="text" class="form-control" id="" list="TAName">
							<datalist id="TAName">
								<option value="0"></option>								
							</datalist>
						</div>
			</div>
			<div class="form-group col-md-12">
						<label for="" class="col-lg-4 control-label">ชื่อ ล๊อคอิน:</label>
						<div class="col-lg-4">
							<input type="text" class="form-control" id="" list="TAName">
							<datalist id="TAName">
								<option value="0"></option>								
							</datalist>
						</div>
			</div>
			<div class="form-group col-md-12">
						<label for="" class="col-lg-4 control-label">สถานะ:</label>
						<div class="col-lg-4">
							<input type="text" class="form-control" id="" list="TAName">
							<datalist id="TAName">
								<option value="0"></option>								
							</datalist>
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
									ยกเลิก<i class="fa fa-times"></i>
								</button>
							</div>
						</div>
					</div>
				</div>
		
	</div>
		<div class="row">
		<div class="col-lg-12">
			<div class="bs-component">
		     <table class="table table-striped" id="result-table">
					<thead>
						<tr>
							<th>ลำดับที่</th>
							<th nowrap>ชื่อ Network MA</th>
							<th nowrap>ชื่อ Reference name for TA</th>
							<th nowrap>หมายเลขโทรศัพท์ที่สมัครตัวแทน TA</th>
							<th nowrap>ชื่อ-นามสกุลผู้เข้าใช้งาน</th>
							<th nowrap>ชื่อ ล๊อคอิน</th>
							<th nowrap>วันที่ทำการสร้างข้อมูล</th>
							<th nowrap>คนที่ทำการสร้าง</th>
							<th nowrap>วันที่มีการแก้ไขข้อมูลล่าสุด</th>
							<th nowrap>คนที่ทำการแก้ไขข้อมูลล่าสุด</th>
							<th nowrap>สถานะปัจจุบัน</th>
							<th nowrap>Action</th>
						</tr>
					</thead>
					<tbody>
							<tr>
								<td></td>
								<td nowrap></td>
								<td nowrap></td>
								<td nowrap></td>
								<td nowrap></td>
								<td nowrap></td>
								<td nowrap></td>
								<td></td>
								<td nowrap></td>
								<td nowrap></td>
								<td nowrap></td>
								<td></td>
							</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

