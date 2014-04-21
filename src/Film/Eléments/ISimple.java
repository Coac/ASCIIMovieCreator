
package Film.Eléments;

/**
 * L'interface ISimple décrit la liste des méthodes nécessaires pour manipuler
 * un élément simple, c'est à dire un élément qui ne contient qu'une seule et
 * unique instance de la plus petite structure d'élément de l'API.
 * Cependant, elle doit être implémentée dans le cadre d'éléments
 * complexes, ceux-ci étant composés d'éléments simples amménés à être
 * manipulés par l'utilisateur de l'objet.
 * 
 * @author      Le Victor
 * @author      Luttgens Pascal
 * @version     1.0
 * @param <C>   type des coordonnés utilisées pour le développement
 * @since       1.0
 */
public interface ISimple<C> {
    
    /**
     * Modifier permet de changer la valeur du caractère contenu dans un élément     * 
     * 
     * @param c nouveau caractère de l'élément
     * @since   1.0
     */
    void modifier(char c);
    
    /**
     * Change les coordonnées de l'élément.
     * Les coordonnées sont données au type choisi par le programmeur pour
     * faciliter son travail lors du développement de l'application.
     * 
     * @param coord 
     * @since       1.0
     */
    void déplacer(C coord);
    
}
