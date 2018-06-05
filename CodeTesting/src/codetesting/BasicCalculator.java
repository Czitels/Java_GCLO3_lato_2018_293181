/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetesting;
import java.lang.IllegalArgumentException;
import java.math.*;
/**
 *
 * @author bitel
 */
public class BasicCalculator extends Exception{
    public double calculateSum(double firstValue, double secondValue)
    {
        return firstValue+secondValue;
    }
    public double calculateDifference(double firstValue, double secondValue)
    {
        return firstValue-secondValue;
    }
    public double caluclateMultiplication(double firstValue, double secondValue)
    {
        return firstValue*secondValue;
    }
    public double calculateDivision(double firstValue, double secondValue)
    {
        if(secondValue==0){
            throw new IllegalArgumentException();
        }
        return firstValue/secondValue;
    }
    public double calculatePow(double firstValue, double secondValue)
    {
        return Math.pow(firstValue,secondValue);
    }
    public double calculateSqrt(double Value)
    {
        if(Value<0)
        {
            throw new IllegalArgumentException();
        }
        return Math.sqrt(Value);
    }
}
