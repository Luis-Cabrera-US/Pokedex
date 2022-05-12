package test;

import tipos.pokedex.FactoriaPokemon;
import tipos.pokedex.Pokedex;

public class TestFactoria {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testleerpokemon("data/Pokemon.csv");
		System.out.println("=============================");

	}

	
	private static void testleerpokemon(String ficherocsv) {
		
		System.out.println("Lectura de los datos de la Pokedex");
		Pokedex Pokemones = FactoriaPokemon.leerPokedex(ficherocsv);
		System.out.println(Pokemones);
		
	}
}
