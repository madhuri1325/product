<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><i>Delete the product </i></h1>
<form action="DeleteController.jsp">
<input type="hidden" name="pid" value=<%=request.getParameter("id") %>>
Name to be deleted <input type="text" name="name">


<input type="submit" value="delete">
</body>
</html>