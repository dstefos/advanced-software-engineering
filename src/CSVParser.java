
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVParser {
	
// Read pokemons' data from external CSV, and return an array list of Pokemons 
	public static Pokemon[] readData(String file) throws IOException { 
	    ArrayList<String[]> content = new ArrayList<>();
	    
//		Read CSV
	    try(BufferedReader br = new BufferedReader(new FileReader(file))) {
	        String line = "";
	        while ((line = br.readLine()) != null) {
	            content.add(line.split(","));
	        }
	    } catch (FileNotFoundException e) {
	    	System.out.println(file+" not found!");
	    }
	    
// 		Create a new Pokemon ArrayList and seed the above data
		Pokemon pokemons[] = new Pokemon[content.size()];		
		
//		For each line of the CSV data, create a new Pokemon instance according to the corresponding data
		for(int i=0; i<content.size(); i++) {
			String[] line=content.get(i);
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

//			Push the newly created Pokemon into the temp Pokemon ArrayList
			pokemons[i]=tempPokemon;
		}
		
	    return pokemons;
	}
	
	public static void main(String[] args) throws IOException {

		Pokemon[] lista=CSVParser.readData("pokemons.csv");
		
//		Print all pokemons in pokemons.csv
		for(Pokemon tempPokemon: lista) 
			System.out.println(tempPokemon);
		
	}
}
