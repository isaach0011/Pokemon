package pokemon.model;

public abstract class Pokemon 
{
	private int healthPoints;
	private int attackPoints;
	private double speed;
	private int number;
	private String name;
	
	public Pokemon(String name, int number)
	{
		
	}
	
	public String getPokemonTypes()
	{
		return "";
	}
	
	public String toString()
	{
		return "";
	}
	
	public String getPokemonInformation()
	{
		return "";
	}
	
	public int getHealthPoints()
	{
		return healthPoints;
	}
	
	public int getAttackPoints()
	{
		return attackPoints;
	}
	
	public double getSpeed()
	{
		return speed;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}
	
	public void setAttackPoints(int attackPoints)
	{
		this.attackPoints = attackPoints;
	}
	
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
