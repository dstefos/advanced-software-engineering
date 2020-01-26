
public class Charizard extends Pokemon
{
	
	public Charizard(String name, String typeOfPokemon, String sound, double height, double weight, String attack1,String attack2)
	{
		
		super(name, typeOfPokemon, sound, height, weight, attack1, attack2);
		
		
	}

	public void nameOfThePokemon()
    {
    	System.out.println("'Charizard'");
    	
    }
	
	public void typeOfThePokemon()
	{
		System.out.println("'Fire'");
		
	}
	
	public void soundOfThePokemon()
	{
		System.out.println("'Charizardddd'");
		
	}
	
	public void heightOfThePokemon()
	{
		System.out.println("'1.18'");
		
	}
	
	public void weightOfThePokemon()
	{
		System.out.println("'47.38'");
	}
	
	
    public void attack1OfThePokemon()
    {
    	System.out.println("1. 'Fire Spin'");
    	
    }
    
    public void attack2OfThePokemon()
    {
    	System.out.println("2. 'Overheat'");
    	
    }	
	
	
}
