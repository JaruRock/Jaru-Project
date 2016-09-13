<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container" style="margin-top: 50px">

	 <form:form method="POST" action="/kiosk-register" modelAttribute="keyform" class="form-horizontal">
	 <h4>Kiosk Profile (API from AIS)</h4>
	 <hr>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="networkMa">ชื่อ Network MA *</label>
                <div class="col-md-7">
                      <form:select  path="networkMa" class="form-control input-sm" >
					    <form:option value="NONE"> --SELECT--</form:option>
					    <form:option value="AIS"> --AIS--</form:option>
					    <form:option value="DTAC"> --DTAC--</form:option>
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
					    <form:option value="NONE"> --SELECT--</form:option>
					    <form:option value="AIS"> --AIS--</form:option>
					    <form:option value="DTAC"> --DTAC--</form:option>
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
					 <form:input type="text" path="vendorName" class="form-control input-sm" />
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
              			<form:option value="NONE"> --SELECT--</form:option>
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
					    <form:option value="10001">Active</form:option>
					    <form:option value="10002">In Active</form:option>
					    <form:option value="10003">Locked</form:option>
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
   	 <h4>ข้อมูลเจ้าของพื้นที่ (แก้ไขได้)</h4>
	 <hr>
	 

      	         	                     
    </form:form>
    
    
</div>