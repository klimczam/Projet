package fr.iutvalence.klimzur.mastermind;

/* Board is the class which it defines the board of the game */
public class Board {
    /** Nombre de lignes. */
    private final int NOMBRE_DE_LIGNES   = 8;
    /** Nombre de colonnes. */
    private final int NOMBRE_DE_COLONNES = 4;
    /* table type color */
    private Color[][] cases;

    /* initialization and constructor of class Plateau */
    public Board() {
        this.cases = new Color[NOMBRE_DE_COLONNES][NOMBRE_DE_LIGNES];
        for (int i = 0; i < NOMBRE_DE_COLONNES; i++) {
            for (int j = 0; j < NOMBRE_DE_LIGNES; j++) {
                this.cases[i][j] =Color.BLACK;
            }
        }
    }
    
    
    @Override
    public String toString()
	{
		String plateauAsciiArt = "";

		for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++)
		{
			for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++)
				plateauAsciiArt += this.cases[numeroDeLigne][numeroDeColonne];
			plateauAsciiArt += "\n";
		}

		return plateauAsciiArt;
	}
}
