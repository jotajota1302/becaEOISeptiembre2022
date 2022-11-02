package edu.es.eoi;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataDemoApplicationTests {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Test
	void contextLoads() {
		
		//Crud completo 
		
		//1-recuperar entidad
		//2-Guardar
		//3-Modificar
		//4 borrar
		
		List<Cliente> all = clienteRepository.findAll();
		
		Cliente cliente=clienteRepository.findById("03765983S").get();
		
		System.out.println(cliente.getDireccion());
		
	
		
	}

}
