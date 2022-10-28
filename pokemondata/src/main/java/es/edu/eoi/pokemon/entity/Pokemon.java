package es.edu.eoi.pokemon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "pokemon", name = "pokemon")
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int numero_pokedex;
	
	@Column(name = "nombre")
	private String name;
	
	@Column(name = "peso")
	private double weight;
	
	@Column(name = "altura")
	private double height;
	
	@OneToOne(mappedBy = "pokemon")
	private Estadisticas estadisticas;

	public int getNumero_pokedex() {
		return numero_pokedex;
	}

	public void setNumero_pokedex(int numero_pokedex) {
		this.numero_pokedex = numero_pokedex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pokemon [numero_pokedex=" + numero_pokedex + ", name=" + name + ", weight=" + weight + ", height="
				+ height + ", estadisticas=" + estadisticas + "]";
	}



	
	
	
}
