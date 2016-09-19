<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container" style="margin-top: 50px">
	 <c:if test="${not empty param.success}">
	 		<div class="alert alert-success" role="alert">${param.success}</div>
	 </c:if>
	 <form:form method="POST" action="/kiosk-register" modelAttribute="keyform" class="form-horizontal">
	 
	 <form:hidden path="pinCode"/>
	 
	 <h4>Kiosk Profile (API from AIS)</h4>
	 <hr>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="networkMa">ชื่อ Network MA *</label>
                <div class="col-md-7">
                      <form:select  path="networkMa" class="form-control input-sm" >
                        <form:option value=""> -- Select -- </form:option>
					    <form:option value="AIS"> AIS </form:option>
					    <form:option value="DTAC"> DTAC </form:option>
<%-- 					    <form:options items="${listOfInstitutionsNames}"></form:options> --%>
					  </form:select>
                    <div class="has-error">
                        <form:errors path="networkMa" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
 
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="mobileMA">หมายเลขโทรศัพท์ MA</label>
                <div class="col-md-7">
					 <form:input type="text" path="mobileMa" id="mobileMa" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="mobileMa" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
          <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="referentTaName">หมายเลขโทรศัพท์ที่สมัครตัวแทน *</label>
                <div class="col-md-7">
                      <form:select  path="referentTaName" class="form-control input-sm" >
                        <form:option value=""> -- Select -- </form:option>
					    <form:option value="AIS"> AIS </form:option>
					    <form:option value="DTAC"> DTAC </form:option>
<%-- 					    <form:options items="${listOfInstitutionsNames}"></form:options> --%>
					  </form:select>
                    <div class="has-error">
                        <form:errors path="referentTaName" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
  
          <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="customerType">ประเภทสมาชิก </label>
                <div class="col-md-7">
						<form:radiobutton path="customerType" value="COMPERATE"/> นิติบุคคล
						<form:radiobutton path="customerType" value="PERSON"/> บุคคลธรรมดา
                    <div class="has-error">
                        <form:errors path="customerType" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>              
  
  
   
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="companyName">ชื่อ /ชื่อบริษัท</label>
                <div class="col-md-7">
					 <form:input type="text" path="companyName" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="companyName" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
          <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">นามสกุล</label>
                <div class="col-md-7">
					 <form:input type="text" path="lastName" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="lastName" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>  
<!--    ----------------------------------------------------------------- -->
   	 <h4>Kiosk Location Profile</h4>
	 <hr>
	
	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="vendorName">vendor (เพิ่ม)</label>
                <div class="col-md-7">
					  <form:select  path="vendorName" class="form-control input-sm" >
                        <form:option value=""> -- Select -- </form:option>
					    <form:option value="100"> Vendor A </form:option>
					  </form:select>
                    <div class="has-error">
                        <form:errors path="vendorName" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>  
	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="kioskId">Kiosk ID</label>
                <div class="col-md-7">
					 <form:input type="text" path="kioskId" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="kioskId" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>                
 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="kioskStatus">สถานะตู้เติมเงิน</label>
                <div class="col-md-7">
                      <form:select  path="kioskStatus" class="form-control input-sm" >
              			<form:option value="">Pre Active</form:option>
					    <form:option value="A">Active</form:option>
					    <form:option value="I">In Active</form:option>
					    <form:option value="L">Locked</form:option>
					    <form:option value="P">Pre Active</form:option>
<%-- 					    <form:options items="${listOfInstitutionsNames}"></form:options> --%>
					  </form:select>                    
					  <div class="has-error">
                        <form:errors path="kioskStatus" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>  
        
 <!--    ----------------------------------------------------------------- -->
   	 <h4>ข้อมูลเจ้าของพื้นที่ (แก้ไขได้)</h4>
	 <hr>


	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="areaTitleName">คำนำหน้าชื่อ *</label>
                <div class="col-md-7">
                      <form:select  path="areaTitleName" class="form-control input-sm" >
                        <form:option value=""> -- Select -- </form:option>
					    <form:option value="10001">นาย</form:option>
					    <form:option value="10002">นาง</form:option>
					    <form:option value="10003">นางสาว</form:option>
<%-- 					    <form:options items="${listOfInstitutionsNames}"></form:options> --%>
					  </form:select>                    
					  <div class="has-error">
                        <form:errors path="areaTitleName" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>  
        	 

	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="areaFirstName">ชื่อ *</label>
                <div class="col-md-7">
					 <form:input type="text" path="areaFirstName" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="areaFirstName" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>    
        
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="areaLastName">นามสกุล *</label>
                <div class="col-md-7">
					 <form:input type="text" path="areaLastName" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="areaLastName" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>    
 	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="areaMobileNo">หมายเลขโทรศัพท์เคลื่อนที่ที่ติดต่อได้ *</label>
                <div class="col-md-7">
					 <form:input type="text" path="areaMobileNo" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="areaMobileNo" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>    
  
   <!--    ----------------------------------------------------------------- -->
   	 <h4>ข้อมูลสถานที่ติดตั้งตู้เติมเงิน (แก้ไขได้)</h4>
	 <hr>
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="kioskAreaType">ประเภทสถานที่ตั้งของตู้เติมเงิน *</label>
                <div class="col-md-7">
                      <form:select  path="kioskAreaType" class="form-control input-sm" >
                        <form:option value=""> -- Select -- </form:option>
					    <form:option value="101">อาคารพาณิชย์</form:option>
					    <form:option value="102">บ้านพักอาศัย</form:option>
					    <form:option value="103">หอพัก</form:option>
					    <form:option value="104">คอนโดมิเนียม</form:option>
					    <form:option value="999">อื่นๆ</form:option>
