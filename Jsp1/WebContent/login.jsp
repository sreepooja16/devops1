<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<%
String first,last,user,pass,contact,address;
first=request.getParameter("first_name");
last=request.getParameter("last_name");
user=request.getParameter("username");
pass=request.getParameter("password");
address=request.getParameter("address");
contact=request.getParameter("contact");
//out.println("FirstName"+first+"LastName"+last);
//out.println("Username"+user+"Password"+pass);
//out.println("Address"+address+"Contact"+contact);
if(user.equals("sree_pooja")&&pass.equals("123"))
{
	//response.sendRedirect("jsp2.jsp?User="+user);
	out.println(config.getInitParameter("Name"));
//pageContext.setAttribute("User",user,pageContext.REQUEST_SCOPE);
//request.getRequestDispatcher("jsp2.jsp").forward(request,response);
}
else
	response.sendRedirect("Home.html");

%>

</form>
</body>
</html>