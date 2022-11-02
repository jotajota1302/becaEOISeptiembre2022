package edu.es.eoi.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
		
		System.out.println("Hello");			
		
	}
//	
//	@Bean
//	public Hero getHero() {
//		
//		Hero h= new Hero();
//		h.setName("default hero name");
//		
//		return h;
//		
//	}
//	
//	@Bean
//	public Quest getQuest() {
//		
//		Quest q=new Quest();
//		q.setName("default quest");
//		
//		return q;
//	}
	
	

}
