package com.blaze.gaming.sprites;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import com.blaze.gaming.utils.GameConstants;

public class Player extends CommonPlayer implements GameConstants {
	
	private BufferedImage walkImage[] = new BufferedImage[6];
	private BufferedImage kickImage[] = new BufferedImage[6];
	public Player() throws Exception {
		image = ImageIO.read(Player.class.getResource(player_img));
		x = 100;
		w = h = player_dimension;
		y = FLOOR - h;
		loadwalkImage();
		
	}
	private void loadwalkImage() {
		walkImage[0] = image.getSubimage(63, 237, 73, 97);
		walkImage[1] = image.getSubimage(142, 237, 73, 97);
		walkImage[2] = image.getSubimage(224, 237, 73, 97);
		walkImage[3] = image.getSubimage(303, 237, 73, 97);
		walkImage[4] = image.getSubimage(375, 237, 73, 97);
		walkImage[5] = image.getSubimage(453, 237, 73, 97);
	}
	
	private void lodakickImage() {
		kickImage[0] = image.getSubimage(37, 1044, 73, 102);
		kickImage[1] = image.getSubimage(120, 1044, 73, 102);
		kickImage[2] = image.getSubimage(202, 1044, 118, 104);
		kickImage[3] = image.getSubimage(332,1044, 73, 102);
		kickImage[4] = image.getSubimage(404,1044, 73, 102);
		kickImage[5] = image.getSubimage(482, 1048, 97, 102);
	}
	@Override
	public BufferedImage defaultImage() {
		if(imageIndex>5)
			imageIndex=0;
		
		BufferedImage img = walkImage[imageIndex];
		imageIndex++;
		return img;
	}
	
	@Override
	public BufferedImage walk() {
	return image.getSubimage(ls1,ls2,ls3,ls4); 
}
	
	

	
	

}
