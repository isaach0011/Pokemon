package poke.model;

public class Torkoal extends Pokemon implements Fire
{
	public Torkoal()
	{
		super("Torkoal", 324);
	}

	public Torkoal(String name)
	{
		super(name, 324);
	}
	
	public Torkoal(String name, int number)
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
}
