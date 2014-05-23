package Film;

import Coordonnées.Coord;

/**
 * Le Film est un ensemble d'images.
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @see     Image
 * @version 1.0
 * @since   1.0
 **/
public interface IElément {
    
    /**
     * Retourne le Caractère qui correspond à l'indice
     * passé en paramètre
     * 
     * @param i		l'indice
     * @return 		le Caractère
     * @since   1.0
     */
    Caractère get(int i);

    /**
     * Retourne le nombre de Caractères présent
     * dans l'élément
     * 
     * @return le nombre de Caractère
     * @since   1.0
     */
    int size();
    
    /**
     * Réalise une rotation d'angle "angle" et de centre "centre" sur la Ligne
     * 
     * 
     * @param angle     valeur de l'angle de rotation en radian
     * @param centre    centre de rotation
     * @since           1.0
     */
    void rotation(double angle, Coord centre);
    
    /**
     * Réalise une rotation d'angle "angle" et de centre "centre" sur la Ligne
     * 
     * 
     * @param angle     valeur de l'angle de rotation en degré
     * @param centre    centre de rotation
     * @since           1.0
     */
    void rotationD(double angle, Coord centre);
    
     /**
     * Déplace l'élément à la coordonée passé en paramètre
     * Le point de repère est le premiere caractère de l'élément
     * 
     * @param coord				la coordonnée
     * @since   1.0
     */
    void déplacer(Coord coord);
    
    /**
     * Renvoie une copie profonde d'un élément
     * 
     * @return  la copie de l'élément
     * @since   1.0
     */
	IElément clone();

}
