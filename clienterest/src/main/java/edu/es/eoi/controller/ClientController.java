package edu.es.eoi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.es.eoi.entity.Client;
import edu.es.eoi.repository.ClientRepository;

@RestController
@RequestMapping("/clientes")
public class ClientController {

	@Autowired
	ClientRepository repository;

	@RequestMapping(value = "/{dni}", method = RequestMethod.GET)
	public ResponseEntity<Client> findByDni(@PathVariable String dni) {

		Optional<Client> client = repository.findById(dni);
		if (client.isPresent()) {
			return new ResponseEntity<Client>(client.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Client>> findAll() {

		List<Client> data = repository.findAll();
		if (!data.isEmpty()) {
			return new ResponseEntity<List<Client>>(data, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody Client cliente) {

		repository.save(cliente);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{dni}", method = RequestMethod.PUT)
	public ResponseEntity<?> update(@RequestBody Client cliente, @PathVariable String dni) {

		if (dni.equals(cliente.getDni())) {
			repository.save(cliente);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/{dni}", method = RequestMethod.DELETE)
	public ResponseEntity<Client> deleteByDni(@PathVariable String dni) {

		repository.deleteById(dni);
		return new ResponseEntity<Client>(HttpStatus.ACCEPTED);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public ResponseEntity<?> deletetAll() {

		repository.deleteAll();
		return new ResponseEntity<>(HttpStatus.ACCEPTED);

	}

}
