import java.io.IOException;
import java.util.ArrayList;

public class Main
{

	public static void main(String[] args) throws IOException
	{   
//		Read data from external CSV
		ArrayList<Pokemon> pokemons = CSVParser.readData("pokemons.csv");		
		
//		Print all pokemons
		for(Pokemon tempPokemon:pokemons)
			System.out.println(tempPokemon);
	 }	
}