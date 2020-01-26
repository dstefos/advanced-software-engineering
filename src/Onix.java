
public class Onix extends Pokemon
{
	public Onix(String name, String typeOfPokemon, String sound, double height, double weight, String attack1,String attack2)
	{
		
		super(name, typeOfPokemon, sound, height, weight, attack1, attack2);
		
		
	}

	public void nameOfThePokemon()
    {
    	System.out.println("'Onix'");
    	
    }
	
	public void typeOfThePokemon()
	{
		System.out.println("'Rock'");
		
	}
	
	public void soundOfThePokemon()
	{
		System.out.println("'Ooonix'");
		
	}
	
	public void heightOfThePokemon()
	{
		System.out.println("'8.12'");
		
	}
	
	public void weightOfThePokemon()
	{
		System.out.println("'180.34'");
	}
	
	
    public void attack1OfThePokemon()
    {
    	System.out.println("1. 'Rock Throw'");
    	
    }
    
    public void attack2OfThePokemon()
    {
    	System.out.println("2. 'Heavy Slam'");
    	
    }	

}
