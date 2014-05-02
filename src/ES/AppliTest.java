package ES;

import java.io.FileNotFoundException;

import Film.Image;
import Film.Eléments.Ligne;
import Film.Eléments.Texte;
import Film.Eléments.Coordonnées.Coord;



public class AppliTest {
	
	public static void main(String[] args) throws FileNotFoundException {

		Ligne ligne = new Ligne('a',new Coord(0,0)	, new Coord(3,29));
		ES es = new ES("C:/Users/Coac/Desktop/test.txt");
		Image image = new Image(50,50);
		Texte texte = new Texte("123456789", 2);
		image.add(texte);
		image.add(ligne);
		es.écrire(image);
	}

}
