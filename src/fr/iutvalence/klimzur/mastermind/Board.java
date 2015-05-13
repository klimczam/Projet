package fr.iutvalence.klimzur.mastermind;

/**
 * Game's board.
 *
 * @author Zurchert
 * @version TODO
 */
public class Board {
    /** Number of line */
    private final int NOMBRE_DE_LIGNES   = 8;
    
    /** Number of column */
    private final int NOMBRE_DE_COLONNES = 4;
   
    /**
     * to draw every case of the board
     */
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

    /**
     * get case
     * @param numeroDeLigne
     * @return number of line of the case
     */
    public Color[] getCases(int numeroDeLigne) {
		return cases[numeroDeLigne];
	}

    /**
     * set case
     * @param numLigne
     * @param numColonne
     * @param cases
     */
	public void setCases(int numLigne, int numColonne, Color cases) {
		this.cases[numLigne][numColonne] = cases;
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
