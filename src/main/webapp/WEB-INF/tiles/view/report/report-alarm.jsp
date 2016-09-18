<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
    <div class="panel">
	    <h3>Kiosk Alarm Report</h3>
	    <p>ค้นหาตู้เติมเงิน</p>
	</div>
  <form:form method="POST" action="/new-user" modelAttribute="user" class="form-horizontal">
        <form:input type="hidden" path="userId" id="userId"/>

        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Operator</label>
                <div class="col-md-4">
                    <select class="form-control ">
                    <option>All</option>
                    </select>
                </div>
            </div>
        </div>
 
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">ชื่อ Network MA *</label>
                <div class="col-md-4" >
                   <select class="form-control ">
                    <option>All</option>
                    </select>
                </div>
            </div>
        </div>
 
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">ชื่อ Network TA *</label>
                <div class="col-md-4" >
                    <select class="form-control ">
                    <option>All</option>
                    </select>
                </div>
            </div>
        </div>
 
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">จังหวัด</label>
                <div class="col-md-4" >
                    <select class="form-control ">
                    <option>All</option>
                    </select>
                </div>
            </div>
        </div>
 
       <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">อำเภอ</label>
                <div class="col-md-4" >
                    <select class="form-control ">
                    <option>All</option>
                    </select>
                </div>
            </div>
        </div>
                 <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">ตำบล</label>
                <div class="col-md-4" >
                    <select class="form-control ">
                    <option>All</option>
                    </select>
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Model</label>
                <div class="col-md-4" >
                    <select class="form-control ">
                    <option>All</option>
                    </select>
                </div>
            </div>
        </div>
                 <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">Vendor</label>
                <div class="col-md-4" >
                    <select class="form-control ">
                    <option>All</option>
                    </select>
                </div>
            </div>
        </div>
        
                 <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">รหัสตู้เติมเงิน (Kiosk ID)</label>
                <div class="col-md-4">
                    <input type="text"  id="lastName" class="form-control input-sm" />
                </div>
            </div>
        </div>
                 <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">หมายเลขเครื่องตู้เติมเงิน (Kiosk Serial Number)</label>
                <div class="col-md-4">
                    <input type="text"  id="lastName" class="form-control input-sm" />
                </div>
            </div>
        </div>
                 <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">สถานะตู้เติมเงิน</label>
                <div class="col-md-4">
                    <input type="text"  id="lastName" class="form-control input-sm" />
                </div>
            </div>
        </div>
 
       <div class="row">
            <div class="form-group col-md-12">
                <div class="col-md-6">
                <div class="row">
                <div class="col-md-4">
                	<label class="control-lable" for="lastName">Start Date From </label>
                </div>
                <div class="col-md-6">
                    <input type="text"  id="lastName" class="form-control input-sm" />
                     </div>
                </div>
                </div>
                <div class="col-md-6">
                <div class="col-md-4">
                	<label class="control-lable" for="lastName">Start Date To </label>
                </div>
                <div class="col-md-6">
                    <input type="text"  id="lastName" class="form-control input-sm" />
                    </div>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <div class="col-md-6">
                <div class="row">
                <div class="col-md-4">
                	<label class="control-lable" for="lastName">Clear Date From </label>
                </div>
                <div class="col-md-6">
                    <input type="text"  id="lastName" class="form-control input-sm" />
                     </div>
                    </div>
                </div>
                <div class="col-md-6">
                
                <div class="col-md-4">
                	<label class="control-lable" for="lastName">Clear Date To </label>
                	</div>
                <div class="col-md-6">
                    <input type="text"  id="lastName" class="form-control input-sm" />
                     </div>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-actions text-center">
                       	<a href="${cPath}/report-alarm-search" class="btn btn-primary custom-width">ค้นหา</a>
                        <a href="" class="btn btn-primary custom-width">ยกเลิก</a>
                        <a href="" class="btn btn-primary custom-width">Export</a>
            </div>
        </div>
    </form:form>
    
    
 
        <table class="table table-hover">
            <thead>
                <tr>
                    <th>No.</th>
                    <th>Data Time Start</th>
                    <th>Data Time Clear</th>
                    <th>Operator</th>
					<th>รหัสตู้เติมเงิน</th>
					<th>สถานะการแจ้งเตือน</th>
					<th>Error Code</th>
					<th>Error Description</th>
					<th>หมายเลขเครื่องตู้เติมเงิน</th>
					<th>ชื่อ Network MA</th>
					<th>หมายเลขโทรศัพท์ที่สมัครตัวแทน MA</th>
					<th>ชื่อ Reference name for TA</th>
					<th>ชื่อ TA </th>
					<th>นามสกุล TA</th>
					<th>หมายเลขโทรศัพท์ที่สมัครตัวแทน TA</th>
					<th>ชื่อ Vendor</th>
					<th>ชื่อ Model</th>
					<th>Software Version</th>
					<th>ชื่อ</th>
					<th>นามสกุล</th>
					<th>หมายเลขโทรศัพท์เคลื่อนที่ที่ติดต่อได้</th>
					<th>ประเภทสถานที่ตั้งตู้เติมเงิน</th>
					<th>เลขที่</th>
					<th>หมู่ที่</th>
					<th>ซอย</th>
					<th>ถนน</th>
					<th>จังหวัด</th>
					<th>อำเภอ</th>
					<th>ตำบล</th>
					<th>รหัสไปรษณีย์</th>
					
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${kioskAlarmReport}" var="kioskAlarm">
                <tr>
                    <td>1</td>
                    <td>${kioskAlarm.dateTimeStart}</td>
                    <td>${kioskAlarm.dateTimeClear}</td>
                    <td>${kioskAlarm.operator}</td>                                    
					<td>  <a id="action-button" href="#" data-toggle="modal" data-target=".bs-example-modal-lg" >${kioskAlarm.kioskId}</a>  </td>
                    <td>${kioskAlarm.statusNoti}</td>
                    <td>${kioskAlarm.errorCode}</td>
                    <td>${kioskAlarm.errorDescription}</td>
                    <td>${kioskAlarm.kioskSerialNumber}</td>     
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>     
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>     
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>     
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>     
	                <td></td>
                    <td></td>
                    <td></td>
                    <td></td>     
					<td></td>
					
                </tr>
          </c:forEach>
            </tbody>
        </table>
        
        
        
     
