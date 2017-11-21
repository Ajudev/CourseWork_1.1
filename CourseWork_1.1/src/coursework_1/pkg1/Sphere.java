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
public class Sphere extends ThreeDShapes{
    private final double _radius;
    public Sphere(String name, double radius){
        super(name);
        _radius = radius;
    }

    @Override
    public double getVolume(){
        return 1.3333*Math.PI*_radius*_radius*_radius;
    }

    @Override
    public double getSA(){
        return 4*Math.PI*Math.pow(_radius, 2);
    }

}
