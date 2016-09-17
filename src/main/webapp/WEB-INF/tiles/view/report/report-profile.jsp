<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">

		<div class="page-header">
			<div class="row">
				<div class="col-lg-12">
					<h3>รายงานตู้เติมเงิน</h3>
				</div>
			</div>
		</div>
		
		<div class="row">
		
		  <fieldset><div class="well">
		   <form class="form-horizontal">  
	          <div class="col-lg-6">
                  <div class="form-group">
                    <label for="name" class="col-lg-4 control-label">Host ID</label>
                    <div class="col-lg-6">
                      <input type="text" class="form-control" id="name"  >
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="" class="col-lg-4 control-label">Owner Name</label>
                    <div class="col-lg-6">
                      <input type="text" class="form-control" id=""  >
                    </div>
                  </div>
                   <div class="form-group">
                    <label for="" class="col-lg-4 control-label">Owner Type</label>
                    <div class="col-lg-6">
                       <select class="form-control" id="ownerType">
                       	<option value="">All</option>
                      </select>
                    </div>
                  </div>
            	 <div class="form-group">
                    <label for="" class="col-lg-4 control-label">Assigned Date Start</label>
                    <div class="col-lg-6">
			                <div class='input-group date' id='Assigned'>
			                    <input type='text' class="form-control" />
			                    <span class="input-group-addon">
			                        <span class="glyphicon glyphicon-calendar"></span>
			                    </span>
			                </div>
                    </div>
                  </div>
	          </div>
	          <div class="col-lg-6">
	                  <div class="form-group">
	                    <label for="select" class="col-lg-4 control-label">Asset Type</label>
	                    <div class="col-lg-6">
	                      <select class="form-control" id="assetType">
	                      	<option value="">All</option>
	                      </select>
	                    </div>
	                  </div>
	                 <div class="form-group">
	                    <label for="" class="col-lg-4 control-label">Mobile No.</label>
	                    <div class="col-lg-6">
	                      <input type="number" class="form-control" id=""  >
	                    </div>
	                  </div>
	                  <div class="form-group">
	                    <label for="" class="col-lg-4 control-label">Gender</label>
	                    <div class="col-lg-6">
	                       <select class="form-control" id="gender">
	                        <option value="">All</option>
	                      </select>
	                    </div>
	                  </div>
	                   <div class="form-group">
	                    <label for="" class="col-lg-4 control-label">Assigned Date Finish</label>
	                    <div class="col-lg-6">
	                       <div class='input-group date' id='Assigned'>
			                    <input type='text' class="form-control" />
			                    <span class="input-group-addon">
			                        <span class="glyphicon glyphicon-calendar"></span>
			                    </span>
			                </div>
	                    </div>
	                  </div>
	                
	          </div>


				<div class="row">
					<div class="col-lg-12">
						<div class="form-group "> 
							<div class="col-lg-12 text-center">
								<button type="reset" class="btn btn-default"> &nbsp;Clear <i class="fa fa-refresh"></i></button>&nbsp;&nbsp;
								<button type="button" class="btn btn-primary">Search <i class="fa fa-search"></i></button>&nbsp;&nbsp;
								<button type="button" class="btn btn-warning" disabled>Export <i class="fa fa-file-excel-o"></i></button>
							</div>
						</div>
					</div>
				</div>

				</form></div>
            </fieldset>
            
        </div>
		
		
		<div class="bs-docs-section">

        <div class="row">
          <div class="col-lg-12">
            <div class="page-header"> 
              <h3  >Result</h3>
            </div>

            <div class="bs-component">
              <table class="table table-striped " id="result-table" cellspacing="0" width="100%">
                <thead>
                  <tr  >
					<th class="text-center">Host ID </th>					 
					<th class="text-center">Asset Type</th>
					<th class="text-center">Status</th>
					<th class="text-center">S/N</th>
					<th class="text-center">S/N2</th>
					<th class="text-center">Brand</th>
					<th class="text-center">Models</th>
					<th class="text-center">Acquired </th>
					<th class="text-center">Warranty Exp.</th>
					<th class="text-center">Owner</th>
					<th class="text-center">Own. Type   </th>
					<th class="text-center">Mobile</th>
					<th class="text-center">Assigned</th>
					<th class="text-center">Finished</th>
                  </tr>
                </thead>
                <tbody>
<!--                   <tr> -->
<!--                     <td><a>Host Id  </a> </td> -->
<!--                     <td>Column  </td> -->
<!--                     <td>Column  </td> -->
<!--                     <td>Column  </td> -->
<!--                     <td>Column  </td> -->
<!--                     <td>Column  </td> -->
<!--                     <td>Column  </td> -->
<!--                     <td>Column  </td> -->
<!--                     <td>Column  </td> -->
<!--                     <td>Column  </td> -->
<!--                     <td>Column  </td> -->
<!--                   </tr> -->
                </tbody>
              </table> 
            </div><!-- /example -->
          </div>
        </div>
      </div>
		
		
		<hr>
		
		
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
	
		/* $('.date').datepicker();
		
	    $('#result-table').DataTable({
	    	"searching": false,
   			 "ordering": false,
   			 "ajax": "${cPath}/resources/json/data.json",
   			 "columns": [
	            { "data": "name",
			        "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
			            $(nTd).html("<a href='#"+oData.name+"'>"+oData.name+"</a>");
			        } 
	            },
	            { "data": "position" },
	            { "data": "office" },
	            { "data": "extn" },
	            { "data": "start_date" },
	            { "data": "salary" },
	            { "data": "name" },
	            { "data": "position" },
	            { "data": "office" },
	            { "data": "extn" },
	            { "data": "extn" },
	            { "data": "start_date" },
	            { "data": "extn" },
	            { "data": "salary" }
       		 ]
	    
	    }); */
	});
	
</script>
	
    
