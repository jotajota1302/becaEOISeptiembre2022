package edu.es.eoi.springdemo;

import org.springframework.stereotype.Repository;

@Repository
public class AlumnoRepositoryJPAImpl implements AlumnoRepository{
	
	public void doSomething() {
		
		System.out.println("entering the repository with JPA");
		
		System.out.println("Accedo a la bbdd");
		
	}

}
