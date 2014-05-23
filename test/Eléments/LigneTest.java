/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Eléments;

import Coordonnées.Coord;
import Film.Caractère;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Tests unitaires de la classe Ligne.
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @see     Ligne
 * @version 1.0
 * @since   1.0
 **/
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
    
    /**
     * Test de la méthode modifier de la classe Elément
     */
    @Test
    public void testModifier() {
        System.out.println("Modifier");
        Ligne instance = new Ligne(' ', new Coord(1,1), new Coord(4,1));
        instance.modifier('x');
        Ligne expResult = new Ligne('x', new Coord(1,1), new Coord(4,1));
        Ligne result = instance.clone();
        assertEquals(expResult, result);
    }

    /**
     * Test of allonger method, of class Ligne.
     */
    @Test
    public void testAllonger() {
        System.out.println("allonger");
        int début = 5;
        int fin = 2;
        Ligne instance = new Ligne('x', new Coord(5, 5), new Coord(10,5));
        instance.allonger(début, fin);
        Ligne expResult = new Ligne('x', new Coord(0, 5), new Coord(12,5));
        Ligne result = instance.clone();
        assertEquals(expResult, result);
    }
    
    
}