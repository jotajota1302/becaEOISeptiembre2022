package edu.es.eoi.service;

import edu.es.eoi.database.RecetaDAO;
import edu.es.eoi.model.Receta;

//Toda la logica de recetas
public class RecetaService {

	//si hay que acceder a bbdd que lo haga el DAO
	RecetaDAO recetaDAO= new RecetaDAO();
	
	public Receta verReceta() {
		
		System.out.println("quiero recuperar una receta de bbdd y llamo a recetaDAO");
		
		return recetaDAO.encuentraReceta();
	}
	
}
