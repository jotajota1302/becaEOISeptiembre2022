package edu.es.eoi;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonaDto {

	private int id;	
	
	private String name;	
	
	private String address;
	
	private List<AnimalDto> animales;
	
}
