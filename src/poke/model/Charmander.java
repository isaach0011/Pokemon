package poke.model;

public class Charmander extends Pokemon implements Fire
{

	public Charmander()
	{
		super("Charmander", 4);
	}

	public Charmander(String name)
	{
		super(name, 4);
	}
	
	public Charmander(String name, int number)
	{
		super(name,number);
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
