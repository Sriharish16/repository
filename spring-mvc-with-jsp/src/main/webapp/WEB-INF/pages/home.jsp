<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table{

border: 10px solid red;

}
tr,td,th{
border: 4px solid blue;
border-collapse:collapse;
margin-left:auto;
margin-right:auto;
}</style>
</head>
<body>

<table>

<tr>
<th>Product Id</th>
<th>Product Name</th>
<th>Rate Per Unit</th>
</tr>


<c:forEach items="${list}" var="eachItem">
<tr>
<td>${eachItem.productId}</td>
<td>${eachItem.productName}</td>
<td>${eachItem.price}</td>
</tr>
</c:forEach>

</table>
</body>
</html>