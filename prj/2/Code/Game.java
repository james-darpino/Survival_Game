package FinalProject;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferStrategy;
import java.util.Random;

import FinalProject.Game.STATE;


public class Game extends Canvas implements Runnable{


	private static final long serialVersionUID = -8505977986526312639L;

	//creates the dimensions of the game window
	public static final int WIDTH  = 1920, HEIGHT = 1080 ;
	private Thread thread;
	private boolean running = false;

	//allows these classes to be used 
	private Random r;
	private Handler handler;
	private HUD hud;
	private Spawner spawner;
	private Menu menu;
	private GameOver gameOver;
	private Player player;

	//creates multiple game States
	public enum STATE {
		Menu,
		Game, 
		GameOver
	};

	//sets game state to Menu as default 
	public STATE gameState = STATE.Menu;

	public Game() {

		handler = new Handler();
		menu = new Menu(this, handler);
		gameOver = new GameOver(this, handler);
		

		//lets program listen to key and mouse movements 
		this.addKeyListener(new KeyInput(handler));
		this.addMouseListener(menu);
	
		
			
	
		// creates window with the title of the game at the top
		new Window(WIDTH, HEIGHT, "Project MC", this);

		hud = new HUD();
		spawner = new Spawner(handler, hud);
		r = new Random(); // allows enemies to spawn at random locations 

		//if the game is in game state Game then the player and a basic enemy spawns 
		if(gameState == STATE.Game) {
			handler.addObject(new Player(WIDTH / 2 - 32, HEIGHT / 2 - 32, ID.Player, handler));
			handler.addObject(new BasicEnemy(r.nextInt(WIDTH), r.nextInt(HEIGHT), ID.BasicEnemy));

		}	



	}

	//starts the game 
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
		if (HUD.HEALTH < 1) {
			gameState = STATE.GameOver;
		}
	}
	//stops the game
	public synchronized void stop() {
		try {
			
				running = false;
				thread.join();
				gameState = STATE.GameOver;

		


		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	//Game loop
	public void run() {
		this.requestFocus(); 
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(running) {
			
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1) {
				tick();
				delta--;
			}
			if(running)
				render();
			frames++;

			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println("FPS: " + frames);

				frames = 0;
			
				
			} else if (HUD.HEALTH < 1) {
				gameState = STATE.GameOver;
				
			
			}
		}
		stop();
	}

	private void tick() {
		handler.tick();
		if ( gameState == STATE.Game) {
			hud.tick();
			spawner.tick();
		}else if (gameState == STATE.Menu) {
			menu.tick();
		}else if(HUD.HEALTH <= 0) {
	    	gameState = STATE.GameOver;
	    	gameOver.tick();
	  }


	}


	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}


		Graphics g = bs.getDrawGraphics();

		// sets background color
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);




		handler.render(g);

		// creates a switching of game states
		if (gameState == STATE.Game) {
			hud.render(g);
		}else if (gameState == STATE.Menu) {
			menu.render(g);
		}else if(HUD.HEALTH <= 0) {
	    	gameState = STATE.GameOver;
	    	gameOver.render(g);
	    	
	  }


		

		g.dispose();
		bs.show();
	}

	// makes it so a value can't go above or below the min or max
	//this is used to make sure enemies and player can't go outside of the game box
	public static int clamp(int var, int min, int max) {
		if ( var >= max)
			return var = max;
		else if (var <= min)
			return var = min;
		else
			return var;
	}

	public static void main(String args[]) {

		new Game();



	}
}
