package Film.Eléments;

import java.util.ArrayList;

import Film.Eléments.Coordonnées.Coord;

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

public class Texte extends Elément {
	
	private ArrayList<Caractère> caractères = new ArrayList<Caractère>();
	private int largeur;
	private int hauteur;
	
	
    /**
     * Créer un Texte à partir d'une chaine de char et de la largeur du texte.
     * 
     * @param string		la chaine de caractère
     * @param largeur		la largeur du texte
     * @since   1.0
     */
	public Texte(String string, int largeur) {
		this.largeur = largeur;
		hauteur = string.length() / largeur;
		
		for (int i = 0; i < string.length(); i++) {
			caractères.add(new Caractère(string.charAt(i), new Coord( i%largeur,i/largeur )));
		} 
			
	}

    /**
     * Change tous les caractères du texte par le caractère spécifié
     * en argument
     * 
     * @param c				le caractère
     * @since   1.0
     */
	public void modifier(char c) {
		for(Caractère caractère : caractères) {
			caractère.modifier(c);
		}
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
	

	
	

}