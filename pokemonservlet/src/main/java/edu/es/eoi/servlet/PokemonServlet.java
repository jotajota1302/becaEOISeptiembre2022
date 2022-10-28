package edu.es.eoi.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.es.eoi.service.PokemonService;
import es.edu.eoi.pokemon.entity.Pokemon;

@WebServlet("/pokemon")
public class PokemonServlet extends HttpServlet {
		
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PokemonService service=new PokemonService();
		
		Pokemon p=service.findPokemonById(Integer.valueOf(request.getParameter("numero")));
		
		response.getWriter().append(p.getName());
		
	}
}
