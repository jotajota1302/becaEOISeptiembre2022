package es.edu.eoi.pokemon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema="pokemon",name = "estadisticas_base")
public class Estadisticas {

	@Id
	public int numero_pokedex;
	
	@Column(name = "ps")
	private int health;
	
	@Column(name = "ataque")
	private int attack;
	
	@Column(name = "defensa")
	private double defense;	

	@Column(name = "especial")
	private double special;	

	@Column(name = "velocidad")
	private double speed;
	
	@OneToOne()
	@JoinColumn(name = "numero_pokedex")
    @MapsId
	private Pokemon pokemon;

	public int getNumero_pokedex() {
		return numero_pokedex;
	}

	public void setNumero_pokedex(int numero_pokedex) {
		this.numero_pokedex = numero_pokedex;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public double getDefense() {
		return defense;
	}

	public void setDefense(double defense) {
		this.defense = defense;
	}

	public double getSpecial() {
		return special;
	}

	public void setSpecial(double special) {
		this.special = special;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "[health=" + health + ", attack=" + attack + ", defense=" + defense + ", special=" + special
				+ ", speed=" + speed + "]";
	}
	
	
	
}
