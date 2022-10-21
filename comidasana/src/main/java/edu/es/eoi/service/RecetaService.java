package edu.es.eoi.service;

import java.sql.SQLException;

import edu.es.eoi.database.RecetaDAO;
import edu.es.eoi.model.Ingrediente;
import edu.es.eoi.model.Receta;

//Toda la logica de recetas
public class RecetaService {

	//si hay que acceder a bbdd que lo haga el DAO
	RecetaDAO recetaDAO= new RecetaDAO();
	
	public Receta buscarReceta(int id) throws SQLException {
				
		return recetaDAO.encuentraReceta(id);
	}
	
	public double calculaPrecioReceta(Receta receta) {
		
		//¿como calculo el precio de una receta?
		
		double precio=0;
		
		for (Ingrediente ingrediente : receta.getIngredientes()) {
			precio=precio+ingrediente.getPrecio();
		}
		
		return precio;
		
	}
	
	public void crearReceta() {
		
		System.out.println("creo una receta y llamo a recetaDAO");
		
	}
	
}
