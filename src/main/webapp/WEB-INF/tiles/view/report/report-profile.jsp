<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%-- <link rel="stylesheet" href="${cPath}/resources/css/datepicker.css"> --%>
<link rel="stylesheet" href="${cPath}/resources/css/dataTables.bootstrap.min.css">
<%-- <script src="${cPath}/resources/js/bootstrap-datepicker.js"></script> --%>
<script src="${cPath}/resources/js/jquery.dataTables.min.js"></script>
<script src="${cPath}/resources/js/dataTables.bootstrap.min.js"></script>
	
	
<div class="container">

		<div class="page-header">
			<div class="row">
				<div class="col-lg-12">
					<h1>รายงานตู้เติมเงิน</h1>
				</div>
			</div>
		</div>
		
		<div class="row">
		
		  <fieldset  >
		  
		   <div class="col-lg-12">
	            <div class=" "> 
	              <h3>ค้นหาตู้เติมเงิน</h3>
	            </div>
           </div>
           
<!-- 		  <legend class="kms-legend">ค้นหาตู้เติมเงิน</legend> -->
		   <form class="form-horizontal well">  
	          <div class="col-lg-6">
                  <div class="form-group">
                    <label for="name" class="col-lg-5 control-label">Operator</label>
                    <div class="col-lg-6">
<!--                       <input type="text" class="form-control" id="name"  > -->
                      <div class="radio" style="float: left; margin:0 10px;">
                        <label><input type="radio" name="operator"  value="AWN" >AWN</label>
                      </div>
                      <div class="radio" style="float: left; margin:0 10px;">
                         <label><input type="radio" name="operator"  value="DTAC" >DTAC</label>
                      </div>
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="" class="col-lg-5 control-label">TA Name </label>
                    <div class="col-lg-6">
                      <input type="text" class="form-control" id="" list="TAName" >
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
                    <label for="" class="col-lg-5 control-label">รหัสตู้เติมเงิน (Kiosk ID)</label>
                    <div class="col-lg-6">
                   		 <input type="text" class="form-control" id=""  >
                    </div>
                  </div>
            	 <div class="form-group">
                    <label for="" class="col-lg-5 control-label">สถานะตู้เติมเงินผูกกับ Wallet</label>
                    <div class="col-lg-6">
                       <select class="form-control" id="">
                       	<option value="">All</option>
                      </select>
                    </div>
                  </div>
	          </div>
	          <div class="col-lg-6">
	                  <div class="form-group">
	                  		<label for="" class="col-lg-4 control-label required">ชื่อ Network MA </label>
		                    <div class="col-lg-6">
		                      <input type="text" class="form-control" required="required" id="" list="Network" >
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
	                    <label for="" class="col-lg-4 control-label">หมายเลขเครื่องตู้เติมเงิน (Kiosk Serial Number)</label>
	                    <div class="col-lg-6">
	                       <input type="text" class="form-control" id=""  >
	                    </div>
	                  </div>
	                
	          </div>


				<div class="row">
					<div class="col-lg-12">
						<div class="form-group "> 
							<div class="col-lg-12 text-center">
								<button type="button" class="btn btn-primary">Search <i class="fa fa-search"></i></button>&nbsp;&nbsp;
								<button type="reset" class="btn btn-default"> Cancel <i class="fa fa-ban"></i></button>&nbsp;&nbsp;
								<button type="button" class="btn btn-warning" disabled>Export into Excel <i class="fa fa-file-excel-o"></i></button>
							</div>
						</div>
					</div>
				</div>

				</form>
