package edu.es.eoi.view;

import java.util.Scanner;

import edu.es.eoi.service.RecetaService;

public class MenuPrincipal {
	
	public static void printMenuPrincipal() {
		
		System.out.println("Bienvenido a mi app, elige una opcion");
		System.out.println("1-Ver recetas");
		System.out.println("2-Crear receta");
		System.out.println("3-Buscar restaurante");
		
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		@SuppressWarnings("unused")
		int option=scan.nextInt();
		
		System.out.println("llamo al servicio de recetas y le pido la receta que quiero");
		
		RecetaService service= new RecetaService();
		service.verReceta();
		
		printMenuPrincipal();
		
	}

}
