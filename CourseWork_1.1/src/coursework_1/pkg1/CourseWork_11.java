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
public class CourseWork_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //  final LinkedList<Shape> shapes = new LinkedList();

        Scanner s  =new Scanner(System.in);
        println("Welcome to the program");
        println("Press 1 to access 2D shapes and press 2 to access 3D shapes");
        int choice_1 = s.nextInt();
        if (choice_1==1){
          println("Which one of the 2D shapes do you want to access");
          println("For rectangle press 1, press 2 for circle, press 3 for triangle");
          int choice_2 = s.nextInt();
          if (choice_2==1:){
            println("Name of the rectangle: ");
            String name1 = s.next();
            println("Length of the rectangle: ");
            double len = nextDouble();
            println("Width of the rectangle: ");
            double brd = nextDouble();
            shapes.add(new Rectangle(name1,len,brd));
          }
          else if (choice_2 ==2:){
            println("Name of the circle: ");
            String name2 = s.next();
            println("Radius of the circle: ");
            double radius = s.next();
            shapes.add(new Circle(name2,radius));
          }
          else if (choice_2 ==3){
            /* Add the triangle functions in here*/
          }
          else{
            println("Please enter a valid option");
          }
          

        }
        shapes.add(new Rectangle("Rectangle one", 10, 8));
        shapes.add(new Rectangle("Rectangle two", 20, 5));
        shapes.add(new Circle("Circle one", 10));
        shapes.add(new Circle("Circle two", 20));
        shapes.add(new Cylinder("Cylinder", 5, 10));
        shapes.add(new Sphere("Sphere", 5));

        for (final Shape shape:shapes){
            shape.displayDescription();
            if (shape instanceof Circle){
                System.out.println("Area: "+shape.getArea());
                System.out.println("Circumference: "+ shape.getPerimeter());

            }
            else if (shape instanceof Rectangle) {
                System.out.println("Area: "+shape.getArea());
                System.out.println("Perimeter: "+shape.getPerimeter());
            }
            else if (shape instanceof Cylinder){
                System.out.println("");
            }
            else{

            }
            System.out.println("");
        }

    }

}
