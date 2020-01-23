

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class Logout extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("link.html").include(request,response);
		HttpSession session=request.getSession();
		session.invalidate();
		out.println("successfully logout from the site");
	}

}
