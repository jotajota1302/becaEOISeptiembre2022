package edu.es.eoi.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl implements AlumnoService{
	
	@Autowired
	AlumnoRepository repository;
	
	public void doSomething() {		
		
		System.out.println("entering the service");
		
		repository.doSomething();
		
	}

}
