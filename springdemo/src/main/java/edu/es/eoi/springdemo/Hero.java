package edu.es.eoi.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter	
@Setter
public class Hero {
	
	private String name;
	
	@Autowired
	private Quest quest;

	
	
	
	
}
