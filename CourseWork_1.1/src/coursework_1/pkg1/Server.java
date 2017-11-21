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
                    int port = 8000;
                    ServerSocket serverSocket = new ServerSocket(port);
                    Socket socket = serverSocket.accept();
                    ObjectOutputStream toClient = new ObjectOutputStream(socket.getOutputStream());
                    ObjectInputStream fromClient = new ObjectInputStream(socket.getInputStream());
                    
                    
                    ArrayList<Object> userinput = new ArrayList<Object>();
                    while(true){
                        Shape s = (Shape)fromClient.readObject();
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
  
