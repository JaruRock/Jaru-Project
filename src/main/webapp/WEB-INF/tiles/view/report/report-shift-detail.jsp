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
	<c:forEach items="${kioskShiftList}" var="domain">
		 หมายเลขโทรศัพท์มือถือ : ${domain.telephoneNo} <br>
		Kiosk ID: ${domain.kioskId}<br>
		วันที่เปิด Shift: ${domain.openShiftDate}<br>
		วันที่ปิด Shift: ${domain.closeShiftDate} <br>
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
						<tr><td>ธนบัตรมูลค่า 20บาท</td><td></td><td></td></tr>
						<tr><td>ธนบัตรมูลค่า 50บาท</td><td></td><td></td></tr>
						<tr><td>ธนบัตรมูลค่า 100บาท</td><td></td><td></td></tr>
						<tr><td>ธนบัตรมูลค่า 500บาท</td><td></td><td></td></tr>
						<tr><td>ธนบัตรมูลค่า 1000บาท</td><td></td><td></td></tr>
						<tr>
							<td><b>รวม</b></td>
							<td></td>
							<td></td>
						</tr>
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
					<tr><td>เหรียญมูลค่า 1บาท</td><td></td><td></td></tr>
					<tr><td>เหรียญมูลค่า 2บาท</td><td></td><td></td></tr>
					<tr><td>เหรียญมูลค่า 5บาท</td><td></td><td></td></tr>
					<tr><td>เหรียญมูลค่า 10บาท</td><td></td><td></td></tr>
					<tr>
						<td><b>รวม</b></td>
						<td></td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>

