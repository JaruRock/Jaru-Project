<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container" style="margin-top: 50px; width: 800px;">
    <form:form method="POST" action="/new-group" modelAttribute="user" class="form-horizontal">
        <form:input type="hidden" path="groupId" id="groupId"/>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="firstName">Group Name</label>
                <div class="col-md-7">
                    <form:input type="text" path="firstName" id="firstName" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="firstName" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="username">Group Code</label>
                <div class="col-md-7">
                    <c:choose>
                        <c:when test="${edit}">
                            <form:input type="text" path="username" id="username" class="form-control input-sm" disabled="true"/>
                        </c:when>
                        <c:otherwise>
                            <form:input type="text" path="username" id="username" class="form-control input-sm" />
                            <div class="has-error">
                                <form:errors path="username" class="help-inline"/>
                            </div>
                        </c:otherwise>
                    </c:choose>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="group">Group Type</label>
                <div class="col-md-7">
                    <form:select path="groupType" items="${groupTypeList}" multiple="false" itemValue="groupTypeId" itemLabel="groupTypeName" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="groupType" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
 
        <div class="row">
            <div class="form-actions floatRight">
                <c:choose>
                    <c:when test="${edit}">
                        <button type="submit" class="btn btn-primary btn-sm">Update</button>
                        <a href="<c:url value='/user-list' />" class="btn btn-default custom-width">Cancel</a>
                    </c:when>
                    <c:otherwise>
                        <button type="submit" class="btn btn-primary btn-sm">Register</button>
                        <a href="<c:url value='/user-list' />" class="btn btn-default custom-width">Cancel</a>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
    </form:form>
</div>