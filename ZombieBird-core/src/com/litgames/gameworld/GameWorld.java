package com.litgames.gameworld;

import com.litgames.gameobjects.Bird;
import com.litgames.gameobjects.ScrollHandler;

public class GameWorld {
	private Bird bird;
	private ScrollHandler scroller;
	
	public GameWorld(int midPointY) {
		// Initialize Bird here
		bird = new Bird(33, midPointY - 5, 17, 12);
		// The grass should start 66 pixels below the midPointY
		scroller = new ScrollHandler(midPointY + 66);
	}
	
	public void update(float delta) {
		bird.update(delta);
		scroller.update(delta);
	}
	
	public Bird getBird() {
		return bird;
	}
	
	public ScrollHandler getScroller() {
		return scroller;
	}
}
