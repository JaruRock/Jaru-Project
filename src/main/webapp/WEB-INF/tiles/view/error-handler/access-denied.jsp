<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" style="margin-top: 50px; width: 800px;">
    <div class="panel">
    	<h3>Dear <strong>${loggedinuser},</strong></h3>
    	<p>You are not authorized to access this page.
    	<a href="<c:url value="/" />">Back</a> to <strong>Welcome Page</strong></p>
    </div>
</div>