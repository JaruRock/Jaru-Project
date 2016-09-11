<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<div class="container" style="margin-top: 50px; width: 800px;">
    <div class="alert alert-success lead">
        ${success}
    </div>
    <span class="well floatRight">
        <a href="<c:url value='/user-list' />">Back</a> to User list
    </span>
</div>
