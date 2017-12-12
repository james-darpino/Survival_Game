package FinalProject;

import java.awt.Canvas;
import java.awt.Dimension;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends Canvas{


	private static final long serialVersionUID = -4421869432853622923L;

	public Window(int width, int height, String title, Game game) {
		//creates the pop up window 
		JFrame frame = new JFrame(title);


		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));

		// allows user to exit the program when they click the X at the top of the window 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		frame.pack();


		frame.setResizable(false); //Doesn't allow user to resize the window
		frame.setLocationRelativeTo(null); // starts window in middle of screen
		frame.add(game); 
		frame.setVisible(true); // allows the user to see the window
		game.start(); //starts the window e



	}
}
