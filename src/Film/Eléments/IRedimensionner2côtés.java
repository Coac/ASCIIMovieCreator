package Film.Eléments;

/**
 * L'interface IRedimensionner4 spécifie les méthodes à implémenter pour 
 * redimensionner un élément qui peut être redimensionneé de 2 côtés.
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @version 1.0
 * @since   1.0
 */

public interface IRedimensionner2côtés {
    
    /**
     * Redimensionne un élément en fonction des paramètres entrants.
     * Cette fonction ne prend pas en compte le fait que l'axe de l'objet puisse
     * avoir changé (après rotation par exemple).
     * 
     * @param début nombre d'élements à ajouter/supprimer au début
     * @param fin   nombre d'éléments à ajouter/supprimer à la fin
     * @since       1.0
     */
    void redimensionner(int début, int fin);
    
}
