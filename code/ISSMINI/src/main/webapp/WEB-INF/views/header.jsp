<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>ISSMINI</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
    </head>
    <body>
        <div class="bg-dark text-white row" style=" padding: 10px; height: 110px; width: 100%; margin : 0;    overflow: hidden;">
            <div class="row">
                <div class="p-3" align="left" style="display: inline-flex; height: 80px;">
                    <p>ISS</p>
                    <c:if test="${not empty headerFlag}">
                        <c:choose>
                            <c:when test="${headerFlag == 'board'}">
                                <div style="margin: 0 35px;">
                                    <p style="border: 1px solid white; color: black; background-color: white;">board</P>
                                </div>
                            </c:when>
                            <c:otherwise>
                                <div style="margin: 0 35px;">
                                    <form action="board" method="get" id="board">
                                        <input type="hidden" name="user" value="${user}">
                                        <p style="border: 1px solid white; cursor: pointer;" onclick="document.getElementById('board').submit();">board</p>
                                    </form>
                                </div>
                            </c:otherwise>
                        </c:choose>
                    </c:if>
                </div>
                <hr>
            </div>
        </div>
    </body>
</html>