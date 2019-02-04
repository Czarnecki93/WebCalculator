/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author patryk
 */
public class CalculatorTest
{
    
    public CalculatorTest()
    {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd()
    {
        System.out.println("add");
        int n1 = 5;
        int n2 = 6;
        Calculator instance = new Calculator();
        int expResult = 11;
        int result = instance.add(n1, n2);
        assertEquals(expResult, result);
        System.out.println("Result of add: " + result);
    }

    /**
     * Test of sub method, of class Calculator.
     */
    @Test
    public void testSub()
    {
        System.out.println("sub");
        int n1 = 5;
        int n2 = 6;
        Calculator instance = new Calculator();
        int expResult = -1;
        int result = instance.sub(n1, n2);
        assertEquals(expResult, result);
        System.out.println("Result of sub: " + result);
    }

    /**
     * Test of mul method, of class Calculator.
     */
    @Test
    public void testMul()
    {
        System.out.println("mul");
        int n1 = 5;
        int n2 = 5;
        Calculator instance = new Calculator();
        int expResult = 25;
        int result = instance.mul(n1, n2);
        assertEquals(expResult, result);
        System.out.println("Result of mul: " + result);
    }

    /**
     * Test of div method, of class Calculator.
     */
    @Test
    public void testDiv()
    {
        System.out.println("div");
        int n1 = 0;
        int n2 = 2;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.div(n1, n2);
        assertEquals(expResult, result);
        System.out.println("Result of div: " + result);
    }
    
}
