package edu.es.eoi.springdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDemoApplicationTests {

	@Autowired
	Hero hero1;
	
	@Autowired
	Hero hero2;
	
	@Autowired
	UtilsService service;
	
	@Autowired
	AlumnoController alumnoController;
	
	@Test
	void contextLoads() {
		
		System.out.println(hero1.getQuest());
		System.out.println(hero2.getQuest());
		
		service.sendMail("");
		
		alumnoController.doSomething();
		
	}

}
