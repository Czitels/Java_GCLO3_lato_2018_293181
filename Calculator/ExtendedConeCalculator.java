/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import static java.lang.Math.*;
import java.lang.Exception;

public class ExtendedConeCalculator extends ConeCalculator 
{

    ExtendedConeCalculator() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void calculateArea(double r, double l) throws Exception
    {
        if((r<0)&&(l<0))
        {
            throw new IllegalArgumentException("r and l must be > 0 ");
        }
        System.out.println(Math.PI*r*r+Math.PI*r*l);
    }
    public void calculateVolume(double r, double H) throws Exception
    {
        if((r<0)&&(H<0))
        {
            throw new IllegalArgumentException("r and H must be > 0 ");
        }
        System.out.println((Math.PI*r*r*H)/3);
    }
}
