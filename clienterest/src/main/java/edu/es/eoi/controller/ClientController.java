package edu.es.eoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.dto.ClientBalanceDto;
import edu.es.eoi.dto.ClienteDto;
import edu.es.eoi.service.ClientService;

@RestController
@RequestMapping("/clientes")
public class ClientController {

	@Autowired
	ClientService clientService;

	@RequestMapping(value = "/{dni}", method = RequestMethod.GET)
	public ResponseEntity<ClienteDto> findByDni(@PathVariable String dni) {

		ClienteDto client = clientService.find(dni);
		
		if (client!=null) {
			return new ResponseEntity<ClienteDto>(client, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}

//	@RequestMapping(method = RequestMethod.GET)
//	public ResponseEntity<List<Cliente>> findAll() {
//
//		List<Cliente> data = repository.findAll();
//		if (!data.isEmpty()) {
//			return new ResponseEntity<List<Cliente>>(data, HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		}
//	}
//
//	@RequestMapping(method = RequestMethod.POST)
//	public ResponseEntity<?> create(@RequestBody Cliente cliente) {
//
//		repository.save(cliente);
//		return new ResponseEntity<>(HttpStatus.CREATED);
//	}
//
//	@RequestMapping(value = "/{dni}", method = RequestMethod.PUT)
//	public ResponseEntity<?> update(@RequestBody Cliente cliente, @PathVariable String dni) {
//
//		if (dni.equals(cliente.getDni())) {
//			repository.save(cliente);
//			return new ResponseEntity<>(HttpStatus.ACCEPTED);
//		} else {
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//	}
//
//	@RequestMapping(value = "/{dni}", method = RequestMethod.DELETE)
//	public ResponseEntity<Cliente> deleteByDni(@PathVariable String dni) {
//
//		repository.deleteById(dni);
//		return new ResponseEntity<Cliente>(HttpStatus.ACCEPTED);
//	}
//
//	@RequestMapping(method = RequestMethod.DELETE)
//	public ResponseEntity<?> deletetAll() {
//
//		repository.deleteAll();
//		return new ResponseEntity<>(HttpStatus.ACCEPTED);
//
//	}

}
