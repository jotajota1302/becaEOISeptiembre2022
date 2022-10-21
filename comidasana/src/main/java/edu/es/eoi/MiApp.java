package edu.es.eoi;

import java.sql.SQLException;

import edu.es.eoi.view.MenuPrincipal;

public class MiApp {
	
	public static void main(String[] args) {

		try {
			MenuPrincipal.printMenuPrincipal();
		} catch (SQLException e) {		
			e.printStackTrace();
			main(args);
		}
		
	}

}