<!-- 				</div> -->
            </fieldset>
            
        </div>
		
		
		<div class="bs-docs-section">

        <div class="row">
          <div class="col-lg-12">
            <div class=" "> 
              <h3>ข้อมูลตู้เติมเงิน</h3>
            </div>

            <div class="bs-component">
              <table class="table table-striped" id="result-table" cellspacing="0" width="350%">
                <thead>
                  <tr> 				 
						<th class="text-center">No.</th>
						<th class="text-center">Operator</th>
						<th class="text-center">ชื่อ Network MA</th>
						<th class="text-center">หมายเลขโทรศัพท์ที่สมัครตัวแทน MA</th>
						<th class="text-center">ประเภทสมาชิก MA</th>
						<th class="text-center">ชื่อ Reference name for TA</th>
						<th class="text-center">หมายเลขโทรศัพท์ที่สมัครตัวแทน TA</th>
						<th class="text-center">ประเภทสมาชิก TA</th>
						<th class="text-center">รหัสตู้เติมเงิน</th>
						<th class="text-center">หมายเลขเครื่องตู้เติมเงิน</th>
						<th class="text-center">ชื่อ</th>
						<th class="text-center">นามสกุล</th>
						<th class="text-center">หมายเลขโทรศัพท์เคลื่อนที่ที่ติดต่อได้</th>
						<th class="text-center">ประเภทสถานที่ตั้งตู้เติมเงิน</th>
						<th class="text-center">เลขที่</th>
						<th class="text-center">หมู่ที่</th>
						<th class="text-center">ซอย</th>
						<th class="text-center">ถนน</th>
						<th class="text-center">จังหวัด</th>
						<th class="text-center">อำเภอ</th>
						<th class="text-center">ตำบล</th>
						<th class="text-center">รหัสไปรษณีย์</th>
						<th class="text-center">ชื่อ Vendor</th>
						<th class="text-center">ชื่อ Model</th>
						<th class="text-center">ละติจูด</th>
						<th class="text-center">ลองจิจูด</th>
						<th class="text-center">เบอร์โทรศัพท์ที่ใช้เชื่อมต่อ</th>
						<th class="text-center">Mainboard Serial No.</th>
						<th class="text-center">Coin Acceptor Serial No.</th>
						<th class="text-center">Bank Acceptor Serial No.</th>
						<th class="text-center">วันที่ลงทะเบียนตู้เติมเงิน</th>
						<th class="text-center">วันที่มีการเปิดใช้งานครั้งแรก</th>
						<th class="text-center">สถานะตู้เติมเงิน</th>
                  </tr>
                </thead>
<!--                 <tbody> -->
<!--                 </tbody> -->
              </table> 
            </div><!-- /example -->
          </div>
        </div>
      </div>
		
	</div>
	
 <script>
 /* 
	var LOV_ASSET_TYPE = ${LOV_ASSET_TYPE};
	var LOV_OWNER_TYPE = ${LOV_OWNER_TYPE};
	var LOV_GENDER = ${LOV_GENDER};
	
	$.each(LOV_ASSET_TYPE, function(i, val){
	   $('#assetType').append($('<option/>', { value: val['code'], text: val['code']+' - '+val['descTH'] }));
	});
	
	$.each(LOV_OWNER_TYPE, function(i, val){
	   $('#ownerType').append($('<option/>', { value: val['code'], text: val['code']+' - '+val['descTH'] }));
	});
	
	$.each(LOV_GENDER, function(i, val){
	   $('#gender').append($('<option/>', { value: val['code'], text: val['descTH'] }));
	});
	 */
	
	$(document).ready(function() {
	
// 		$('.date').datepicker();
		
	    $('#result-table').DataTable({
	   		"paging":  false,
	    	"searching": false,
   			"ordering": false,
	        "scrollY": true,
	        "scrollX": true
//    			 "ajax": "${cPath}/resources/json/data.json",
//    			 "columns": [
// 	            { "data": "name",
// 			        "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
// 			            $(nTd).html("<a href='#"+oData.name+"'>"+oData.name+"</a>");
// 			        } 
// 	            },
// 	            { "data": "position" },
// 	            { "data": "office" },
// 	            { "data": "extn" },
// 	            { "data": "start_date" },
// 	            { "data": "salary" },
// 	            { "data": "name" },
// 	            { "data": "position" },
// 	            { "data": "office" },
// 	            { "data": "extn" },
// 	            { "data": "extn" },
// 	            { "data": "start_date" },
// 	            { "data": "extn" },
// 	            { "data": "salary" }
//        		 ]
	    
	    }); 
	});
	
</script>
	
    
