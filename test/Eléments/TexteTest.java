/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Eléments;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author scalpa
 */
public class TexteTest {
    
    public TexteTest() {
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
     * Test of modifier method, of class Texte.
     */
    @Test
    public void testModifier() {
        System.out.println("modifier");
        char c = ' ';
        Texte instance = null;
        instance.modifier(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Texte.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 0;
        Texte instance = null;
        Caractère expResult = null;
        Caractère result = instance.get(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Texte.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Texte instance = new Texte('l', );
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Texte.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Texte instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Texte.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Texte instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class Texte.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Texte instance = null;
        Texte expResult = null;
        Texte result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
