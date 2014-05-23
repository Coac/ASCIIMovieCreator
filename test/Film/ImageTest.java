/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Film;

import Coordonnées.Coord;
import Eléments.Elément;
import Eléments.Ligne;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Tests unitaires de la classe Image.
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @see     Image
 * @version 1.0
 * @since   1.0
 **/
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
        int i = 1;
        Image instance = new Image(50,50);
        instance.add(new Caractère('a', new Coord(10, 10)));
        instance.add(new Ligne('b', new Coord(10, 10),  new Coord(20, 20)));
        instance.add(new Caractère('c', new Coord(15, 25)));
        IElément expResult = new Ligne('b', new Coord(10, 10),  new Coord(20, 20));
        IElément result = instance.get(i);
        assertEquals(expResult, result);

    }

    /**
     * Test of size method, of class Image.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Image instance = new Image(40, 40);
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        instance.add(new Caractère('a', new Coord(10, 10)));
        instance.add(new Ligne('b', new Coord(10, 10),  new Coord(20, 20)));
        instance.add(new Caractère('c', new Coord(15, 25)));
        expResult = 3;
        result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of getX method, of class Image.
     */
    @Test
    public void testGetX() {
        Image instance = new Image(5,10);
        int expResult = 5;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getY method, of class Image.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Image instance = new Image(5,10);
        int expResult = 10;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class Image.
     */
    @Test
    public void testAdd_Elément_int() {
        System.out.println("add");
        int i = 2;
        Image instance = new Image(50,50);
        instance.add(new Caractère('a', new Coord(10, 10)));
        instance.add(new Ligne('b', new Coord(10, 10),  new Coord(20, 20)));
        instance.add(new Caractère('c', new Coord(15, 25)));
        instance.add(new Caractère('a', new Coord(5, 30)), 2);
        IElément expResult = new Caractère('a', new Coord(5, 30));
        IElément result = instance.get(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class Image.
     */
    @Test
    public void testAdd_Elément() {
        System.out.println("add");
        int i = 0;
        Image instance = new Image(50,50);
        instance.add(new Caractère('a', new Coord(10, 10)));
        IElément expResult = new Caractère('a', new Coord(10, 10));
        IElément result = instance.get(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of supprimer method, of class Image.
     */
    @Test
    public void testSupprimer_int() {
        System.out.println("supprimer");
        int indice = 0;
        Image instance = new Image(50,50);
        instance.add(new Caractère('a', new Coord(10, 10)));
        instance.add(new Ligne('b', new Coord(10, 10),  new Coord(20, 20)));
        instance.add(new Caractère('c', new Coord(15, 25)));
        instance.supprimer(indice);
        IElément expResult = new Ligne('b', new Coord(10, 10),  new Coord(20, 20));
        IElément result = instance.get(indice);
        assertEquals(expResult, result);
    }

    /**
     * Test of supprimer method, of class Image.
     */
    @Test
    public void testSupprimer_Elément() {
        int indice = 1;
        Image instance = new Image(50,50);
        instance.add(new Caractère('a', new Coord(10, 10)));
        instance.add(new Ligne('b', new Coord(10, 10),  new Coord(20, 20)));
        instance.add(new Caractère('c', new Coord(15, 25)));
        instance.supprimer(new Ligne('b', new Coord(10, 10),  new Coord(20, 20)));
        IElément expResult = new Caractère('c', new Coord(15, 25));
        IElément result = instance.get(indice);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Image.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Image instance = new Image(4,4);
        instance.add(new Caractère('a', new Coord(1, 2)));
        instance.add(new Caractère('b', new Coord(3, 2)));
        instance.add(new Ligne('c', new Coord(0, 1),  new Coord(3, 1)));
        String expResult = "    \n"
                + "cccc\n"
                + " a b\n"
                + "    \n";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of clone method, of class Image.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Image instance = new Image(50,50);
        instance.add(new Caractère('a', new Coord(10, 10)));
        instance.add(new Ligne('b', new Coord(10, 10),  new Coord(20, 20)));
        instance.add(new Caractère('c', new Coord(15, 25)));
        Image instance2 = new Image(50,50);
        instance2.add(new Caractère('a', new Coord(10, 10)));
        instance2.add(new Ligne('b', new Coord(10, 10),  new Coord(20, 20)));
        instance2.add(new Caractère('c', new Coord(15, 25)));
        Image expResult = instance2;
        Image result = instance.clone();
        assertEquals(expResult, result);
    }
    
}
