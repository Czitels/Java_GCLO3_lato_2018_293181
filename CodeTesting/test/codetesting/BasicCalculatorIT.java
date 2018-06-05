package codetesting;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

public class BasicCalculatorIT {
    
    public BasicCalculatorIT() {
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
     * Test of calculateSum method, of class BasicCalculator.
     */
    @Test
    public void testCalculateSum() {
        BasicCalculator instance = new BasicCalculator();
        double expResult = 0.0;
        double result = instance.calculateSum(0.0, 0.0);
        assertEquals(expResult, result, 0.0);
        expResult = -20.0;
        result = instance.calculateSum(-10.0, -10.0);
        assertEquals(expResult, result, 0.0);
        expResult = 5.0;
        result = instance.calculateSum(2.0, 3.0);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculateDifference method, of class BasicCalculator.
     */
    @Test
    public void testCalculateDifference() {
        BasicCalculator instance = new BasicCalculator();
        double expResult = 0.0;
        double result = instance.calculateDifference(0.0, 0.0);
        assertEquals(expResult, result, 0.0);
        expResult = -5.0;
        result = instance.calculateDifference(2.0, 7.0);
        assertEquals(expResult, result, 0.0);
        expResult = 15.0;
        result = instance.calculateDifference(20.0, 5.0);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of caluclateMultiplication method, of class BasicCalculator.
     */
    @Test
    public void testCaluclateMultiplication() {
        BasicCalculator instance = new BasicCalculator();
        double expResult = 0.0;
        double result = instance.caluclateMultiplication(0.0, 0.0);
        assertEquals(expResult, result, 0.0);
        expResult = 15.0;
        result = instance.caluclateMultiplication(3.0, 5.0);
        assertEquals(expResult, result, 0.0);
        expResult = -100.0;
        result = instance.caluclateMultiplication(10.0, -10.0);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of calculateDivision method, of class BasicCalculator.
     */
    @Test
    public void testCalculateDivision() {
        BasicCalculator instance = new BasicCalculator();
        double expResult = 0.0;
        double result = instance.calculateDivision(0.0, 1.0);
        assertEquals(expResult, result, 0.0);
        
        expResult = 5.0;
        result = instance.calculateDivision(15.0, 3.0);
        assertEquals(expResult, result, 0.0);
        
        expResult = -10.0;
        result = instance.calculateDivision(100.0,-10.0);
        assertEquals(expResult, result, 0.0);

    }
    @Test(expected = IllegalArgumentException.class)
    public void testExcForCalculateDivision() {
        BasicCalculator instance = new BasicCalculator();
        double result = instance.calculateDivision(0.0, 0.0);

    }

    /**
     * Test of calculatePow method, of class BasicCalculator.
     */
    @Test
    public void testCalculatePow() {
        BasicCalculator instance = new BasicCalculator();
        double expResult =  0.0;
        double result = instance.calculatePow(0.0, 1.0);
        assertEquals(expResult, result, 0.0);
        
        expResult =  1.0;
        result = instance.calculatePow(0.0, 0.0);
        assertEquals(expResult, result, 0.0);
        
        expResult =  4.0;
        result = instance.calculatePow(2.0, 2.0);
        assertEquals(expResult, result, 0.0);


    }

    @Test
    public void testCalculateSqrt() {
        //BasicCalculator instance = new BasicCalculator();
        /*double expResult = 2.0;
        double result = instance.calculateSqrt(4.0);
        assertEquals(2.0, result, 0.0);
        
        result = instance.calculateSqrt(0.0);
        assertEquals(0.0, result, 0.0);
        
        result = instance.calculateSqrt(16.0);
        assertEquals(4, result, 0.0);
        */
        //assertEquals(expValue, instance.calculateSqrt(value),0.0);

    }
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testExcForCalculateSqrt() {
        
        BasicCalculator instance = new BasicCalculator();
        instance.calculateSqrt(-2);
    }
    
}
