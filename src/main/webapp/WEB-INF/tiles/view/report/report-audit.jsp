<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="container" style="margin-top: 50px; width: 800px;">
    <div class="panel">
	    <h3>Kiosk Audit Report</h3>
	    <p>ค้นหาตู้เติมเงิน</p>
	</div>
  <form:form method="POST" action="/kiosk-audit-report" modelAttribute="kioskAuditReportCritiria" class="form-horizontal">
  
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="firstName">From Date</label>
                <div class="col-md-7">
                	<form:input type="text" path="fromDate" id="fromDate" class="form-control input-sm"/>

                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">To Date</label>
                <div class="col-md-7">
                	<form:input type="text" path="toDate" id="toDate" class="form-control input-sm"/>
              
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Operator</label>
                <div class="col-md-7">
                <form:select  path="operator" class="form-control input-sm" >
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
                <label class="col-md-3 control-lable" for="lastName">ชื่อ Network MA *</label>
                <div class="col-md-7" >
                
                <form:select  path="networkMa" class="form-control input-sm" >
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
                <label class="col-md-3 control-lable" for="lastName">ชื่อ Network TA *</label>
                <div class="col-md-7" >
                <form:select  path="netWorkTa" class="form-control input-sm" >
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
                <div class="col-md-7" >
                <form:select  path="province" class="form-control input-sm" >
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
                <div class="col-md-7" >
               <form:select  path="district" class="form-control input-sm" >
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
                <div class="col-md-7" >
               <form:select  path="subDistri" class="form-control input-sm" >
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
                <label class="col-md-3 control-lable" for="lastName">รหัสตู้เติมเงิน (Kiosk ID)</label>
                <div class="col-md-7">
                    <form:input type="text" path="kioskId" id="kioskId" class="form-control input-sm"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">หมายเลขเครื่องตู้เติมเงิน (Kiosk Serial Number)</label>
                <div class="col-md-7">
                    <form:input type="text" path="kioskSerialNumber" id="kioskSerialNumber" class="form-control input-sm"/>
                </div>
            </div>
        </div>
        
      <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">สถานะตู้เติมเงิน</label>
                <div class="col-md-7">
                
<%--                 <form:select  path="statusKiosk" class="form-control input-sm" > --%>
<%-- 			         <form:option value="101">ALL</form:option> --%>
<%-- 			         <form:option value="102">Active</form:option> --%>
<%-- 			         <form:option value="103">Inactive</form:option> --%>
<%-- 			         <form:option value="104">TBC</form:option> --%>

<%-- 			    </form:select> --%>

                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-actions floatRight">
                       	<a href="/report-audit-search" class="btn btn-default custom-width">ค้นหา</a>
                        <a href="" class="btn btn-default custom-width">ยกเลิก</a>
                        <a href="" class="btn btn-default custom-width">Export</a>
            </div>
        </div>
    </form:form>
    
    
 
        <table class="table table-hover table-bordered">
            <thead>
                <tr>
                    <th>No.</th>
                    <th>Operator.</th>
                    <th>ชื่อ Network MA</th>
                    <th>หมายเลขโทรศัพท์ที่สมัครตัวแทน MA</th>
					<th>ประเภทสมาชิก MA</th>
					<th>ชื่อ Reference name for TA</th>
					<th>หมายเลขโทรศัพท์ที่สมัครตัวแทน TA</th>
					<th>ประเภทสมาชิก TA</th>
					<th>รหัสตู้เติมเงิน</th>
					<th>หมายเลขเครื่องตู้เติมเงิน</th>
					<th>ชื่อ</th>
					<th>นามสกุล</th>
					<th>ประเภทสถานที่ตั้งตู้เติมเงิน</th>
					<th>เลขที่</th>
					<th>หมู่ที่</th>
					<th>ซอย</th>
					<th>จังหวัด</th>
					<th>อำเภอ</th>
					<th>ตำบล</th>
					<th>รหัสไปรษณี</th>
					<th>สถานะตู้เติมเงิน</th>
					<th>Open Shift Date</th>
					<th>Open Shift Time</th>
					<th>Close Shift Date</th>
					<th>Close Shift Time</th>
					<th>User Name ที่เปิดตู้</th>
					<th>Action</th>
					<th>Total Amount</th>
					<th>1</th>
					<th>2</th>
					<th>5</th>
					<th>10</th>
					<th>20</th>
					<th>50</th>
					<th>100</th>
					<th>500</th>
					<th>1000</th>
					
                </tr>
            </thead>
            <tbody>
           <c:forEach items="${kioskAuditReport}" var="kioskAudit">
                <tr>

                    
                    <td></td>
                    <td>${kioskAudit.operator}</td>
                    <td>${kioskAudit.networkMa}</td>
                    <td>${kioskAudit.phoneMa}</td>
                    <td>${kioskAudit.typeMa}</td>
                    <td>${kioskAudit.referenceName}</td>
                    <td>${kioskAudit.phonTa}</td>
                    <td>${kioskAudit.typeTa}</td>
                    <td>${kioskAudit.kioskId}</td>
                    <td>${kioskAudit.kioskSerialNumber}</td>
					<td>${kioskAudit.fristName}</td>
                    <td> </td>
                    <td> </td>
                    <td> </td>                                    
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>
					<td> </td>



                </tr>
          		</c:forEach>
            </tbody>
        </table>

</div>
