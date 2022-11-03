package edu.es.eoi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataDemoApplicationTests {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	ClienteServiceImpl service;
	
	@Autowired
	WordService wordservice;
	
	@Test
	void contextLoads() {
		
		wordservice.convertToPDF("fsadfjsdhfjkshk");
		
		//Crud completo 
		
		//1-recuperar entidad
		//2-Guardar
		//3-Modificar
		//4 borrar		
		
//		Cliente cliente=clienteRepository.findById("03765983S").get();
	
		Cliente c= new Cliente();
		c.setDni("AAAAAAAAA");
		c.setDireccion("TEST");
		c.setNombre("JJ NEW");
		
//		clienteRepository.save(c);
		
//		c.setDni("BBBBBBBB");
		
//		clienteRepository.save(c);
		
//		clienteRepository.deleteById("AAAAAAAAA");
			
//		clienteRepository.findAll(PageRequest.of(0,5));
		
//		clienteRepository.findAll(PageRequest.of(1,5));
		
		service.doUpdates();
			
		
	}

}
