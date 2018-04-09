import java.net.*;
import java.io.*;

public class ex12server {
    public static void main(String[] args) throws IOException {
        
        ServerSocket server = new ServerSocket(9090);
        
        
        
        while (true) {
            System.out.println("Waiting for connection...");
            Socket client = server.accept();
            System.out.println("Connected" + client.getInetAddress());
            //assign each client to a thread
            ex12handler t = new ex12handler(client);
            Thread th = new Thread(t);
            th.start();
         }
    }
}