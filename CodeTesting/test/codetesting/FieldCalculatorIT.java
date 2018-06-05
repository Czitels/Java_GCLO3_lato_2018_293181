/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bitel
 */
public class FieldCalculatorIT {
    
    public FieldCalculatorIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateSquare method, of class FieldCalculator.
     */
    @Test
    public void testCalculateSquare() {
        FieldCalculator instance = new FieldCalculator();
        double result = instance.calculateSquare(4);
        assertEquals(16, result, 0.0);
        
        result = instance.calculateSquare(2);
        assertEquals(4, result, 0.0);
        
        result = instance.calculateSquare(3);
        assertEquals(9, result, 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExcForCalculateSquare() {
        FieldCalculator instance = new FieldCalculator();
        instance.calculateSquare(0.0);
    }

    /**
     * Test of calculateCircle method, of class FieldCalculator.
     */
    @Test
    public void testCalculateCircle() {
        FieldCalculator instance = new FieldCalculator();
        double result = instance.calculateCircle(3.0);
        assertEquals(28.0, result, 1.0);
        
        result = instance.calculateCircle(1.0);
        assertEquals(3.0, result, 1.0);
        
        result = instance.calculateCircle(2.0);
        assertEquals(12.0, result, 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExcForCalculateCircle() {
        FieldCalculator instance = new FieldCalculator();
        instance.calculateCircle(0.0);
    }

    /**
     * Test of calculateTriangle method, of class FieldCalculator.
     */
    @Test
    public void testCalculateTriangle() {
        FieldCalculator instance = new FieldCalculator();
        double result = instance.calculateTriangle(4.0, 4.0);
        assertEquals(8, result, 0.0);
        
        result = instance.calculateTriangle(1.0, 1.0);
        assertEquals(0.5, result, 0.0);
        
        result = instance.calculateTriangle(10.0, 10.0);
        assertEquals(50, result, 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExcForCalculateTriangle() {
        FieldCalculator instance = new FieldCalculator();
        instance.calculateTriangle(0, 0);
    }

    /**
     * Test of calculateRectangle method, of class FieldCalculator.
     */
    @Test
    public void testCalculateRectangle() {
        FieldCalculator instance = new FieldCalculator();
        double result = instance.calculateRectangle(5.0, 5.0);
        assertEquals(25.0, result, 0.0);
        result = instance.calculateRectangle(2.0, 10.0);
        assertEquals(20.0, result, 0.0);
        result = instance.calculateRectangle(3.0, 1.0);
        assertEquals(3.0, result, 0.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExcForCalculateRectangle() {
        FieldCalculator instance = new FieldCalculator();
        instance.calculateRectangle(0.0, 0.0);
    }
    
}
