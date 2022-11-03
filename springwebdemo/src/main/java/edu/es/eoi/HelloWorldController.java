package edu.es.eoi;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloWorldController {

	@RequestMapping(value = "test1" ,method = RequestMethod.GET)		
	@ResponseBody
	public User sayTest1(@RequestParam String nif,@Nullable @RequestParam String password) {
		
		//nif del cliente y yo te lo busco y te devuelvo el nombre y el pw
		System.out.println(password);
		System.out.println(nif);
		
		return new User("JJ", "test password");
	}
	
	@RequestMapping(value = "test2/{id}" ,method = RequestMethod.GET)		
	@ResponseBody
	public User sayTest2(@PathVariable(name = "id") String id) {		
	
		System.out.println(id);
		
		return new User("JJ", "test password");
	}
	
	@RequestMapping(value = "page1" ,method = RequestMethod.GET)		
	public String goToPage1() {
		
		return "page1.html";
	}
	
	@RequestMapping(value = "page2" ,method = RequestMethod.GET)		
	public String goToPage2() {
		
		return "page2.html";
	}
	
}
