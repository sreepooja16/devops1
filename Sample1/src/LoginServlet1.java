

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class LoginServlet1 extends HttpServlet {
	String user,pass;
	public void init()
	{
		System.out.println("Inside Init method");
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		user=request.getParameter("user");
		pass=request.getParameter("pass");
		//out.println("Username"+user+" "+"Password"+pass);
		if(user.equals("pooja")&& pass.equals("123"))
		{
		//out.println("Hello"+" "+user+" welcome to this site");
		//out.println("Email "+getServletContext().getInitParameter("Email"));
			response.sendRedirect("servlet2?User="+user);
		}
		else
		{
			
			//out.println("Invalid credentials");
			response.sendRedirect("login.html");
		}
		System.out.println("Inside server method");
	}
		public void destroy()
		{
			System.out.println("Inside Destroy method");
		}

	}


