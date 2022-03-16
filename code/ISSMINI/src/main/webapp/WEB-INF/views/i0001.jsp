<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
	<link rel="stylesheet" href="css/i0001.css"> 
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container-fluid bg-dark text-white w-100 h-100">
		<div class="row">
			<div class="p-3" align="left">
				<p>ISS</p>
				<hr>
			</div>
		</div>
		<div class="row pr-1" align="center">
			<p>Login</p>
		</div>
		<div class="row">
			<div class="col-4">
			</div>
			<div class="col-4 mt-3" align="center" style="margin-bottom: 200px;">
				<form action="login.do" method="post">
					<input class="form-control m-1" type="text" placeholder="ID">
					<input class="form-control m-1" type="password" placeholder="PASSWORD">
					<button class="btn btn-outline-light m-1" type="submit">Sign in</button>
					<button class="btn btn-outline-light m-1" type="button" onclick="location.href='/issmini/i0002'">Sign up</button>
				</form>
			</div>
			<div class="col-4">
			</div>
		</div>
		<div class="row">
			<div class="col" align="center">
				<hr>
				<p>ISS Management</p>
			</div>
		</div>
	</div>
</body>
</html>