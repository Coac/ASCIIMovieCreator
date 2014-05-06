package Film.Eléments.Coordonnées;

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
public class Coord implements IConvCoord<Integer> {

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
          
    @Override
    public Integer convCoord() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
	
	
	
}
