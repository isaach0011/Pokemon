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
		this.pokemonIcon = new ImageIcon(getClass().getResource("images/quickball.png"));
		this.updateButton = new JButton("Update the stats!");
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -206, SpringLayout.EAST, this);
		this.nameField = new JTextField(25);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameField, -516, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, -69, SpringLayout.EAST, this);
		this.combatField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, -71, SpringLayout.EAST, this);
		this.healthField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 34, SpringLayout.SOUTH, nameField);
		baseLayout.putConstraint(SpringLayout.SOUTH, healthField, -13, SpringLayout.NORTH, combatField);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, -71, SpringLayout.EAST, this);
		this.speedField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.SOUTH, combatField, -11, SpringLayout.NORTH, speedField);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, 198, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, speedField, -71, SpringLayout.EAST, this);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea(10,25);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 25, SpringLayout.SOUTH, advancedArea);
		this.pokedexSelector = new JComboBox(new String [] {"Charmander", "Cyndaquil", "Ludicolo", "Snivy", "Totodile"});
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 110, SpringLayout.WEST, this);
		this.advancedLabel = new JLabel("Advanced Information");
		baseLayout.putConstraint(SpringLayout.NORTH, advancedArea, 22, SpringLayout.SOUTH, advancedLabel);
		this.combatLabel = new JLabel("Combat Points:");
		this.healthLabel = new JLabel("Health Points:");
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, advancedLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.EAST, healthLabel, -337, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 24, SpringLayout.SOUTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, combatLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 40, SpringLayout.SOUTH, nameField);
		this.speedLabel = new JLabel("Speed Points:");
		baseLayout.putConstraint(SpringLayout.NORTH, advancedLabel, 34, SpringLayout.SOUTH, speedLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 23, SpringLayout.SOUTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedLabel, 0, SpringLayout.WEST, healthLabel);
		this.numberLabel = new JLabel("Pokemon Number:");
		baseLayout.putConstraint(SpringLayout.WEST, numberLabel, 1537, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, -6, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 6, SpringLayout.EAST, numberLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -18, SpringLayout.NORTH, nameField);
		this.nameLabel = new JLabel("Name:");
		baseLayout.putConstraint(SpringLayout.NORTH, nameLabel, 6, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, -2, SpringLayout.WEST, nameField);
		this.pokemonLabel = new JLabel("The current pokemon", pokemonIcon, JLabel.CENTER);
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 8, SpringLayout.SOUTH, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonLabel, 14, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 25, SpringLayout.WEST, this);
		
		
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


