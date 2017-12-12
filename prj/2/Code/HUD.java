package FinalProject;

import java.awt.Color;
import java.awt.Graphics;

import FinalProject.Game.STATE;

public class HUD {

	public static int HEALTH = 1; //sets health to 200
	public static int healthValue = 200;
	private Game game;
	private int greenValue = 255; // sets health bar to be green 

	private int score = 0;
	private int level = 1;
	private STATE gameState;
	public void tick() {
		
		HEALTH = Game.clamp(HEALTH, 0, 200); // make sure health doesnt go above or below bar
		greenValue = Game.clamp(greenValue, 0, 255);
       
		greenValue = HEALTH;
		 
	

		score++; // makes score increase by surviving 



		} 
	
	public void setScore(int score) {
		this.score = score;
	}

	void Update()
	 {
	    if(HEALTH <= 0) {
	    	game.gameState = STATE.GameOver;
	    }
	 }


	public void render(Graphics g) {
		//upon taking damage the empty space in the box is gray
		g.setColor(Color.gray);
		g.fillRect(15, 15, 200, 32);

		g.setColor(new Color(75, greenValue, 0)); // makes Health turn red upon taking damage
		g.fillRect(15, 15, HEALTH , 32);

		// creates a white border around health box
		g.setColor(Color.white);
		g.drawRect(15, 15, 200, 32);

		g.drawString("Score: " + score, 15, 64);
		g.drawString("Level: " + level, 15, 80);
		 if(HEALTH <= 0) {
		    	gameState = STATE.GameOver;
		  }

	}

	public void score(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}





}
