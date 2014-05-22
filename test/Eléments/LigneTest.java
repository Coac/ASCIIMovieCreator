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
public class LigneTest {
    
    public LigneTest() {
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
     * Test of estCoordDeLigne method, of class Ligne.
     */
    @Test
    public void testEstCoordDeLigne() {
        System.out.println("estCoordDeLigne");
        Coord coord = new Coord(3,3);
        Ligne instance = new Ligne(' ', new Coord(1,1), new Coord(4,4));
        boolean expResult = true;
        boolean result = instance.estCoordDeLigne(coord);
        assertEquals(expResult, result);
    }

    /**
     * Test of redimensionner method, of class Ligne.
     */
    @Test
    public void testRedimensionner() {
        System.out.println("redimensionner");
        int début = 0;
        int fin = 0;
        Ligne instance = null;
        instance.redimensionner(début, fin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Ligne.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 1;
        Ligne instance = new Ligne(' ', new Coord(1,1), new Coord(4,1));
        Caractère expResult = new Caractère(' ', new Coord(2, 1));
        Caractère result = instance.get(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class Ligne.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Ligne instance = new Ligne(' ', new Coord(1,1), new Coord(4,1));
        int expResult = 4;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of clone method, of class Ligne.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Ligne instance = new Ligne(' ', new Coord(1,1), new Coord(4,1));
        Ligne expResult = new Ligne(' ', new Coord(1,1), new Coord(4,1));
        Ligne result = instance.clone();
        assertEquals(expResult, result);
    }
    
}
