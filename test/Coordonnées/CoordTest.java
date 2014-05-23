package Coordonnées;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Tests unitaires de la classe Coord.
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @see     Coord
 * @version 1.0
 * @since   1.0
 **/
public class CoordTest {
    
    public CoordTest() {
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
     * Test of getX method, of class Coord.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Coord instance = new Coord(5,6);
        int expResult = 5;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getY method, of class Coord.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Coord instance = new Coord(4,2);
        int expResult = 2;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setX method, of class Coord.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 6;
        Coord instance = new Coord(3,3);
        instance.setX(x);
        assertEquals(x, instance.getX());
    }

    /**
     * Test of setY method, of class Coord.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 2;
        Coord instance = new Coord(9,9);
        instance.setY(y);
        assertEquals(y, instance.getY());
    }


/**
     * Test of rotationReturn method, of class Coord.
     */
    @Test
    public void testRotationReturn() {
        System.out.println("rotationReturn");
        double angle = Math.PI;
        Coord centre = new Coord(2,2);
        Coord instance = new Coord(1,2);
        Coord expResult = new Coord(3,2);
        Coord result = instance.rotationReturn(angle, centre);
        assertEquals(expResult, result);
    }

    /**
     * Test of rotationReturnD method, of class Coord.
     */
    @Test
    public void testRotationReturnD() {
        System.out.println("rotationReturnD");
        double angle = 180.0;
        Coord centre = new Coord(2,2);
        Coord instance = new Coord(1,2);
        Coord expResult = new Coord(3,2);
        Coord result = instance.rotationReturnD(angle, centre);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of moins method, of class Coord.
     */
    @Test
    public void testMoins() {
        System.out.println("moins");
        Coord coord = new Coord(4, 4);
        Coord instance = new Coord(6, 7);
        Coord expResult = new Coord(2, 3);
        Coord result = instance.moins(coord);
        assertEquals(expResult, result);
    }

    /**
     * Test of plus method, of class Coord.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        Coord coord = new Coord(5,1);
        Coord instance = new Coord(2,4);
        Coord expResult = new Coord(7,5);
        Coord result = instance.plus(coord);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Coord.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Coord coord = new Coord(1,6);
        Coord instance = new Coord(1,6);
        boolean expResult = true;
        boolean result = instance.equals(coord);
        assertEquals(expResult, result);
    }

    /**
     * Test of equalsX method, of class Coord.
     */
    @Test
    public void testEqualsX() {
        System.out.println("equalsX");
        Coord coord = new Coord(3,5);
        Coord instance = new Coord(3,6);
        boolean expResult = true;
        boolean result = instance.equalsX(coord);
        assertEquals(expResult, result);
    }

    /**
     * Test of equalsY method, of class Coord.
     */
    @Test
    public void testEqualsY() {
        System.out.println("equalsY");
        Coord coord = new Coord(3,8);
        Coord instance = new Coord(9,8);
        boolean expResult = true;
        boolean result = instance.equalsY(coord);
        assertEquals(expResult, result);
    }

    /**
     * Test of estDans method, of class Coord.
     */
    @Test
    public void testEstDans() {
        System.out.println("estDans");
        Coord début = new Coord(1,1);
        Coord fin = new Coord(3,3);
        Coord instance = new Coord(2,2);
        boolean expResult = true;
        boolean result = instance.estDans(début, fin);
        assertEquals(expResult, result);
    }

    /**
     * Test of échange method, of class Coord.
     */
    @Test
    public void testÉchange() {
        System.out.println("échange");
        Coord c1 = new Coord(2,2);
        Coord c2 = new Coord(5,5);
        Coord.échange(c1, c2);
        assertEquals(c1, new Coord(5,5));
        assertEquals(c2, new Coord(2,2));
    }

    /**
     * Test of toString method, of class Coord.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Coord instance = new Coord(7,5);
        String expResult = "[7, 5]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
