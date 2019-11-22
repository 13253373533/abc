<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/9/12
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body >
    <table border="1" >
        <tr>
            <th>图书编号</th>
            <th>图书名称</th>
            <th>图书价格</th>
            <th>图书作者</th>
        </tr>
        <c:forEach items="${pb.books}" var="book" >
            <tr>
                <td>${book.num}</td>
                <td>${book.name}</td>
                <td>${book.price}</td>
                <td>${book.author}</td>

            </tr>
        </c:forEach>

    </table>
    <c:if test="${pb.currentPage!=1}">
        <a href="/jsppage/booklist?pageNum=${pb.currentPage-1}" >上一页</a>
    </c:if>

    第${pb.currentPage}页/共${pb.totalPage}页
    <c:if test="${pb.totalPage!=pb.currentPage}">
        <a href="/jsppage/booklist?pageNum=${pb.currentPage+1}" >下一页</a>
    </c:if>

</body>
</html>
