

import java.io.*;



import javax.servlet.*;
import javax.servlet.http.*;


public class Servlet2 extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("Hello "+request.getParameter("user")+"you are in the page"+getServletConfig().getServletName());
	}

}
