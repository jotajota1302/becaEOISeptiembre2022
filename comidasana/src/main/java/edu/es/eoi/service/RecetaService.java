package edu.es.eoi.service;

import java.sql.SQLException;

import edu.es.eoi.database.RecetaDAO;
import edu.es.eoi.model.Receta;

//Toda la logica de recetas
public class RecetaService {

	//si hay que acceder a bbdd que lo haga el DAO
	RecetaDAO recetaDAO= new RecetaDAO();
	
	public Receta buscarReceta(int id) throws SQLException {
				
		return recetaDAO.encuentraReceta(id);
	}
	
	public void crearReceta() {
		
		System.out.println("creo una receta y llamo a recetaDAO");
		
	}
	
}
