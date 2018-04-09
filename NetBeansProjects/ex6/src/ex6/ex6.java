
import java.io.*;

import java.util.*;

class ex6 {
 public static void main(String[] args) {
  if (args.length != 1) {
   System.err.println("Usage: java ex6 <file>");
   System.err.println("you must supply the name of the file");
   System.exit(0);
  } else {
   String fileName = args[0]; // the first argument
   // now create the filestream and connect PrintWriter
   // the value true enables autoflushing
   try {
    FileReader fin = new FileReader(fileName);
    BufferedReader din = new BufferedReader(fin);
    System.out.println("Data in file " + fileName + "is ");
    //read from the file
    String line = null; // line of text
    int numPoints = 0; // running total of points

    while ((line = din.readLine()) != null) {
     // here we have read in a line of text
     // now parse line to extract data and print it out to the screen
     StringTokenizer st = new StringTokenizer(line, ",");

     int x = Integer.parseInt(st.nextToken().trim());
     int y = Integer.parseInt(st.nextToken().trim());

     numPoints++;
     System.out.println("\tx=" + x + ", y=" + y + ", x*y=" + (x * y));
    }
    System.out.println("There are " + numPoints + " points in this file");
    din.close(); // close the stream
   } catch (IOException e) {
    System.err.println("Error! - " + e.getMessage());
   }
  }
 }
}