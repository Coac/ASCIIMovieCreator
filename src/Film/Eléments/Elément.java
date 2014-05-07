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
    	for (int i = 0; i < size(); i++) 
	    	get(i).setCoord(get(i).getCoord().rotationReturnD(angle, centre));
    }
    	
    	
    	
	 /**
     * Déplace l'élément à la coordonée passé en paramètre
     * Le point de repère est le premiere caractère de l'élément
     * 
     * @param coord				la coordonnée
     * @since   1.0
     */
	public void déplacer(Coord coord) {
		Coord deltaCoord = coord.moins(get(0).getCoord());
		for (int i = 0; i < size(); i++)
			get(i).déplacer(get(i).getCoord().plus(deltaCoord));

	}
	
    /**
     * Modifier permet de changer la valeur des caractères contenus
     *  dans un élément  
     * 
     * @param c 		nouveau caractère de l'élément
     * @since   1.0
     */
    void modifier(char c) {
    	for (int i = 0; i < size(); i++)
    		get(i).modifier(c);
    }
    
    
    
    /**
     * Modifie le Caractère contenu dans à la position coord
     * S'il n'ya rien à cette position, la méthode ne fait rien
     * 
     * @param c 		nouveau char du Caractère
     * @pram coord		les coordonnées du Caractère
     * @since   1.0
     */
    public void modifier(char c, Coord coord) {
    	for (int i = 0; i < size(); i++){
            if (get(i).getCoord() == coord)
                get(i).modifier(c);
        }
    }
    	
    	
    	
    	
    	
	
}
