/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetesting;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author bitel
 */
@RunWith(Parameterized.class)
public class CalculateSqrtIT {
    private double value;
    private double expValue;
    BasicCalculator instance;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {0,0}, {1,1}, {4,2}, {9, 3}, {16,4} 
        });
    }
    
    public CalculateSqrtIT(double input, double expected) {
        value=input;
        expValue=expected;
    }
   
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance=new BasicCalculator();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateSum method, of class BasicCalculator.
     */
    
    @Test
    public void testCalculateSqrt() {
        assertEquals(expValue, instance.calculateSqrt(value),0.0);
    }
    
}
