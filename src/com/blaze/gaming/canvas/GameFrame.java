package com.blaze.gaming.canvas;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	public GameFrame() {
		
		setTitle("To be Stree Fighter");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(1400,900);
		setLocationRelativeTo(null);
		Board board = new Board();
		add(board);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFrame obj = new GameFrame();
		
	}

}
