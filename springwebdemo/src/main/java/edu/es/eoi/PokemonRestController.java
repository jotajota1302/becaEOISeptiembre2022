package edu.es.eoi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pokemon")
public class PokemonRestController {
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Pokemon> findAll(){
		
		System.out.println("buscalos a todos");
		
		Pokemon p= new Pokemon();
		p.setNombre("Pickachu");
		p.setPokedex(23);
		
		ArrayList<Pokemon> pokemons=new ArrayList<>();
		pokemons.add(p);
		pokemons.add(p);
		
		return pokemons;
	}	
	
	@RequestMapping(value = "/{pokedex}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Pokemon> findOne(@PathVariable(name = "pokedex") String pokedex) {
		
		Pokemon p= new Pokemon();
		p.setNombre("random pokemon");
		p.setPokedex(Integer.valueOf(pokedex));
		
		return new ResponseEntity<>(p,HttpStatus.OK);
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity create(@RequestParam String pokedex, @RequestParam String nombre) {
		
		Pokemon p= new Pokemon();
		p.setNombre(nombre);
		p.setPokedex(Integer.valueOf(pokedex));
		
		System.out.println("he creado el pokemon " + nombre);
		
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/{pokedex}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteOne(@PathVariable(name = "pokedex") String pokedex) {
				
		System.out.println("borro el elemento con baja logica" + pokedex);
	}
	

	@RequestMapping(method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteAll() {
				
		System.out.println("borro todos los pokemon");
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
	@ResponseBody
	public void update(@RequestParam Integer pokedex, @RequestParam String nombre,@PathVariable(name = "id") Integer id) {
		
		if(pokedex!=id) {
			System.out.println("Error");
		}else {
			System.out.println("Actualizo el pokemon numero " + id);
		}
		
	}
	

}
