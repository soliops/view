<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
 <html lang="ko">
 <head>
 <title>Spring Boot에서 JSP 출력</title>
 <meta charset="UTF-8">
 <style>
 table,tr,td,th{
 border : 1px solid #444444;}
 </style>
 </head>
 <body>
    <div>
        <table>
            <tr>
                <th>언어</th>
                <th>통합 개발 환경</th>
                <th>빌드 도구</th>
            </tr>
            <tr>
                 <th>${map.Language}</th>
                 <th>${map.IDE}</th>
                 <th>${map.Framework}</th>
            </tr>
        </table>
    </div>

    <div>
        <table>
            <j:forEach items="${list}" var="job">
                <tr>
                    <td>${job}</td>
                </tr>
            </j:forEach>
        </table>
    </div>
</body>
</html>