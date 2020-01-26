
public class Bulbasaur extends Pokemon
{
	public Bulbasaur(String name, String typeOfPokemon, String sound, double height, double weight, String attack1,String attack2)
	{
		
		super(name, typeOfPokemon, sound, height, weight, attack1, attack2);
		
		
	}

	public void nameOfThePokemon()
    {
    	System.out.println("'Bulbasaur'");
    	
    }
	
	public void typeOfThePokemon()
	{
		System.out.println("'Grass'");
		
	}
	
	public void soundOfThePokemon()
	{
		System.out.println("'Bulbasaurr'");
		
	}
	
	public void heightOfThePokemon()
	{
		System.out.println("'0.77'");
		
	}
	
	public void weightOfThePokemon()
	{
		System.out.println("'9.39'");
	}
	
	
    public void attack1OfThePokemon()
    {
    	System.out.println("1. 'Vine Whip'");
    	
    }
    
    public void attack2OfThePokemon()
    {
    	System.out.println("2. 'Seed Bomb'");
    	
    }	

}
