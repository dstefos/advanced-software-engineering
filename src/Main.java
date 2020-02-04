import java.io.IOException;
import java.util.ArrayList;

public class Main
{

	public static void main(String[] args) throws IOException
	{   
		CSVParser parser= new CSVParser("pokemons.csv");
		ArrayList<String[]> inputList = parser.readData();		
		ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();		
		for(String[] line: inputList) {			
			int id = Integer.parseInt(line[0]);					
			String name = line[1];			
			String typeofpokemon = line[2];		
			String typeofpokemon2 = line[3];
			int total =	Integer.parseInt(line[4]);			
			int hp =	Integer.parseInt(line[5]);
			int attack = Integer.parseInt(line[6]);			
			int defence =	Integer.parseInt(line[7]);			
			int attack2 = Integer.parseInt(line[8]);			
			int defence2 =	Integer.parseInt(line[9]);		
			int speed =	Integer.parseInt(line[10]);
			int generation =	Integer.parseInt(line[11]);			
			boolean legendary = Boolean.parseBoolean(line[12]);			
			Pokemon tempPokemon=new Pokemon(id,name,typeofpokemon,typeofpokemon2,total,hp,attack,defence,attack2,defence2,speed,generation,legendary);			
			pokemons.add(tempPokemon);
		}
	 }	
}