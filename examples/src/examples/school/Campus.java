package examples.school;

public class Campus {
	
	public static Persona[] personas= new Persona[100];
	public static boolean initializated=false;

	public static void main(String[] args) {		
	
		if(!initializated) {
			initializated=initData();	
		}
		
		Menu.printMenuPrincipal();	
			
	}

	private static boolean initData() {
		
		Estudiante estudiante1= new Estudiante();
		estudiante1.setNombre("Jose");
		estudiante1.setApellidos("Jimenez");
		estudiante1.setEmail("mail@gmail");
		estudiante1.setNumeroEstudiante(3);
		estudiante1.setTelefono("676786876");
		
		Direccion direccion= new Direccion();
		direccion.setCalle("C/Pepito");
		direccion.setCiudad("Alicante");
		direccion.setCodigoPostal("03565");
		direccion.setPais("España");
		
		estudiante1.setDireccion(direccion);
		
		double[] notas=new double[5];
		notas[0]=4.0;
		notas[1]=6.0;
		notas[2]=8.0;
		notas[3]=2.0;
		notas[4]=1.0;
		
		estudiante1.setNotas(notas);		
		
		Estudiante estudiante2= new Estudiante();
		estudiante2.setNombre("Sara");
		estudiante2.setApellidos("Baras");
		estudiante2.setEmail("mail@gmail");
		estudiante2.setNumeroEstudiante(25);
		estudiante2.setTelefono("785786578");
		
		Direccion direccion2= new Direccion();
		direccion2.setCalle("C/Juanito");
		direccion2.setCiudad("Alicante");
		direccion2.setCodigoPostal("03345");
		direccion2.setPais("España");
		
		estudiante2.setDireccion(direccion2);
		
		double[] notas2=new double[5];
		notas2[0]=7.0;
		notas2[1]=6.0;
		notas2[2]=9.0;
		notas2[3]=4.0;
		notas2[4]=5.0;
		
		estudiante2.setNotas(notas2);		
		
		personas[0]=estudiante1;
		personas[1]=estudiante2;
	
		
		Profesor profesor= new Profesor();
		profesor.setNombre("Pepe");
		profesor.setApellidos("Perez");
		profesor.setEmail("mail@gmail");	
		profesor.setTelefono("764374677");
		profesor.setAsignatura("Matematicas");
		profesor.setSalario(25000);
		
		personas[2]=profesor;
		
		
		return true;
	}

}
