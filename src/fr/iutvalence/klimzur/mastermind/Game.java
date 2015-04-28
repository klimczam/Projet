package fr.iutvalence.klimzur.mastermind;

/**
 * The begin of the game
 * @author klimczam
 *
 */
public class Game extends Board {
    /**
     * The board displays
     */
    private Board  board;
    /**
     * The player who plays to this game
     */
    private Player player1;
    
    /**
     * The round of the game
     */
    private int round;
    
    /**
     * Table of color which contents the secret 
     */
    private final Color[] secret;
    
    /**
     * The constructor of the game
     */
    public Game(){
    	this.player1 = new Player("JoueurTest");
    	this.round = 0;
    	this.board = new Board();
    	this.secret= new Color[4];
    	this.secret[0]=Color.YELLOW;
    	this.secret[1]=Color.ORANGE;
    	this.secret[2]=Color.GREEN;
    	this.secret[3]=Color.BLUE;
    }
    
    /**
     * To get the secret
     * @return the secret
     */
    public Color[] GetSecret(){
    	return this.secret;
    }
    
    /**
     * Display the game
     */
    @Override
    public String toString() {
    	String plateauAsciiArt = "";
    	plateauAsciiArt += "Round : " + this.round + "\n";
    	plateauAsciiArt += "Nom du joueur : " + this.player1.name + "\n";
    	
        for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++) {
            for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++) {
                plateauAsciiArt += this.cases[numeroDeLigne][numeroDeColonne] + " ";
            }
            plateauAsciiArt += "\n";
        }
        return plateauAsciiArt;
    }
    
}
