<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container" style="margin-top: 50px">
	<div class="panel panel-primary" style="max-width: 330px; margin: 0 auto;">
		<div class="panel-heading"><strong>Log in to Kiosk Management Web Portal</strong></div>
		<div class="panel-body">
			<form action="/login" method="post" class="form-signin">
			  <c:if test="${param.error != null}">
                     <div class="alert alert-danger">
                         <p>Invalid username and password.</p>
                     </div>
                 </c:if>
                 <c:if test="${param.logout != null}">
                     <div class="alert alert-success">
                         <p>You have been logged out successfully.</p>
                     </div>
                 </c:if>
			  <div class="form-group">
			    <label class="input-group-addon" for="username"><i class="fa fa-user"></i></label>
                      <input type="text" class="form-control" id="username" name="username" autofocus="autofocus" placeholder="Enter Username" required>
			  </div>
			  <div class="form-group">
			    <label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label> 
                      <input type="password" class="form-control" id="password" name="password" placeholder="Enter Password" required>
			  </div>
			  <div class="form-group">
			    <div class="checkbox">
                        <label><input type="checkbox" id="rememberme" name="remember-me"> Remember Me</label>  
                      </div>
			  </div>
			  <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />
			  
			  <div class="row">
				<div class="col-md-6">
		  			<button type="submit" class="btn btn-primary btn-block">Log in</button>
	  			</div>
	  			<div class="col-md-6">
			  		<button type="reset" class="btn btn-default btn-block">Reset</button>
			  	</div>
		  	  </div>
			</form>
		</div>
	</div>
</div>
