/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Film;

import Eléments.Elément;
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
public class ImageTest {
    
    public ImageTest() {
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
     * Test of get method, of class Image.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 0;
        Image instance = null;
        Elément expResult = null;
        Elément result = instance.get(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Image.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Image instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Image.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Image instance = null;
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Image.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Image instance = null;
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Image.
     */
    @Test
    public void testAdd_Elément_int() {
        System.out.println("add");
        Elément élément = null;
        int profondeur = 0;
        Image instance = null;
        instance.add(élément, profondeur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Image.
     */
    @Test
    public void testAdd_Elément() {
        System.out.println("add");
        Elément élément = null;
        Image instance = null;
        instance.add(élément);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supprimer method, of class Image.
     */
    @Test
    public void testSupprimer_int() {
        System.out.println("supprimer");
        int indice = 0;
        Image instance = null;
        instance.supprimer(indice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supprimer method, of class Image.
     */
    @Test
    public void testSupprimer_Elément() {
        System.out.println("supprimer");
        Elément élément = null;
        Image instance = null;
        instance.supprimer(élément);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Image.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Image instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Image.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Image instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Image.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Image instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clone method, of class Image.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Image instance = null;
        Image expResult = null;
        Image result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
