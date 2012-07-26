/*	
 * 	File: FilledCircle.java
 * 	-----------------------
 * 	This file defines a graphical object that appears
 * 	as a filled circle.
 * 
 */


import acm.graphics.*;
import java.awt.*;

/**	This class creates a GObject subclass that
 * 	is almost identical to GOval except that it
 * 	creates a filled GOval object with equal
 * 	width and height (a circle).
 * @author Ansh SHukla
 *
 */



public class FilledCircle extends GOval {

/**	Creates a new Filled Circle with specified bounds */
	public FilledCircle(double x, double y, double radius){
		super(x - radius, y - radius, radius, radius);
		setFilled(true);
	}
	
/* Creates a new Filled Circle with specified bounds and color. */
	public FilledCircle(double x, double y, double radius,
									Color color) {
		this(x, y, radius);
		setColor(color);
	}

}
