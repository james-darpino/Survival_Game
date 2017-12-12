package FinalProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

import FinalProject.Game.STATE;

public class Player extends GameObject {

	Random r = new Random();
	Handler handler;




	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;



	}




	// hit box of player
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);

	}


	public void tick() {
		x += velX;
		y += velY;

		//keep player inside box
		x = Game.clamp(x, 0, Game.WIDTH - 37);
		y = Game.clamp(y, 0, Game.HEIGHT - 65);

		//allows collision with enemies to deduct player health 
		collision1();
		collision2();
		collision3();
		collision4();


	}



	public void render(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		//border that makes user take damage
		g.setColor(Color.white);
		g2d.draw(getBounds());

		//color and dimensions of player 
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);

	}

	//if border collides with enemy border you lose health for basic enemy 
	private void collision1() {
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			if(tempObject.getId() == ID.BasicEnemy) {
				if(getBounds().intersects(tempObject.getBounds())) {
					//collision code
					HUD.HEALTH -= 2;
				}
			}
		}
	}
	//if border collides with enemy border you lose health for advanced enemy 
	private void collision2() {
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			if(tempObject.getId() == ID.AdvancedEnemy) {
				if(getBounds().intersects(tempObject.getBounds())) {
					//collision code
					HUD.HEALTH -= 4;
				}
			}
		}
	}
	//if border collides with enemy border you lose health for super enemy 
	private void collision3() {
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			if(tempObject.getId() == ID.SuperEnemy) {
				if(getBounds().intersects(tempObject.getBounds())) {
					//collision code
					HUD.HEALTH -= 6;
				}
			}
		}
	}
	//if border collides with enemy border you lose health for boss enemy 
	private void collision4() {
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			if(tempObject.getId() == ID.BossEnemy) {
				if(getBounds().intersects(tempObject.getBounds())) {
					//collision code
					HUD.HEALTH -= 20;
				}
			}
		}
	}




}



