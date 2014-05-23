package Eléments;

import java.util.LinkedList;

import Coordonnées.Coord;
import Film.Caractère;

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
        
    /**
     * Permet de vérifier si une ligne occupe une certaine coordonnée 
     * 
     * @param coord les coordonnées
     * @return      true si coord est occupée par un Caractère de Ligne
     */
    public boolean estCoordDeLigne(Coord coord){
		for (Caractère caractère : caractères) {
			if(caractère.getCoord().equals(coord))
				return true;
		}
    	return false;
        
    }
    
    /**
     * Allonge une ligne à ses deux extrémités, la fonction ne fonctionne que
     * pour les lignes obliques à 45°, verticales et horizontales
     * 
     * @param début
     * @param fin
     */
    public void allonger(int début, int fin) {
    	double coeff = coeffDir(caractères.getFirst().getCoord(), caractères.getLast().getCoord());
        if (coeff != 0 && coeff != 1 && coeff != -1 && caractères.getFirst().getCoord().getY() != caractères.getLast().getCoord().getY() )
            throw new UnsupportedOperationException("Allonger ne fonctionne que pour les lignes oblique à 45 degrés, verticales et horizontales");
        
    	int x1,y1,x2,y2;
    	if(caractères.getFirst().getCoord().getX() == caractères.getLast().getCoord().getX())
    	{
    		
    		if(caractères.getFirst().getCoord().getY() < caractères.getLast().getCoord().getX()) {
    			y1 = caractères.getFirst().getCoord().getY() - début;
    			y2 = caractères.getLast().getCoord().getY() + fin;
    			
    		}
    		else {
    			y1 = caractères.getLast().getCoord().getY() - début;
    			y2 = caractères.getFirst().getCoord().getY() + fin;
    		}
    		x1 = caractères.getFirst().getCoord().getX();
			x2 = x1;	
    		
			
    	}
    	else {
	    	x1 = caractères.getFirst().getCoord().getX() - début;
	    	x2 = caractères.getLast().getCoord().getX() + fin;
	    	double a = coeffDir(caractères.getFirst().getCoord(), caractères.getLast().getCoord());
	    	double b = ordAOrigine(caractères.getFirst().getCoord(), caractères.getLast().getCoord());
	    	
	    	y1 = (int) Math.round((double)x1*a + b);
	    	y2 = (int) Math.round((double)x2*a + b);
    	}
    	
    	Ligne tmp = new Ligne(caractères.getFirst().getCaractère(), new Coord(x1,y1), new Coord(x2,y2));
    	System.out.println(new Coord(x1,y1).toString() + new Coord(x2,y2));
    	
    	int i;
        for (i = 0 ; i <  tmp.size() ; ++i)
                if(caractères.getFirst().getCoord().equals(tmp.get(i).getCoord()))
                	break;
        
        --i;
        for (; i >= 0 ; --i) {
        	int j =0;
        	
        	caractères.addFirst(tmp.get(i));
        	
        	j++;
        	if(j>=début)
        		break;
        }
        
        
        for (i = 0 ; i <  tmp.size() ; ++i)
            if(caractères.getLast().getCoord().equals(tmp.get(i).getCoord()))
            	break;
        
        ++i;
        for (; i < tmp.size() ; ++i) {
        	int j =0;
        	tmp.get(i).modifier(caractères.getLast().getCaractère());
        	caractères.addLast(tmp.get(i));
        	
        	j++;
        	if(j>=fin)
        		break;
        }
    	
    }
     
    /**
     * Raccourcit une ligne 
     * 
     * @param début Nombre de caractère à supprimer au début
     * @param fin   Nombre de caractère à supprimer à la fin
     */
    public void diminuer(int début, int fin) {
                assert(début + fin > size());
                for (int i = 0 ; i < début ; ++i)
                    caractères.removeFirst();
                for (int i = 0 ; i < début ; ++ i)
                    caractères.removeLast();
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
