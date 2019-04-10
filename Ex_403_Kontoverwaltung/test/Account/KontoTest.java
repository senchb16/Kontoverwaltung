/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christoph
 */
public class KontoTest {
    
    public KontoTest() {
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
     * Test of withdraw method, of class Konto.
     */
    @Test
    public void testWithdraw() throws Exception {
        System.out.println("withdraw");
        int value = 0;
        String name = "";
        Konto instance = null;
        int expResult = 0;
        int result = instance.withdraw(value, name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deposit method, of class Konto.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        int value = 0;
        String name = "";
        Konto instance = null;
        int expResult = 0;
        int result = instance.deposit(value, name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class Konto.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Konto instance = null;
        int expResult = 0;
        int result = instance.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
