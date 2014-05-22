package Eléments;

import java.util.LinkedList;

import Coordonnées.Coord;
import java.util.Objects;



/**
 * Une ligne est un élément complexe composé d'une liste de caractères.
 * La classe Ligne implémentant ISimple, IComplexe et IRedimensionner2côtés
 * elle offre à l'utilisateur les méthodes nécessaire pour pouvoir déplacer
 * l'élément, modifier sa composition ou récupérer un élément simple qui la 
 * compose.
 * De plus, l'utilisation du type Coord rend les opérations de rotation possible
 * et l'évolution vers d'autres types d'éléments complexes (textes et extraits)
 * est elle aussi implémentée.
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @version 1.0
 * @see     Elément
 * @see     Coord
 * @since   1.0
 **/
public class Ligne extends Elément {
	
	
	//private ArrayList<Caractère> caractères = new ArrayList<Caractère>();
	
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
	/*public Ligne(char caractère, Coord c1, Coord c2) {
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
*/
	// ------------------------------------------------------------------------------------
	
    private LinkedList<Caractère> caractères = new LinkedList<Caractère>();
    
    /**
    * Crée une Ligne à partir des points des ses
    * deux extrémités.
    *
    * On utilise l'Algorithme de tracé de segment de Bresenham
    * Source : http://fr.wikipedia.org/wiki/Algorithme_de_trac%C3%A9_de_segment_de_Bresenham
    *
    * @param c             valeur du caractère à tracé
    * @param départ       coordonnée d'une extrémité
    * @param arrivé       coordonnée de l'autre extrémité
    * @since   1.0
    */
    public Ligne(char c, Coord départ, Coord arrivé) {
    	int dx, dy;
    	dx = arrivé.getX() - départ.getX();
    	if (dx != 0) {
    		if (dx > 0) {
    			dy = arrivé.getY() - départ.getY();
    			if (dy != 0) {
    				if (dy > 0) {
    					// vecteur oblique dans le 1er quadran

    					if (dx >= dy) {
    						// vecteur diagonal ou oblique proche de l’horizontale, dans le 1er octant
    						int e = dx;
    						dx = (e) * 2 ; 
    						dy = dy * 2 ;  // e est poiftif
    						while(true) {  // déplacements horizontaux
    							caractères.add(new Caractère(c,new Coord(départ.getX(), départ.getY()))) ;
    							départ.setX(départ.getX() + 1);
    							if ( départ.getX() == arrivé.getX() ) break; ;
    							e = e - dy;
    							if (e < 0) {
    								départ.setY(départ.getY() + 1) ;  // déplacement diagonal
    								e = e + dx ;
    							}
    						}
    					}
    					else {
    						// vecteur oblique proche de la verticale, dans le 2nd octant
    						int e = dy;
    						dy = e * 2 ;
    						dx = dx * 2 ;  // e est poiftif
    						while(true) {  // déplacements verticaux
    							caractères.add(new Caractère(c,new Coord(départ.getX(), départ.getY()))) ;
    							départ.setY(départ.getY() + 1);
    							if (départ.getY() == arrivé.getY()) break; ;
    							e=e-dx;
    							if (e < 0) {
    								départ.setX(départ.getX() + 1) ;  // déplacement diagonal
    								e = e + dy ;
    							}
    						}
    					}
    				}
    				else { // dy < 0 (et dx > 0)
    					// vecteur oblique dans le 4e cadran

    					if (dx >= -dy) {
    						// vecteur diagonal ou oblique proche de l’horizontale, dans le 8e octant
    						int e = dx;
    						dx = e * 2 ; 
    						dy = dy * 2 ;  // e est poiftif
    						while(true) {  // déplacements horizontaux
    							caractères.add(new Caractère(c,new Coord(départ.getX(), départ.getY()))) ;
    							départ.setX(départ.getX() + 1);
    							if (départ.getX() == arrivé.getX()) break; 
    							e=e+dy;
    							if (e < 0) {
    								départ.setY(départ.getY() - 1 );  // déplacement diagonal
    								e = e + dx ;
    							}
    						}
    					}
    					else {  // vecteur oblique proche de la verticale, dans le 7e octant
    						int e =dy;
    						dy = e * 2 ;
    						dx = dx * 2 ;  // e est négatif
    						while(true) {  // déplacements verticaux
    							caractères.add(new Caractère(c,new Coord(départ.getX(), départ.getY()))) ;
    							départ.setY( départ.getY() - 1);
    							if (départ.getY() == arrivé.getY()) break ;
    							e=e+dx;
    							if (e > 0) {
    								départ.setX(départ.getX() + 1) ;  // déplacement diagonal
    								e = e + dy ;
    							}
    						}
    					}

    				}

    			}

    			else {  // dy = 0 (et dx > 0)

    				// vecteur horizontal vers la droite
    				while(true) {
    					caractères.add(new Caractère(c,new Coord(départ.getX(), départ.getY()))) ;
    					départ.setX(départ.getX() + 1);
    					if(départ.getX() == arrivé.getX()) break;
    				}

    			}
    		}
    		else {  // dx < 0
    			dy = arrivé.getY() - départ.getY();
    			if (dy != 0) {
    				if (dy > 0) {
    					// vecteur oblique dans le 2nd quadran

    					if (-dx >= dy) {
    						// vecteur diagonal ou oblique proche de l’horizontale, dans le 4e octant
    						int e = dx ;
    						dx = e * 2 ;
    						dy = dy * 2 ;  // e est négatif
    						while(true) {  // déplacements horizontaux
    							caractères.add(new Caractère(c,new Coord(départ.getX(), départ.getY()))) ;
    							départ.setX(départ.getX() - 1);
    							if (départ.getX()== arrivé.getX()) break;
    							e=e+dy;
    							if (e >= 0) {
    								départ.setY(départ.getY() + 1) ;  // déplacement diagonal
    								e = e + dx ;
    							}
    						}
    					}
    					else {
    						// vecteur oblique proche de la verticale, dans le 3e octant
    						int e = dy ;
    						dy = e * 2 ; 
    						dx = dx * 2 ;  // e est poiftif
    						while(true) {  // déplacements verticaux
    							caractères.add(new Caractère(c,new Coord(départ.getX(), départ.getY()))) ;
    							départ.setY(départ.getY() + 1);
    							if (départ.getY() == arrivé.getY()) break;
    							e=e+dx;
    							if (e <= 0) {
    								départ.setX( départ.getX() - 1 );  // déplacement diagonal
    								e = e + dy ;
    							}
    						}
    					}
    				}
    				else {  // dy < 0 (et dx < 0)
    					// vecteur oblique dans le 3e cadran

    					if (dx <= dy) {
    						// vecteur diagonal ou oblique proche de l’horizontale, dans le 5e octant
    						int e = dx ;
    						dx = e * 2 ;
    						dy = dy * 2 ;  // e est négatif
    						while(true) {  // déplacements horizontaux
    							caractères.add(new Caractère(c,new Coord(départ.getX(), départ.getY()))) ;
    							départ.setX( départ.getX() - 1);
    							if (départ.getX()== arrivé.getX()) break ;
    							e=e-dy;
    							if (e >= 0) {
    								départ.setY(départ.getY() - 1) ;  // déplacement diagonal
    								e = e + dx ;
    							}
    						}
    					}
    					else {  // vecteur oblique proche de la verticale, dans le 6e octant
    						int e=dy ;
    						dy = e * 2 ; 
    						dx = dx * 2 ;  // e est négatif
    						while(true) {  // déplacements verticaux
    							caractères.add(new Caractère(c,new Coord(départ.getX(), départ.getY()))) ;
    							départ.setY(départ.getY() - 1);
    							if (départ.getY()== arrivé.getY()) break ;
    							e=e-dx;
    							if (e >= 0) {
    								départ.setX(départ.getX() - 1) ;  // déplacement diagonal
    								e = e + dy ;
    							}
    						}
    					}

    				}
    			}
    			else {  // dy = 0 (et dx < 0)

    				// vecteur horizontal vers la gauche
    				while(true) {
    					caractères.add(new Caractère(c,new Coord(départ.getX(), départ.getY()))) ;
    					départ.setX( départ.getX() - 1);
    					if(départ.getX()== arrivé.getX()) break ;
    				}

    			}
    		}
    	}
    	else {  // dx = 0
    		dy = arrivé.getY() - départ.getY();
    		if (dy != 0) {
    			if (dy > 0) {

    				// vecteur vertical croissant
    				while(true) {
    					caractères.add(new Caractère(c,new Coord(départ.getX(), départ.getY()))) ;
    					départ.setY(départ.getY() + 1);
    					if(départ.getY() == arrivé.getY()) break ;
    				}
    			}
    			else {  // dy < 0 (et dx = 0)

    				// vecteur vertical décroissant
    				while(true) {
    					caractères.add(new Caractère(c,new Coord(départ.getX(), départ.getY()))) ;
    					départ.setY(départ.getY() - 1);
    					if(départ.getY()== arrivé.getY()) break ;

    				}
    			}
    		}
    	}
    	
    	caractères.add(new Caractère(c,new Coord(arrivé.getX(), arrivé.getY())));

    }
    
