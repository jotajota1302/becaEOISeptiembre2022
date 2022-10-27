package edu.es.eoi;

import java.util.Scanner;

import edu.es.eoi.service.ClienteService;

public class MenuPrincipal {

	
	public static void printMenu() {
		
		System.out.println("Bienvenido a tu app bancaria, introduce tu DNI: "); 
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		String dni=scan.next();
	
		System.out.println("Dinero Total: " + ClienteService.getSaldoTotal(Main.clienteDAO.read(dni)));
			
	
	}
	
}
