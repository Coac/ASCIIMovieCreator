package Eléments;

import java.util.ArrayList;

import Film.Image;
import Coordonnées.Coord;
import java.util.Objects;

/**
 * Le Texte est un bloc de caractères qui peut être créer à partir d'un String.
 * Sa taille peut être choisi : largeur, hauteur
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @version 1.0
 * @see     Elément
 * @see     IComplexe
 * @see     Coord
 * @since   1.0
 **/

public class Cadre extends Elément {
	
	private ArrayList<Caractère> caractères = new ArrayList<Caractère>();
	
	/**
     * Créer un Cadre à partir de deux coordonnées
     * 
     * @param coord1		1ere Coordonnées
     * @param coord2		2e Coordonnées
     * @param c				le caractère utilisé pour dessiner le cadre
     * @since   1.0
     */
	public void cadre(char c, Coord coord1, Coord coord2) {
		caractères.clear();
		Image image = new Image(1,1);
		image.add(new Ligne(c,new Coord(coord1.getX(), coord1.getY()), new Coord(coord1.getX(), coord2.getY())));
		image.add(new Ligne(c,new Coord(coord1.getX(), coord1.getY()), new Coord(coord2.getX(), coord1.getY())));
		image.add(new Ligne(c,new Coord(coord2.getX(), coord2.getY()), new Coord(coord2.getX(), coord1.getY())));
		image.add(new Ligne(c,new Coord(coord2.getX(), coord2.getY()), new Coord(coord1.getX(), coord2.getY())));

		for (int i = 0; i < image.size(); i++) {
			for (int j = 0; j < image.get(i).size(); j++) {
				caractères.add(image.get(i).get(j));
			}
		}
		
	}
	
	
    /**
     * Créer un Cadre à partir d'un élément.
     * L'élément va être encadrer par ce premier
     * 
     * @param élément		l'élément
     * @param c				le caractère utilisé pour dessiner le cadre
     * @since   1.0
     */
	public Cadre(char c, Elément élément) {
		int minX = élément.get(0).getCoord().getX();
		int maxX = élément.get(0).getCoord().getX();
		int minY = élément.get(0).getCoord().getY();
		int maxY = élément.get(0).getCoord().getY();
		
		
		
		for (int i = 1; i < élément.size(); i++) {
			// On trouve maxX et minX
			if(élément.get(i).getCoord().getX() < minX)
				minX = élément.get(i).getCoord().getX();
			else if(élément.get(i).getCoord().getX() > maxX)
				maxX = élément.get(i).getCoord().getX();
			
			// On trouve maxY et minY
			if(élément.get(i).getCoord().getY() < minY)
				minY = élément.get(i).getCoord().getY();
			else if(élément.get(i).getCoord().getY() > maxY)
				maxY = élément.get(i).getCoord().getY();
		}
		minX -= 1;
		minY -= 1;
		maxX += 1;
		maxY += 1;
		
		cadre(c, new Coord(minX, minY), new Coord(maxX,maxY));
		
	}
        
    /**
     * Crée une copie de Cadre
     * 
     * @param cadre     le cadre à copier
     * @since 1.0       
     */
    public Cadre(Cadre cadre) {
                for (Caractère caractère : cadre.caractères)
                    caractères.add(caractère.clone());
        }

	@Override
	public Caractère get(int i) {
		assert(i<caractères.size());
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
        final Cadre other = (Cadre) obj;
        if (!Objects.equals(this.caractères, other.caractères)) {
            return false;
        }
        return true;
    }

        
        
        @Override
        public Cadre clone() {
                return new Cadre(this);
        }
	

	
	

}