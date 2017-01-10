package poke.model;

public class Shaymin extends Pokemon implements Grass
{
	public Shaymin()
	{
		super("Shaymin", 492);
	}

	public Shaymin(String name)
	{
		super(name, 492);
	}
	
	public Shaymin(String name, int number)
	{
		super(name, number);
	}
	
	public int VineWhip()
	{
		return 34;
	}
	
	public int GigaDrain()
	{
		return 25;
	}
}
