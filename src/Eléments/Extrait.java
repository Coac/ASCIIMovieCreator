package Eléments;

import Coordonnées.Coord;
import Film.Caractère;

import java.util.Objects;


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
public class Extrait extends Elément {

	private Texte texte;
	Coord début;
	Coord fin;
	
    /**
     *
     * @param texte
     * @param début
     * @param fin
     */
    public Extrait(Texte texte, Coord début, Coord fin) {
		this.texte = texte;
		this.début = début;
		this.fin = fin;
	}
            
    
    /**
     * Créer une copie d'un Extrait
     * 
     * @param extrait     l'extrait à recopier
     * @since 1.0
     */
        public Extrait(Extrait extrait) {
            	this.texte = extrait.texte.clone();
		this.début = extrait.début;
		this.fin = extrait.fin;
        }
	
	@Override
        public void modifier(char c) {
            texte.modifier(c);
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
        
        @Override
        public void rotation(double angle, Coord centre) throws UnsupportedOperationException {
                throw new UnsupportedOperationException("La rotation n'est pas supportée pour l'extrait de texte");
        }

        @Override
        public void rotationD(double angle, Coord centre) throws UnsupportedOperationException {
                throw new UnsupportedOperationException("La rotation n'est pas supportée pour l'extrait de texte");
        }
        
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.texte);
        hash = 47 * hash + Objects.hashCode(this.début);
        hash = 47 * hash + Objects.hashCode(this.fin);
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
        final Extrait other = (Extrait) obj;
        if (!Objects.equals(this.texte, other.texte)) {
            return false;
        }
        if (!Objects.equals(this.début, other.début)) {
            return false;
        }
        if (!Objects.equals(this.fin, other.fin)) {
            return false;
        }
        return true;
    }

        
        
        @Override
        public Extrait clone() {
                return new Extrait(this);
        }

	
	
	
}
