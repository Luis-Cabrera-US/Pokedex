package tipos.pokedex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pokedex {
	
	private List<Pokemon> PokedexNacional;

	public Pokedex() {
		// TODO Auto-generated constructor stub
		PokedexNacional = new ArrayList<>();
	}
	
	
	public Pokedex(Collection<Pokemon> Coleccion) {
		this.PokedexNacional = new ArrayList<Pokemon>(Coleccion);
	}
	
	public Pokedex(Stream<Pokemon> Poke) {
		this.PokedexNacional = Poke.collect(Collectors.toList());
	}


	public Integer PokedexSize() {
		
		return PokedexNacional.size();
		
	}
	
	public void AddPokemon(Pokemon P) {
		
		PokedexNacional.add(P);
		
	}
	
	public Double MediaPuntos() {
		
		Double res = 0.0;
		Double suma = 0.0;
		Double size = (double) PokedexNacional.size();
		
		for(Pokemon p : PokedexNacional) {	
			suma += p.getTotal();
			
		}
		if(size >= 0) {
			res = suma/size;
		}
		
		return res;
	}
	
	public Boolean ExistePokemonTipos(Elementos Type_1, Elementos Type_2 ) {
		Boolean res = null;
		
		for(Pokemon p: PokedexNacional) {
			
			if(p.getType1().equals(Type_1) || p.getType2().equals(Type_1)) {
				
				res = true;
				if(p.getType2().equals(Type_2)|| p.getType1().equals(Type_2)) {
					res = true;
				}

			}
			
			else {
				res = false;
			}
		}
		
		return res;
	}
	
	
	public List<String> PokemonsFiltradoGeneracion(Generation G){
		List<String> res = null;
		
		res = PokedexNacional.stream()
				.filter(pokemon -> pokemon.getGeneracion().equals(G))
				.map(pokemon -> pokemon.getName())
				.collect(Collectors.toList());
		
		return res;
	}
	
	public Map<Elementos, List<String>> PokemonPorTipoPrimario(){
		Map<Elementos, List<String>> res = null;
		
		res = PokedexNacional.stream()
				.collect(Collectors.groupingBy(Pokemon :: getType1, 
						Collectors.mapping(Pokemon:: getName, Collectors.toList())));
		
		return res;
	}
	
	public Map<Elementos, Long> NumeroPokemonPorTipoPrimario(){
		Map<Elementos, Long> res = null;
		
		res = PokedexNacional.stream()
				.collect(Collectors.groupingBy(Pokemon:: getType1,
						Collectors.counting()));
		
		


		Map<Elementos, Long> sortedres = res.entrySet().stream()
				.sorted(Map.Entry.comparingByValue() )
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
						(e1, e2) -> e1, LinkedHashMap::new));
				
		
		
		return sortedres;
	}
	
	public Map<Elementos, Long> NumeroPokemonPorTipoSecundario(){
		Map<Elementos, Long> res = null;
		
		res = PokedexNacional.stream()
				.collect(Collectors.groupingBy(Pokemon:: getType2,
						Collectors.counting()));
		
		Map<Elementos, Long> sortedres = res.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
						(e1, e2) -> e1, LinkedHashMap::new));
				
		
		
		return sortedres;
	}
	

	public List<String> ObtenerLineaEvolutivaPokemon(String Name) {
		
		List<String> res = null;
		
		for(Pokemon P : PokedexNacional) {
			
			if(P.getName().equals(Name)) {
				
				while(P.getAntecesor() != "NONE") {
					
					res.add(P.getName());
					
				}
				
			}
		}
		
		
		return res;
	}
	
	
	@Override
	public String toString() {
		return "Pokedex [PokedexNacional=" + PokedexNacional + "]";
	}

}
