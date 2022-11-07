package edu.es.eoi.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ClienteDto {
	
	@JsonProperty(value = "nif")
	private String dni;

	@JsonProperty(value = "name")
	private String nombre;	
	
	@JsonProperty(value = "address")
	private String direccion;		
	
	@JsonIgnore
	private String password;


}
