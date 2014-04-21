package Film.Eléments.Coordonnées;

/**
 * L'interface IConvCoord spécifie les méthodes à implémenter pour 
 * effectuer les conversions entre un type de coordonnées utilisé pour faciliter
 * le développement du programme et le type de stockage choisit pour ces 
 * coordonnées.
 * 
 * @author      Le Victor
 * @author      Luttgens Pascal
 * @version     1.0
 * @param <C>   type des coordonnés utilisées pour le développement
 * @since       1.0
 */

public interface IConvCoord<C> {
        
    /**
     * retourne l'objet contenant les coordonnées au type de stockage choisi.
     * 
     * @return  coordonnées dans le type utilisé pour le stockage
     * @since   1.0
     */
    C convCoord();
        
}
