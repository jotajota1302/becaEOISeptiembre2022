package edu.es.eoi.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ClienteDto {
	
	private String dni;

	private String nombre;
	
	private String direccion;		
	@JsonIgnore
	private String password;


}
