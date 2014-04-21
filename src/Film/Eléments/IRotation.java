package Film.Eléments;

/**
 * L'interface IRotation spécifie les méthodes à implémenter pour 
 * pouvoir effectuer des rotations d'élément.
 * 
 * @author      Le Victor
 * @author      Luttgens Pascal
 * @version     1.0
 * @param <C>   type des coordonnés utilisées pour le développement
 */
public interface IRotation<C> {
    
    /**
     * Réalise une rotation d'angle "angle" et de centre "centre" sur un 
     * élément.
     * 
     * @param angle     valeur de l'angle de rotation
     * @param centre    centre de rotation
     * @since           1.0
     */
    void rotation(int angle, C centre);
    
}