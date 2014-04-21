
package Film.Eléments;

/**
 * L'interface IComplexe décrit la liste des méthodes nécessaires pour manipuler
 * un élément complexe, c'est à dire un élément qui contient au moins un élément
 * simple (voir ISimple) et un autre élément.
 * Les éléments complexe comprenant par définition des éléments simple,
 * IComplexe hérite donc des méthodes ISimple permettant la manipulation des
 * éléments simple.
 * 
 * 
 * @author      Le Victor
 * @author      Luttgens Pascal
 * @version     1.0
 * @param <T>   type de l'élément simple
 * @param <C>   type des coordonnés utilisées pour le développement
 * @since       1.0
 */
public interface IComplexe<T,C> extends ISimple<C> {
    
    /**
     *
     * @param c
     * @param coord
     * @since       1.0
     */
    void modifier(char c, C coord);
    
    /**
     *
     * @param coord
     * @since       1.0
     */
    void supprimer(C coord);
    
    /**
     *
     * @param coord
     * @return      
     * @since       1.0
     */
    T convSimple(C coord);
    
}
