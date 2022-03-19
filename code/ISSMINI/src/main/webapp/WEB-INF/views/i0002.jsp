<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html lang="ko2" class="h-100">
<head>
<meta charset="utf-8">

<title>부트스트랩 기본 틀</title>
<link rel="stylesheet" href="resources/css/registAcc.css" type="text/css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script> 
</head>

<body>
<div class="container-fluid p-3 mb-2 bg-dark text-white" style=" padding: 10px; height: 100%; width: 100%; margin : 0; overflow: hidden; ">
  <div class="row" style=" padding: 10px; height: 20%; width: 100%; min-height: 50px; margin : 0;  overflow: hidden;">
    <div class="row">
			<div class="p-3" align="left">
				<p>ISS</p>
				<hr>
			</div>
		</div>
		<div class="row pr-1" align="center">
			<p>signUp</p>
		</div>
  </div>
  <div class="row" style="padding: 10px; height: 60%; width: 100%; min-height: 300px; margin : 0;  overflow: hidden;">
  <form action="" method="post">
    <div class="col fst-italic" style="margin-top: 15%; transform: translateY(-50%);text-align: center;">
      <input id="accountId" name="accountId" class="registadd" type="text" placeholder="ID" aria-label="Username" aria-describedby="basic-addon1">
      <input id="accountPassword" name="accountPassword" class="registadd" type="text" placeholder="PASSWORD" aria-label="Username" aria-describedby="basic-addon1">
      <input id="accountMail" name="accountMail" class="registadd" type="text" placeholder="MAIL" aria-label="Username" aria-describedby="basic-addon1">
      <button class="btn btn-outline-light" type="submit" style="padding: 5px; margin:10px;">作成</button>
      <button class="btn btn-outline-light" onclick="location.href='/issmini'" style="padding: 5px; margin:10px;">戻る</button>
    </div>
  </form>
  </div>
  <div class="row"style=" padding: 10px; height: 20%; width: 100%; min-height: 50px; margin : 0;  overflow: hidden;">
    <div class="col" align="center">
    <hr>
      <p>ISS Management</p>
    </div>
  </div>
</div>
<script>

$(document).ready(function(){
	//회원가입 버튼(회원가입 기능 작동)
	$(".accadd").click(function(){
		$("#add_form").attr("action", "/issmini/i0002");
		$("#add_form").submit();
	});
});

</script>
</body>
</html>
