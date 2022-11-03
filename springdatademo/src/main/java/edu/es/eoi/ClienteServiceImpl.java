package edu.es.eoi;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl {
	
	@Autowired
	private ClienteRepository clienteRepository;
		
	@Transactional(rollbackOn = Exception.class)
	public void doUpdates() {
		
		Cliente c1= new Cliente();
		c1.setDni("AAAAAAAAA");
		c1.setDireccion("TEST");
		c1.setNombre("JJ NEW");
		
		Cliente c2= new Cliente();
		c2.setDni("BBBBBBBBB");
		c2.setDireccion("TEST");
		c2.setNombre("JJ NEW");
			
		Cliente c3= new Cliente();
		c3.setDni("CCCCCCCCC");
		c3.setDireccion("TEST");
		c3.setNombre("JJ NEW");
				
		clienteRepository.save(c1);
		clienteRepository.save(c2);
		clienteRepository.save(c3);
		
	}

}
