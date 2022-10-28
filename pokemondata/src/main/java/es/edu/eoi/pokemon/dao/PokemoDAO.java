package es.edu.eoi.pokemon.dao;

import java.util.List;

import es.edu.eoi.pokemon.entity.Pokemon;

public interface PokemoDAO {

	Pokemon findPokemonByPokedexNumber(int number);
	
	List<Pokemon> findAll();

}