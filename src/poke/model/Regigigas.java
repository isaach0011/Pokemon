package poke.model;

public class Regigigas extends Pokemon implements Normal
{
	public Regigigas()
	{
		super("Regigigas", 486);
	}

	public Regigigas(String name)
	{
		super(name, 486);
	}
	
	public Regigigas(String name, int number)
	{
		super(name, number);
	}
	
	public int HyperBeam()
	{
		return 9999999;
	}
	
	public int MegaPunch()
	{
		return 1;
	}
}

