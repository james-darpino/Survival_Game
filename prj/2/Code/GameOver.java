package FinalProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Random;

import FinalProject.Game.STATE;



public class GameOver implements ActionListener{

	
	private Game game; 
	private Handler handler;
	private HUD hud;
	private Random r = new Random();
	private Spawner spawner;

	
	
	public GameOver(Game game, Handler handler) {
		this.game = game;
		this.handler = handler;
	}




	public void tick() {

	}


	public void render(Graphics g) {
		//sets fonts of text and sizes that's displayed 
		Font fnt = new Font("arial", 1, 100);
		Font fnt2 = new Font("arial", 2, 75);


		g.setFont(fnt);
		g.setColor(Color.blue); //sets color of text
		g.drawString("Game Over", 690, 200); // sets what the text says and where it in in relation to gameover window 

		g.setFont(fnt2);
		g.setColor(Color.white);//sets color of text
		// sets what the text says and where it in in relation to gameover window 
		g.drawString("Better luck next time!" , 830, 475);

	}











	@Override
	public void actionPerformed(ActionEvent e) {
		if (HUD.HEALTH <= 0) {
		game.gameState = STATE.GameOver;
			
			}
		
	}
}
