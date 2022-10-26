package edu.es.eoi;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.es.eoi.dao.FingerPrintDaoJPAImpl;
import edu.es.eoi.dao.UserDao;
import edu.es.eoi.dao.UserDaoJDBCImpl;
import edu.es.eoi.dao.UserDaoJPAImpl;
import edu.es.eoi.entity.Fingerprint;
import edu.es.eoi.entity.Prueba;
import edu.es.eoi.entity.User;

public class Main {

	public static void main(String[] args) throws Exception {
				
		//Ya he acabado de configurar JPA 
		//1-libreras en el pom
		//2-persistence xml
		//3-Anotaciones en la clase prueba (entities)
		
		EntityManager manager=Persistence.createEntityManagerFactory("BASEDEDATOSPRUEBA").createEntityManager();
		
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
			
		Date data= new Date();
		long inicio= data.getTime();
		
		UserDaoJDBCImpl userDao2 = new UserDaoJDBCImpl();
		User user2=userDao2.read(1);
		
		data= new Date();
		long fin= data.getTime();
		
		System.out.println("Esto ha tardado: " +(fin-inicio));
		
		System.out.println(user2);
		
		data= new Date();
		inicio= data.getTime();
		
		UserDao userDao= new UserDaoJPAImpl();				 
		User user=userDao.read(1);
		
		data= new Date();
		fin= data.getTime();
		
		System.out.println("Esto ha tardado: " +(fin-inicio));
		
		System.out.println(user);
		
		FingerPrintDaoJPAImpl fingerDao=new FingerPrintDaoJPAImpl();
//		
//		Fingerprint huella = fingerDao.read(1);
//		
//		System.out.println(huella);
		
		Date fecha= new Date();
		
		User nuevoUser= new User();
		nuevoUser.setMail("test@gmail.com");
		nuevoUser.setUsername("test");
		nuevoUser.setPassword("PPPPPP");
		nuevoUser.setLastAccess(fecha);	
		
		Fingerprint nuevaHuella= new Fingerprint();
		nuevaHuella.setFinger("indice");
		nuevaHuella.setImage("ruta");
		nuevaHuella.setScandate(fecha);
		
		//setear la relacion
		nuevaHuella.setUser(nuevoUser);		
		user.setFingerprint(nuevaHuella);
		
//		userDao.create(nuevoUser);	
		
		userDao.read(1);

	}

}
