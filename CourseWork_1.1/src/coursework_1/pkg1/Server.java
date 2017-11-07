/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_1.pkg1;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author M00609218
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Thread(() -> {
            try{
                int port = 8000;
                Socket socket;
                ServerSocket serverSocket = new ServerSocket(8000);
                socket = serverSocket.accept();
                ObjectOutputStream toClient = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream fromServer = new ObjectInputStream(socket.getInputStream());
                LinkedList Shapes = (LinkedList) fromServer.readObject();
            } 
            catch(IOException ex){
                System.err.println(ex);
            } catch(ClassNotFoundException ex){
                System.err.println(ex);
            }
            
        });

    }
  }
