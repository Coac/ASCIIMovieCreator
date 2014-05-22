package Coordonnées;

/**
 * Coord est la classe permettant la gestion de coordonnées 2D positives. Elle 
 * permet de simplifier l'utilisation des données renseignant la position d'un
 * élément dans le plan en utlisant des couples de coordonnées (x,y) tout en
 * proposant une fonction de conversion permettant de retourner un couple au 
 * type désiré pour le stockage prévu dans l'interface IConvCoord.
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @version 1.0
 * @see     IConvCoord
 * @since   1.0
 */
public class Coord {

    private int x;  // Coordonnée en abscisse
    private int y;  // COordonnée en ordonnée

    /**
     * Crée un couple de coordonnées à partir d'un couple donné en paramètre.
     * Les coordonnées ne peuvent être négative.
     * 
     * @param x coordonnée en abscisse
     * @param y coordonnée en ordonnée
     * @since   1.0
     */
    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    
    public Coord(Coord c1) {
		this.x = c1.x;
		this.y = c1.y;
	}

	/**
     * 
     * @return  coordonnée de l'objet en abscisse
     * @since   1.0
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @return  coordonnée en ordonnée
     * @since   1.0
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @param x coordonnée en abscisse
     * @since   1.0
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @param y coordonnée en ordonnée
     * @since   1.0
     */
    public void setY(int y) {
        this.y = y;
    }
          
    /**
     * Renvoie la nouvelle coordonée après une rotation d'angle "angle" et de centre "centre"
     * 
     * 
     * @param angle     valeur de l'angle de rotation en radian
     * @param centre    centre de rotation
     * @return		la nouvelle coordonnées après rotation
     * @since           1.0
     */
    public Coord rotationReturn(double angle, Coord centre) {
         return new Coord((int)Math.round(Math.cos(angle)*(this.x - centre.getX()) - Math.sin(angle)*(this.y - centre.getY()) + centre.getX()), 
        				 (int)Math.round(Math.sin(angle)*(this.x - centre.getX()) + Math.cos(angle)*(this.y - centre.getY()) + centre.getY()) );
        
        
    }
    
    
    /**
     * Renvoie la nouvelle coordonée après une rotation d'angle "angle" et de centre "centre"
     * 
     * 
     * @param angle     valeur de l'angle de rotation en degré
     * @param centre    centre de rotation
     * @return          la nouvelle coordonnées après rotation
     * @since           1.0
     */
    public Coord rotationReturnD(double angle, Coord centre) {
        return rotationReturn(Math.toRadians(angle), centre);
    }
    
    
    /**
     * Soustraction des coordonnées par une autre
     * 
     * @param coord     opérande de droite de la soustraction
     * @return 		    le résultat de la soustraction
     * @since           1.0
     */
    public Coord moins(Coord coord) {
    	return new Coord(x-coord.getX(), y-coord.getY());
    	
    }

    /**
     * Addition des coordonnées par une autre
     * 
     * @param coord     opérande de droite de la soustraction
     * @return 		    le résultat de la soustraction
     * @since           1.0
     */
	public Coord plus(Coord coord) {
		return new Coord(x+coord.getX(), y+coord.getY());
	}
	   
    /**
     * Test si deux Coord sont égaux
     * 
     * @param coord     La Coord à comparer
     * @return 		    true si égal, sinon false
     * @since           1.0
     */
	public boolean equals(Coord coord) {
		return (x == coord.getX() && y == coord.getY());
	}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.x;
        hash = 37 * hash + this.y;
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
        final Coord other = (Coord) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
        
        
	
    /**
     * Test si l'abcisse des deux Coord sont égaux
     * 
     * @param coord     La Coord à comparer
     * @return 		    true si égal, sinon false
     * @since           1.0
     */
	public boolean equalsX(Coord coord) {
		return (x == coord.getX());
	}
	
    /**
     * Test si l'ordonnée des deux Coord sont égaux
     * 
     * @param coord     La Coord à comparer
     * @return 		    true si égal, sinon false
     * @since           1.0
     */
	public boolean equalsY(Coord coord) {
		return (y == coord.getY());
	}
	
	
	
    /**
     * Test si la coordonnée est dans le cadre
     * défini par les coord début et fin
     * 
     * @param départ    La Coord de départ
     * @param fin     	La Coord de fin
     * @return 		    true si oui, sinon false
     * @since           1.0
     */
	public boolean estDans(Coord début, Coord fin) {
		return x >= début.getX() && x <= fin.getX() && y >= début.getY() && y <= fin.getY();
	}
	
	
    /**
     * Echange les valeurs des deux Coord
     * c1 aura la valeur de c2
     * c2 aura la valeur de c1
     * 
     * @param c1    	La Coord c1
     * @param c2     	La Coord c2
     * @return 		    true si oui, sinon false
     * @since           1.0
     */
	static public void échange(Coord c1, Coord c2) {
		Coord temp = new Coord(c1);
		c1 = c2;
		c2 = temp;
	}
	
	
	
	
	/**
     * Retourne une chaine de caractère qui 
     * correspond au Coord
     * 
     * @return 		    la chaine de caractère
     * @since           1.0
     */
	@Override
	public String toString() {
		return new String("["+ x +", " + y +"]");
	}
	
	
	
}
