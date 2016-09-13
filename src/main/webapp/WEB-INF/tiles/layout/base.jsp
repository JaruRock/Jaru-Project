<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title><tiles:insertAttribute name="title" ignore="true" /></title>
	
	<c:set var="cPath" scope="session" value="<%=request.getContextPath()%>"/>
	
	<link href="<c:url value="/resources/images/favicon.ico" />" rel="icon" />
	<link href="<c:url value="/resources/images/favicon.ico" />" rel="shortcut icon"/>
	<link href="<c:url value='/resources/components/bootstrap/css/bootstrap.min.css' />"  rel="stylesheet" />
	<link href="<c:url value='/resources/css/kms-web-custom.css' />" rel="stylesheet" />
	<link href="<c:url value='/resources/components/font-awesome-4.6.3/css/font-awesome.css' />" rel="stylesheet" />
	
	<script type="text/javascript" src="${cPath}/resources/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="${cPath}/resources/components/bootstrap/js/bootstrap.min.js"></script> 
	
	<!-- Custom styles for implement page -->
	<tiles:insertAttribute name="custom-css" ignore="true" />
	
	<!-- Custom java script for implement page -->
	<tiles:insertAttribute name="custom-js" ignore="true" />

</head>
<body>
	<!-- Header -->
	<tiles:insertAttribute name="header" />
	<!-- Body -->
	<tiles:insertAttribute name="body" />
	<!-- Footer -->
	<tiles:insertAttribute name="footer" />
</body>
</html>