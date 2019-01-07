import java.awt.Dimension;

import javax.swing.JFrame;

public class Window {

	public Window(int width, int height, String title, Game game) {
	
		JFrame frame = new JFrame(title);
		
		//set the scaling and size of the window
		frame.setPreferredSize(new Dimension(width, height));;
		frame.setMaximumSize(new Dimension(width, height));;
		frame.setMinimumSize(new Dimension(width, height));;
		
		//Setting different functions on the window 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		//adding out game to the JFrame so we can put something on the canvas
		frame.add(game);
		
	}	
}
