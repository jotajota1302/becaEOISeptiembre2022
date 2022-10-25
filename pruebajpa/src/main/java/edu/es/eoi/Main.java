package edu.es.eoi;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.es.eoi.entity.Prueba;

public class Main {

	public static void main(String[] args) {
				
		//Ya he acabado de configurar JPA 
		//1-libreras en el pom
		//2-persistence xml
		//3-Anotaciones en la clase prueba (entities)
		
		EntityManager manager=Persistence.createEntityManagerFactory("BASEDEDATOSPRUEBA").createEntityManager();
		
		Prueba prueba1=manager.find(Prueba.class, 1);
//		Prueba prueba2=manager.find(Prueba.class, 2);
		
		Prueba nueva= new Prueba();
		nueva.setCampo("Test1");
		nueva.setCampo2("Test2");
		
//		manager.getTransaction().begin();
//		manager.persist(nueva);
//		manager.getTransaction().commit();
		
		Prueba updated=manager.find(Prueba.class, 3);
		updated.setCampo2("updated");
		
//		manager.getTransaction().begin();
//		manager.merge(updated);
//		manager.getTransaction().commit();
		
		Prueba remove=manager.find(Prueba.class, 2);
		
		manager.getTransaction().begin();
		manager.remove(remove);
		manager.getTransaction().commit();
		
		
	}

}
