/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import static java.lang.Math.*;
import java.lang.Exception;
/**
 *
 * @author fleja
 */
public class ExtendedTetrahedronCalculator extends TetrahedronCalculator
{
    public void calculateArea(double r)
    {
        if(r<0)
        {
            throw new IllegalArgumentException("length of side must be > 0 ");
        }
        System.out.println(r*r*r*r*sqrt(3));
    }
    public void calculateVolume(double r)
    {
        if(r<0)
        {
            throw new IllegalArgumentException("length of side must be > 0 ");
        }
        System.out.println((r*r*r*sqrt(2))/12);
    }
}
