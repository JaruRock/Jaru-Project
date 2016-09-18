<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" style="margin-top: 30px; ">
	<div class="row">
		<div class="form-group col-md-12">
			<h3>
				<label class="col-md-3 control-lable">ค้นหาตู้เติมเงิน</label>
			</h3>
		</div>
	</div>
	

	<form:form method="POST" action="kiosk-search" modelAttribute="kiosk"
		class="form-horizontal">
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="">ชื่อ NetworkMA</label>
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
				<label class="col-md-3 control-lable" for="kioskId">รหัสตู้เติมเงิน (KioskID)</label>
				<div class="col-md-5">
					<form:input type="text" path="kioskId" id="kioskId"
						class="form-control input-sm" />
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="kioskSerialNo">หมายเลขเครื่องตู้เติมเงิน (KioskSerialNumber)</label>
				<div class="col-md-5">
					<form:input type="password" path="kioskSerialNo" id="kioskSerialNo"
						class="form-control input-sm" />
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="kioskStatus">สถานะตู้เติมเงิน (KioskStatus)</label>
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
					<button type="submit" class="btn btn-primary">Search <i class="fa fa-search"></i></button>&nbsp;&nbsp;
					<button type="reset" class="btn btn-default"> &nbsp;Clear <i class="fa fa-refresh"></i></button>&nbsp;&nbsp;
				</div>
			</div>
		</div>


		<div class="bs-component">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>No.</th>
						<th>ชื่อ NetworkMA</th>
						<th>หมายเลขโทรศัพท์ที่สมัครตัวแทน</th>
						<th>ชื่อขนามสกุล TA</th>
						<th>TA Reference Name</th>
						<th>รหัสตู้เติมเงิน</th>
						<th>ชื่อ</th>
						<th>นามสกุล</th>
						<th>หมายเลขเครื่องตู้เติมเงิน</th>
						<th>ประเภทสถานที่ตั้ง</th>
						<th>จังหวัด</th>
						<th>อำเภอ</th>
						<th>ตำบล</th>
						<th>สถานะ</th>
						<th>Action</th>

					</tr>
				</thead>
				<tbody>
					
            <c:forEach items="${kiosks}" var="kiosk1">
                <tr>
                    <td>${kiosk1.kioskId}</td>
                    <td>${kiosk1.nameNetworkMA}</td>
                    <td>${kiosk1.telephoneNo}</td>
                    <td>${kiosk1.nameTA}</td>
                     <td>${kiosk1.taReferenceName}</td>
                    <td>${kiosk1.kioskID}</td>
                    <td>${kiosk1.name}</td>
                    <td>${kiosk1.lastName}</td>
                     <td>${kiosk1.kioskSerialNo}</td>
                    <td>${kiosk1.typeZone}</td>
                    <td>${kiosk1.province}</td>
                    <td>${kiosk1.amphur}</td>
                    <td>${kiosk1.district}</td>
                    <td>${kiosk.kioskStatus}</td>
                    <td>
                    <a href="<c:url value='/edit-group' />" >View</a>
                    <a href="<c:url value='/edit-group' />" >Edit</a>
                     </td>
                    
                </tr>
            </c:forEach>  
				</tbody>
			</table>
		</div>

	</form:form>
</div>