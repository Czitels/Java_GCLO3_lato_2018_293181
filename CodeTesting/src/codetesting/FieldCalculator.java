/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetesting;

/**
 *
 * @author bitel
 */
public class FieldCalculator {
    public double calculateSquare(double side)
    {
        if(side<=0)
            throw new IllegalArgumentException();
        return side*side;
    }
    public double calculateCircle(double radius)
    {
        if(radius<=0)
            throw new IllegalArgumentException();
        return Math.PI*radius*radius;
    }
    public double calculateTriangle(double side, double height)
    {
        if((side<=0)||(height<=0))
            throw new IllegalArgumentException();
        return (side*height)/2;
    }
    public double calculateRectangle(double firstSide, double secondSide)
    {
        if((firstSide<=0)||(secondSide<=0))
            throw new IllegalArgumentException();
        return firstSide*secondSide;
    }
}
