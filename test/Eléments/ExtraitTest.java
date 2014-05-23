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
 * Tests unitaires de la classe Extrait.
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @see     Extrait
 * @version 1.0
 * @since   1.0
 **/
public class ExtraitTest {
    
    public ExtraitTest() {
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
     * Test of get method, of class Extrait.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 1;
        Extrait instance = new Extrait(new Texte("abcdefghijkl",4), new Coord(0, 1), new Coord(3,2));
        Caractère expResult = new Caractère('f', new Coord(1,1));
        Caractère result = instance.get(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class Extrait.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Extrait instance = new Extrait(new Texte("abcdefghijkl",4), new Coord(0, 1), new Coord(3,2));
        int expResult = 8;
        int result = instance.size();
        assertEquals(expResult, result);
    }


    /**
     * Test of clone method, of class Extrait.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Extrait instance =  new Extrait(new Texte("abcdefghijkl",4), new Coord(0, 1), new Coord(3,2));
        Extrait expResult =  new Extrait(new Texte("abcdefghijkl",4), new Coord(0, 1), new Coord(3,2));
        Extrait result = instance.clone();
        assertEquals(expResult, result);
    }
    
    /**
     * Test de la méthode modifier de l'interface IElément
     */
    @Test
    public void testModifier() {
        System.out.println("Modifier");
        Extrait instance =  new Extrait(new Texte("abcdefghijkl",4), new Coord(0, 1), new Coord(3,2));
        instance.modifier('x');
        Extrait expResult =  new Extrait(new Texte("xxxxxxxxxxxx",4), new Coord(0, 1), new Coord(3,2));
        Extrait result = instance.clone();
        assertEquals(expResult, result);
    }
    
}
