package projetjava;

import java.io.FileNotFoundException;

import ES.ES;
import Film.Film;
import Film.Image;
import Film.Eléments.Cadre;
import Film.Eléments.Caractère;
import Film.Eléments.Extrait;
import Film.Eléments.Ligne;
import Film.Eléments.Texte;
import Film.Eléments.Coordonnées.Coord;



public class AppliTest {
	
	public static void main(String[] args) throws FileNotFoundException {

		ES es = new ES("C:/Users/Coac/Desktop/test.txt");
		Film film = new Film();
		
		
		Texte texte = new Texte("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO", 4);
		Caractère c = new Caractère('c',new Coord(20,20));
		Cadre cadre = new Cadre('-',texte);
		Image image = new Image(60,60);
		
		texte.déplacer(new Coord(5,5));
		Extrait extrait = new Extrait(texte, new Coord(0,0), new Coord(4,4));
		image.add(extrait);
		//image.add(cadre);
		//image.add(c);
		film.add(image);

		
		
		es.écrire(film);
	}

}
