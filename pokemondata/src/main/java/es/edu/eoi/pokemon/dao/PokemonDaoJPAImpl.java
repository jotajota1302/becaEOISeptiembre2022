package es.edu.eoi.pokemon.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import es.edu.eoi.pokemon.entity.Pokemon;

public class PokemonDaoJPAImpl implements PokemoDAO {
	
	private EntityManager manager = Persistence.createEntityManagerFactory("POKEMON_DB").createEntityManager();
	
	@Override
	public Pokemon findPokemonByPokedexNumber(int number) {
		
		return manager.find(Pokemon.class, number);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pokemon> findAll() {
		
		Query query=manager.createQuery("from Pokemon");
		
		return query.getResultList();
		
	}

}
