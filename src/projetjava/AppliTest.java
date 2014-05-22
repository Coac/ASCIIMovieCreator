package projetjava;

import java.io.FileNotFoundException;

import ES.ES;
import Film.Caractère;
import Film.Film;
import Film.Image;
import Eléments.Cadre;
import Eléments.Extrait;
import Eléments.Ligne;
import Eléments.Texte;
import Coordonnées.Coord;



public class AppliTest {
	
	public static void main(String[] args) throws FileNotFoundException {

		ES es = new ES("C:/test.txt");
		Film film = new Film();
		
		
		Image image = new Image(60,60);
        Ligne ligne = new Ligne('l', new Coord(1,1), new Coord(5,5));
		
                image.add(ligne);
                ligne.get(3).modifier('o');
		Ligne lign2 = new Ligne(ligne);
		Image image2 = new Image(image);
		
		
		lign2.allonger(5, 5);
		
		image2.add(lign2);
		
		film.add(image);
                film.add(image2);
                
                

		
		
		es.écrire(film);
	}

}
