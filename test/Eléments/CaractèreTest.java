package Eléments;

import Coordonnées.Coord;
import Film.Caractère;
import java.util.AbstractList;
import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * Tests unitaires de la classe Caractère.
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @see     Caractère
 * @version 1.0
 * @since   1.0
 **/
public class CaractèreTest {
    
    public CaractèreTest() {
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
     * Test of getCaractère method, of class Caractère.
     */
    @Test
    public void testGetCaractère() {
        System.out.println("getCaract\u00e8re");
        Caractère instance = new Caractère('t', new Coord(1, 2));
        char expResult = 't';
        char result = instance.getCaractère();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoord method, of class Caractère.
     */
    @Test
    public void testGetCoord() {
        System.out.println("getCoord");
        Caractère instance = new Caractère('t', new Coord(1, 2));
        Coord expResult = new Coord(1, 2);
        Coord result = instance.getCoord();
        assertEquals(expResult, result);
    }

    /**
     * Test of modifier method, of class Caractère.
     */
    @Test
    public void testModifier() {
        System.out.println("modifier");
        char c = 'm';
        Caractère instance = new Caractère('t', new Coord(1, 2));
        instance.modifier(c);
        assertEquals(c, instance.getCaractère());
    }

    /**
     * Test of déplacer method, of class Caractère.
     */
    @Test
    public void testDéplacer() {
        System.out.println("d\u00e9placer");
        Coord coord = new Coord(5, 5);
        Caractère instance = new Caractère('t', new Coord(1, 2));
        instance.déplacer(coord);
        assertEquals(coord, instance.getCoord());        
    }

    /**
     * Test of indexOf method, of class Caractère.
     */
    @Test
    public void testIndexOf() throws Exception {
        System.out.println("indexOf");
        AbstractList<Caractère> caractères = new LinkedList<Caractère>();
        caractères.add(new Caractère('a', new Coord(1, 2)));
        caractères.add(new Caractère('b', new Coord(2, 2)));
        caractères.add(new Caractère('c', new Coord(3, 2)));
        Coord coord = new Coord(2,2);
        int expResult = 1;
        int result = Caractère.indexOf(caractères, coord);
        assertEquals(expResult, result);
    }

    /**
     * Test of caractèrePrésent method, of class Caractère.
     */
    @Test
    public void testCaractèrePrésent() throws Exception {
        System.out.println("caract\u00e8rePr\u00e9sent");
        AbstractList<Caractère> caractères = new LinkedList<Caractère>();
        caractères.add(new Caractère('a', new Coord(1, 2)));
        caractères.add(new Caractère('b', new Coord(2, 2)));
        caractères.add(new Caractère('c', new Coord(3, 2)));
        Coord coord = new Coord(1,2);
        Caractère expResult = new Caractère('a', new Coord(1, 2));
        Caractère result = Caractère.caractèrePrésent(caractères, coord);
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class Caractère.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 0;
        Caractère instance = new Caractère('a', new Coord(1, 2));
        Caractère expResult = new Caractère('a', new Coord(1, 2));
        Caractère result = instance.get(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class Caractère.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Caractère instance = new Caractère('a', new Coord(1, 2));
        int expResult = 1;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of clone method, of class Caractère.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Caractère instance = new Caractère('a', new Coord(1, 2));
        Caractère expResult = new Caractère('a', new Coord(1, 2));
        Caractère result = instance.clone();
        assertEquals(expResult, result);
    }
    
}
