package edu.es.eoi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	PersonaRepository repository;

	@Value("${jj.myproperty}")
	private String nombre;

	@GetMapping	
	public ResponseEntity<PersonaDto> find() {		
		
		System.out.println(nombre);
		
		Persona persona=repository.findById(1).get();
		
		PersonaDto personaDto= new PersonaDto();
		BeanUtils.copyProperties(persona, personaDto);
	
		List<Animal> animales=persona.getAnimales();
		List<AnimalDto> lista= new ArrayList<AnimalDto>();
		
		for (Animal animal : animales) {
			AnimalDto animalDto= new AnimalDto();
			BeanUtils.copyProperties(animal,animalDto);
			lista.add(animalDto);
		}
		
		personaDto.setAnimales(lista);
		
		return ResponseEntity.ok(personaDto);
		
	}

}
