/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthew
 */
import java.net.*;
import java.io.*;

import java.util.*;

public class ex9client {
   public static void main(String[] args) throws IOException {
       //sending data .......................................
       DatagramSocket client = new DatagramSocket(); 
        System.out.print("Type a string: ");
        String msg = null;
        BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
        msg = kbd.readLine().trim() + "\n";
       byte[] data = msg.getBytes();
       int length = data.length;
       InetAddress destination = InetAddress.getByName("localhost");
       int portNumber = 9090;
                 
       DatagramPacket sendPacket = new DatagramPacket(data,length,destination,portNumber);       
       client.send(sendPacket);
       System.out.print(msg);
       
       //receiving data .......................................
       byte[] data2 = new byte[1024];
       DatagramPacket receivedPacket = new DatagramPacket(data2,data2.length);
       client.receive(receivedPacket);
       data2 = receivedPacket.getData();
       String message2 = new String(data2);
       System.out.print("new message = " + message2);
       
    } 
    
}
