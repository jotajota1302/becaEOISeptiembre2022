package edu.es.eoi;

import edu.es.eoi.dao.ClienteDaoJPAImpl;
import edu.es.eoi.view.MenuPrincipal;

public class Main {

	public static ClienteDaoJPAImpl clienteDAO= new ClienteDaoJPAImpl();	
	
	public static void main(String[] args) throws Exception {
				
		//Ya he acabado de configurar JPA 
		//1-libreras en el pom
		//2-persistence xml
		//3-Anotaciones en la clase prueba (entities)
		
//		EntityManager manager=Persistence.createEntityManagerFactory("BASEDEDATOSPRUEBA").createEntityManager();
		
//		Prueba prueba1=manager.find(Prueba.class, 1);
//		Prueba prueba2=manager.find(Prueba.class, 2);
		
//		Prueba nueva= new Prueba();
//		nueva.setCampo("Test1");
//		nueva.setCampo2("Test2");
		
//		manager.getTransaction().begin();
//		manager.persist(nueva);
//		manager.getTransaction().commit();
		
//		Prueba updated=manager.find(Prueba.class, 3);
//		updated.setCampo2("updated");
		
//		manager.getTransaction().begin();
//		manager.merge(updated);
//		manager.getTransaction().commit();
		
//		Prueba remove=manager.find(Prueba.class, 2);
		
//		manager.getTransaction().begin();
//		manager.remove(remove);
//		manager.getTransaction().commit();
			
//		Date data= new Date();
//		long inicio= data.getTime();
//		
//		UserDaoJDBCImpl userDao2 = new UserDaoJDBCImpl();
//		User user2=userDao2.read(1);
//		
//		data= new Date();
//		long fin= data.getTime();
//		
//		System.out.println("Esto ha tardado: " +(fin-inicio));
//		
//		System.out.println(user2);
//		
//		data= new Date();
//		inicio= data.getTime();
//		
//		UserDaoJPAImpl userDao= new UserDaoJPAImpl();				 
//		User user=userDao.read(1);
//		
//		data= new Date();
//		fin= data.getTime();
//		
//		System.out.println("Esto ha tardado: " +(fin-inicio));
//		
//		System.out.println(user);
//		
//		FingerPrintDaoJPAImpl fingerDao=new FingerPrintDaoJPAImpl();
////		
////		Fingerprint huella = fingerDao.read(1);
////		
////		System.out.println(huella);
//		
//		Date fecha= new Date();
//		
//		User nuevoUser= new User();
//		nuevoUser.setMail("test@gmail.com");
//		nuevoUser.setUsername("test");
//		nuevoUser.setPassword("PPPPPP");
//		nuevoUser.setLastAccess(fecha);	
//		
//		Fingerprint nuevaHuella= new Fingerprint();
//		nuevaHuella.setFinger("indice");
//		nuevaHuella.setImage("ruta");
//		nuevaHuella.setScandate(fecha);
//		
//		//setear la relacion
//		nuevaHuella.setUser(nuevoUser);		
//		user.setFingerprint(nuevaHuella);
//		
////		userDao.create(nuevoUser);	
//		
//		userDao.read(1);
//		
//		System.out.println(userDao.findAll());
//		System.out.println(userDao.findUsersByFingerprint("indice"));
//				
//		ClienteDaoJPAImpl dao= new ClienteDaoJPAImpl();
//		
//		Cliente cliente = dao.read("03765983S");
//		
//		System.out.println(cliente.getNombre());
//		
//		BancoDaoJPAImpl bancoDaoJPAImpl= new BancoDaoJPAImpl();
//		
//		Banco banco=bancoDaoJPAImpl.read(1);
//		
//		System.out.println(banco);
//		
//		CuentaDaoJPAImpl cuentaDaoJPAImpl= new CuentaDaoJPAImpl();
//		
//		Cuenta cuenta=cuentaDaoJPAImpl.read(1);
//		
//		System.out.println(cuenta);
		
		//Genericidad
		
//		List bancos= new ArrayList();
//			
//		List<Cuenta> cuentas= new ArrayList<Cuenta>();
		
		MenuPrincipal.printMenu();
		
		main(args);
		
	}

}