    /**
     * Créer une copie de Ligne
     * 
     * @param ligne     la ligne à recopier
     * @since 1.0
     */
    public Ligne(Ligne ligne) {
            for (Caractère caractère : ligne.caractères) {
                caractères.add(caractère.clone());
            }
    }
        

    public boolean estCoordDeLigne(Coord coord){
		for (Caractère caractère : caractères) {
			if(caractère.getCoord().equals(coord))
				return true;
		}
    	return false;
        
    }
    

    public void redimensionner(int début, int fin) {
            if (début)    
                
    }
    
    private void allonger(Ligne ligne, int début, int fin) {
            int distance = (int) Math.sqrt((caractères.getFirst().getCoord().getX() - caractères.getLast().getCoord().getX())^2 +
                                       (caractères.getFirst().getCoord().getY() - caractères.getLast().getCoord().getY())^2);
            Coord cf = new Coord(caractères.getFirst().getCoord().getX() + (caractères.getFirst().getCoord().getX() - caractères.getLast().getCoord().getX()) / distance * fin,
                            caractères.getFirst().getCoord().getX() + (caractères.getFirst().getCoord().getX() - caractères.getLast().getCoord().getX()) / distance * fin);
            
            Coord cd = new Coord(caractères.getLast().getCoord().getX() + (caractères.getLast().getCoord().getX() - caractères.getFirst().getCoord().getX()) / distance * début,
                            caractères.getLast().getCoord().getY() + (caractères.getLast().getCoord().getY() - caractères.getFirst().getCoord().getY()) / distance * début);
            
            
            Ligne tmp = new Ligne(' ', cd, cf);
            
            int i = 0;
            for (int i = 0 ; i < début ; ++i)
                    tmp.caractères.get(i).modifier(ligne.caractères.getFirst().getCaractère());
            
            
            for (; i < fin ; ++i)
                    tmp.caractères.get(i).modifier(ligne.caractères.getFirst().getCaractère());
            
        
            
    }
    
    private void diminuer(int début, int fin) {
                assert(début + fin > size());
                for (int i = 0 ; i < début ; ++i)
                    caractères.removeFirst();
                for (int i = 0 ; i < début ; ++ i)
                    caractères.removeLast();
    }

    // ------------------------------------------------------------------------------------
	
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
	
	
	@Override
	public Caractère get(int i) {
		assert(i < caractères.size());
		return caractères.get(i);
	}
	
	@Override
	public int size() {
		return caractères.size();
	}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.caractères);
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
        final Ligne other = (Ligne) obj;
        if (!Objects.equals(this.caractères, other.caractères)) {
            return false;
        }
        return true;
    }
        
	
        @Override
        public Ligne clone() {
            return new Ligne(this);
        }
	
	
}
