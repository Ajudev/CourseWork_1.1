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
    public static void main(String args[]){
                try{
   /* Lines 24 to 28 inatiales a port for the server to listen to and creates a socket to accept the clients 
   request for connection and creates an ObjectOutputStream for sending objects to client and ObjectInputStream
   to accept objects from client*/                 
                    int port = 8000;
                    ServerSocket serverSocket = new ServerSocket(port);
                    Socket socket = serverSocket.accept();
                    ObjectOutputStream toClient = new ObjectOutputStream(socket.getOutputStream());
                    ObjectInputStream fromClient = new ObjectInputStream(socket.getInputStream());
                    
       //Creating a new arraylist named to store the object send from the client             
                    ArrayList<Object> userinput = new ArrayList<Object>();
       //While loop is created to keep the server running 
                    while(true){
                        Shape s = (Shape)fromClient.readObject(); //Used to read contents from the shape class
                        userinput.add(s);
                        toClient.writeObject(userinput);
                        toClient.flush();
                        
                    }
                
            }
                    
                
                
                catch(IOException ex){
                    System.err.println(ex);
                }
                catch(ClassNotFoundException ex){
                    System.err.println(ex);
                } 
            
   }
        }
  
