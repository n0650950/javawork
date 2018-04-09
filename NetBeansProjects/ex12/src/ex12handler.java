import java.net.*;
import java.io.*;

public class ex12handler implements Runnable {
    Socket client;
    DataOutputStream outToClient;
    
    public ex12handler (Socket _client) throws IOException{
        client = _client;
        outToClient = new DataOutputStream(client.getOutputStream());   
        } //constructor
    public void run() {
        try{
            DataInputStream inFromClient = new DataInputStream(client.getInputStream());
            String text = inFromClient.readUTF();
            String newtext = text.toUpperCase();
            DataOutputStream outToClient = new DataOutputStream(client.getOutputStream());
            outToClient.writeUTF(newtext);
        }catch(IOException e){}
        //an entire task can be implemented here
    }   //thread method
}