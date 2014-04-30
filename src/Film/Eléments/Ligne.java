package Film.Eléments;

import java.util.ArrayList;

import Film.Eléments.Coordonnées.Coord;

public class Ligne extends Elément{
	private ArrayList<Caractère> caractères = new ArrayList<Caractère>();
	
	/**
     * Crée une Ligne à partir d'un char et de deux points de coordonnées
     * c1 et c2.
     * 
     * @param caractère		valeur du caractère
     * @param coord			coordonnées du 1er point
     * @param coord			coordonnées du 2e point
     * 
     * @since   1.0
     */
	public Ligne(char caractère, Coord c1, Coord c2) {
		assert(c1.equals(c2)); // Vaut mieux utiliser un Caractère dans ce cas là
		
		// On veut que c1 soit le plus petit en abcsisse
		if(c1.getX() > c2.getX()) {
			Coord temp = c1;
			c1 = c2;
			c2 = temp;
		}
		
		// -------  Si les même abcisses, ligne verticale ---------
		if(c1.getX() == c2.getX()) {
			if(c1.getY() > c2.getY()) {
				Coord temp = c1;
				c1 = c2;
				c2 = temp;
			}
			
			for(int y=c1.getY(); y<=c2.getY(); ++y) {
				caractères.add(new Caractère(caractère, new Coord(c1.getX(), y)));
			}
		}
		else { // -------- Sinon ----------------------------------
			
			double a = coeffDir(c1, c2);
			double b = ordAOrigine(c1, c2);
			
			for(int x=c1.getX(); x<=c2.getX(); ++x) {
				caractères.add(new Caractère(caractère, new Coord(x,(int) Math.round(a*x+b))));
			}
		}
			
	}

	
	/**
     * Retourne le coefficient directeur de la droite
     * créée par 2 points de coordonées c1 et c2.
     * 
     * @param coord			coordonnées du 1er point
     * @param coord			coordonnées du 2e point
     * @return 				le coefficient directeur
     * 
     * @since   1.0
     */
	private static double coeffDir(Coord c1, Coord c2) {
		assert(c2.getX()-c1.getX() > 0);
		return (c2.getY()-c1.getY())/(c2.getX()-c1.getX());
	}
	
	/**
     * Retourne l'ordonnée à l'origine de la droite
     * créée par 2 points de coordonées c1 et c2.
     * 
     * @param coord			coordonnées du 1er point
     * @param coord			coordonnées du 2e point
     * @return 				l'ordonnée à l'origine
     * 
     * @since   1.0
     */
	private static double ordAOrigine(Coord c1, Coord c2) {
		assert(c2.getX()-c1.getX() != 0);
		return (c2.getX()*c1.getY() - c1.getX()*c2.getY())/(c2.getX()-c1.getX());
		
	}
	
	
	
	public Caractère get(int i) {
		assert(i < caractères.size());
		return caractères.get(i);
	}
	
	public int size() {
		return caractères.size();
	}
}
