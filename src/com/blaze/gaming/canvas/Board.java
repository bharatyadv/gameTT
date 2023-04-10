package com.blaze.gaming.canvas;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.blaze.gaming.sprites.OppnPlayer;
import com.blaze.gaming.sprites.Player;
import com.blaze.gaming.utils.GameConstants;

public class Board extends JPanel implements GameConstants {
	BufferedImage imageBg;
	private Player player;
	private OppnPlayer oppnPlayer;
	private Timer timer;
	private void gameLoop() {
		timer = new Timer(100, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				repaint();
			}
		});
		timer.start();
	}
	public Board() throws Exception {
		player = new Player();
		oppnPlayer = new OppnPlayer();
		loadBg();
		setFocusable(true);
		bindEvents();
		gameLoop();
		
		
}

	private void bindEvents() {
		KeyListener listener = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("Type "+e.getKeyCode()+" "+e.getKeyChar());
			}

			@Override
			public void keyPressed(KeyEvent e) {
				//left player
				if(e.getKeyCode()==KeyEvent.VK_A) {
					player.setSpeed(-speed);
					player.move();
					//repaint();
				}
				else if(e.getKeyCode()==KeyEvent.VK_D) {
					player.setSpeed(speed);
					player.move();
					//repaint();
				}
				else if(e.getKeyCode()==KeyEvent.VK_K) {
					player.setCurrentMove(kick);
				}
				else if(e.getKeyCode()==KeyEvent.VK_P) {
					player.setCurrentMove(punch);
				}
				
				//right player
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					oppnPlayer.setSpeed(-speed);
					oppnPlayer.move();
					//repaint();
				}
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					oppnPlayer.setSpeed(speed);
					oppnPlayer.move();
					//repaint();
				}
				// TODO Auto-generated method stub
				//System.out.println("Pressed "+e.getKeyCode()+" "+e.getKeyChar());
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("Release "+e.getKeyCode()+" "+e.getKeyChar());
			}
			
		};
		this.addKeyListener(listener);
	}
	@Override
	public void paintComponent(Graphics pen){
		printBg(pen);
		player.drawPlayer(pen);
		oppnPlayer.drawPlayer(pen);
	}
	
	
	private void printBg(Graphics pen){
		pen.drawImage(imageBg,0,0,GWIDTH,GHEIGHT,null);
	}
	
	private void loadBg() {
		try {
		imageBg =ImageIO.read(Board.class.getResource(bg_img));
		}
		catch (Exception e) {
			System.out.println("image not found");
			System.out.println(e);
			System.exit(0);
		}
	}
}
	
