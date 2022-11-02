package edu.es.eoi.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller	
public class AlumnoController {

	@Autowired
	AlumnoService service;
	
	public void doSomething() {
		
		System.out.println("entering the controller");
		
		service.doSomething();
		
	}
	
}
