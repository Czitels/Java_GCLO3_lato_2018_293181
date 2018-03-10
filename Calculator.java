/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        MyCalculator object1=new ConeCalculator();
        MyCalculator object2=new TetrahedronCalculator();
        ExtendedConeCalculator object3=new ExtendedConeCalculator();
        ExtendedTetrahedronCalculator object4=new ExtendedTetrahedronCalculator();
        double r=input.nextDouble();
        System.out.println(object1.calculateBaseArea(r));
        System.out.println(object1.calculateBasePerimeter(r));
        System.out.println(object2.calculateBaseArea(r));
        System.out.println(object2.calculateBasePerimeter(r));
        try {
            object3.calculateArea(r,r);
        } catch (Exception ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            object3.calculateVolume(r,r);
        } catch (Exception ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        object4.calculateArea(r);
        object4.calculateVolume(r);

    }
    
}
