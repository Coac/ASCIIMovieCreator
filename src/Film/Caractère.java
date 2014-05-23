package Film;

import java.util.AbstractList;

import Coordonnées.Coord;
import Eléments.Elément;

import java.util.Objects;

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
 * @see     Coord
 * @since   1.0
 **/

public class Caractère extends Elément {

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
    * Change la valeur du caractère
    * 
    * @param c			nouvelle valeur du caractère
    * @since   1.0
    */
    public void modifier(char c) {
        caractère = c;
    }
	
	
    /**
    *
    * Change les coordonnées du caractère
    * 
    * @param coord		nouvelles coordonnées du caractère
    * @since   1.0
    */
    @Override
    public void déplacer(Coord coord) {
        this.coord = coord;
    }
    
    
    /**
    *
    * Renvoie l'indice du caractère dont sa coordonnée correspond
    * à celle passée en paramètre 
    *
    * @param caractères		la liste de caractères
    * @param coord			la coordonnée
    * @since   1.0
    */
    static public int indexOf(AbstractList<Caractère> caractères, Coord coord) throws Exception {
		for (int i = 0; i < caractères.size(); i++) {
			if(caractères.get(i).getCoord().equals(coord))
				return i;
		}
    	
    	throw new Exception("Le caractère dont la coordonnée n'est pas présent dans la Liste");
    	
    }
    
    /**
    *
    * Renvoie le caractère dont sa coordonnée correspond
    * à celle passée en paramètre 
    *
    * @param caractères		la liste de caractères
    * @param coord		la coordonnée
    * @return                   le caractère
    * @throws Exception 
    * @since   1.0
    */
    static public Caractère caractèrePrésent(AbstractList<Caractère> caractères, Coord coord) throws Exception {
		return caractères.get(indexOf(caractères,coord));
    	
    }

	@Override
	public Caractère get(int i) {
		return this;
	}

	@Override
	public int size() {
		return 1;
	}


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.caractère;
        hash = 53 * hash + Objects.hashCode(this.coord);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caractère other = (Caractère) obj;
        if (this.caractère != other.caractère) {
            return false;
        }
        if (!Objects.equals(this.coord, other.coord)) {
            return false;
        }
        return true;
    }
        
    @Override
    public Caractère clone() {
        return new Caractère(this);
    }
	
	

	
    
}
