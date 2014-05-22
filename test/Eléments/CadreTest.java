/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Eléments;

import Coordonnées.Coord;
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
public class CadreTest {
    
    public CadreTest() {
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
     * Test of cadre method, of class Cadre.
     */
    @Test
    public void testCadre() {
        System.out.println("cadre");
        char c = ' ';
        Coord coord1 = new Coord(1,1);
        Coord coord2 = new Coord(3,3);
        Cadre instance = null;
        instance.cadre(c, coord1, coord2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Cadre.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 0;
        Cadre instance = new Cadre('x', new Caractère('c', new Coord(2, 2)));
        Caractère expResult = new Caractère('x', new Coord(1, 1));
        Caractère result = instance.get(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class Cadre.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Cadre instance = new Cadre('x', new Caractère('c', new Coord(2, 2)));
        int expResult = 12;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of clone method, of class Cadre.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Cadre instance = new Cadre('x', new Caractère('c', new Coord(2, 2)));
        Cadre expResult = new Cadre('x', new Caractère('c', new Coord(2, 2)));
        Cadre result = instance.clone();
        assertEquals(expResult, result);
    }
    
}
