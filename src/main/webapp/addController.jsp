<%@page import="com.glvc.dao.ProductDao"%>
<%@page import="com.glvc.bean.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ProductDao dao=new ProductDao();
Product product=new Product();
product.setPid(Integer.parseInt(request.getParameter("pid")));
product.setPname(request.getParameter("pname"));
product.setCost(Float.parseFloat(request.getParameter("pcost")));
int row=dao.insert(product);
if(row>0){
	response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("fail.jsp");
}
%>
</body>
</html>

