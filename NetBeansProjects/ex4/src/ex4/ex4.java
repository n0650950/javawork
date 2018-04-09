/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author Matthew
 */
import java.io.*;


import java.util.*;
        

class ex4 {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: java ex4 <file>");
			System.err.println("you must supply the name of the file");
			System.exit(0);
		}
		else {
			String fileName = args[0]; // the first argument
			// now create the filestream and connect PrintWriter
			// the value true enables autoflushing
			try {
				FileReader fin = new FileReader(fileName);
				BufferedReader din = new BufferedReader(fin);
				System.out.println("Data in file " + fileName + " is: ");
				//read from the file
				String line = null; // line of text
				int sum = 0; // running total of numbers

				while ((line = din.readLine()) != null) {
					// here we have read in a line of text
					// now parse line to extract data and print it out to the screen
					int value = Integer.parseInt(line);
					sum += value;

					System.out.println("\t" + value);
				}
				System.out.println("Sum of numbers in file was " + sum);
				din.close(); // close the stream
			}
			catch (IOException e) {
				System.err.println("Error! - " + e.getMessage());
			}
		}
	}
} 