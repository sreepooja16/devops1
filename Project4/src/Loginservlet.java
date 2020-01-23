

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Loginservlet extends HttpServlet {
	
	String user,pass;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("link.html").include(request,response);
		
		user=request.getParameter("user");
		pass=request.getParameter("pass");
		if(user.equals("pooja")&& pass.equals("123"))
		{
		    HttpSession session=request.getSession();
			session.setAttribute("User", user);
			out.println(user+"welcome");
		}
		else
		{
			
			out.println("sorry,Invalid Username or password");
			request.getRequestDispatcher("NewFile1.html").include(request, response);
			
		}
	}

}
