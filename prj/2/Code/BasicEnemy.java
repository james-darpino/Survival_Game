package FinalProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class BasicEnemy extends GameObject {

	public BasicEnemy(int x, int y, ID id) {
		super(x, y, id);

		//sets the speed of enemy
		velX = 5;
		velY = 5;

	}

	// gives enemy a hit box for the player to run into
	public Rectangle getBounds() {
		return new Rectangle(x, y, 16, 16);

	}

	public void tick() {

		x += velX;
		y += velY;

		//keeps enemy inside box and bouncing off walls
		if (y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
		if (x <= 0 || x >= Game.WIDTH - 16) velX *= -1;
	}


	//sets color and dimensions of enemy 
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, 16, 16);

	}

}
