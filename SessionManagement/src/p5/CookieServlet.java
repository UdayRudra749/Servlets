package p5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/Cookies")
public class CookieServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
        PrintWriter out=response.getWriter();
        String email=request.getParameter("txtemail");
        String gender=request.getParameter("g1");
        System.out.println(gender);
        String []values=request.getParameterValues("c1");
        for(String s:values)
        {
        	out.println(s);
        }
        Cookie c1=new Cookie("EmailCookie",email);
        c1.setMaxAge(24*60*60);
        response.addCookie(c1);
        if(c1!=null)
        {
        	out.println("Cookie created");
        }
		/*RequestDispatcher rd=request.getRequestDispatcher("Cookie2");
		rd.include(request,response);*/
	response.sendRedirect("Cookie2?str1="+email+"&str2="+gender);	
			
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
