/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_1.pkg1;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author M00609218
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ObjectOutputStream outputToServer = null;
        ObjectInputStream fromServer = null;
        int port = 8000;
        String host = "localhost";
        ArrayList shapes = new ArrayList();
        Scanner s  =new Scanner(System.in);
        try{
            Socket socket = new Socket(host,port);
            outputToServer = new ObjectOutputStream(socket.getOutputStream());
            fromServer = new ObjectInputStream(socket.getInputStream());
        }
        catch (IOException ex){
            System.out.println(ex.toString()+'\n');
        }
        while(true){
            System.out.println("Welcome to the program");
            System.out.println("Press 1 to create 2D Shapes \n Press 2 to create 3D Shapes \n Press 3 to recieve shapes from server \n Press 4 to exit the program \n");
            int choice_1 = s.nextInt();
            if (choice_1==1){
                System.out.println("Which one of the 2D shapes do you want to access");
                System.out.println("For rectangle press 1, press 2 for circle, press 3 for triangle, press 4 to exit the program");
                int choice_2 = s.nextInt();
                if (choice_2==1){
                    System.out.println("Name of the rectangle: ");
                    String name1 = s.next();
                    System.out.println("Length of the rectangle: ");
                    double len = s.nextDouble();
                    System.out.println("Width of the rectangle: ");
                    double brd = s.nextDouble();
                    Rectangle r = new Rectangle(name1,len,brd);
                    shapes.add(r);
                    double area = 0,perimeter= 0;
                    try{ 
                        area = r.getArea();
                        perimeter = r.getPerimeter();
                        r.displayDescription();
                        System.out.println("The area of rectangle is: "+area);
                        System.out.println("The perimeter of rectangle is: "+perimeter);
                        outputToServer.writeObject(r);
                        outputToServer.flush();
                        
                    } catch(Exception e){
                        e.printStackTrace();
                    }

                   
                }
                else if (choice_2 ==2){
                    System.out.println("Name of the circle: ");
                    String name2 = s.next();
                    System.out.println("Radius of the circle: ");
                    double radius = s.nextDouble();
                    double area=0,perimeter=0;
                    Circle c = new Circle(name2,radius);
                    try{
                        area=c.getArea();
                        perimeter=c.getPerimeter();
                        c.displayDescription();
                        System.out.println("The area of circle is: "+area);
                        System.out.println("The perimeter of circle is: "+perimeter);
                        outputToServer.writeObject(c);
                        outputToServer.flush();
                    } catch(Exception e){
                        e.printStackTrace();
                    }
                }
                else if (choice_2 ==3){
                    System.out.println("Name of the Triangle: ");
                    String name3 = s.next();
                    System.out.println("Length of the sides: ");
                    double side1 = s.nextDouble();
                    double side2 = s.nextDouble();
                    System.out.println("Length of the base of the Triangle: ");
                    double base = s.nextDouble();
                    System.out.println("Length of the height from the base of the Triangle: ");
                    double height = s.nextDouble();
                    Triangle t = new Triangle(name3,side1,side2,base,height);
                    double area=0,perimeter=0;
                    try{
                        area = t.getArea();
                        perimeter = t.getPerimeter();
                        t.displayDescription();
                        System.out.println("The area of triangle is: "+area);
                        System.out.println("The perimeter of triangle is: "+perimeter);
                        outputToServer.writeObject(t);
                        outputToServer.flush();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                else if(choice_2 == 4){
                    System.out.println("Thank you for using the program");
                    System.exit(0);
                }
            }
            else if (choice_1==2){
                System.out.println("Press 1 to access Sphere, Press 2 to access Cylinder and Press 3 to exit the program: ");
                int choice_3 = s.nextInt();
                if (choice_3==1){
                    System.out.println("Name of the Sphere: ");
                    String name4 = s.next();
                    System.out.println("Radius of the Sphere: ");
                    double r1 = s.nextDouble();
                    Sphere sp = new Sphere(name4,r1);
                    try{
                        double volume = sp.getVolume();
                        double SA = sp.getSA();
                        System.out.println("The volume of Sphere is: "+volume);
                        System.out.println("The Surface Area of rectangle is: "+SA);
                        outputToServer.writeObject(sp);
                        outputToServer.flush();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                else if (choice_3==2){
                    System.out.println("Name of the Cylinder: ");
                    String name5 = s.next();
                    System.out.println("Radius of the Cylinder: ");
                    double r2 = s.nextDouble();
                    System.out.println("Height of the Cylinder: ");
                    double h1 = s.nextDouble();
                    Cylinder cy = new Cylinder(name5,r2,h1);
                    try{
                        double volume = cy.getVolume();
                        double SA = cy.getSA();
                        System.out.println("The volume of Cylinder is: "+volume);
                        System.out.println("The Surface Area of Cylinder is: "+SA);
                        outputToServer.writeObject(cy);
                        outputToServer.flush();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
                else if(choice_3 == 3){
                    System.out.println("Thank you for using the program");
                    System.exit(0);
                }
            }
            else if(choice_1==3){
                try{
                    ArrayList in = (ArrayList)fromServer.readObject();
                    for(Object str:in){
                        System.out.println(str);
                    }
                } catch(Exception e){
                    e.printStackTrace();
                }
            }
            else if(choice_1==4) {
                System.out.println("Thank you for using the program");
                System.exit(0);
            }
            else{
                System.out.println("Please enter a valid option");
            }
        }
  }
}
