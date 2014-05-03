package Film.Eléments;

import Film.Eléments.Coordonnées.Coord;


/**
 * La classe Extrait est un extrait de texte.
 * On peut changer la visibilité du texte grâce
 * aux Coord début et fin.
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @version 1.0
 * @since   1.0
 */
public class Extrait extends Elément{

	private Texte texte;
	Coord début;
	Coord fin;
	
	
	
	public Extrait(Texte texte, Coord début, Coord fin) {
		this.texte = texte;
		this.début = début;
		this.fin = fin;
	}
	
	
	@Override
	public Caractère get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}
