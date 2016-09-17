<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" style="margin-top: 50px; width: 800px;">
	<div class="row">
		<div class="form-group col-md-12">
			<h3>
				<label class="col-md-3 control-lable">ค้นหาตู้เติมเงิน</label>
			</h3>
		</div>
	</div>

	<form:form method="GET" action="" modelAttribute="kiosk"
		class="form-horizontal">
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="">NetworkMA</label>
				<div class="col-md-7">
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
				<label class="col-md-3 control-lable" for="telephoneNo">TelephoneNumber</label>
				<div class="col-md-7">
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
				<label class="col-md-3 control-lable" for="kioskId">KioskNo</label>
				<div class="col-md-7">
					<form:input type="text" path="kioskId" id="kioskId"
						class="form-control input-sm" />
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="kioskSerialNo">KioskSerialNo</label>
				<div class="col-md-7">
					<form:input type="password" path="kioskSerialNo" id="kioskSerialNo"
						class="form-control input-sm" />
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="kioskStatus">KioskStatus</label>
				<div class="col-md-7">
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
					<button type="submit" class="btn btn-primary btn-sm">Search</button>
					<button type="submit" class="btn btn-primary btn-sm">Cancel</button>
				</div>
			</div>
		</div>


		<div class="panel panel-default">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>No</th>
						<th>NetworkMA</th>
						<th>TelephoneNo</th>
						<th>Name</th>
						<th>TA Reference Name</th>
						<th>KioskNo</th>
						<th>Name</th>
						<th>LastName</th>
						<th>KioskSerailNo</th>
						<th>Zone</th>
						<th>Province</th>
						<th>Aumphur</th>
						<th>District</th>
						<th>Status</th>
						<th></th>

					</tr>
				</thead>
				<tbody>
					
            <c:forEach items="${kiosks}" var="kiosk1">
                <tr>
                    <td>${kiosk1.kioskId}</td>
                    <td></td>
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
                    <td>${kiosk1.kioskStatus}</td>
                    <td></td>
                    
                </tr>
            </c:forEach>  
				</tbody>
			</table>
		</div>

	</form:form>
</div>