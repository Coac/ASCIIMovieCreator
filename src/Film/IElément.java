/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Film;

import Coordonnées.Coord;

/**
 *
 * @author scalpa
 */
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
    
    
	IElément clone();

}
