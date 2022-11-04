package edu.es.eoi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.es.eoi.entity.Cliente;
import edu.es.eoi.repository.ClientRepository;

@SpringBootTest
class AppTests {

	@Autowired
	ClientRepository clientRepository;
	
	@Test
	void test() {
				
		Cliente c=clientRepository.findById("03765983S").get();
		
		Assertions.assertTrue(c.getNombre().equals("Pepe"));
			
		
	}

}
