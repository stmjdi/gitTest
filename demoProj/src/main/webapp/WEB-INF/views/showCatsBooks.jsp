<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Books By Category</title>

<style>
	body{
		text-align:center;
	}
	table{
		text-align:center;
		margin-top:200px;
		margin-left:auto;
		margin-right:auto;
	}
	th{
		background-color:lightgreen;
	}
	
</style>
</head>
<body>
<h1>Show Books By Category</h1>
<h1>meow 냐옹 miao nyang</h1>
<table>
	<tr>
		<th>bid</th>
		<th>title</th>
		<th>author</th>
		<th>publisher</th>
		<th>pubdate</th>
		<th>isbn</th>
		<th>bcategory</th>
		<th>blocation</th>
		<th>bcount</th>
		<th>descrip</th>
		<th>bpages</th>
		<th>willdel</th>
	</tr>
	
	<c:forEach var="itm" items="${blist }">
	<tr>
		<td>${itm.bid }</td>
		<td><a href="booklistDetail?bid=${itm.bid }">${itm.title }</a></td>
		<td>${itm.author }</td>
		<td>${itm.publisher }</td>
		<td>${itm.pubdate }</td>
		<td>${itm.isbn }</td>
		<td>${itm.bcategory }</td>
		<td>${itm.blocation }</td>
		<td>${itm.bcount }</td>
		<td>${itm.descrip }</td>
		<td>${itm.bpages }</td>
		<td>${itm.willdel }</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>