package fr.iutvalence.g2d.groupe8.mastermind;

/* TODO JAVADOC. */
public class Cases {
    /* TODO Pourquoi ne pas utiliser la case Couleur directement (reprise en enum). */
    /**
     * Couleur.
     *
     * @see Couleurs
     */
    private final int couleur;

    /* TODO Créer un constructeur sans paramètre qui crée une case vide. */

    /**
     * Créer une case de la couleur donnée.
     *
     * @param couleur couleur voulue
     */
    public Cases(int couleur) {
        this.couleur = couleur;
    }

    /**
     * Obtenir la couleur de la case.
     *
     * @return Couleur de la case
     */
    public int obtenirCase() {
        return this.couleur;
    }
}
