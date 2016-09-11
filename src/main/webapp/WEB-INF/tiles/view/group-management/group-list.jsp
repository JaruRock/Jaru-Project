<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<div class="container" style="margin-top: 50px">
	<div class="panel">
		<sec:authorize access="hasRole('02001')">
	    	<a href="<c:url value='/new-group-ma' />" class="btn btn-primary custom-width">Add Group</a>
	    </sec:authorize>
	    <sec:authorize access="hasRole('02001')">
	    	<a href="<c:url value='/new-group-ta' />" class="btn btn-primary custom-width">Add Group</a>
	    </sec:authorize>
	    <sec:authorize access="hasRole('02001')">
	    	<a href="<c:url value='/new-group' />" class="btn btn-primary custom-width">Add Group</a>
	    </sec:authorize>
    </div>
    <div class="panel panel-default">
        <table class="table table-hover">
            <thead>
                <tr>
                    <th>Group Name</th>
                    <th>Group Code</th>
                    <th>Group Type</th>
                    <sec:authorize access="hasRole('02002') or hasRole('02003')">
	                    <th width="100"></th>
	                    <th width="100"></th>
                    </sec:authorize>
                     
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${groupList}" var="group">
                <tr>
                    <td>${group.groupName}</td>
                    <td>${group.groupCode}</td>
                    <td>${group.groupType}</td>
                    <sec:authorize access="hasRole('02002') or hasRole('02003')">
                    <td>
                    	<sec:authorize access="hasRole('02002')">
                    		<a href="<c:url value='/edit-group-${group.groupId}' />" class="btn btn-primary custom-width">edit</a>
                    	</sec:authorize>
                    </td>
                    <td>
                    	<sec:authorize access="hasRole('02003')">
	                    	<c:if test="${group.groupType ne 'AM'}">
	                    		<a href="<c:url value='/delete-group-${group.groupId}' />" class="btn btn-primary custom-width">delete</a>
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