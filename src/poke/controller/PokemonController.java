package poke.controller;

import java.util.ArrayList;

import poke.model.Pokemon;
import poke.view.PokemonFrame;

public class PokemonController 
{
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame baseFrame;
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		baseFrame = new PokemonFrame(this);
	}
	
	public void start()
	{
		
	}
}
