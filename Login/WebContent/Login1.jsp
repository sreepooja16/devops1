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
      String message = (String)request.getAttribute("error");
if(message != null){
out.println("<h2><font color='red'>"+message +"</font></h2>");
}
%>

<form action="LoginServlet" method = "post">
<h1>Login Page</h1>
<br> UserName : <input type="text" name="user"><br>
<br> Password : <input type="password" name="pass"><br><br>

<input type="submit" value="submit">
<input type="reset" value="reset">
</form>
</body>
</html>