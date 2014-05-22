package projetjava;

import java.io.FileNotFoundException;

import ES.ES;
import Film.Film;
import Film.Image;
import Eléments.Cadre;
import Eléments.Caractère;
import Eléments.Extrait;
import Eléments.Ligne;
import Eléments.Texte;
import Coordonnées.Coord;



public class AppliTest {
	
	public static void main(String[] args) throws FileNotFoundException {

		ES es = new ES("C:/test.txt");
		Film film = new Film();
		
		
		Texte texte = new Texte("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO", 4);
		Caractère c = new Caractère('c',new Coord(20,20));
		Cadre cadre = new Cadre('-',texte);
		Image image = new Image(60,60);
                Ligne ligne = new Ligne('l', new Coord(10,1), new Coord(18,7));
		
		texte.déplacer(new Coord(5,5));
		Extrait extrait = new Extrait(texte, new Coord(0,0), new Coord(4,4));
		image.add(extrait);
                image.add(ligne);
                Image image2 = image.clone();
                extrait.déplacer(new Coord(20,20));
		ligne.redimensionner(0, 5);
                //image.add(cadre);
		//image.add(c);
		film.add(image);
                film.add(image2);
                
                

		
		
		es.écrire(film);
	}

}
