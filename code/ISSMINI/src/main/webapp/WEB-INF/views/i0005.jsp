<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file ="header.jsp" %>
<%@include file ="footer.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Board</title>
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script type="text/javascript" src="resources/js/i0005.js"></script>
        <!--><link rel="stylesheet" href="resources/css/i0005.css"><!--> 
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"> 
    </head>
    <body>
        <div class="container-fluid bg-dark w-100 h-100 overflow-auto">
            <div class="row text-white" align="center">
                <p>Board</p>
            </div>
            <div class="row" align="center">
                <div class="col-1">
                </div>
                <div class="col-10 bg-white">
                    <form action="create.do" method="post">
                        <table class="table table-striped" style="text-align: center;">
                            <tbody>
                                <tr>
                                    <td>タイトル</td>
                                    <td><input name="textTitle" type="text" class="form-control" maxlength="30"></td>
                                </tr>
                                <tr>
                                    <td>本文</td>
                                    <td><textarea name="textContents" class="form-control" maxlength="1000" style="height: 300px; resize: none;"></textarea></td>
                                </tr>
                            </tbody>
                        </table>
                        <input type="hidden" name="user" value="${user}">
                        <button type="submit" class="btn btn-secondary" id="btnCreate">登録する</button>
                    </form>
                </div>
                <div class="col-1">
                </div>
            </div>
        </div>
    </body>
</html>