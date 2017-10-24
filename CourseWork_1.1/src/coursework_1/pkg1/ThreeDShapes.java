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
public abstract class ThreeDShapes extends Shape {
    
    public ThreeDShapes(String name){
        super(name);
    }
    
    public abstract double getVolume();
    
    public abstract double getSA();
    
    public void displayDescription(){
        System.out.println("I'm a shape named "+ _name);
    }
    
}
