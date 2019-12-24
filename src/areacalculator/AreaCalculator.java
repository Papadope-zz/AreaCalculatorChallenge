/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacalculator;

/**
 *
 * @author User
 */
public class AreaCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        area(5.0);
        area(-1);
        area(5.0, 4.0);
        area(-1.0, 4.0);
    }
    
    public static double area (double radius){
        if (radius < 0){
            return -1;
        }
        radius = radius*radius*Math.PI;
        System.out.println(radius);
        return radius;
    }
    
    public static double area (double x, double y){
        if ((x < 0) || (y < 0)){
            return -1;
        }
        double areaOfRectangle = x * y;
        System.out.println(areaOfRectangle);
        return areaOfRectangle;
    }
    
}
