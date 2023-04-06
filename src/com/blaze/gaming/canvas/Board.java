package com.blaze.gaming.canvas;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Board extends JPanel {
	BufferedImage imageBg;
	public Board() {
		loadBg();
		
}
	@Override
	public void paintComponent(Graphics pen){
		printBg(pen);
		
	}
	private void printBg(Graphics pen){
		pen.drawImage(imageBg,0,0,1400,900,null);
	}
	private void loadBg() {
		try {
		imageBg =ImageIO.read(Board.class.getResource("bg.jpg"));
		}
		catch (Exception e) {
			System.out.println("image not found");
			System.out.println(e);
			System.exit(0);
		}
	}
}
	
