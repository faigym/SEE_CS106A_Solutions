/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {

	private static final int SENTINEL = 0;
	
	
	public void run() {
		println("This program finds the largest and smallest numbers");
		int holding = readInt("? ");
		int largest = holding;
		int smallest = holding;
		
		if(holding == SENTINEL){
			println("Nice try, but you tried to quit and trick me.");
		}
		else{
			while(true){
				holding = readInt("? ");
				if(holding == SENTINEL){
					break;
				}
				if(holding > largest){
					largest = holding;
				}
				if(holding < smallest){
					smallest = holding;
				}
			}
			println("smallest: " + smallest);
			println("largest: " + largest);
		}
	}

}
