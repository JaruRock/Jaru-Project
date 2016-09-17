<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" style="margin-top: 50px; width: 800px;">
    <div class="panel">
	    <h3>Kiosk Audit Report</h3>
	    <p>ค้นหาตู้เติมเงิน</p>
	</div>
  <form:form method="POST" action="/new-user" modelAttribute="user" class="form-horizontal">
        <form:input type="hidden" path="userId" id="userId"/>

        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Operator</label>
                <div class="col-md-7">
                    <select class="form-control ">
                    <option>All</option>
                    </select>
                </div>
            </div>
        </div>
 
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">ชื่อ Network MA *</label>
                <div class="col-md-7" >
                   <select class="form-control ">
                    <option>All</option>
                    </select>
                </div>
            </div>
        </div>
 
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">ชื่อ Network TA *</label>
                <div class="col-md-7" >
                    <select class="form-control ">
                    <option>All</option>
                    </select>
                </div>
            </div>
        </div>
 
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">จังหวัด</label>
                <div class="col-md-7" >
                    <select class="form-control ">
                    <option>All</option>
                    </select>
                </div>
            </div>
        </div>
 
       <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">อำเภอ</label>
                <div class="col-md-7" >
                    <select class="form-control ">
                    <option>All</option>
                    </select>
                </div>
            </div>
        </div>
                 <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">ตำบล</label>
                <div class="col-md-7" >
                    <select class="form-control ">
                    <option>All</option>
                    </select>
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Model</label>
                <div class="col-md-7" >
                    <select class="form-control ">
                    <option>All</option>
                    </select>
                </div>
            </div>
        </div>
                 <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Vendor</label>
                <div class="col-md-7" >
                    <select class="form-control ">
                    <option>All</option>
                    </select>
                </div>
            </div>
        </div>
        
                 <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">รหัสตู้เติมเงิน (Kiosk ID)</label>
                <div class="col-md-7">
                    <input type="text"  id="lastName" class="form-control input-sm" />
                </div>
            </div>
        </div>
                 <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">หมายเลขเครื่องตู้เติมเงิน (Kiosk Serial Number)</label>
                <div class="col-md-7">
                    <input type="text"  id="lastName" class="form-control input-sm" />
                </div>
            </div>
        </div>
                 <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">สถานะตู้เติมเงิน</label>
                <div class="col-md-7">
                    <input type="text"  id="lastName" class="form-control input-sm" />
                </div>
            </div>
        </div>
 
       <div class="row">
            <div class="form-group col-md-12">
                <div class="col-md-6">
                	<label class="control-lable" for="lastName">Start Date From </label>
                    <input type="text"  id="lastName" class="form-control input-sm" />
                </div>
                <div class="col-md-6">
                	<label class="control-lable" for="lastName">Start Date To </label>
                    <input type="text"  id="lastName" class="form-control input-sm" />
                </div>
            </div>
        </div>
               <div class="row">
            <div class="form-group col-md-12">
                <div class="col-md-6">
                	<label class="control-lable" for="lastName">Clear Date From </label>
                    <input type="text"  id="lastName" class="form-control input-sm" />
                </div>
                <div class="col-md-6">
                	<label class="control-lable" for="lastName">Clear Date To </label>
                    <input type="text"  id="lastName" class="form-control input-sm" />
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-actions floatRight">
                       	<a href="" class="btn btn-default custom-width">ค้นหา</a>
                        <a href="" class="btn btn-default custom-width">ยกเลิก</a>
                        <a href="" class="btn btn-default custom-width">Export</a>
            </div>
        </div>
    </form:form>
    
    
 
        <table class="table table-hover table-bordered">
            <thead>
                <tr>
                    <th>No.</th>
                    <th>Date Time Start</th>
                    <th>Date Time Clear</th>
                    <th>Operator.</th>
                    <th>รหัสตู้เติมเงิน</th>
                    <th>สถานะการแจ้งเตือน</th>
                    <th>Error Code</th>
                    
                    <th>Error Description</th>
                    <th>หมายเลขเครื่องตู้เติมเงิน</th>
					<th>ชื่อ Network MA</th>
					<th>หมายเลขโทรศัพท์ที่สมัครตัวแทน MA</th>
					<th>หมายเลขโทรศัพท์ที่สมัครตัวแทน TA</th>
					<th>ประเภทสมาชิก TA</th>
					
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
					<th></th>
					<th></th>
					<th>รหัสไปรษณี</th>
					
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
           
                <tr>
                    <td>firstName</td>
                    <td>lastName</td>
                    <td>email</td>
                    <td>username</td>                                    
					<td>ประเภทสมาชิก MA</td>
					<td>ชื่อ Reference name for TA</td>
					<td>หมายเลขโทรศัพท์ที่สมัครตัวแทน TA</td>
					<td>ประเภทสมาชิก TA</td>
					<td>รหัสตู้เติมเงิน</td>
					<td>หมายเลขเครื่องตู้เติมเงิน</td>
					<td>ชื่อ</td>
					<td>นามสกุล</td>
					<td>ประเภทสถานที่ตั้งตู้เติมเงิน</td>
					<td>เลขที่</td>
					<td>หมู่ที่</td>
					<td>ซอย</td>
					<td>จังหวัด</td>
					<td>อำเภอ</td>
					<td>ตำบล</td>
					<td>รหัสไปรษณี</td>
					<td>สถานะตู้เติมเงิน</td>
					<td>Open Shift Date</td>
					<td>Open Shift Time</td>
					<td>Close Shift Date</td>
					<td>Close Shift Time</td>
					<td>User Name ที่เปิดตู้</td>
					<td>Action</td>
					<td>Total Amount</td>
					<td>1</td>
					<td>2</td>
					<td>5</td>
					<td>10</td>
					<td>20</td>
					<td>50</td>
					<td>100</td>
					<td>500</td>
					<td>1000</td>
                </tr>
          
            </tbody>
        </table>

</div>
