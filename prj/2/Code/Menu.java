package FinalProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import FinalProject.Game.STATE;

public class Menu extends MouseAdapter{

	private Game game; 
	private Handler handler;
	private Random r = new Random();

	public Menu(Game game, Handler handler) {
		this.game = game;
		this.handler = handler;
	}
	// registers a mouse click
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();

		//if user clicks within the dimensions then the game state switches to Game
		if(mouseOver(mx, my,710, 450, 500, 200)) {
			game.gameState = STATE.Game;

			//when game state is Game the player will spawn and a basic enemy will also spawn 
			handler.addObject(new Player(Game.WIDTH / 2 - 32, Game.HEIGHT / 2 - 32, ID.Player, handler));
			handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy));


		}
	}

	private boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
		if( mx > x && mx < x + width) {
			if(my > y && my < y + height) {
				return true;
			}else
				return false;
		}else
			return false;
	}
	public void mouseReleased(MouseEvent e) {

	}



	public void tick() {

	}


	public void render(Graphics g) {
		//sets fonts and sizes of text that's displayed 
		Font fnt = new Font("arial", 1, 100);
		Font fnt2 = new Font("arial", 2, 75);

		g.setFont(fnt);
		g.setColor(Color.blue);//sets color of text
		g.drawString("Project MC", 690, 200);// sets what the text says and where it in in relation to menu window 

		g.setColor(Color.white);//sets color of text
		g.drawRect(710, 450, 500, 200); // draws rectangle where the play button is placed

		g.setFont(fnt2);
		g.setColor(Color.white);//sets color of text
		g.drawString("Play", 875, 575);// sets what the text says and where it in in relation to menu window 

	}

}
