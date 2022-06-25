<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file ="header.jsp" %>
<%@include file ="footer.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Board</title>
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script type="text/javascript" src="resources/js/i0004.js"></script>
        <link rel="stylesheet" href="resources/css/registAcc.css" type="text/css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"> 
    </head>
    <body>
        <div class="container-fluid bg-dark w-100 h-100 overflow-auto" align="center">
            <div class="row text-white" align="center">
                <p>Board</p>
            </div>
            <form method="post" name="form">
                <div class="row">
                    <div class="col-1">
                    </div>
                    <div class="col-10 bg-white">
                        <div class="row mb-3 mt-3">
                            <label class="col-sm-1 col-form-label">番号</label>
                            <div class="col-sm-1">
                                <input class="form-control" name="textNo" id="no" value="${list.no}" readonly>
                            </div>
                            <label class="col-sm-1 col-form-label">タイトル</label>
                            <div class="col-sm-9">
                                <input class="form-control" name="textTitle" id="tittleName" value="${list.title}" readonly>
                            </div>
                        </div>
                        <div class="row mb-3">
                            <label class="col-sm-1 col-form-label">作成者</label>
                            <div class="col-sm-11">
                                <input class="form-control" name="user" id="userId" value="${list.user}" readonly>
                            </div>
                        </div>
                        <div class="row mb-3">
                            <label class="col-sm-1 col-form-label">作成日時</label>
                            <div class="col-sm-11">
                                <input class="form-control" id="createTime" value="${list.createTime}" readonly>
                            </div>
                        </div>
                        <div class="row mb-3">
                            <label class="col-sm-1 col-form-label">本文</label>
                            <div class="col-sm-11">
                                <textarea class="form-control" name="textContents" id="contents" rows="7" style="resize: none;" readonly>${list.contents}</textarea>
                            </div>
                        </div>
                        <input type="hidden" name="loginUser" value="${user}">
                        <div class="row mb-3" align="center">
                            <div class="col-sm-3"></div>
                            <div class="col-sm-2">
                                <input class="btn btn-secondary" type="submit" value="戻る" onclick="javascript: form.action='/issmini/back';">
                            </div>
                            <c:if test="${user eq list.user}">
                                <div class="col-sm-2">
                                    <input class="btn btn-primary" type="submit" value="変更" onclick="javascript: form.action='/issmini/update';">
                                </div>
                                <div class="col-sm-2">
                                    <input class="btn btn-danger" type="submit" value="削除" onclick="javascript: form.action='/issmini/delete';">
                                </div>
                            </c:if>
                            <c:if test="${user ne list.user}">
                                <div class="col-sm-4">
                                </div>
                            </c:if>
                            <div class="col-sm-3"></div>
                        </div>
                    </div>
                    <div class="col-1">
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>