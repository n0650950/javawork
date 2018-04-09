import java.net.*;
import java.io.*;

public class ex12client {
    public static void main(String[] args) throws IOException {
        Socket server;
  
        while (true) {
            server = new Socket("localhost", 9090);
   
            System.out.print("Type a string: ");
            BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
            String userinp = kbd.readLine().trim();
   
            DataOutputStream outToServer = new DataOutputStream(server.getOutputStream());
            outToServer.writeUTF(userinp);
   
            DataInputStream inFromServer = new DataInputStream(server.getInputStream());
            String text = inFromServer.readUTF();
   
            System.out.print("Output: " + text + "\n\n");
        }
    }
}