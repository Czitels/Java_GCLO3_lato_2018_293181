/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import static java.lang.Math.*;

/**
 *
 * @author fleja
 */
public class ConeCalculator implements MyCalculator{
    @Override
    public double calculateBaseArea(double r)
    {
        return Math.PI*r*r;
    }
    public double calculateBasePerimeter(double r)
    {
        return 2*Math.PI*r;
    }
}
