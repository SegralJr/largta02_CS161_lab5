package largta02_CS161_lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BaseWindow extends JFrame {
	
	/*
	 * Taylor Large
	 * CS161
	 * Spring 2018
	 * Lab 5
	 */
	
	private JPanel west, east, center, middle;
	private JButton button;
	private JTextField text;
	private JLabel label;
	
	public BaseWindow(int length) { //Constructor
		super(">>>>> BASE WINDOW with COLORED COMPONENTS <<<<<");
		text = new JTextField(length); //Sets text box length to the parameter value Length
		setSize(800,450); //Sets the size of the GUI window
		setLocation(25, 15); //Sets the location of the GUI window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Defines what action will take place when the window is closed
		
		openWindow(); //Runs the openWindow() method to create the GUI
		setVisible(true); //Sets the GUI to be visible
	}
	
	public void openWindow() { //GUI
		
		Font font = new Font("Dialog", Font.BOLD, 98); //Declares a common font type

		JPanel west = new JPanel(); //Panel at the west portion of the GUI
		west.setBackground(Color.GREEN); //Sets west portion's background color
		
		JPanel east = new JPanel(); //Panel at the east portion of the GUI
		east.setBackground(Color.YELLOW); //Sets east portion's background color
		
		JPanel center = new JPanel(); //Panel at the center portion of the GUI
		center.setBackground(Color.LIGHT_GRAY); //Sets the center portion's background color
		
		JPanel middle = new JPanel(); //Panel at middle of the center portion of the GUI
		middle.setBackground(Color.DARK_GRAY); //Sets the middle portion's background color
		
		JButton button = new JButton("button!"); //Button in the middle of the GUI
		button.setBackground(Color.RED); //Sets the button's color
		
		text.setBackground(Color.PINK); //Sets the color of this text
		
		JLabel label = new JLabel("Middle panel!"); //Declares new JLabel text box
		label.setForeground(Color.CYAN); //Sets the color of the text box
		
		add(west, BorderLayout.WEST); //Adds the west panel to the west region of the GUI
		add(east, BorderLayout.EAST); //Adds the east panel to the east region of the GUI
		
		center.setLayout(new GridLayout(5,1)); //Divides the center region by 5 rows and 1 column
		center.add(new JLabel()); //Adds dummy row to indent
		center.add(new JLabel()); //Adds dummy row to indent
		center.add(middle); //Adds the middle panel to the middle of the center portion, row 3
		
		west.add(button); //Adds the button to the west portion of the GUI
		middle.add(label); //Adds the label to the middle portion of the GUI
		east.add(text); //Adds the text box to the east portion of the GUI
		
		add(center, BorderLayout.CENTER); //Adds the center panel
	}
	
}
