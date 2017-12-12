package FinalProject;

import java.util.Random;

public class Spawner {

	private Handler handler;
	private HUD hud;
	private Random r = new Random();

	//sets score to start at 0
	private int scoreKeep = 0;

	public Spawner(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}

	public void tick() {
		scoreKeep++;

		// every 250 points the player moves on to the next level 
		if(scoreKeep >= 250) {
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() +1); // sets level 1 number higher when 250 points goes by

			// Spawns enemies based on what level player is on
			if (hud.getLevel() == 2) {
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy));

			}else if (hud.getLevel() == 3) {
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy));

			}else if (hud.getLevel() == 4) {
				handler.addObject(new AdvancedEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.AdvancedEnemy));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy));
			}
			else if (hud.getLevel() == 5) {
				handler.addObject(new AdvancedEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.AdvancedEnemy));


			}else if (hud.getLevel() == 6) {
				handler.addObject(new AdvancedEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.AdvancedEnemy));
				handler.addObject(new SuperEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.SuperEnemy));

			}else if (hud.getLevel() == 7) {
				handler.addObject(new SuperEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.SuperEnemy));
				handler.addObject(new SuperEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.SuperEnemy));
				handler.addObject(new AdvancedEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.AdvancedEnemy));


			}else if (hud.getLevel() == 8) {
				handler.addObject(new AdvancedEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.AdvancedEnemy));
				handler.addObject(new AdvancedEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.AdvancedEnemy));
				handler.addObject(new SuperEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.SuperEnemy));
				handler.addObject(new SuperEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.SuperEnemy));
				handler.addObject(new BossEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BossEnemy));

			} else if (hud.getLevel() == 9) {
				handler.addObject(new SuperEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.SuperEnemy));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy));
				handler.addObject(new BossEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BossEnemy));

			} else if (hud.getLevel() == 10) {
				handler.addObject(new BossEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BossEnemy));
				handler.addObject(new BossEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BossEnemy));
				handler.addObject(new BossEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BossEnemy));

			}
		}
	}

	

	public void setScoreKeep(int scoreKeep) {
		this.scoreKeep = scoreKeep;
	}
}





