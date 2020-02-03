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
		String user = request.getParameter("user");

		//out.println("<h2><font color='green'>Login Suceess!!</font></h2>");
	%>
	<h2>
		<font color='green'>Welcome <%=user%>!!! Login Successful!!!
		</font>
	</h2>



</body>
</html>