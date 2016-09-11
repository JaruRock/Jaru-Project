<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<div class="container" style="margin-top: 50px">
	<div class="panel">
		<sec:authorize access="hasRole('01001')">
	    	<a href="<c:url value='/new-user' />" class="btn btn-primary custom-width">Add User</a>
	    </sec:authorize>
	    <sec:authorize access="hasRole('02')">
	    	<a href="<c:url value='/group-list' />" class="btn btn-primary custom-width">Create Group</a>
	    </sec:authorize>
    </div>
    <div class="panel panel-default">
        <table class="table table-hover">
            <thead>
                <tr>
                    <th>Firstname</th>
                    <th>Lastname</th>
                    <th>Email</th>
                    <th>Username</th>
                    <sec:authorize access="hasRole('01002') or hasRole('01003')">
	                    <th width="100"></th>
	                    <th width="100"></th>
                    </sec:authorize>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${userList}" var="user">
                <tr>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.email}</td>
                    <td>${user.username}</td>
                    <sec:authorize access="hasRole('01002') or hasRole('01003')">
	                    <td>
	                    	<sec:authorize access="hasRole('01002')">
	                    		<a href="<c:url value='/edit-user-${user.username}' />" class="btn btn-primary custom-width">edit</a>
	                    	</sec:authorize>
	                    </td>
	                    <td>
	                    	<sec:authorize access="hasRole('01003')">
		                    	<c:if test="${user.username ne 'admin'}">
		                    		<a href="<c:url value='/delete-user-${user.username}' />" class="btn btn-primary custom-width">delete</a>
		                    	</c:if>
	                    	</sec:authorize>
	                    </td>
                    </sec:authorize>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>