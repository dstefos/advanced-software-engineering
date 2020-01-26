
public class Pikachu extends Pokemon
{  
	
	public Pikachu(String name, String typeOfPokemon, String sound, double height, double weight, String attack1,String attack2)
	{
		
		super(name, typeOfPokemon, sound, height, weight, attack1, attack2);
		
		
	}

	public void nameOfThePokemon()
    {
    	System.out.println("'Pikachu'");
    	
    }
	
	public void typeOfThePokemon()
	{
		System.out.println("'Electric'");
		
	}
	
	public void soundOfThePokemon()
	{
		System.out.println("'Pika Pika Pikachu'");
		
	}
	
	public void heightOfThePokemon()
	{
		System.out.println("'0.47m'");
		
	}
	
	public void weightOfThePokemon()
	{
		System.out.println("'7.65kg'");
	}
	
	
    public void attack1OfThePokemon()
    {
    	System.out.println("1. 'Thunder Shock'");
    	
    }
    
    public void attack2OfThePokemon()
    {
    	System.out.println("2. 'Thunderbolt'");
    	
    }
	

}
