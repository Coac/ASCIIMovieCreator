package Film;

import java.util.LinkedList;


/**
 * Le Film est un ensemble d'images. Il peut
 * être affiché à l'aide de la classe ES.
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @version 1.0
 * @see     Image
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

}
