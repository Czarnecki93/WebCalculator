/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author patryk
 */
public class Calculator implements ICalculator
{

    @Override
    public int add(int n1, int n2)
    {
        int res = n1 + n2;
        return res;
    }

    @Override
    public int sub(int n1, int n2)
    {
        int res = n1 - n2;
        return res;
    }

    @Override
    public int mul(int n1, int n2)
    {
        int res = n1 * n2;
        return res;
    }

    @Override
    public int div(int n1, int n2) throws ArithmeticException
    {
        int res = n1 / n2;
        return res;
    }
    
}
