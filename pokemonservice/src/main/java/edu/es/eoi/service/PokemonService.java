package edu.es.eoi.service;

import java.util.List;

import es.edu.eoi.pokemon.dao.PokemoDAO;
import es.edu.eoi.pokemon.dao.PokemonDaoJPAImpl;
import es.edu.eoi.pokemon.entity.Pokemon;

public class PokemonService {
	
	public PokemoDAO dao= new PokemonDaoJPAImpl();
	
	public Pokemon findPokemonById(int id) {
		
		return dao.findPokemonByPokedexNumber(id);
		
	}
	
	public void fight(Pokemon a, Pokemon b) {
		
		//lucharan y me devolvera los pokemon con el estado que tengan
		
		
	}
	
	public List<Pokemon> findAll(){
		
		return dao.findAll();
		
	}
	

}
