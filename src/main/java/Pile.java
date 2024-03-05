
/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author (CEOLIN)
 */
public class Pile {
    String[] elements; // Tableau pour stocker les éléments de la pile
    int indiceSommet;  // Indice du sommet de la pile
    int taille;        // Taille maximale de la pile

    /**
     * Constructeur par défaut. Initialise une pile de taille 100.
     */
    public Pile() {
        this(100); // Appelle le constructeur avec une taille de 100 par défaut
    }

    /**
     * Constructeur qui crée une pile de taille donnée.
     * @param pfTaille La taille de la pile à créer.
     */
    public Pile(int pfTaille) {
        this.elements = new String[pfTaille];
        this.indiceSommet = -1;  // La pile est vide au départ
        this.taille = pfTaille;  // Initialise la taille de la pile
    }

    /**
     * Vérifie si la pile est pleine.
     * @return True si la pile est pleine, false sinon.
     */
    public boolean pilePleine() {
        return indiceSommet == taille - 1;
    }

}