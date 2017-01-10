package poke.model;

public class Suicune extends Pokemon implements Water
{
	public Suicune()
	{
		super("Suicune", 245);
	}

	public Suicune(String name)
	{
		super(name, 245);
	}
	
	public Suicune(String name, int number)
	{
		super(name,number);
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
