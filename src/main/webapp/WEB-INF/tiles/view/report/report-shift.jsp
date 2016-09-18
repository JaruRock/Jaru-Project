<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" style="margin-top: 30px; ">
	<div class="row">
		<div class="form-group col-md-12">
			<h3>
				<label class="col-md-3 control-lable">Kiosk Shift Report</label>
			</h3>
		</div>
	</div> 
	
	<form:form method="POST" action="report-shift" modelAttribute="kioskShiftCritiria" class="form-horizontal">
 

	    <div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="number">ชื่อ Network MA *</label>
	        <div class="col-md-4">
	            <form:input type="text" path="networkMAName" class="form-control input-sm" />
	        </div>
	    </div>
	    
	    	    <div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="number">หมายเลขโทรศัพท์ที่สมัครตัวแทน</label>
	        <div class="col-md-4">
	            <form:input type="text" path="telphoneNo" class="form-control input-sm" />
	        </div>
	    </div>		
		
	    <div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="number">Kiosk ID</label>
	        <div class="col-md-4">
	            <form:input type="text" path="kioskId" class="form-control input-sm" />
	        </div>
	    </div>
	    
	   	<div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="dateFrom">ตั้งแต่วันที่</label>
	        <div class="col-md-4">
	            <form:input type="text" path="fromDate" class="form-control input-sm" />
	        </div>
	    </div>
	    
	    <div class="form-group col-md-12">
	        <label class="col-md-3 control-lable" for="dateTo">ถึงวันที่</label>
	        <div class="col-md-4">
	            <form:input type="text" path="toDate" class="form-control input-sm" />
	        </div>
	    </div>		
	 
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable"></label>
				<div class="col-md-7">
					<button type="submit" class="btn btn-primary">ตกลง <i class="fa fa-search"></i></button>&nbsp;&nbsp;
					<button type="reset" class="btn btn-default"> &nbsp;Cancel <i class="fa "></i></button>&nbsp;&nbsp;
				</div>
			</div>
		</div>

 

		<div class="bs-component">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ลำดับที่</th>
						<th>Shift ID</th>
						<th>วันที่เปิด Shift</th>
						<th>วันที่ปิด Shift</th>
						<th>หมายเลขโทรศัพท์มือถือ</th>
						<th>Kiosk ID</th>
						<th>สถานที่ตั้ง</th>
						<th>Action</th> 
					</tr>
				</thead>
				<tbody>
					
 
	
            <c:forEach items="${kioskShiftList}" var="domain">
                <tr>
                    <td> </td>
                    <td>${domain.shiftId}</td>
                    <td>${domain.openShiftDate}</td>
                    <td>${domain.closeShiftDate}</td>
                     <td>${domain.telephoneNo}</td>
        
                    <td>${domain.kioskId}</td>
                    <td>${domain.address}</td>
                   
                    <td>
                    <a href="#" >View</a>
                  
                     </td>
                    
                </tr>
            </c:forEach>  
				</tbody>
			</table>
		</div>

	</form:form>
</div>

 