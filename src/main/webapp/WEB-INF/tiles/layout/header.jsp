<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<nav class="navbar navbar-default navbar-fixed-top">
	
	<div class="container login-text">
		<c:if test="${loggedinuser != null}">
		<span class="text-muted">Dear <strong>${loggedinuser}</strong>, Language:&nbsp;<spring:message code="user.title"/></span>
		</c:if>
	</div>
	
	<div class="container">
		<div class="navbar-header">
			<button aria-controls="navbar" aria-expanded="false" data-target="#kms-web-navbar" data-toggle="collapse" class="navbar-toggle collapsed" type="button">
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a href="<c:url value="/" />" class="navbar-brand">
			<img id="logo" class="link" src="<spring:url value="/resources/images/dtac_logo.png"/>" alt="dtac logo" width="60"/>
			</a>
		</div>
		
		<c:if test="${loggedinuser != null}">
		<div class="collapse navbar-collapse" id="kms-web-navbar">
		    <ul class="nav navbar-nav">
		    	<li class="dropdown">
		            <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="kiosk"><i class="fa fa-cubes"></i> Kiosk<span class="caret"></span></a>
		            <ul class="dropdown-menu" aria-labelledby="themes" id="kiosk">
			             <li><a href="${cPath}/kiosk-register" class="smoothScroll line-txt"> Register Kiosk</a></li>
			             <li class="divider"></li>
						 <li><a href="${cPath}/kiosk-profile" class="smoothScroll line-txt"> Edit Kiosk Profile</a></li>
		            </ul>
		        </li>
		    	<li class="dropdown">
		            <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="report"><i class="fa fa-file-o"></i> Report<span class="caret"></span></a>
		            <ul class="dropdown-menu" aria-labelledby="themes" id="report">
						<li><a href="${cPath}/report-customer-balance" class="smoothScroll line-txt">Query Customer Balance</a></li> 
			             <li class="divider"></li>
						<li><a href="${cPath}/report-movement" class="smoothScroll line-txt">Kiosk Movement</a></li> 
			             <li class="divider"></li>
						<li><a href="${cPath}/report-shift" class="smoothScroll line-txt">Kiosk Shift Report</a></li> 
			             <li class="divider"></li>
						<li><a href="${cPath}/report-profile" class="smoothScroll line-txt">Kiosk Profile Report</a></li> 
			             <li class="divider"></li>
						<li><a href="${cPath}/report-audit" class="smoothScroll line-txt">Kiosk Audit Report</a></li> 
			             <li class="divider"></li>
						<li><a href="${cPath}/report-alarm" class="smoothScroll line-txt">Kiosk Alarm Report</a></li> 

		            </ul>
		        </li>
		    	<li class="${navClassActiveAdmin}"><a href="<c:url value="/user-list" />"><i class="fa fa-user"></i> Admin Area</a></li>
		    </ul>
		    
		    
		    <ul class="nav navbar-nav navbar-right">
		      <li>
		      <a href="<c:url value="/logout" />"><span class="glyphicon glyphicon-log-in">&nbsp;</span><spring:message code="logout.button" /></a>
		      </li>
		 	</ul>
		  
		</div>
		</c:if>
	</div>
</nav>

