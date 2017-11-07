/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_1.pkg1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author M00609218
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      final LinkedList<Shape> shapes = new LinkedList();
      Scanner s  =new Scanner(System.in);
      System.out.println("Welcome to the program");
      System.out.println("Press 1 to access 2D shapes and press 2 to access 3D shapes");
      int choice_1 = s.nextInt();
      if (choice_1==1){
        System.out.println("Which one of the 2D shapes do you want to access");
        System.out.println("For rectangle press 1, press 2 for circle, press 3 for triangle");
        int choice_2 = s.nextInt();
        if (choice_2==1){
          System.out.println("Name of the rectangle: ");
          String name1 = s.next();
          System.out.println("Length of the rectangle: ");
          double len = s.nextDouble();
          System.out.println("Width of the rectangle: ");
          double brd = s.nextDouble();
          shapes.add(new Rectangle(name1,len,brd));
        }
        else if (choice_2 ==2){
          System.out.println("Name of the circle: ");
          String name2 = s.next();
          System.out.println("Radius of the circle: ");
          double radius = s.nextDouble();
          shapes.add(new Circle(name2,radius));
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
          shapes.add(new Triangle(name3,side1,side2,base,height));
        }
        else{
          System.out.println("Please enter a valid option");
          return;
        }
      }
      else if (choice_1==2){
        System.out.println("Press 1 to access Sphere, Press 2 to access Cylinder: ");
        int choice_3 = s.nextInt();
        if (choice_3==1){
          System.out.println("Name of the Sphere: ");
          String name4 = s.next();
          System.out.println("Radius of the Sphere: ");
          double r1 = s.nextDouble();
          shapes.add(new Sphere(name4,r1));
          System.out.println("To calculate the Volume press 1, And press 2 to calculate Surface Area");
          int choice_5 = s.nextInt();
          if (choice_5==1){

          }
          else if (choice_5==2){

          }
          else{
            System.out.println("Please enter a valid option");
            return;
          }
        }
        else if (choice_3==2){
          System.out.println("Name of the Cylinder: ");
          String name5 = s.next();
          System.out.println("Radius of the Cylinder: ");
          double r2 = s.nextDouble();
          System.out.println("Height of the Cylinder: ");
          double h1 = s.nextDouble();
          shapes.add(new Cylinder(name5,r2,h1));
          System.out.println("To calculate the Volume press 1, And press 2 to calculate Surface Area");
          int choice_5 = s.nextInt();
          for(final Shape shape:shapes){
            if (choice_5==1){

            }
            else if (choice_5==2){

            }
            else{
              System.out.println("Please enter a valid option");
              return;
            }
          }}

        else{
          System.out.println("Please enter a valid option");
          return;
        }
      }
      else{
        System.out.println("Please enter a valid option");
        return;
      }
//      for (final Shape shape:shapes){
//          shape.displayDescription();
//          if (shape instanceof Circle){
//            System.out.println("Area: "+shape.getArea());
//            System.out.println("Circumference: "+ shape.getPerimeter());
//          }
//          else if (shape instanceof Rectangle) {
//            System.out.println("Area: "+shape.getArea());
//            System.out.println("Perimeter: "+shape.getPerimeter());
//          }
//          else if (shape instanceof Cylinder){
//            System.out.println("");
//          }
//          else{
//
//          }
//          System.out.println("");
//        }

  }
}
