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
