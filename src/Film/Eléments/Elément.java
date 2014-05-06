package Film.Eléments;

import Film.Eléments.Coordonnées.Coord;

/**
 * La classe élément est le supertype à la base de tous les éléments utilisables
 * de l'application.
 * Elle contient donc les attributs et méthodes communes à TOUS les éléments.
 * Chaque Elément contient des Caractères
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @version 1.0
 * @since   1.0
 */
public abstract class Elément {
    
    /**
     * Retourne le Caractère qui correspond à l'indice
     * passé en paramètre
     * 
     * @param i		l'indice
     * @return 		le Caractère
     * @since   1.0
     */
	public abstract Caractère get(int i);
	
	
	
    /**
     * Retourne le nombre de Caractères présent
     * dans l'élément
     * 
     * @return le nombre de Caractère
     * @since   1.0
     */
	public abstract int size();
	
	
	
    /**
     * Réalise une rotation d'angle "angle" et de centre "centre" sur la Ligne
     * 
     * 
     * @param angle     valeur de l'angle de rotation en radian
     * @param centre    centre de rotation
     * @since           1.0
     */
    public void rotation(double angle, Coord centre) {
    	for (int i = 0; i < size(); i++) {
	    	get(i).setCoord(get(i).getCoord().rotationReturn(angle, centre));
    	}
    	
    }
    
    /**
     * Réalise une rotation d'angle "angle" et de centre "centre" sur la Ligne
     * 
     * 
     * @param angle     valeur de l'angle de rotation en degré
     * @param centre    centre de rotation
     * @since           1.0
     */
    public void rotationD(double angle, Coord centre) {
    	for (int i = 0; i < size(); i++) {
	    	get(i).setCoord(get(i).getCoord().rotationReturnD(angle, centre));
    	}
    	
    	
    	
    	
    	
    }
	
}
