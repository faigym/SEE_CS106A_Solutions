/*
 * File: GraphicsHierarchy.java
 * ----------------------------
 * This program is a stub for the GraphicsHierarchy problem, which
 * draws a partial diagram of the acm.graphics hierarchy.
 */

import acm.program.*;
import acm.graphics.*;

public class GraphicsHierarchy extends GraphicsProgram {
	
	private static final int BOX_WIDTH = 185;
	private static final int BOX_HEIGHT = 60;
	private static final int VERTICAL_PADDING = 90;
	private static final int HORIZONTAL_PADDING = 40;
	double ONE_HORIZONTAL_UNIT = BOX_WIDTH + HORIZONTAL_PADDING;
	
	public void run() {
		printBoxesLabels();
		printLines();
	}

	private void printBoxesLabels(){
		double startX = (getWidth() - (3 * BOX_WIDTH + 2 * HORIZONTAL_PADDING))/(double) 2;
		double startY = ((double) getHeight() / 2) + ((double) VERTICAL_PADDING / 2);
		double midX = (double) BOX_WIDTH / 2;
		double midY = (double) BOX_HEIGHT / 2;
		
		for(int i=0; i < 3; i++){
			GRect bottom = new GRect(startX + i*(ONE_HORIZONTAL_UNIT), startY, BOX_WIDTH, BOX_HEIGHT);
			add(bottom);
			switch (i){
			case 0:	
				GLabel graphics = new GLabel("GraphicsProgram", startX + i*(ONE_HORIZONTAL_UNIT), startY); 	
				graphics.move(midX - (graphics.getWidth() / 2), midY + (graphics.getAscent() / 2));
				add(graphics);
				break;
			case 1: 
				GLabel console = new GLabel("ConsoleProgram", startX + i*(ONE_HORIZONTAL_UNIT), startY); 		
				console.move(midX - (console.getWidth() / 2), midY + (console.getAscent() / 2));
				add(console);
				break;
			case 2: 
				GLabel dialog = new GLabel("DialogProgram", startX + i*(ONE_HORIZONTAL_UNIT), startY); 			
				dialog.move(midX - (dialog.getWidth() / 2), midY + (dialog.getAscent() / 2));
				add(dialog);
				break;
			}
		}
		
		GRect top = new GRect(startX + BOX_WIDTH + HORIZONTAL_PADDING, ((double) getHeight()/2) - ((double) VERTICAL_PADDING / 2) - BOX_HEIGHT, BOX_WIDTH, BOX_HEIGHT);
		add(top);
		GLabel program = new GLabel("Program", startX + BOX_WIDTH + HORIZONTAL_PADDING, ((double) getHeight()/2) - ((double) VERTICAL_PADDING / 2) - BOX_HEIGHT);
		program.move(midX - (program.getWidth() / 2), midY + (program.getAscent() / 2));
		add(program);
	}
	
	private void printLines(){
		double fixedX = (double) getWidth() / 2;
		double fixedYTop = ((double) getHeight() / 2) - ((double) VERTICAL_PADDING / 2);
		double fixedYBottom = ((double) getHeight() / 2) + ((double) VERTICAL_PADDING / 2);
		double baseX = (getWidth() - (3 * BOX_WIDTH + 2 * HORIZONTAL_PADDING))/(double) 2 + (BOX_WIDTH / (double) 2);
		for(int i = 0; i<3; i++){
			add(new GLine(fixedX, fixedYTop, baseX + i*ONE_HORIZONTAL_UNIT, fixedYBottom));
		}
	}
	
}
