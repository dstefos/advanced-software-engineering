
public class Ekans extends Pokemon
{
	public Ekans(String name, String typeOfPokemon, String sound, double height, double weight, String attack1,String attack2)
	{
		
		super(name, typeOfPokemon, sound, height, weight, attack1, attack2);
		
		
	}

	public void nameOfThePokemon()
    {
    	System.out.println("'Ekans'");
    	
    }
	
	public void typeOfThePokemon()
	{
		System.out.println("'Poison'");
		
	}
	
	public void soundOfThePokemon()
	{
		System.out.println("'Ekanssss'");
		
	}
	
	public void heightOfThePokemon()
	{
		System.out.println("'2.09'");
		
	}
	
	public void weightOfThePokemon()
	{
		System.out.println("'7.36'");
	}
	
	
    public void attack1OfThePokemon()
    {
    	System.out.println("1. 'Acid'");
    	
    }
    
    public void attack2OfThePokemon()
    {
    	System.out.println("2. 'Poison Fang'");
    	
    }	

}
