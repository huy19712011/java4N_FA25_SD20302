<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Products</h2>
<table border="1">
    <tr>
        <th>#</th>
        <th>Id</th>
        <th>Name</th>
        <th>Category</th>
    </tr>
    <c:forEach var="tempProduct" items="${products}" varStatus="i">
        <tr>
            <td>${i.index + 1}</td>
            <td>${tempProduct.id}</td>
            <td>${tempProduct.name}</td>
            <td>${tempProduct.category.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
