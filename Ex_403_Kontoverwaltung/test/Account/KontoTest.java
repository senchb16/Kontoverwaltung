/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Christoph
 */
@RunWith(value=Parameterized.class)
public class KontoTest {
    
    @Parameter(value = 0)
    public int value;
    
    @Parameter(value = 1)
    public int expectedWithdraw;
    
    @Parameter(value = 2)
    public int expectedDeposit;
    
    @Parameters(name = "")
    public static Iterable<Object[]>data1(){
        return Arrays.asList(new Object[][]{
            {34,466,534},
            {49,451,549},
            {20,480,520},
            {44,456,544},
            {17,483,517}
        });
    }

    /**
     * Test of withdraw method, of class Konto.
     */
    @Test
    public void testWithdraw() throws Exception {
        System.out.println("withdraw");
        int value = this.value;
        
        Konto instance = new Konto(500);
        
        int result = instance.withdraw(value);
        assertEquals(expectedWithdraw, result);
        
        
    }

    /**
     * Test of deposit method, of class Konto.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        int value = this.value;
        
        Konto instance = new Konto(500);
        
        int result = instance.deposit(value);
        assertEquals(expectedDeposit, result);
       
    }

//    /**
//     * Test of getBalance method, of class Konto.
//     */
//    @Test
//    public void testGetBalance() {
//        System.out.println("getBalance");
//        Konto instance = null;
//        int expResult = 0;
//        int result = instance.getBalance();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
