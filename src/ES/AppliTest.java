package ES;

import java.io.FileNotFoundException;

import Film.Film;
import Film.Image;
import Film.Eléments.Cadre;
import Film.Eléments.Caractère;
import Film.Eléments.Ligne;
import Film.Eléments.Texte;
import Film.Eléments.Coordonnées.Coord;



public class AppliTest {
	
	public static void main(String[] args) throws FileNotFoundException {

		ES es = new ES("C:/Users/Coac/Desktop/test.txt");
		Film film = new Film();
		
		
		for (double i = 0; i < 361; i+=1) {
			Texte texte = new Texte("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO", 40);
			Caractère c = new Caractère('c',new Coord(20,20));
			double degré = i;
			texte.rotationD(degré, new Coord(20,20));
			Cadre cadre = new Cadre('-',texte);
			Image image = new Image(60,60);
			image.add(texte);
			image.add(cadre);
			image.add(c);
			film.add(image);
			
		}

		
		
		es.écrire(film);
	}

}
