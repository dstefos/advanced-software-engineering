import java.io.IOException;

public class Main
{

	public static void main(String[] args) throws IOException
	{   
//		Read data from external CSV
		Pokemon[] pokemons = CSVParser.readData("pokemons.csv");		
		
//		Print all pokemons
		for(Pokemon tempPokemon:pokemons)
			System.out.println(tempPokemon);
	 }	
}