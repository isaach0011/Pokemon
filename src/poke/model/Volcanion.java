package poke.model;

public class Volcanion extends Pokemon implements Fire, Water
{
	public Volcanion()
	{
		super("Volcanion", 721);
	}

	public Volcanion(String name)
	{
		super(name, 721);
	}
	
	public Volcanion(String name, int number)
	{
		super(name, number);
	}
	
	public int Overheat()
	{
		return this.getAttackPoints() * 9;
	}
	
	public int Ember()
	{
		return 20;
	}
	
	public int Surf() 
	{
		return 76;
	}

	public int WaterGun() 
	{
		return 7;
	}
}
