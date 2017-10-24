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
public class Cylinder extends ThreeDShapes{
    private final double _radius;
    private final double _height;
    
    public Cylinder(String name, double radius, double height){
        super(name);
        _radius = radius;
        _height = height;
    }
    
    @Override
    public double getVolume(){
        return Math.PI*Math.pow(_radius, 2)*_height;
    } 
    
    @Override
    public double getSA(){
        return 2*Math.PI*_radius*(_radius+_height);
    }
    
}
