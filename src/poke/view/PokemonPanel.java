package poke.view;

import javax.swing.*;
import poke.controller.PokemonController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;


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
		this.nameField = new JTextField(25);
		this.combatField = new JTextField(5);
		this.healthField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea(10,25);
		this.pokedexSelector = new JComboBox(new String [] {"Charmander", "Cyndaquil", "Ludicolo", "Snivy", "Totodile"});
		this.advancedLabel = new JLabel("Advanced Information");
		this.combatLabel = new JLabel("Combat Points:");
		this.healthLabel = new JLabel("Health Points:");
		this.speedLabel = new JLabel("Speed Points:");
		this.numberLabel = new JLabel("Pokemon Number:");
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
		baseLayout.putConstraint(SpringLayout.WEST, numberLabel, 148, SpringLayout.EAST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 8, SpringLayout.SOUTH, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonLabel, 14, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 25, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 2, SpringLayout.EAST, nameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, -385, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -31, SpringLayout.NORTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -30, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedLabel, 34, SpringLayout.SOUTH, speedLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 23, SpringLayout.SOUTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, healthLabel, -24, SpringLayout.NORTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, advancedLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.EAST, healthLabel, -337, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, combatLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 164, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 164, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedArea, 22, SpringLayout.SOUTH, advancedLabel);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 110, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 25, SpringLayout.SOUTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberField, -550, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, -69, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberField, -550, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, -69, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, combatField, -11, SpringLayout.NORTH, speedField);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, 198, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, speedField, -71, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 118, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, healthField, -13, SpringLayout.NORTH, combatField);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameField, -17, SpringLayout.NORTH, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, -71, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, -71, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -206, SpringLayout.EAST, this);
		
	}
	
	public void setupDropdown()
	{
		
	}
	
	public void setupListeners()
	{
		pokedexSelector.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				
			}
		});
		
		updateButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				
			}
		});
		
		this.addMouseListener(new MouseListener()

		{

			public void mouseEntered(MouseEvent entered)
			{
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse entered the program.");
			}

			public void mouseReleased(MouseEvent released)
			{
//				System.out.println("released");
			}

			public void mouseExited(MouseEvent exited)
			{
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse exited the program.");
			}

			public void mouseClicked(MouseEvent clicked)
			{
//				System.out.println("clicked");
			}

			public void mousePressed(MouseEvent pressed)
			{
//				System.out.println("pressed");
			}
			
		});
		
		this.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseDragged(MouseEvent dragged)
			{
				setRandomColor();
			}			

			public void mouseMoved(MouseEvent moved)
			{
//				if((Math.abs(moved.getX() - updateButton.getX()) < 5 ) || (Math.abs(moved.getY() - updateButton.getY()) < 5))
//				{
//					updateButton.setLocation(moved.getX() + 10, moved.getY() - 10);
//				}
			}
		});
	}
	
	private void setRandomColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	
	public void changeColorBasedOnData(String data)
	{
		if (data.contains("Fire"))
		{
			this.setBackground((Color.RED));
		}
		if (data.contains("Water"))
		{
			this.setBackground((Color.BLUE));
		}
		if (data.contains("Grass"))
		{
			this.setBackground((Color.GREEN));
		}
		else
		{
			this.setBackground((Color.DARK_GRAY));
		}
		
		repaint();
	}
	
	public void changeImageDisplay(String name)
	{
		String path = "/poke/view/images/";
		String defaultName = "quickball";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
	}
	
	public boolean isValidDouble(String input)
	{
		boolean isValid = false;
		
		try
		{
			double successful = Double.parseDouble(input);
			isValid = true;
		}
		catch (NumberFormatException userTypedSomething)
		{
			JOptionPane.showMessageDialog(this,  "Type in a valid double for speed");
			speedField.setText("");
		}
		
		return isValid;
	}
	
	public boolean isValidInteger(String input)
	{
		return false;
	}
	
	public boolean isValidname(String name)
	{
		return false;
	}
}


