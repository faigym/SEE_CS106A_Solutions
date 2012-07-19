/*
 * File: Target.java
 * ------------------
 * This program is a stub for the Target problem, which displays
 * a target by adding concentric circles to the canvas.
 */

import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class Target extends GraphicsProgram {

	private static final int OUTSIDE_RING_RADIUS = 72;
	private static final double MIDDLE_RING_RADIUS = 46.8;
	private static final double INSIDE_RING_RADIUS = 21.6;
	
	public void run() {
		double centerX = (double) getWidth()/2;
		double centerY = (double) getHeight()/2;
		GOval outside = new GOval(centerX - (OUTSIDE_RING_RADIUS)/2, centerY - (OUTSIDE_RING_RADIUS)/2, OUTSIDE_RING_RADIUS, OUTSIDE_RING_RADIUS);
		outside.setColor(Color.RED);
		outside.setFilled(true);
		add(outside);
		
		GOval middle = new GOval(centerX - (MIDDLE_RING_RADIUS)/2, centerY - (MIDDLE_RING_RADIUS)/2, MIDDLE_RING_RADIUS, MIDDLE_RING_RADIUS);
		middle.setColor(Color.WHITE);
		middle.setFilled(true);
		middle.setFillColor(Color.WHITE);
		add(middle);
		
		GOval inside = new GOval(centerX - (INSIDE_RING_RADIUS)/2, centerY - (INSIDE_RING_RADIUS)/2, INSIDE_RING_RADIUS, INSIDE_RING_RADIUS);
		inside.setColor(Color.RED);
		inside.setFilled(true);
		add(inside);
	}

}
