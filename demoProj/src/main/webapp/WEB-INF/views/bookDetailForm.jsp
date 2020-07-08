<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Detail Form</title>

<style>
body {
	text-align: center;
}

table {
	text-align: center;
	margin-top: 200px;
	margin-left: auto;
	margin-right: auto;
}

th {
	background-color: lightgreen;
}
</style>
</head>
<body>
	<h1>Book Detail Information about "${bdetail.title }"</h1>
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
		<tr>
			<td>${bdetail.bid }</td>
			<td>${bdetail.title }</td>
			<td>${bdetail.author }</td>
			<td>${bdetail.publisher }</td>
			<td>${bdetail.pubdate }</td>
			<td>${bdetail.isbn }</td>
			<td>${bdetail.bcategory }</td>
			<td>${bdetail.blocation }</td>
			<td>${bdetail.bcount }</td>
			<td>${bdetail.descrip }</td>
			<td>${bdetail.bpages }</td>
			<td>${bdetail.willdel }</td>
		</tr>

	</table>

</body>
</html>