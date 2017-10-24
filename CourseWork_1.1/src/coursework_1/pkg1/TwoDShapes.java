/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_1.pkg1;

/**
 *
 * @author M00609218
 */
public abstract class TwoDShapes extends Shape {
    public TwoDShapes(String name){
        super(name);
    }
    
//    @Override
    public abstract double getArea();
    
//    @Override
    public abstract double getPerimeter();
    
    @Override
    public void displayDescription(){
        System.out.println("I'm a shape named"+_name);
    }
    
}
