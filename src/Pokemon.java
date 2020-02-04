
public class Pokemon 
{	
	
	private int id,total,hp,attack,defence,attack2,defence2,speed,generation;
	private String name,typeOfPokemon,typeOfPokemon2;
	private boolean isLegendary;

	public Pokemon(int id, String name, String typeOfPokemon, String typeOfPokemon2, int total, int hp, int attack, int defence, int attack2, int defence2, int speed, int generation, boolean isLegendary)
	{   
		this.id = id;
		this.name = name;
		this.typeOfPokemon = typeOfPokemon;		
		this.typeOfPokemon2 = typeOfPokemon2;
		this.total = total;
		this.hp = hp;
		this.attack= attack;
		this.defence = defence;
		this.attack2 = attack2;
		this.defence2 = defence2;
		this.speed = speed;
		this.generation = generation;
		this.isLegendary = isLegendary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getAttack2() {
		return attack2;
	}

	public void setAttack2(int attack2) {
		this.attack2 = attack2;
	}

	public int getDefence2() {
		return defence2;
	}

	public void setDefence2(int defence2) {
		this.defence2 = defence2;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGeneration() {
		return generation;
	}

	public void setGeneration(int generation) {
		this.generation = generation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeOfPokemon() {
		return typeOfPokemon;
	}

	public void setTypeOfPokemon(String typeOfPokemon) {
		this.typeOfPokemon = typeOfPokemon;
	}

	public String getTypeOfPokemon2() {
		return typeOfPokemon2;
	}

	public void setTypeOfPokemon2(String typeOfPokemon2) {
		this.typeOfPokemon2 = typeOfPokemon2;
	}

	public boolean isLegendary() {
		return isLegendary;
	}

	public void setLegendary(boolean isLegendary) {
		this.isLegendary = isLegendary;
	}

}
