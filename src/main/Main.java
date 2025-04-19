package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setTitle("Nuh uh...");
		
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		
		window.pack(); // set size to the "insered"
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
