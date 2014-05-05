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
	
		
		for (double i = 0.1; i < 6.29; i+=0.1) {
			Texte texte = new Texte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 5);
			double degré = i;
			texte.rotation(degré, new Coord(10,10));
			Image image = new Image(30,30);
			image.add(texte);
			film.add(image);

		}

		
		
		es.écrire(film);
	}

}
