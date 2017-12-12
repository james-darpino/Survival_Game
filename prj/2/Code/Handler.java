package FinalProject;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler { //allows edits to be made to game objects

	LinkedList<GameObject> object = new LinkedList<GameObject>();

	public void tick() {
		for( int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);

			tempObject.tick();
		}
	}
	public void render (Graphics g) {
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);

			tempObject.render(g);
		}
	}

	//allows the addition of game objects to be put into the game
	public void addObject(GameObject object) {
		this.object.add(object);
	}

	//allows the removal of objects from the game
	public void removeObject(GameObject object) {
		this.object.remove(object);

	}
}
