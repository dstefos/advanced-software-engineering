
public class Psyduck extends Pokemon
{
	public Psyduck(String name, String typeOfPokemon, String sound, double height, double weight, String attack1,String attack2)
	{
		
		super(name, typeOfPokemon, sound, height, weight, attack1, attack2);
		
		
	}

	public void nameOfThePokemon()
    {
    	System.out.println("'Psyduck'");
    	
    }
	
	public void typeOfThePokemon()
	{
		System.out.println("'Water'");
		
	}
	
	public void soundOfThePokemon()
	{
		System.out.println("'Psy-Psy-Psyduck'");
		
	}
	
	public void heightOfThePokemon()
	{
		System.out.println("'0.84'");
		
	}
	
	public void weightOfThePokemon()
	{
		System.out.println("'18.11'");
	}
	
	
    public void attack1OfThePokemon()
    {
    	System.out.println("1. 'Zen Headbutt'");
    	
    }
    
    public void attack2OfThePokemon()
    {
    	System.out.println("2. 'Aqua Tail'");
    	
    }	
	

}
