<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" style="margin-top: 50px; width: 800px;">
    <div class="panel">
    	<h3>There were the occurred problem in the application.</h3>
    	<p>Please contact the application administrator.
    	<a href="<c:url value="/" />">Back</a> to <strong>Welcome Page</strong></p>
    	<div class="well" style="width: 550px;">
	    	<p><i>${timestamp }</i>&nbsp;status=${status}, error=${error}</p>
	    	<p>message=${message}, trace=${trace}</p>
    	</div>
	</div>
</div>
