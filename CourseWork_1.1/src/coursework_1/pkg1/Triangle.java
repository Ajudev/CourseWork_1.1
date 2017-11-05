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
public class Triangle extends TwoDShapes {
    private final double _side1;
    private final double _side2;
    private final double _base;
    private final double _height;

    public Triangle(String name, double side1, double side2, double base, double height){
        super(name);
        _side1=side1;
        _side2=side2;
        _base=base;
        _height=height;
    }

    @Override
    public double getArea(){
        return (_height*_base)/2;
    }

    @Override
    public double getPerimeter(){
        return _side1+_side2+_base;
    }
}
