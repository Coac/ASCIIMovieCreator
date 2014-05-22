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
		int j = -1;
		for (int j2 = 0; j2 < texte.size(); j2++) {
			  if(texte.get(j2).getCoord().moins(texte.get(0).getCoord()).estDans(début, fin)) {
				  j++;
				  if(j == i)
					  return texte.get(j2);
			  }	
		}
		
		return null;
	}

	
	@Override
	public int size() {
		int j = 0;
		for (int i = 0; i < texte.size(); i++)
			  if(texte.get(i).getCoord().moins(texte.get(0).getCoord()).estDans(début, fin))
				  ++j;

		return j;
	}

	
	
	
}
