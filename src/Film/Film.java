package Film;

import java.util.LinkedList;


/**
 * Le Film est un ensemble d'images.
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @see     Image
 * @version 1.0
 * @since   1.0
 **/
public class Film {
	
	private LinkedList<Image> images = new LinkedList<Image>();

	
	
    /**
    *
    * Retourne le nombre d'images
    * contenu dans le Film
    *
    * @return			le nb d'images
    * @since   1.0
    */
	public int size() {
		return images.size();
	}
	

    /**
    *
    * Retourne une image qui compose
    * le film de la position i
    *
    * @param i			la position
    * @return			l'image
    * @since   1.0
    */
	public Image get(int i) {
		assert(i>=0 && i< images.size());
		return images.get(i);
	}
	
    /**
    * Ajoute une image au film
    * positionnée à la fin
    *
    * @param image			l'image
    * @since   1.0
    */
	public void add(Image image) {
		assert(image != null);
		images.add(image);
	}
	
    /**
    * Ajoute une image au film
    * positionnée à la position indiquée par le paramètre
    *
    * @param image			l'image
    * @param position		la position
    * @since   1.0
    */
	public void add(Image image, int position) {
		assert(image != null && position >0 && position < images.size());
		images.add(position, image);
	}

}
