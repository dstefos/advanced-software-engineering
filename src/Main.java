import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{   
		String option;
		int counter=0;
		boolean user=true;
		Pokemon pokemon1=new Pokemon("Pikachu","Electric","Pika Pika Pikachu",0.47,7.65,"Thunder Shock","Thunderbolt");
		Pokemon pikachu=new Pikachu("Pikachu","Electric","Pika Pika Pikachu",0.47,7.65,"Thunder Shock","Thunderbolt");
		Pokemon pokemon2=new Pokemon("Charizard","Fire","Charizardddd",1.18,47.38,"Fire Spin","Overheat");
		Pokemon charizard=new Charizard("Charizard","Fire","Charizardddd",1.18,47.38,"Fire Spin","Overheat");
		Pokemon pokemon3=new Pokemon("Jigglypuff","Normal","Jiggly-puuuff",0.34,2.12,"Feint Attack","Dazzling Gleam");
		Pokemon jigglypuff=new Jigglypuff("Jigglypuff","Normal","Jiggly-puuuff",0.34,2.12,"Feint Attack","Dazzling Gleam");
		Pokemon pokemon4=new Pokemon("Psyduck","Water","Psy-Psy-Psyduck",0.84,18.11,"Zen Headbutt","Aqua Tail");
		Pokemon psyduck=new Psyduck("Psyduck","Water","Psy-Psy-Psyduck",0.84,18.11,"Zen Headbutt","Aqua Tail");
		Pokemon pokemon5=new Pokemon("Gengar","Ghost","Gengaaar",1.37,30.49,"Shadow Claw","Focus Blast");
		Pokemon gengar=new Gengar("Gengar","Ghost","Gengaaar",1.37,30.49,"Shadow Claw","Focus Blast");
		Pokemon pokemon6=new Pokemon("Ekans","Poison","Ekanssss",2.09,7.36,"Acid","Poison Fang");
		Pokemon ekans=new Ekans("Ekans","Poison","Ekanssss",2.09,7.36,"Acid","Poison Fang");
		Pokemon pokemon7=new Pokemon("Alakazam","Psychic","Alakazaamm",1.66,51.36,"Psycho Cut","Future Sight");
		Pokemon alakazam=new Alakazam("Alakazam","Psychic","Alakazaamm",1.66,51.36,"Psycho Cut","Future Sight");
		Pokemon pokemon8=new Pokemon("Bulbasaur","Grass","Bulbasaurr",0.77,9.39,"Vine Whip","Seed Bomb");
		Pokemon bulbasaur=new Bulbasaur("Bulbasaur","Grass","Bulbasaurr",0.77,9.39,"Vine Whip","Seed Bomb");
		Pokemon pokemon9=new Pokemon("Onix","Rock","Ooonix",8.12,180.34,"Rock Throw","Heavy Slam");
		Pokemon onix=new Onix("Onix","Rock","Ooonix",8.12,180.34,"Rock Throw","Heavy Slam");
		Pokemon pokemon10=new Pokemon("Mankey","Fighting","Mankeyyyy",0.48,24.83,"Scratch","Cross Chop");
		Pokemon mankey=new Mankey("Mankey","Fighting","Mankeyyyy",0.48,24.83,"Scratch","Cross Chop");
		
		Pokemon[] pokemons=new Pokemon [] {pokemon1,pokemon2,pokemon3,pokemon4,pokemon5,pokemon6,pokemon7,pokemon8,pokemon9,pokemon10};
		
		while(user==true)
		{   System.out.println("Choose one Pokemon name ");
			for(Pokemon i:pokemons)
			{ 
				counter++;
				System.out.println(counter+". " +i.getName());
			}
			System.out.println(counter+1+". " +"Exit");    
			
			
			Scanner scan=new Scanner(System.in);
		    option=scan.nextLine();
		    
			switch(option)
			{
				case "Pikachu":
				    System.out.println("*********************************");
					pokemon1.nameOfThePokemon();
					pikachu.nameOfThePokemon();
					System.out.println("*********************************");
					pokemon1.typeOfThePokemon();
					pikachu.typeOfThePokemon();;
					System.out.println("*********************************");
					pokemon1.soundOfThePokemon();
					pikachu.soundOfThePokemon();
					System.out.println("*********************************");
					pokemon1.heightOfThePokemon();
					pikachu.heightOfThePokemon();
					System.out.println("*********************************");
					pokemon1.weightOfThePokemon();
					pikachu.weightOfThePokemon();
					System.out.println("*********************************");
					pokemon1.attack1OfThePokemon();
					pikachu.attack1OfThePokemon();
					System.out.println("*********************************");
					pokemon1.attack2OfThePokemon();
					pikachu.attack2OfThePokemon();
				    break;	
				case "Charizard": 		
				    System.out.println("*********************************");
					pokemon2.nameOfThePokemon();
					charizard.nameOfThePokemon();
					System.out.println("*********************************");
					pokemon2.typeOfThePokemon();
					charizard.typeOfThePokemon();;
					System.out.println("*********************************");
					pokemon2.soundOfThePokemon();
					charizard.soundOfThePokemon();
					System.out.println("*********************************");
					pokemon2.heightOfThePokemon();
					charizard.heightOfThePokemon();
					System.out.println("*********************************");
					pokemon2.weightOfThePokemon();
					charizard.weightOfThePokemon();
					System.out.println("*********************************");
					pokemon2.attack1OfThePokemon();
					charizard.attack1OfThePokemon();
					System.out.println("*********************************");
					pokemon2.attack2OfThePokemon();
					charizard.attack2OfThePokemon();
				    break;
				case "Jigglypuff":	
		    	    System.out.println("*********************************");
					pokemon3.nameOfThePokemon();
					jigglypuff.nameOfThePokemon();
					System.out.println("*********************************");
					pokemon3.typeOfThePokemon();
					jigglypuff.typeOfThePokemon();;
					System.out.println("*********************************");
					pokemon3.soundOfThePokemon();
					jigglypuff.soundOfThePokemon();
					System.out.println("*********************************");
					pokemon3.heightOfThePokemon();
					jigglypuff.heightOfThePokemon();
					System.out.println("*********************************");
					pokemon3.weightOfThePokemon();
					jigglypuff.weightOfThePokemon();
					System.out.println("*********************************");
					pokemon3.attack1OfThePokemon();
					jigglypuff.attack1OfThePokemon();
					System.out.println("*********************************");
					pokemon3.attack2OfThePokemon();
					jigglypuff.attack2OfThePokemon();
					break;
				case "Psyduck":
					System.out.println("*********************************");
					pokemon4.nameOfThePokemon();
					psyduck.nameOfThePokemon();
					System.out.println("*********************************");
					pokemon4.typeOfThePokemon();
					psyduck.typeOfThePokemon();;
					System.out.println("*********************************");
					pokemon4.soundOfThePokemon();
					psyduck.soundOfThePokemon();
					System.out.println("*********************************");
					pokemon4.heightOfThePokemon();
					psyduck.heightOfThePokemon();
					System.out.println("*********************************");
					pokemon4.weightOfThePokemon();
					psyduck.weightOfThePokemon();
					System.out.println("*********************************");
					pokemon4.attack1OfThePokemon();
					psyduck.attack1OfThePokemon();
					System.out.println("*********************************");
					pokemon4.attack2OfThePokemon();
					psyduck.attack2OfThePokemon();
					break;
				case "Gengar":
					System.out.println("*********************************");
					pokemon5.nameOfThePokemon();
					gengar.nameOfThePokemon();
					System.out.println("*********************************");
					pokemon5.typeOfThePokemon();
					gengar.typeOfThePokemon();;
					System.out.println("*********************************");
					pokemon5.soundOfThePokemon();
					gengar.soundOfThePokemon();
					System.out.println("*********************************");
					pokemon5.heightOfThePokemon();
					gengar.heightOfThePokemon();
					System.out.println("*********************************");
					pokemon5.weightOfThePokemon();
					gengar.weightOfThePokemon();
					System.out.println("*********************************");
					pokemon5.attack1OfThePokemon();
					gengar.attack1OfThePokemon();
					System.out.println("*********************************");
					pokemon5.attack2OfThePokemon();
					gengar.attack2OfThePokemon();
					break;
				case "Ekans":
					System.out.println("*********************************");
					pokemon6.nameOfThePokemon();
					ekans.nameOfThePokemon();
					System.out.println("*********************************");
					pokemon6.typeOfThePokemon();
					ekans.typeOfThePokemon();;
					System.out.println("*********************************");
					pokemon6.soundOfThePokemon();
					ekans.soundOfThePokemon();					
					System.out.println("*********************************");
					pokemon6.heightOfThePokemon();
					ekans.heightOfThePokemon();
					System.out.println("*********************************");
					pokemon6.weightOfThePokemon();
					ekans.weightOfThePokemon();
					System.out.println("*********************************");
					pokemon6.attack1OfThePokemon();
					ekans.attack1OfThePokemon();
					System.out.println("*********************************");
					pokemon6.attack2OfThePokemon();
					ekans.attack2OfThePokemon();
				    break;
				case "Alakazam":
					System.out.println("*********************************");
					pokemon7.nameOfThePokemon();
					alakazam.nameOfThePokemon();
					System.out.println("*********************************");
					pokemon7.typeOfThePokemon();
					alakazam.typeOfThePokemon();;
					System.out.println("*********************************");
					pokemon7.soundOfThePokemon();
					alakazam.soundOfThePokemon();					
					System.out.println("*********************************");
					pokemon7.heightOfThePokemon();
					alakazam.heightOfThePokemon();
					System.out.println("*********************************");
					pokemon7.weightOfThePokemon();
					alakazam.weightOfThePokemon();
					System.out.println("*********************************");
					pokemon7.attack1OfThePokemon();
					alakazam.attack1OfThePokemon();
					System.out.println("*********************************");
					pokemon7.attack2OfThePokemon();
					alakazam.attack2OfThePokemon();
					break;
				case "Bulbasaur":
					System.out.println("*********************************");
					pokemon8.nameOfThePokemon();
					bulbasaur.nameOfThePokemon();
					System.out.println("*********************************");
					pokemon8.typeOfThePokemon();
					bulbasaur.typeOfThePokemon();;
					System.out.println("*********************************");
					pokemon8.soundOfThePokemon();
					bulbasaur.soundOfThePokemon();					
					System.out.println("*********************************");
					pokemon8.heightOfThePokemon();
					bulbasaur.heightOfThePokemon();
					System.out.println("*********************************");
					pokemon8.weightOfThePokemon();
					bulbasaur.weightOfThePokemon();
					System.out.println("*********************************");
					pokemon8.attack1OfThePokemon();
					bulbasaur.attack1OfThePokemon();
					System.out.println("*********************************");
					pokemon8.attack2OfThePokemon();
					bulbasaur.attack2OfThePokemon();
					break;
				case "Onix":
					System.out.println("*********************************");
					pokemon9.nameOfThePokemon();
					onix.nameOfThePokemon();
					System.out.println("*********************************");
					pokemon9.typeOfThePokemon();
					onix.typeOfThePokemon();;
					System.out.println("*********************************");
					pokemon9.soundOfThePokemon();
					onix.soundOfThePokemon();					
					System.out.println("*********************************");
					pokemon9.heightOfThePokemon();
					onix.heightOfThePokemon();
					System.out.println("*********************************");
					pokemon9.weightOfThePokemon();
					onix.weightOfThePokemon();
					System.out.println("*********************************");
					pokemon9.attack1OfThePokemon();
					onix.attack1OfThePokemon();
					System.out.println("*********************************");
					pokemon9.attack2OfThePokemon();
					onix.attack2OfThePokemon();
					break;
				case "Mankey":
					System.out.println("*********************************");
					pokemon10.nameOfThePokemon();
					mankey.nameOfThePokemon();
					System.out.println("*********************************");
					pokemon10.typeOfThePokemon();
					mankey.typeOfThePokemon();;
					System.out.println("*********************************");
					pokemon10.soundOfThePokemon();
					mankey.soundOfThePokemon();					
					System.out.println("*********************************");
					pokemon10.heightOfThePokemon();
					mankey.heightOfThePokemon();
					System.out.println("*********************************");
					pokemon10.weightOfThePokemon();
					mankey.weightOfThePokemon();
					System.out.println("*********************************");
					pokemon10.attack1OfThePokemon();
					mankey.attack1OfThePokemon();
					System.out.println("*********************************");
					pokemon10.attack2OfThePokemon();
					mankey.attack2OfThePokemon();
					break;
				case "Exit":	
					System.out.println("'Game Over'");
					user=false;
					break;
				default:
					System.out.println(" 'This Pokemon does not exist,pick another one!!' ");
					break;
			}
		   
			System.out.println();
		}
	
		
		
		
		
		
	 }	
}
	
