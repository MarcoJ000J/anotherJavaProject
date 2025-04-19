package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	// Configurações da tela
	
	final int originalTileSize = 16; // tamanho dos sprites
	final int scale = 3; // multiplier value of the reescaling
	
	final int titleSize = originalTileSize * scale; // o tamanho final 48 X 48
	
	//tamanho da tela
	
	final int maxScreenCol = 16; // quantidades de colunas na tela 
	final int maxScreenRow = 12; // quantidades de linhas na tela  == 4 : 3 (16 : 12)
	
	final int screenWidth = titleSize * maxScreenCol; // 768 pixels
	final int screenHeigth = titleSize * maxScreenRow; // 576 pixels 
	
	Thread gameThread;
	
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeigth));
		this.setBackground(Color.BLACK);
		this.setDoubleBuffered(true);
		
	}
	
	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.run();
	}

	@Override
	public void run() {
		
		while(gameThread != null) {
			
		}
		
	}
}
