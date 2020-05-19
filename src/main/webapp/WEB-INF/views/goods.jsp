<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/4/17
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<body>

<table>
    <tr>
        <th>id</th>
        <th>商品名</th>
        <th>价格</th>
        <th>日期</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${goodsList}" var="goodsList">
        <tr>
            <td>${goodsList.id}</td>
            <td>${goodsList.name}</td>
            <td>${goodsList.price}</td>
<%--            <td>${goodsList.gtime}</td>--%>
            <td><fmt:formatDate value="${goodsList.gtime}" pattern="yyyy-MM-dd"/></td>
            <td><a href="d?id=${goodsList.id}">删除</a> </td>
        </tr>
    </c:forEach>
</table>
</body>

</html>