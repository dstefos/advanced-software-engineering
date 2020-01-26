
public class Jigglypuff extends Pokemon
{

	public Jigglypuff(String name, String typeOfPokemon, String sound, double height, double weight, String attack1,String attack2)
	{
		
		super(name, typeOfPokemon, sound, height, weight, attack1, attack2);
		
		
	}

	public void nameOfThePokemon()
    {
    	System.out.println("'Jigglypuff'");
    	
    }
	
	public void typeOfThePokemon()
	{
		System.out.println("'Normal'");
		
	}
	
	public void soundOfThePokemon()
	{
		System.out.println("'Jiggly-puuuff'");
		
	}
	
	public void heightOfThePokemon()
	{
		System.out.println("'0.34'");
		
	}
	
	public void weightOfThePokemon()
	{
		System.out.println("'2.12'");
	}
	
	
    public void attack1OfThePokemon()
    {
    	System.out.println("1. 'Feint Attack'");
    	
    }
    
    public void attack2OfThePokemon()
    {
    	System.out.println("2. 'Dazzling Gleam'");
    	
    }
}
