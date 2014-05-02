package Film;

import java.util.LinkedList;

import Film.Eléments.Elément;




/**
 * Une Image est un ensemble d'éléments. Chaque éléments peut
 * être placé à des profondeurs différents. Une image possède
 * une largeur et une longueur.
 * L'élément qui a une profondeur
 * plus haute va écraser les éléments qui
 * ont une profondeur plus faible si jamais il y a
 * des caractères à une même position. 
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @see Elément
 * @version 1.0
 * @since   1.0
 **/
public class Image {
	
	private LinkedList<Elément> éléments = new LinkedList<Elément>();
	
	private int x;
	private int y;
	
	
    /**
    * Construit une Image vide de taille x,y
    *
    * @param x			la largeur
    * @param y			la longueur
    * @since   1.0
    */
	public Image(int x, int y) {
		assert(x >0 && y >0);
		this.x = x;
		this.y = y;
	}
	
	
    /**
    * Retourne la largeur de l'image
    *
    * @return			la largeur
    * @since   1.0
    */
	public int getX() {
		return x;
	}

    /**
    * Retourne la longueur de l'image 
    *
    * @return			la longueur
    * @since   1.0
    */
	public int getY() {
		return y;
	}
	
	
    /**
    * Ajoute un élément dans l'image à
    * une certaine profondeur
    *
    * @param élément			l'élément
    * @param profondeur			la profondeur
    * @since   1.0
    */
	public void add(Elément élément, int profondeur) {
		assert(profondeur > 0 && profondeur < éléments.size());
		éléments.add(profondeur,élément);
	}
	
    /**
    * Ajoute un élément dans l'image à
    * la profondeur la plus haute
    *
    * @param élément			l'élément
    * @since   1.0
    */
	public void add(Elément élément) {
		éléments.add(élément);
	}
	
	
    /**
    * Renvoie un String qui correspond à
    * correspond à l'Image en respectant les 
    * profondeurs des éléments. 
    *
    * @return 	le String
    * @since   1.0
    */
	@Override
	public String toString() {
		
		// Initialisation du tableau de char
		char tab[][] = new char[x][y];
	    for (int i = 0; i < tab.length; i++)
	    	for (int j = 0; j < tab[i].length; j++)
	    		tab[i][j] = ' ';
		
	    // On rentre chaque éléments dans le tableau de char
	    for(Elément élément: éléments) {
	    	for (int i = 0; i < élément.size(); i++) {
	    		if(x >= élément.get(i).getCoord().getX() && y >= élément.get(i).getCoord().getY())
				tab[élément.get(i).getCoord().getX()][élément.get(i).getCoord().getY()] = élément.get(i).getCaractère();
			}
	    }
	    
	    String s = new String("");
	    for (int i = 0; i < tab.length; i++) {
	    	for (int j = 0; j < tab[i].length; j++) {
	    		s+=tab[i][j];
	    	}
	    	s += "\n";
	    }
	    	
	    return s;
		
	}
	
	

}
