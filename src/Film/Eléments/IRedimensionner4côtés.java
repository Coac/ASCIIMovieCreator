package Film.Eléments;

/**
 * L'interface IRedimensionner4 spécifie les méthodes à implémenter pour 
 * redimensionner un élément qui peut être redimensionneé de 4 côtés.
 * 
 * @author  Le Victor
 * @author  Luttgens Pascal
 * @version 1.0
 * @since   1.0
 */

public interface IRedimensionner4côtés {
    
    /**
     * Redimensionne un élément en fonction des paramètres entrants.
     * Cette fonction ne prend pas en compte le fait que l'axe de l'objet puisse
     * avoir changé (après rotation par exemple).
     * 
     * @param gauche    nombre d'éléments à ajouter/supprimer à gauche
     * @param haut      nombre d'éléments à ajouter/supprimer en haut
     * @param droite    nombre d'éléments à ajouter/supprimer à droite
     * @param bas       nombre d'éléments à ajouter/supprimer en bas
     * @since           1.0
     */
    void redimensionner(int gauche, int haut, int droite, int bas);
        
}
