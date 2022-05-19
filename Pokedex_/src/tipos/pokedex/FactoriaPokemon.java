package tipos.pokedex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FactoriaPokemon {

	public static Pokedex leerPokedex(String rutafichero) {
		
		Pokedex res = null;
		
		try {
			List<Pokemon> sv = Files.lines(Paths.get(rutafichero))
								.skip(1)
								.map(FactoriaPokemon :: parseaPokemon)
								.collect(Collectors.toList());
			res = new Pokedex(sv);
			
			
		} catch(IOException e) {
			
			System.out.println("No se ha encontrado el fichero de la ruta.");
			e.printStackTrace();
			
		}
		
		
		return res;
		
	}

	public static Pokemon parseaPokemon(String lineaCSV) {
		
		String[] dato = lineaCSV.split(",");
		
		Integer ID = Integer.parseInt(dato[0].trim());
		String Name = dato[1].trim();
		Elementos Type1 = Elementos.valueOf(dato[2].trim().toUpperCase());
		Elementos Type2 = Elementos.valueOf(dato[3].trim().toUpperCase());
		Integer HP = Integer.parseInt(dato[5].trim());
		Integer Attack = Integer.parseInt(dato[6].trim());
		Integer Defense = Integer.parseInt(dato[7].trim());
		Integer Sp_attack = Integer.parseInt(dato[8].trim());
		Integer Sp_defense = Integer.parseInt(dato[9].trim());
		Integer Speed = Integer.parseInt(dato[10].trim());
		Integer Total = Integer.parseInt(dato[4].trim());
		Generation Generacion = ParseaGeneration(dato[11].trim().toUpperCase());
		Boolean Legendary = Boolean.parseBoolean(dato[12].trim());
		String Antecesor = dato[13].trim();
		String Predecesor = dato[14].trim();




		
		
		
		return new Pokemon(ID, Name, Type1, Type2, HP, Attack, Defense, Sp_attack, Sp_defense,
				Speed, Total, Generacion, Legendary, Antecesor, Predecesor);
	}
	
	
	private static Generation ParseaGeneration(String valor) {
		
		Generation res = null;
		
		if (valor.equals("1")) {
			res = Generation.KANTO;
			
		}
		else if(valor.equals("2")) {
			res = Generation.JOHTO;

		}
		else if(valor.equals("3")) {
			res = Generation.HOENN;
		}
		else if(valor.equals("4")) {
			res = Generation.SINNOH;
	
		}
		else if(valor.equals("5")) {
			res = Generation.TESELIA;
		}
		else if(valor.equals("6")) {
			res = Generation.KALOS;
		}
		else if(valor.equals("7")) {
			res = Generation.ALOLA;
		}
		else {
			res = Generation.GALAR;
		}
		
		return res;
	}
}
