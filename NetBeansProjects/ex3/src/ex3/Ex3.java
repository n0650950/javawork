/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author Matthew
 */
import java.io.*;
class Ex3 {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.err.println("Usage: java Ex3 <file> <from> <to>");
			System.err.println("you must supply three argument values");
			System.exit(0);
		}
		else {
			String fileName = args[0]; // the first argument
			int from = Integer.parseInt(args[1]); // the second argument
			int to = Integer.parseInt(args[2]); // third argument

			// now create the filestream and connect PrintWriter
			try {
				FileWriter fout = new FileWriter(fileName,false);
				PrintWriter pout = new PrintWriter(fout,true);
				//write to the file
				for (int i = from; i < to; i++ ) {
 					pout.println(i);
				}
				pout.close(); // close the stream
 			}
			catch (IOException e) {
				System.err.println("Error! - " + e.getMessage());
			}
		}
	}
}
