package FinalProject;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject {

	protected int x, y; // protected allows us to only have to initialize once
	protected ID id;
	protected int velX, velY;
	

	public GameObject(int x, int y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	public abstract Rectangle getBounds();
	
	public void setX(int x) {
		this.x = x;
		
	}
	
	public void setY(int y) {
		this.y = y;
		
	}
	
	public int getX(int x) {
		return x;
		
	}
	
	public int getY(int y) {
		return y;
		
	}
	
	public void setId(ID id) {
		this.id = id;
		
	}
	public ID getId() {
		return id;
	}
	
	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}

}
