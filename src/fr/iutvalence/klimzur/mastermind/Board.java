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
    private final int NOMBRE_DE_LIGNES   = 8;
    /* TODO Translate. */
    /** Nombre de colonnes. */
    private final int NOMBRE_DE_COLONNES = 4;
    /* TODO JAVADOC */
    private Color[][] cases;

    /** Create an empty board. */
    public Board() {
        this.cases = new Color[NOMBRE_DE_LIGNES][NOMBRE_DE_COLONNES];
        for (int i = 0; i < NOMBRE_DE_LIGNES; i++) {
            for (int j = 0; j < NOMBRE_DE_COLONNES; j++) {
                this.cases[i][j] = Color.BLACK;
            }
        }
    }

    
    public Color[] getCases(int numeroDeLigne) {
		return cases[numeroDeLigne];
	}

	public void setCases(Color[][] cases) {
		this.cases = cases;
	}


	/**
     * Display the game
     */
    @Override
    public String toString() {
    	String plateauAsciiArt = "";
        for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++) {
            for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++) {
                plateauAsciiArt += this.cases[numeroDeLigne][numeroDeColonne] + " ";
            }
            plateauAsciiArt += "\n";
        }
        return plateauAsciiArt;
    }

}
