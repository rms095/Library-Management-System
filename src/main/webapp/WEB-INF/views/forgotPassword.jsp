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
<title>Forgot Password - LMS</title>
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

		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li class=""><a href="#">Profile</a></li>
				<li><a href="#">about</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> Learn <b class="caret"> </b>
						<ul class="dropdown-menu">
							<li class="dropdown-header">Example</li>
							<li><a href="#"> c++</a></li>
							<li><a href="#"> java</a></li>
							<li class="dropdown-header">tutorials</li>
							<li><a href="#"> c++</a></li>
							<li><a href="#"> java</a></li>
						</ul></li>
			</ul>
		</div>
	</div>

	<div class="container">
		<br /> <br /> <br />
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<strong>Forgot Password - LMS </strong>
						</h3>
					</div>
					<div class="panel-body">
						<c:if test="${not empty result}">
							<div class="alert alert-danger">
								<button type="button" class="close" data-dismiss="alert"
									aria-hidden="true">×</button>
								<span><c:out value="${result}" /> </span>
							</div>
						</c:if>

						<form role="form" method="POST" action="<c:url value="/forgotpassword"/>">
							<div class="form-group">
								<label for="exampleInputEmail1">Username or Email</label> <input
									type="email" class="form-control" name="username"
									placeholder="Enter email">
							</div>
							
							<div class="form-group">
								<div class="col-md-8">
									<button type="submit" class="btn btn-block btn-default">
										<span class="glyphicon glyphicon-chevron-right"></span> Reset Password
									</button>
								</div>
								<div class="col-md-4">
									<a href="<c:url value="registration"/>"
										class="btn btn-block btn-default"><span
										class="glyphicon glyphicon-chevron-right"></span>Login</a>
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