<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
       <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Kiosk Hareware Status</h4>
      </div>
      <div class="modal-body" style="overflow: auto;">
      
      <div class="container">
          <table class="table table-striped " id="result-table" cellspacing="0" width="100%">
                <thead>
                <tr>
                <th> No. </th>
				<th> Date Time Start </th>
				<th> Date Time Clear </th>
				<th> Operator </th>
				<th> ชื่อ Network MA </th>
				<th> หมายเลขโทรศัพท์ที่สมัครตัวแทน MA </th>
				<th> ชื่อ Reference name for TA </th>
				<th> หมายเลขโทรศัพท์ที่สมัครตัวแทน TA </th>
				<th> รหัสตู้เติมเงิน </th>
				<th> หมายเลขเครื่องตู้เติมเงิน </th>
				<th> ชื่อ </th>
				<th> นามสกุล </th>
				<th> หมายเลขโทรศัพท์เคลื่อนที่ที่ติดต่อได้ </th>
				<th> ประเภทสถานที่ตั้งตู้เติมเงิน </th>
				<th> เลขที่ </th>
				<th> หมู่ที่ </th>
				<th> ซอย </th>
				<th> ถนน </th>
				<th> จังหวัด </th>
				<th> อำเภอ </th>
				<th> ตำบล </th>
				<th> รหัสไปรษณีย์ </th>
				<th> ชื่อ Vendor </th>
				<th> ชื่อ Model </th>
				<th> Software Version </th>
				<th> สถานะการแจ้งเตือน </th>
				<th> Error Code </th>
				<th> Error Description </th>
				<th> Kiosk Status </th>
				<th> Door Status </th>
				<th> "Bank  </th>
				<th> Status" </th>
				<th> Coin Status </th>
				<th> Main Board Status  </th>
				<th> "UPS </th>
				<th> (up/down)" </th>
				<th> Power supply </th>
				<th> Network </th>
		               </tr> 
                </thead>
                
                <tbody>
                <tr>
                
				<td> 1 </td>
				<td> 06/09/2553 </td>
				<td> 17/09/2553 </td>
				<td> Operator01 </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td> Ki001 </td>
				<td> K002555454</td>
				<td> ชื่อทดสอบ1</td>
				<td> นามสกุลทดสอบ1</td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				
          		
                
                
				
                </tr>
                
               <tr>
                
				<td> 2 </td>
				<td> 06/09/2553 </td>
				<td> 17/09/2553 </td>
				<td> Operator02 </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td> Ki002 </td>
				<td> K0025545212</td>
				<td> ชื่อทดสอบ</td>
				<td> นามสกุลทดสอบ </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				<td>  </td>
				
          		
                
                
				
                </tr>
                 </tbody>
          </table>
          </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
<!--         <button type="button" class="btn btn-primary">Save changes</button> -->
      </div>
    </div>
  </div>
</div>

</div>
