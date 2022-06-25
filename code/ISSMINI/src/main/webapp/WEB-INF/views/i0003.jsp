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
        <script type="text/javascript" src="resources/js/i0003.js"></script>
        <!--><link rel="stylesheet" href="resources/css/i0003.css"><!--> 
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container-fluid bg-dark w-100 h-100 overflow-auto">
            <div class="row text-white" align="center">
                <p>Board</p>
            </div>
            <div class="row">
                <div class="col-1">
                </div>
                <div class="col-10 bg-white">
                    <div class="row">
                        <table class="table table-striped mt-3">
                            <thead>
                                <tr>
                                    <th class="col-1" scope="col">No.</th>
                                    <th class="col-7" scope="col">Subject</th>
                                    <th class="col-2" scope="col">Name</th>
                                    <th class="col-2" scope="col">Date</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${boardlist}" var="list">
                                    <tr>
                                        <th scope="row">${list.no}</th>
                                        <td><a href="i0004?no=${list.no}&user=${user}">${list.title}</a></td>
                                        <td>${list.user}</td>
                                        <td>${list.createTime}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div class="row" align="center">
                        <div class="col-9">
                        </div>
                        <div class="col-3">
                            <form action="create.do" method="get">
                                <input type="hidden" name="user" value="${user}">
                                <button type="submit" class="btn btn-secondary btn-sm" onclick="">作成</button>
                            </form>
                        </div>
                    </div>
                    <div class="row">
                        <nav aria-label="Page navigation example">
                            <ul class="pagination justify-content-center pagination-sm">
                                <c:if test="${pagination.prev}">
                                    <li class="page-item">
                                        <a class="page-link text-secondary" href="#" aria-label="Previous" onClick="fn_prev('${pagination.page}', '${pagination.range}', '${pagination.rangeSize}', '${user}')">
                                            <span aria-hidden="true">&laquo;</span>
                                            <span class="sr-only">Previous</span>
                                        </a>
                                    </li>
                                </c:if>
                                <c:forEach begin="${pagination.startPage}" end="${pagination.endPage + 1}" var="idx">
                                    <li class="page-item"><a class="page-link text-secondary" href="#" onClick="fn_pagination('${idx}', '${pagination.range}', '${pagination.rangeSize}', '${user}')">${idx}</a></li>
                                </c:forEach>
                                <c:if test="${pagination.next}">
                                    <li class="page-item <c:out value="${pagination.page == idx ? 'active' : ''}"/>">
                                        <a class="page-link text-secondary" href="#" aria-label="Next" onClick="fn_next('${pagination.range}', '${pagination.range}', '${pagination.rangeSize}', '${user}')" >
                                            <span aria-hidden="true">&raquo;</span>
                                            <span class="sr-only">Next</span>
                                        </a>
                                    </li>
                                </c:if>
                            </ul>
                        </nav>
                    </div>
                </div>
                <div class="col-1">
                </div>
            </div>
        </div>
    </body>
</html>