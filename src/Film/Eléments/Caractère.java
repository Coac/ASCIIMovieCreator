package Film.Eléments;

import Film.Eléments.Coordonnées.Coord;

/**
 * Le caractère est l'élément simple de l'application, c'est le plus petit
 * élément utilisable. 
 * Il est possible de le déplacer en changeant ses
 * ses coordonnées, de changer sa valeur, ou de créer des éléments complexes à
 * partir d'un caractère.
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @version 1.0
 * @see     Elément
 * @see     ISimple
 * @see     Coord
 * @since   1.0
 **/

public class Caractère extends Elément implements ISimple<Coord> {

    private char caractère;
    private Coord coord;
    
    
    /**
     * Crée un Caractère à partir d'un char et d'un Coord.
     * 
     * @param caractère		valeur du caractère
     * @param coord			coordonnées du caractère
     * @since   1.0
     */
    public Caractère(char caractère, Coord coord) {
		this.caractère = caractère;
		this.coord = coord;
	}
    
    /**
     * Crée une copie d'un Caractère, le caractère crée
     * aura les même coordonnées et la même valeur que
     * le Caractère reçu en paramètre
     * 
     * @param caractère		objet Caractère à copié
     * @since   1.0
     */
    public Caractère(Caractère caractère) {
		this.caractère = caractère.getCaractère();
		this.coord = caractère.getCoord();

    }
    
    /**
     * 
     * @return  valeur du caractère
     * @since   1.0
     */
	public char getCaractère() {
		return caractère;
	}
	
    /**
     * 
     * @return  coordonnées du caractère
     * @since   1.0
     */
	public Coord getCoord() {
		return coord;
	}
	
	
	/**
    *
    * @param c			nouvelle valeur du caractère
    * @since   1.0
    */
	@Override
    public void modifier(char c) {
        caractère = c;
    }
	
	
	/**
    *
    * @param coord		nouvelles coordonnées du caractère
    * @since   1.0
    */
    @Override
    public void déplacer(Coord coord) {
        this.coord = coord;
    }
    
}
