package ES;

import java.io.FileNotFoundException;

import Film.Film;
import Film.Image;
import Film.Eléments.Ligne;
import Film.Eléments.Texte;
import Film.Eléments.Coordonnées.Coord;



public class AppliTest {
	
	public static void main(String[] args) throws FileNotFoundException {

		ES es = new ES("C:/Users/Coac/Desktop/test.txt");
		Film film = new Film();
		Image image = new Image(10,10);
		//Texte texte = new Texte("123456789", 2);
		//image.add(texte);
		Ligne ligne = new Ligne('a',new Coord(0,0)	, new Coord(0,4));
		image.add(ligne);
		film.add(image);
		
		Image image2 = new Image(image);
		Ligne ligne2 = new Ligne('a',new Coord(0,4)	, new Coord(4,4));
		image2.add(ligne2);
		film.add(image2);
		
		Image image3 = new Image(image2);
		Ligne ligne3 = new Ligne('a',new Coord(4,4)	, new Coord(4,0));
		image3.add(ligne3);
		film.add(image3);
		
		Image image4 = new Image(image3);
		Ligne ligne4 = new Ligne('a',new Coord(0,0)	, new Coord(4,0));
		image4.add(ligne4);
		film.add(image4);
		
		
		es.écrire(film);
	}

}
