import java.net.*;
import java.io.*;

public class ex8server {
   public static void main(String[] args) throws IOException {
       

        ServerSocket server = new ServerSocket(9090);
        
        
        while (true) {
            System.out.println("Waiting for connection...");
            Socket client = server.accept();
            DataInputStream inFromClient = new DataInputStream(client.getInputStream());
            String text = inFromClient.readUTF();
            String newtext = text.toUpperCase();
            DataOutputStream outToClient = new DataOutputStream(client.getOutputStream());
            outToClient.writeUTF(newtext);
        }

        
       

    } 
    
}
