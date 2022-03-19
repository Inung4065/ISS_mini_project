<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-16"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page import="java.util.*"%>
<%@include file ="header.jsp" %>
<%@include file ="footer.jsp" %>
<!DOCTYPE html>
<html lang="ko2" class="h-100">
<head>
  <meta charset="utf-16">
  <title>SingUp</title>
  <link rel="stylesheet" href="resources/css/registAcc.css" type="text/css">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"> 
  <script type="text/javascript" src="resources/js/i0002.js"></script>
</head>
<body>
  <div class="container-fluid p-3 mb-2 bg-dark text-white" style=" padding: 10px; width: 100%; margin : 0; height: 100%; overflow: hidden; ">
    <div class="row" style=" padding: 10px; height: 80px; width: 100%; min-height: 80px; margin : 0; overflow: hidden;">
      <div class="row pr-1" align="center">
        <p>signUp</p>
      </div>
    </div>
    <div class="row" style="padding: 10px; height: 100%; width: 100%; min-height: 500px; margin: 0; overflow: hidden;">
      <form action="i0002" method="post">
        <div class="col fst-italic" style="text-align: center;">
          <input name="id" class="registadd" type="text" placeholder="ID" aria-label="Username" aria-describedby="basic-addon1" value="${id}">
          <input name="password" class="registadd" type="password" placeholder="PASSWORD" aria-label="Username" aria-describedby="basic-addon1" title="<spring:message code='IMI0001'/>">
          <input name="passwordRe" class="registadd" type="password" placeholder="PASSWORDRE" aria-label="Username" aria-describedby="basic-addon1">
          <input name="name" class="registadd" type="text" placeholder="NAME" aria-label="Username" aria-describedby="basic-addon1" value="${name}">
          <button class="btn btn-outline-light" type="submit" style="padding: 5px; margin:10px;">作成</button>
          <button class="btn btn-outline-light" type="button" onclick="cancelBtn();" style="padding: 5px; margin:10px;">戻る</button>
        </div>
      </form>
    </div>
  </div>
  <input id="imi0003" type="hidden" value="<spring:message code='IMI0003'/>" />
</body>
</html>
