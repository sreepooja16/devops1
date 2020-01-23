

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class ProfileServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("link.html").include(request,response);
		
		HttpSession session=request.getSession(false);
		if(session!=null){
			String user=(String)session.getAttribute("User");
			out.println(user+"Welcome to this page");
		}
		else
		{
			out.println("First Login in this site");
			request.getRequestDispatcher("NewFile1.html").include(request,response);
			
		}

	
	
	}
}