<%-- 					    <form:options items="${listOfInstitutionsNames}"></form:options> --%>
					  </form:select>                    
					  <div class="has-error">
                        <form:errors path="kioskAreaType" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>  
        
    	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="kioskAreaAddress">เลขที่ / สถานที่ / อาคาร *</label>
                <div class="col-md-7">
					 <form:input type="text" path="kioskAreaAddress" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="kioskAreaAddress" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>  
     	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="kioskAreaMoo">หมู่ที่  </label>
                <div class="col-md-7">
					 <form:input type="text" path="kioskAreaMoo" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="kioskAreaMoo" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>             	 

     	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="kioskAreaSoi">ซอย </label>
                <div class="col-md-7">
					 <form:input type="text" path="kioskAreaSoi" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="kioskAreaSoi" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div> 

     	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="kioskAreaRoad">ถนน </label>
                <div class="col-md-7">
					 <form:input type="text" path="kioskAreaRoad" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="kioskAreaRoad" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>         

     	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="kioskAreaProvice">จังหวัด * </label>
                <div class="col-md-7">
					  <form:select  path="kioskAreaProvice" class="form-control input-sm" >
                        <form:option value=""> -- Select -- </form:option>
					  	<form:option value="10">กรุงเทพ</form:option>
					  </form:select>
                    <div class="has-error">
                        <form:errors path="kioskAreaProvice" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>           
 
     	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="kioskAreaDistrict">เขต /อำเภอ *  </label>
                <div class="col-md-7">
					  <form:select  path="kioskAreaDistrict" class="form-control input-sm" >
                        <form:option value=""> -- Select -- </form:option>
					  	<form:option value="10">ห้วยขวาง</form:option>
					  </form:select>
                    <div class="has-error">
                        <form:errors path="kioskAreaDistrict" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
     	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="kioskAreaTambon">แขวง / ตำบล * </label>
                <div class="col-md-7">
					  <form:select  path="kioskAreaTambon" class="form-control input-sm" >
                        <form:option value=""> -- Select -- </form:option>
					  	<form:option value="10">ห้วยขวาง</form:option>
					  </form:select>                    <div class="has-error">
                        <form:errors path="kioskAreaTambon" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>        
     	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="kioskAreaPostalCode">รหัสไปรษณีย์ *</label>
                <div class="col-md-7">
					 <form:input type="text" path="kioskAreaPostalCode" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="kioskAreaPostalCode" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>   
      	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="kioskAreaRemarkAddr">จุดสังเกต</label>
                <div class="col-md-7">
					 <form:textarea path="kioskAreaRemarkAddr" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="kioskAreaRemarkAddr" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>         
        
   <!--    ----------------------------------------------------------------- -->
   	 <h4>Kiosk Hardware Profile</h4>
	 <hr>
      	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="hardwareOperater">Kiosk Operator</label>
                <div class="col-md-7">
					 <form:input path="hardwareOperater" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="hardwareOperater" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>  
       	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="hardwareVendor">Vendor</label>
                <div class="col-md-7">
					 <form:input path="hardwareVendor" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="hardwareVendor" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>  
        
        	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="hardwareModel">Model</label>
                <div class="col-md-7">
					 <form:input path="hardwareModel" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="hardwareModel" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>        
        	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="hardwareLatitude">ละติจูด</label>
                <div class="col-md-7">
					 <form:input path="hardwareLatitude" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="hardwareLatitude" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>                
        	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="hardwareLongitude">ลองติจูด</label>
                <div class="col-md-7">
					 <form:input path="hardwareLongitude" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="hardwareLongitude" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>         
 
         	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="hardwareMobileNo">เบอร์โทรศัพท์ที่ใช้เชื่อมต่อ</label>
                <div class="col-md-7">
					 <form:input path="hardwareMobileNo" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="hardwareMobileNo" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>        
  
         	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="hardwareKioskSerailNo">Kiosk Serial No.</label>
                <div class="col-md-7">
					 <form:input path="hardwareKioskSerailNo" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="hardwareKioskSerailNo" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>          
  
         	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="hardwareMainbordSerailNo">Mainboard Serial No.</label>
                <div class="col-md-7">
					 <form:input path="hardwareMainbordSerailNo" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="hardwareMainbordSerailNo" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>          
  
         	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="hardwareCoinAcceptorSerailNo">Coin Acceptor Serial No.</label>
                <div class="col-md-7">
					 <form:input path="hardwareCoinAcceptorSerailNo" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="hardwareCoinAcceptorSerailNo" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>          
         	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="hardwareBankAcceptorSerailNo">Bank Acceptor Serial No.</label>
                <div class="col-md-7">
					 <form:input path="hardwareBankAcceptorSerailNo" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="hardwareBankAcceptorSerailNo" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>          
         	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="hardwareRegisterDate">วันที่ลงทะเบียนตู้เติมเงิน</label>
                <div class="col-md-7">
					 <form:input path="hardwareRegisterDate" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="hardwareRegisterDate" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>          
         	 	
	    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="hardwareFirstOpenDate">วันที่มีการเปิดใช้งานครั้งแรก</label>
                <div class="col-md-7">
					 <form:input path="hardwareFirstOpenDate" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="hardwareFirstOpenDate" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>        
  
  
   
        <div class="row">
            <div class="form-actions floatRight text-center">
                        <button type="submit" class="btn btn-primary">
                       	 	<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Register
                        </button>
                        <a href="<c:url value='/welcome' />" class="btn btn-default">
                        	<span class="glyphicon glyphicon-remove" aria-hidden="true"></span> Cancel
                        </a>
            </div>
        </div>      
                    	         	                     
    </form:form>
    
    
</div>