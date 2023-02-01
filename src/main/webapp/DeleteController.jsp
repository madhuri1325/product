<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.glvc.dao.ProductDao"%>
<%@page import="com.glvc.bean.Product"%>
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

int row=dao.delete(product);
if(row==1){
	response.sendRedirect("Fail.jsp");
}
else{
	out.print("not successful");
}%>
</body>
</html>