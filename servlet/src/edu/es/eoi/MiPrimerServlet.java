package edu.es.eoi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.es.eoi.entity.Cliente;
import edu.es.eoi.service.ClienteService;


@WebServlet("/MiPrimerServlet")
public class MiPrimerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		ClienteService service=new ClienteService();		
		Cliente cliente=service.readCliente(request.getParameter("dni"));
		
		response.getWriter().append("Served at: ").append(String.valueOf(service.getSaldoTotal(cliente)));
		
	}


}
