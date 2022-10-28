package edu.es.eoi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.es.eoi.entity.UserService;


@WebServlet("/checkuser")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println(request.getParameter("mail"));
		System.out.println(request.getParameter("password"));
		
		//Desarrollar un UserService que acceda a BBDD y a traves de un UserDAO compruebe si el password es correcto
		
		UserService service= new UserService();
		service.compruebaPassword(request.getParameter("mail"), request.getParameter("password"));
		
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Login</title>");
	    out.println("</head>");
	    out.println("<body bgcolor=\"white\">");
	    out.print("You are logged");
	    out.print("</br>");
	    out.print("<a href=/login/login.html>Login</a>");
	    out.println("</body>");
	    out.println("</html>");

	}

}
