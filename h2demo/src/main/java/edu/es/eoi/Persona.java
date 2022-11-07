package edu.es.eoi;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "persona")
@Getter
@Setter
public class Persona {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String address;
	
	@OneToMany(targetEntity = Animal.class)
	private List<Animal> animales;
	
}
