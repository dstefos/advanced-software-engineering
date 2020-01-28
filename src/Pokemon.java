
public class Pokemon 
{
	
	private String name;
	private String typeOfPokemon;
	private String sound;
	private double weight;
	private double height;
	private String attack1;
	private String attack2;
	
	
	public Pokemon(String name,String typeOfPokemon,String sound,double height,double weight,String attack1,String attack2)
	{   
		this.name=name;
		this.typeOfPokemon=typeOfPokemon;
		this.sound=sound;
		this.weight=weight;
		this.height=height;
		this.attack1=attack1;
		this.attack2=attack2;
		
	}
    
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getTypeOfPokemon() 
	{
		return typeOfPokemon;
	}

	public void setTypeOfPokemon(String typeOfPokemon) 
	{
		this.typeOfPokemon = typeOfPokemon;
	}

	public String getSound() 
	{
		return sound;
	}

	public void setSound(String sound)
	{
		this.sound = sound;
	}

	public double getHeight() 
	{
		return height;
	}

	public void setHeight(double height) 
	{
		this.height = height;
	}
	
	public double getWeight() 
	{
		return weight;
	}

	public void setWeight(double weight) 
	{
		this.weight = weight;
	}

	public String getAttack1() 
	{
		return attack1;
	}

	public void setAttack1(String attacks) 
	{
		this.attack1 = attacks;
	}


	public String getAttack2() {
		return attack2;
	}

	public void setAttack2(String attack2)
	{
		this.attack2 = attack2;
		
	}
	
//    public void nameOfThePokemon()
//    {
//    	System.out.println("The name of Pokemon is: ");
//    	
//    }
//	
//    public void typeOfThePokemon()
//    {
//    	System.out.println("The type of Pokemon is: ");	
//    	
//    }
//    
//    public void soundOfThePokemon()
//    {
//    	System.out.println("Pokemon is making a sound: ");
//    	
//    }
//    
//    public void heightOfThePokemon()
//    {
//    	System.out.println("The height of Pokemon is: ");
//    	
//    }
//    
//    public void weightOfThePokemon()
//    {
//    	System.out.println("The weight of Pokemon is: ");
//    	
//    }
//    
//    public void attack1OfThePokemon()
//    {
//    	System.out.println("Pokemon's first attack is: ");
//    	
//    }
//    
//    public void attack2OfThePokemon()
//    {
//    	System.out.println("Pokemon's second attack is: ");
//    	
//    }
    
 
}
