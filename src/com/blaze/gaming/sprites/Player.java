package com.blaze.gaming.sprites;

import java.awt.image.BufferedImage; 

import javax.imageio.ImageIO;

import com.blaze.gaming.utils.GameConstants;

public class Player extends CommonPlayer implements GameConstants {
	
	
	public Player() throws Exception {
		image = ImageIO.read(Player.class.getResource(player_img));
		x = 100;
		w = h = player_dimension;
		y = FLOOR - h;
		
	}
	@Override
	public BufferedImage walk() {
	return image.getSubimage(ls1,ls2,ls3,ls4); 
}
	

	
	

}
