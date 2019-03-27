package p5;

import java.io.IOException;
import java.io.PrintWriter;




import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Cookie3")
public class CookieServlet3 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		String value=request.getParameter("h1");
		PrintWriter pw=response.getWriter();
		pw.println("value from hidden field "+value);
		
		
		
		
		
	}
	
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
