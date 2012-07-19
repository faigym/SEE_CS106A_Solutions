/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */


import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	public void run() {
		println("This program lists the Fibonacci sequence");
		int a = 0;
		int b = 1;
		int c;
		println(a);
		println(b);
		while(a + b < 10000){
			c = a + b;
			println(c);
			a = b;
			b = c;
		}
		
		
	}
}


