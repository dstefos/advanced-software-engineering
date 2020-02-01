import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args) throws IOException
	{   
		boolean user=true;

		CsvParser parser= new CsvParser("test.csv");
		
		ArrayList<String[]> inputList=parser.readData();
		
		ArrayList<Pokemon> pokemons=new ArrayList<Pokemon>();
		
		for(String[] line: inputList) {
				String name=line[0];
				String typeOfPokemon=line[1];
				String sound=line[2];
				double weight=Double.valueOf(line[3]);
				double height=Double.valueOf(line[4]);
				String attack1=line[5];
				String attack2=line[6];
				
				Pokemon tempPokemon=new Pokemon(name, typeOfPokemon, sound, weight, height, attack1, attack2);
				pokemons.add(tempPokemon);
		}
		
		while(user==true)
		{   
			int counter=0;
			System.out.println("Choose one number ");
			for(Pokemon i:pokemons)
			{ 
				System.out.println(counter+". " +i.getName());
				counter++;
			}
			System.out.println("Negative number. Exit");    
			
			
			Scanner scan=new Scanner(System.in);
		    int option=scan.nextInt();
		    if(option<0) {
		    	System.out.println("Game over");
			   	System.exit(0);
		    }
		    else if(option>pokemons.size()-1) {
		    	System.out.println("Pokemon not found! Try Again");
		    	continue;
		    }
		    
		    System.out.println("*********************************");
		    
		    Pokemon selected=pokemons.get(option);	
			
			System.out.println("Name: "+selected.getName());
			System.out.println("Type: "+selected.getTypeOfPokemon());
			System.out.println("Sound: "+selected.getSound());
			System.out.println("Height: "+selected.getHeight());
			System.out.println("Weight: "+selected.getWeight());
			System.out.println("Attack1: "+selected.getAttack1());
			System.out.println("Attack2: "+selected.getAttack2());
		    System.out.println("*********************************"); 
			

		   
			System.out.println();
		}
	
		
		
		
		
		
	 }	
}
	
