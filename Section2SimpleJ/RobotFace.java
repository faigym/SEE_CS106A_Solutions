/* RobotFace.java
 * 
 * This program will draw a robot-looking face in the program window
 * such that it has two yellow eyes, a head, and a mouth.
 * 
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class RobotFace extends GraphicsProgram {
	
	private static final int HEAD_WIDTH = 90;
	private static final int HEAD_HEIGHT = 160;
	private static final int EYE_RADIUS = 10;
	private static final int MOUTH_WIDTH = 60;
	private static final int MOUTH_HEIGHT = 20;
	
	public void run(){
		double windowHeight = getHeight();
		double windowWidth = getWidth();
		
		double headX = (windowWidth / 2) - ((double) HEAD_WIDTH / 2);
		double headY = (windowHeight / 2) - ((double) HEAD_HEIGHT / 2);
		drawHead(headX, headY);
		
		double eye1X = headX + (0.25 * (double) HEAD_WIDTH);
		double eyeY = headY + (0.25 * (double) HEAD_HEIGHT);
		double eye2X = headX + (0.75 * (double) HEAD_WIDTH);
		
		drawEye(eye1X, eyeY);
		drawEye(eye2X, eyeY);
		
		double mouthX = headX + ((double) HEAD_WIDTH / 2) - ((double) MOUTH_WIDTH / 2);
		double mouthY = headY + (0.75 * (double) HEAD_HEIGHT);
		drawMouth(mouthX, mouthY);
		
	}

	
	private void drawEye(double x, double y){
		GOval eye = new GOval(x - EYE_RADIUS, y - EYE_RADIUS, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		eye.setFilled(true);
		eye.setFillColor(Color.YELLOW);
		eye.setColor(Color.YELLOW);
		add(eye);
	}

	private void drawHead(double x, double y){
		GRect head = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		head.setColor(Color.BLACK);
		add(head);
	}
	
	private void drawMouth(double x, double y){
		GRect mouth = new GRect(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		add(mouth);
	}
}


