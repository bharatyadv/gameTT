package com.blaze.gaming.sprites;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.blaze.gaming.utils.GameConstants;

public class OppnPlayer extends CommonPlayer implements GameConstants {
	public OppnPlayer() throws IOException {
		x = GWIDTH - 300;
		h = w = player_dimension;
		y = FLOOR - h;
		image = ImageIO.read(OppnPlayer.class.getResource(oppn_player_img));
		
	}
	@Override
	public BufferedImage walk() {
	return image.getSubimage(rs1,rs2,rs3,rs4); 
}

}
