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
            try{
                int port = 8000;
                ServerSocket serverSocket = new ServerSocket(8000);
               
                

                    Socket socket = serverSocket.accept();
                    ObjectOutputStream toClient = new ObjectOutputStream(socket.getOutputStream());
                    ObjectInputStream fromClient = new ObjectInputStream(socket.getInputStream());
                    ArrayList <TwoDShapes>shapes = (ArrayList) fromClient.readObject();
                    ArrayList out = new ArrayList();
                        for (TwoDShapes TwoD:shapes){
                            TwoD.displayDescription();
                            if (TwoD instanceof Circle){
                                out.add(TwoD.getArea());
                                out.add(TwoD.getPerimeter());
                            }
                            else if (TwoD instanceof Rectangle){
                                out.add(TwoD.getArea());
                                out.add(TwoD.getPerimeter());
                            }
                            else if (TwoD instanceof Triangle){
                                out.add(TwoD.getArea());
                                out.add(TwoD.getPerimeter());
                            }
                            toClient.writeObject(out);
                            toClient.flush();

                        }
                        ArrayList <ThreeDShapes> shapes1 = (ArrayList) fromClient.readObject();
                        for (ThreeDShapes ThreeD:shapes1){
                            if(ThreeD instanceof Cylinder){
                                out.add(ThreeD.getVolume());
                                out.add(ThreeD.getSA());
                            }
                            else if(ThreeD instanceof Sphere){
                                out.add(ThreeD.getVolume());
                                out.add(ThreeD.getSA());
                            }
                            toClient.writeObject(out);
                            toClient.flush();
                        }
                }
            
            catch(IOException ex){
                System.err.println(ex);
            } catch(ClassNotFoundException ex){
                System.err.println(ex);
            }
            
       

    }
  }
