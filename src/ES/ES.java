package ES;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import Film.Film;
import Film.Image;



/**
 * La classe ES permet de gérer les entrées-sorties
 * On peut ainsi sauvegarder un film dans un fichier txt
 * mais aussi en charger.
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @see Film
 * @see Image
 * @version 1.0
 * @since   1.0
 **/
public class ES {
	
	private String chemin;
	
	
    /**
    *
    * Le constructeur permet d'indiquer le chemin du
    * fichier txt dans lequel on va lire ou écrire.
    *
    * @param chemin		le chemin du fichier
    * @since   1.0
    */
	public ES(String chemin) {
		this.chemin = new String(chemin);
	}
	
	
    /**
    *
    * Permet d'écrire l'Image dans le fichier
    * indiqué dans le constructeur
    *
    * @param image		l'image
    * @throws 			FileNotFoundException
    * @since   1.0
    */
	public void écrire(Image image) throws FileNotFoundException {
		PrintWriter out;
		out = new PrintWriter(chemin);
		
		out.println(image.getX() + " " + image.getY());
		out.println(image.toString());
		out.println("\\newframe");
		out.close();
	}
	
	
    /**
    *
    * Permet d'écrire toutes les
    * images du Film dans le fichier
    * indiqué dans le constructeur
    *
    * @param film		le film
    * @throws 			FileNotFoundException
    * @since   1.0
    */
	public void écrire(Film film) throws FileNotFoundException {

		for (int i = 0; i < film.size(); i++) {
			écrire(film.get(i));
		}

	}

}
