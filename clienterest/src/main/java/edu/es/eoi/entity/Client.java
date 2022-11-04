package edu.es.eoi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "clientes")
@Getter
@Setter
public class Client {
	
	@Id
	private String dni;
	
	@Column(name = "nombre")
	private String name;
	
	@Column(name="direccion")
	private String address;

}
