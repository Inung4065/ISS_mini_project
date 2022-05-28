<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page import="java.util.*"%>
<%@include file ="header.jsp" %>
<%@include file ="footer.jsp" %>
<!DOCTYPE html>
<html lang="ko2" class="h-100">
<head>
  <meta charset="utf-16">
  <title>Board</title>
  <link rel="stylesheet" href="resources/css/registAcc.css" type="text/css">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"> 
  <script type="text/javascript" src="resources/js/i0005.js"></script>
</head>
<body>
  <div class="container-fluid p-3 mb-2 bg-dark text-white" style=" padding: 10px; width: 100%; margin : 0; height: 100%; overflow: hidden; ">
    <div class="row" style=" padding: 10px; height: 80px; width: 100%; min-height: 80px; margin : 0; overflow: hidden;">
      <div class="row text-white" align="center">
				<p>Board</p>
			</div>
    </div>
    <div class="row" style="padding: 10px; height: 100%; width: 100%; min-height: 500px; margin: 0; overflow: hidden;">
        <div class="col fst-italic" style="text-align: center;">
          <div class="container" style="background-color: white;" >
			<div class="row">
				<form action="i0005" method="post">
					<table class="table table-striped" style="text-align: center;">
						<tbody>
							<tr>
								<td>タイトル</td>
								<td><input name="textTitle" type="text" class="form-control" maxlength="30"></td>
							</tr>
							<tr>
								<td>本文</td>
								<td><textarea name="textContents" class="form-control" maxlength="1000" style="height: 350px;"></textarea></td>
							</tr>
						</tbody>
					</table>
					<button type="submit" class="btn btn-outline-light" id="btnCreate">登録する</button>
				</form>
			</div>
		</div>
        </div>
      </form>
    </div>
  </div>
</body>
</html>