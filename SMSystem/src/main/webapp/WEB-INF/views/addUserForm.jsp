<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value='/resources/css/bootstrap.css' />"
	rel="stylesheet"></link>
</head>
<body>
	<div class="form-container">

		<h1>Enrollment Form</h1>

		<form:form method="POST" modelAttribute="user" class="form-horizontal">

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="id">ID</label>
					<div class="col-md-7">
						<form:input type="text" path="id" id="id"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="id" class="help-inline" />
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="initials">First
						Name</label>
					<div class="col-md-7">
						<form:input type="text" path="initials" id="initials"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="initials" class="help-inline" />
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="surname">First
						Name</label>
					<div class="col-md-7">
						<form:input type="text" path="surname" id="surname"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="surname" class="help-inline" />
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="userType">First
						Name</label>
					<div class="col-md-7">
						<form:input type="text" path="userType" id="userType"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="userType" class="help-inline" />
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-actions floatRight">
					<input type="submit" value="Register"
						class="btn btn-primary btn-sm">
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>