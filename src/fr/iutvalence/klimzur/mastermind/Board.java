package fr.iutvalence.klimzur.mastermind;

/**
 * Game's board.
 *
 * @author Zurchert
 * @version TODO
 */
public class Board {
    /** Number of line */
    private final int NUMBER_OF_LINE   = 8;
    
    /** Number of column */
    private final int NUMBER_OF_COLUMN = 4;
   
    /**
     * to draw every case of the board
     */
    private Color[][] cases;

    /** Create an empty board. */
    public Board() {
        this.cases = new Color[NUMBER_OF_LINE][NUMBER_OF_COLUMN];
        for (int i = 0; i < NUMBER_OF_LINE; i++) {
            for (int j = 0; j < NUMBER_OF_COLUMN; j++) {
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
        for (int numeroDeLigne = 0; numeroDeLigne < NUMBER_OF_LINE; numeroDeLigne++) {
            for (int numeroDeColonne = 0; numeroDeColonne < NUMBER_OF_COLUMN; numeroDeColonne++) {
                plateauAsciiArt += this.cases[numeroDeLigne][numeroDeColonne] + " ";
            }
            plateauAsciiArt += "\n";
        }
        return plateauAsciiArt;
    }

}
