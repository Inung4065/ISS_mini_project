<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file ="header.jsp" %>
<%@include file ="footer.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Border</title>
			<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
			<!--><script type="text/javascript" src="resources/js/i0001.js"></script><!-->
			<!--><link rel="stylesheet" href="resources/css/i0001.css"><!--> 
			<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
	</head>
	<body>
		<div class="container-fluid w-100 h-100 overflow-auto">
			<div>
				<table class="table table-striped  mt-3">
					<thead>
						<tr>
							<th class="col-1" scope="col">No.</th>
							<th class="col-7" scope="col">subject</th>
							<th class="col-2" scope="col">name</th>
							<th class="col-2" scope="col">date</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${boardlist}" var="list">
							<tr>
								<th scope="row">${list.no}</th>
								<td>${list.title}</td>
								<td>${list.contents}</td>
								<td>${list.user}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="row" align="center">
				<h>1.2.3.4.5.6.7.8.9.10</h>
			</div>
		</div>
	</body>
</html>