/*
 * File: Hailstone.java
 * --------------------
 * This program is a stub for the Hailstone problem, which computes
 * Hailstone sequence described in Assignment #2.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {

		
	public void run() {
		int n = readInt("Enter a number: ");
		int counter = 0;
		while(n != 1){
			if (n % 2 == 0){
				print(n + " is even, so I take half: ");
				n /= 2;
				println(n);
			}
			else{
				print(n + " is odd, so I make 3n + 1: ");
				n = 3*n + 1;
				println(n);
			}
			counter ++;
		}
		println("The process took " + counter + " steps to reach 1");
	}

}
