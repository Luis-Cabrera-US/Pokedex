package test;

import tipos.pokedex.Elementos;
import tipos.pokedex.FactoriaPokemon;
import tipos.pokedex.Generation;
import tipos.pokedex.Pokedex;

public class TestPokedex {

		


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pokedex Nacional = FactoriaPokemon.leerPokedex("data/Pokemon.csv");
		GetSize(Nacional);
		GetMediaPuntos(Nacional);
		GetExisteType(Nacional, Elementos.GRASS, Elementos.POISON);
		GetFiltradoGeneration(Nacional, Generation.KALOS);
		GetPokemonPorTipo(Nacional);
	}

	public static void GetSize(Pokedex Nacional) {
		System.out.println("==========================================================");
		String mensaje = String.format("\nLa Pokedex contiene información sobre %d Pokemons", 
				Nacional.PokedexSize());
		System.out.println(mensaje);
		System.out.println("\n==========================================================");
		
	}
	
	public static void GetMediaPuntos(Pokedex Nacional) {
		String mensaje = String.format("\nLa media de puntos de los pokemon es %f",
				Nacional.MediaPuntos());
		System.out.println(mensaje);
		System.out.println("\n==========================================================");
	}
	
	public static void GetExisteType (Pokedex Nacional, Elementos Type1, Elementos Type2) {
		
		String mensaje = String.format("\n¿Existe algún pokemon de tipo %s y %s?",
				Type1, Type2);
		System.out.println(mensaje);
		System.out.println(Nacional.ExistePokemonTipos(Type1, Type2));
		System.out.println("\n==========================================================");

		
	}
	
	public static void GetFiltradoGeneration(Pokedex Nacional, Generation G) {
		
		String mensaje = String.format("\nEsta es la lista de los pokemons la generación de %s \n%s",
				G, Nacional.PokemonsFiltradoGeneracion(G));
		System.out.println(mensaje);
		System.out.println("\n==========================================================");

	}
	
	public static void GetPokemonPorTipo(Pokedex Nacional) {
		
		System.out.println("\nEstos son los pokemons que hay de cada tipo primario");
		Nacional.PokemonPorTipoPrimario().forEach((k,v) -> System.out.println("\n" +k + "=" +v +"\n==========="));
		System.out.println("\n___________________________________________________________");
		Nacional.NumeroPokemonPorTipoPrimario().forEach((k,v) -> System.out.println("\n" +k + "=" +v +"\n==========="));
		System.out.println("\nEstos son los pokemons que hay por tipo secundario");
		Nacional.NumeroPokemonPorTipoSecundario().forEach((k,v) -> System.out.println("\n" +k + "=" +v +"\n==========="));

		System.out.println("\n==========================================================");
		
	}
}
