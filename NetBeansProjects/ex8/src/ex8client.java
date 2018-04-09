import java.net.*;
import java.io.*;

public class ex8client {
 public static void main(String[] args) throws IOException {
  Socket server;
  
  while (true) {
   server = new Socket("localhost", 9090);
   System.out.print("Type a string: ");
   String userinp = null;
   BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
   userinp = kbd.readLine().trim();
   DataOutputStream outToServer = new DataOutputStream(server.getOutputStream());
   outToServer.writeUTF(userinp);
   DataInputStream inFromServer = new DataInputStream(server.getInputStream());
   String text = inFromServer.readUTF();
   System.out.print("Output: " + text + "\n\n");
  }
 }
}