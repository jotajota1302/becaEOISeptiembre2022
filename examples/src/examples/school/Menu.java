package examples.school;

import java.util.Scanner;

public class Menu {

	public static void printMenuPrincipal() {
		
		System.out.println("Bienvenido a mi app");
		System.out.println("Seleccione una opcion: ");
		System.out.println("1-Listar Alumnos");
		System.out.println("2-Listar Profesores");	
		System.out.println("3-Consultar Alumno");	
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int opcion=scan.nextInt();
	
		switch (opcion) {
		case 1:
			
			for (int i = 0; i < Campus.personas.length; i++) {
				
				
				if(Campus.personas[i] instanceof Estudiante) {
					
					Estudiante temp=(Estudiante) Campus.personas[i];
										
					System.out.println("Estudiante: " + temp.getNombre()+ ", numero: " + temp.getNumeroEstudiante());
				}
			}
			System.out.println("**********************************************");	
			break;
		case 2:
			
			for (int i = 0; i < Campus.personas.length; i++) {
				
				if(Campus.personas[i] instanceof Profesor) {
					
					Profesor temp=(Profesor) Campus.personas[i];
					
					System.out.println("Profesor: " + temp.getNombre() +", asignatura: " + temp.getAsignatura());
				}
			}
			System.out.println("**********************************************");			
			break;
			
		case 3:
			
			printMenuSeleccionAlumno();			
			System.out.println("**********************************************");			
			break;

		default:
			System.out.println("Opcion Erronea");			
			break;
		}
		
		printMenuPrincipal();
	
	}
	
	public static void printMenuSeleccionAlumno() {
		
		System.out.println("Selecciona el numero de alumno para saber su media y el precio de su matricula:");
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int opcion=scan.nextInt();
		
		for (int i = 0; i < Campus.personas.length; i++) {
			
			if(Campus.personas[i] instanceof Estudiante) {
				
				Estudiante estudiante = (Estudiante)Campus.personas[i];
				
				if(estudiante.getNumeroEstudiante()==opcion) {
					
					System.out.println("Nota media: " + estudiante.calcularMedia());
					System.out.println("Coste matricula: " + estudiante.calcularMatricula());
				}
			}
			
		}
		
		printMenuPrincipal();
	
		
	}
	
	
	
}
