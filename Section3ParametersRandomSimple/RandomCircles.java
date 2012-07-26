/*
 * File: RandomCircles.java
 * ---------------------
 * This program generates a set of circles drawn with three
 * randomly selected attributes: color, radius, and position
 * with the requirement that no circle is allowed to be drawn
 * even partially out of the visible canvas. 
 */

import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class RandomCircles extends GraphicsProgram {
	private RandomGenerator rgen = new RandomGenerator();
	
	public void run() {
	for(int i = 0; i < 10; i++){
		double radius = rgen.nextDouble(5, 50);
		double centerx = rgen.nextDouble(radius, getWidth() - radius);
		double centery = rgen.nextDouble(radius, getHeight() - radius);
		add(new FilledCircle(centerx, centery, radius, rgen.nextColor()));
	}
	}
	
}

