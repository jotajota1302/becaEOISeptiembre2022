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
		
		Prueba prueba=manager.find(Prueba.class, 1);

		System.out.println(prueba.getCampo1());
		
	}

}
