package pokemon.view;

import pokemon.controller.PokemonController;

import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private SpringLayout baseLayout;
	private ImageIcon pokemonIcon;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokemonPanel(PokemonController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource(""));
		this.updateButton = new JButton("Update the stats!");
		this.nameField = new JTextField(25);
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, 71, SpringLayout.NORTH, this);
		this.combatField = new JTextField(5);
		this.healthField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, 34, SpringLayout.SOUTH, healthField);
		this.speedField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, 33, SpringLayout.SOUTH, combatField);
		baseLayout.putConstraint(SpringLayout.WEST, speedField, 0, SpringLayout.WEST, healthField);
		this.numberField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberField, -47, SpringLayout.NORTH, healthField);
		this.advancedArea = new JTextArea(10,25);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedArea, -111, SpringLayout.SOUTH, this);
		this.pokedexSelector = new JComboBox(new String [] {"Charmander", "Cyndaquil", "Ludicolo", "Snivy{", "Totodile"});
		baseLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, 0, SpringLayout.EAST, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 165, SpringLayout.SOUTH, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 298, SpringLayout.EAST, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 64, SpringLayout.SOUTH, updateButton);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 75, SpringLayout.WEST, this);
		this.advancedLabel = new JLabel("Advanced Information");
		this.combatLabel = new JLabel("Combat Points:");
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 6, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, combatLabel, -122, SpringLayout.WEST, nameField);
		this.healthLabel = new JLabel("Health Points:");
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 73, SpringLayout.SOUTH, nameField);
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.EAST, healthLabel, -337, SpringLayout.EAST, this);
		this.speedLabel = new JLabel("Speed Points:");
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 0, SpringLayout.NORTH, combatLabel);
		this.numberLabel = new JLabel("Pokemon Number:");
		baseLayout.putConstraint(SpringLayout.EAST, speedLabel, 0, SpringLayout.EAST, numberLabel);
		this.nameLabel = new JLabel("Name:");
		this.pokemonLabel = new JLabel("The current pokemon", pokemonIcon, JLabel.CENTER);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	public void setupPanel()
	{
		this.setLayout(baseLayout);;
		this.setPreferredSize(new Dimension(900, 600));
		this.setBackground(Color.DARK_GRAY);
		
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);
		
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		this.add(pokedexSelector);
		this.add(healthField);
		this.add(healthLabel);
		this.add(combatField);
		this.add(combatLabel);
		this.add(speedField);
		this.add(speedLabel);
		this.add(nameField);
		this.add(nameLabel);
		this.add(numberField);
		this.add(numberLabel);
		this.add(advancedLabel);
		this.add(advancedArea);
		this.add(pokemonLabel);
		this.add(updateButton);
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		
	}
}


