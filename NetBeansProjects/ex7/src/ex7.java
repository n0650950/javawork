
import java.io.*;

import java.util.*;


class ex7 {
    
 //declare constant Strings
 final static String PROMPT = "Enter data: ";
 final static String QUIT = "quit";
 final static String PARAMS = "You should supply three values";
 public static void main(String[] args) {
   //variables
   BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
   StringTokenizer st = null;
   String reply = null;
   double width = 0.0, height = 0.0, length = 0.0, volume = 0.0;
   ex7.printIntro();
   // loop forever
   while (true) {
    try {
     System.out.print(PROMPT);
     reply = kbd.readLine().trim();
     // test if we have toquit
     if (reply.startsWith(QUIT)) {
      break;
     } else {
      // parse items in line
      st = new StringTokenizer(reply);
      if (st.countTokens() < 3) {
       System.out.println(PARAMS);
      } else {
       width = Double.valueOf(st.nextToken().trim()).doubleValue();
       height = Double.valueOf(st.nextToken().trim()).doubleValue();
       length = Double.valueOf(st.nextToken().trim()).doubleValue();
       volume = width * height * length;
       System.out.println("Volume of this cuboid is " + volume);
      }
     }
    } catch (IOException ioe) {} // do nothing if error
   }
  } //end of main method
  /*A method called in the main*/
 static void printIntro() {
   System.out.println("A simple program to calculate the volume of aCuboid");
   System.out.println("When prompted please supply three values in the order");
   System.out.println("Width then Height then Length separated by spaces");
   System.out.println("or type quit to finish");
   System.out.println();
  } //end of printIntro method
} // end ex7 class