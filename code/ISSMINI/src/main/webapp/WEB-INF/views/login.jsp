<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko" class="h-100">
<head>
<meta charset="utf-8">

<title>부트스트랩 기본 틀</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
 
 
</head>
<style>
      html,
      body {
        width: 100%;
        height: 100%;
        margin : 0;
        overflow-y:hidden;
        overflow-x:hidden;
      }
      p {
       font-family:"Bauhaus 93";
       font-size: xx-large;
      }
</style>
<body>
<div class="container-fluid p-3 mb-2 bg-dark text-white" style=" padding: 10px; height: 100%; width: 100%; margin : 0; overflow: auto; ">
  <div class="row" style=" padding: 10px; height: 10%; width: 100%; min-height: 50px; margin : 0;  overflow: auto;">
    <div class="col">
    </div>
    <div class="col fw-bold">
      <p>ISS</p>
    </div>
    <div class="col">
    </div>
    <div class="col fw-bold" align="right">
      <p>login page</p>
    </div>
    <div class="col">
    </div>
  </div>
  <div class="row" style="padding: 10px; height: 80%; width: 100%; min-height: 300px; margin : 0;  overflow: auto;">
    <div class="col fst-italic" style="position: absolute; top: 30%; transform: translateY(-50%);text-align: center;">
      <input type="text" class="form-control" placeholder="ID" aria-label="Username" aria-describedby="basic-addon1"style="padding: 10px; height: 50px; width: 90%;  margin:0 auto; overflow: auto;">
      <input type="text" class="form-control" placeholder="PASSWORD" aria-label="Username" aria-describedby="basic-addon1"style="padding: 10px; margin:5px; height: 50px; width: 90%;  margin:0 auto; overflow: auto;">
      <button class="btn btn-outline-light" type="submit" style="padding: 5px; margin:10px;">Sign in</button>
      <button class="btn btn-outline-light" type="submit" style="padding: 5px; margin:10px;">Sign up</button>
    </div>
  </div>
  <div class="row"style=" padding: 10px; height: 10%; width: 100%; min-height: 50px; margin : 0;  overflow: auto;">
    <div class="col" align="center">
      <p>ISS Document Management</p>
    </div>
  </div>
</div>
</body>
</html>
