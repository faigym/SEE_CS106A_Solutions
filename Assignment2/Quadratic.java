/*
 * File: Quadratic.java
 * --------------------
 * This program is a stub for the Quadratic problem, which finds the
 * roots of the quadratic equation.
 */

import acm.program.*;

public class Quadratic extends ConsoleProgram {

	public void run() {
		println("Enter values to compute Pythagorean theorem.");
		double a = readInt("a: ");
		double b = readInt("b: ");
		double c = Math.sqrt(a*a + b*b);
		println("c = " + c);
	}

}

