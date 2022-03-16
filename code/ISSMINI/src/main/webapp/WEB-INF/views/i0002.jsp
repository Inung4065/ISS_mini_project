<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="ko2" class="h-100">
<head>
<meta charset="utf-8">

<title>부트스트랩 기본 틀</title>
<link rel="stylesheet" href="${path}/resources/css/test.css" type="text/css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
 
 
</head>
<style type="text/css">
</style>
<body>
<div class="container-fluid p-3 mb-2 bg-dark text-white" style=" padding: 10px; height: 100%; width: 100%; margin : 0; overflow: hidden; ">
  <div class="row" style=" padding: 10px; height: 20%; width: 100%; min-height: 50px; margin : 0;  overflow: hidden;">
    <div class="col">
    </div>
    <div class="col fw-bold">
      <p>ISS</p>
    </div>
    <div class="col">
    </div>
    <div class="col fw-bold" align="right">
      <p>signUp page</p>
    </div>
    <div class="col">
    </div>
  </div>
  <div class="row" style="padding: 10px; height: 60%; width: 100%; min-height: 300px; margin : 0;  overflow: hidden;">
    <div class="col fst-italic" style="margin-top: 15%; transform: translateY(-50%);text-align: center;">
      <input class="registadd" type="text" placeholder="ID" aria-label="Username" aria-describedby="basic-addon1">
      <input class="registadd" type="text" placeholder="PASSWORD" aria-label="Username" aria-describedby="basic-addon1">
      <input class="registadd" type="text" placeholder="PASSWORDRE" aria-label="Username" aria-describedby="basic-addon1">
      <input class="registadd" type="text" placeholder="MAIL" aria-label="Username" aria-describedby="basic-addon1">
      <button class="btn btn-outline-light" type="submit" style="padding: 5px; margin:10px;">作成</button>
      <button class="btn btn-outline-light" type="submit" style="padding: 5px; margin:10px;">戻る</button>
    </div>
  </div>
  <div class="row"style=" padding: 10px; height: 20%; width: 100%; min-height: 50px; margin : 0;  overflow: hidden;">
    <div class="col" align="center">
      <p>ISS Management</p>
    </div>
  </div>
</div>
</body>
</html>
