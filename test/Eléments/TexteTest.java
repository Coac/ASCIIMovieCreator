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
 * Tests unitaires de la classe Texte.
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @see     Texte
 * @version 1.0
 * @since   1.0
 **/
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
        char c = 'z';
        Texte instance = new Texte("abcdefghijkl",4);
        instance.modifier(c);
        Texte expResultat = new Texte("zzzzzzzzzzzz", 4);
        Texte resultat = instance.clone();
        assertEquals(expResultat, resultat);
    }

    /**
     * Test of get method, of class Texte.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 5;
        Texte instance = new Texte("abcdefghijkl",4);
        instance.déplacer(new  Coord(5,5));
        Caractère expResult = new Caractère('f', new Coord(6,6));
        Caractère result = instance.get(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class Texte.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Texte instance = new Texte("abcdefghijkl",4);
        int expResult = 12;
        int result = instance.size();
        assertEquals(expResult, result);
    }


    /**
     * Test of clone method, of class Texte.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Texte instance = new Texte("abcdefghijkl",4);
        Texte expResult = new Texte("abcdefghijkl",4);
        Texte result = instance.clone();
        assertEquals(expResult, result);
    }
    

}
