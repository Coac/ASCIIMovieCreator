package ES;

import java.io.FileNotFoundException;

import Film.Film;
import Film.Image;
import Film.Eléments.Caractère;
import Film.Eléments.Ligne;
import Film.Eléments.Texte;
import Film.Eléments.Coordonnées.Coord;



public class AppliTest {
	
	public static void main(String[] args) throws FileNotFoundException {

		ES es = new ES("C:/Users/Coac/Desktop/test.txt");
		Film film = new Film();
		
		
		for (double i = 0.1; i < 6.29; i+=0.1) {
			Texte texte = new Texte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 40);
			Caractère c = new Caractère('c',new Coord(20,20));
			double degré = i;
			texte.rotation(degré, new Coord(20,20));
			Image image = new Image(50,50);
			image.add(texte);
			image.add(c);
			film.add(image);

		}

		
		
		es.écrire(film);
	}

}
