package edu.es.eoi.view;

import java.sql.SQLException;
import java.util.Scanner;

import edu.es.eoi.service.RecetaService;

public class MenuPrincipal {
	
	static RecetaService service= new RecetaService();
	
	public static void printMenuPrincipal() throws SQLException {
		
		System.out.println("Bienvenido a mi app, elige una opcion");
		System.out.println("1-Ver recetas");
		System.out.println("2-Crear receta");
		System.out.println("3-Buscar restaurante");
		
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);		
		int option=scan.nextInt();
		
		System.out.println("llamo al servicio de recetas y le pido la receta que quiero");
				
		System.out.println(service.buscarReceta(option));
		
		printMenuPrincipal();
		
	}

}
