package pokemon.controller;

import pokemon.model.Pokemon;
import pokemon.view.PokemonFrame;

public class PokemonController 
{
	private PokemonFrame baseFrame;
	
	public PokemonController()
	{
		baseFrame = new PokemonFrame(this);
	}
	
	public void start()
	{
		
	}
}
