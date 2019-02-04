/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrationtests;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.HttpClient;

/**
 *
 * @author patryk
 */
public class WebCalculatorTest
{

    @Test
    public void add() throws IOException
    {
        HttpClient client = new HttpClient("http://localhost:7777/WebApplication/calculator");
        String res = client.makeHttpRequest("?operation=add&n1=2&n2=2");
        assertEquals("Result of: 2+2= 4", res);
    }
}
