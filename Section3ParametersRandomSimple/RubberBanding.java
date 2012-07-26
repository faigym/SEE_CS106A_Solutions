/*	This program creates a GLabel object with
 * 	starting (x,y) at the user's first mouse 
 * 	click and ending (x,y) following the user's
 * 	mouse until the mouse button is released.
 */



import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.event.*;


public class RubberBanding extends GraphicsProgram {
	
	public void run(){
		add(new GLabel("Click and drag anywhere in the console to draw a line", 20, 20));
		addMouseListeners();
	}
	
	private GLine line;
	
	public void mousePressed(MouseEvent e){
		line = new GLine (e.getX(), e.getY(), e.getX(), e.getY());
		add(line);
	}
	
	public void mouseDragged(MouseEvent e){
		line.setEndPoint(e.getX(), e.getY());
	}
	
	public static final int APPLICATION_WIDTH = 500;
	public static final int APPLICATION_HEIGHT = 500;
}

