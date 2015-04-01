package fr.iutvalence.g2d.groupe8.mastermind;

/* TODO JAVADOC. */
public class Plateau {
    /** Nombre de lignes. */
    private final int NOMBRE_DE_LIGNES   = 8;
    /** Nombre de colonnes. */
    private final int NOMBRE_DE_COLONNES = 4;
    /* TODO JAVADOC. */
    private Cases[][] cases;

    /* TODO JAVADOC. */
    public Plateau() {
        this.cases = new Cases[NOMBRE_DE_COLONNES][NOMBRE_DE_LIGNES];
        for (int i = 0; i < NOMBRE_DE_COLONNES; i++) {
            for (int j = 0; j < NOMBRE_DE_LIGNES; j++) {
                /* TODO Pourquoi ne pas initialiser directement à vide ? */
                cases[i][j] = new Cases(Couleurs.vide);
            }
        }
    }

    /* TODO JAVADOC. */
    /* TODO Faites une classe dédiée plutôt. */
    public static void main(String[] args) {
        System.out.println(new Plateau());
    }

}
