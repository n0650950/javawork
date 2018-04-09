/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;
import java.io.*;

/**
 *
 * @author Matthew
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("points.txt")){            
            int x = 1;
            int y = 10;
            for (int counter = 0; counter < 10; counter++){
                writer.println(x + "," + y);
                x++;
                y--;                      
            }
            writer.close();
        } catch (FileNotFoundException idk) {
            System.err.println("file doesnt exist" + idk);
        }
        

    }
    
}
