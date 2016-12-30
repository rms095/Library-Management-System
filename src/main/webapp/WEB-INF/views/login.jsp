<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">

<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap-theme.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-3.1.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login - LMS</title>
</head>
<body>
	<div class="navbar navbar-inverse">
		<button type="button" class="navbar-toggle" data-toggle="collapse"
			data-target=".navbar-collapse">
			<span class="sr-only"> Toggle navigation</span> <span
				class="icon-bar"> </span> <span class="icon-bar"> </span> <span
				class="icon-bar"> </span>
		</button>

		<a class="navbar-brand" href="#"> Library Management System </a>
	</div>

	<div class="container">
		<br /> <br /> <br />
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<strong>Sign In - LMS </strong>
						</h3>
					</div>
					<div class="panel-body">
						<c:if test="${not empty error}">
							<div class="alert alert-danger">
								<button type="button" class="close" data-dismiss="alert"
									aria-hidden="true">×</button>
								<span><c:out value="${error}" /> </span>
							</div>
						</c:if>

						<form role="form" method="GET" action="<c:url value="/user"/>">
							<div class="form-group">
								<label for="exampleInputEmail1">Username or Email</label> <input
									type="email" class="form-control" name="username"
									placeholder="Enter email">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Password <a
									href="<c:url value="/forgotpassword"/>">(forgot password)</a></label> <input
									type="password" class="form-control" name="password"
									placeholder="Password">
							</div>
							<div class="form-group">
								<div class="col-md-6">
									<button type="submit" class="btn btn-block btn-default">
										<span class="glyphicon glyphicon-log-in"></span> Login
									</button>
								</div>
								<div class="col-md-6">
									<a href="<c:url value="registration"/>"
										class="btn btn-block btn-default"><span
										class="glyphicon glyphicon-chevron-right"></span> Registration</a>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="col-md-4"></div>
		</div>

		<div class="row">
			<div class="navbar  navbar-inverse navbar-fixed-bottom">
				<p class="footer-text">Sunbeam.info © company 2016.</p>
			</div>
		</div>
</body>
</html>