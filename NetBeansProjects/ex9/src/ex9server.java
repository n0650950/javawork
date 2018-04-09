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

public class ex9server {
   public static void main(String[] args) throws IOException {
       //receiving data .......................................
        DatagramSocket server = new DatagramSocket(9090);
        
        while(true){
        byte[] data = new byte[1024];
        DatagramPacket receivedPacket = new DatagramPacket(data, data.length);
        server.receive(receivedPacket);
        data = receivedPacket.getData();
        String message = new String(data);
        

        //sending data .......................................
        String newtext = message.toUpperCase();
        byte[] data2 = newtext.getBytes();
        int length = data2.length;
        InetAddress destination = receivedPacket.getAddress();
        int portNumber = receivedPacket.getPort();
                 
        DatagramPacket sendPacket = new DatagramPacket(data2,length,destination,portNumber);       
        server.send(sendPacket);
        }

    } 
    
}
