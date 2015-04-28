package fr.iutvalence.klimzur.mastermind;

/**
 * Game's board.
 *
 * @author TODO
 * @version TODO
 */
public class Board {
    /* TODO Translate. */
    /** Nombre de lignes. */
    protected final int NOMBRE_DE_LIGNES   = 8;
    /* TODO Translate. */
    /** Nombre de colonnes. */
    protected final int NOMBRE_DE_COLONNES = 4;
    /* TODO JAVADOC */
    protected Color[][] cases;

    /** Create an empty board. */
    public Board() {
        this.cases = new Color[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];
        for (int i = 0; i < NOMBRE_DE_LIGNES; i++) {
            for (int j = 0; j < NOMBRE_DE_COLONNES; j++) {
                this.cases[i][j] = Color.BLACK;
            }
        }
    }


}
