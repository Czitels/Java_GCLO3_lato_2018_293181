/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.lang.Exception;
/**
 *
 * @author fleja
 */
public interface ExtendedCalculator extends MyCalculator
{
    public void calculateArea(double r, double l) throws Exception;
    public void calculateVolume(double r, double H) throws Exception;
}
