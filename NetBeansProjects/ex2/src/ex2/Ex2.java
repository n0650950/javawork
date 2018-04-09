/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Matthew
 */
public class Ex2 {
	public static void main(String[] args) {
		/* check if no argument is passed */
		if (args.length != 2) {
			System.err.println("Usage: java ex2 <String> <int>");
			System.err.println("you mustsupply two argument values");
			System.exit(0);
		}
		else {
			String name = args[0]; // the first argument
			int num = Integer.parseInt(args[1]); // the second argument
			for (int i = 0; i < num; i++ ) {
				System.out.println("[" + i + "] " + name);
			}
		}
	}
}