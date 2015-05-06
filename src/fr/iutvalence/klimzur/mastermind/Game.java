package fr.iutvalence.klimzur.mastermind;

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
    public static int round = 0;
    
    /**
     * Table of color which contents the secret 
     */
    private final Color[] secret;
    
    public Color[] proposition;
    
    /**
     * The constructor of the game
     */
    public Game(){
    	this.player1 = new Player("JoueurTest");
    	this.board = new Board();
    	this.secret= new Color[4];
    	this.secret[0]=Color.YELLOW;
    	this.secret[1]=Color.ORANGE;
    	this.secret[2]=Color.GREEN;
    	this.secret[3]=Color.BLUE;
    	proposition = new Color[4];
    	this.proposition[0]=Color.ORANGE;
    	this.proposition[1]=Color.BLUE;
    	this.proposition[2]=Color.GREEN;
    	this.proposition[3]=Color.RED;
    }
    

    
    private String verification(){
    	int NombreDeCouleurBienPlacee = 0;
    	int BonneCouleur = 0;
    	for (int CouleurSecrete = 0; CouleurSecrete<4; CouleurSecrete++){
    		for(int CouleurJouee = 0; CouleurJouee<4; CouleurJouee++){
    			if (this.secret[CouleurSecrete]==this.proposition[CouleurJouee] && CouleurJouee == CouleurSecrete){
    				NombreDeCouleurBienPlacee++;
    			}
    			if (this.secret[CouleurSecrete]==this.proposition[CouleurJouee] && CouleurJouee != CouleurSecrete){
    				BonneCouleur++;
    			}    			
    		}
    	}
    	return "Nombre De Couleur Bien Placée : " + NombreDeCouleurBienPlacee + " | Couleur correcte, mauvais placement : " + BonneCouleur;
    }
    /**
     * To get the secret
     * @return the secret
     */
    public Color[] getSecret(){
    	return this.secret;
    }
    
    public Color[][] PlacementCouleur(){
    	for (int i = 0; i < NOMBRE_DE_LIGNES; i++) {
            for (int j = 0; j < NOMBRE_DE_COLONNES; j++) {
                this.cases[i][j] = Color.BLACK;
            }         
        }
    	for (int k=0; k<round+1; k++){
    		for (int e=0; e < NOMBRE_DE_COLONNES; e++){
    			this.cases[k][e]=this.proposition[e];
    		}
        }
    	return this.cases;
    }
    
    /**
     * Display the game
     */
    @Override
    public String toString() {
    	String plateauAsciiArt = "";
    	plateauAsciiArt += "Round : " + round + "\n";
    	plateauAsciiArt += "Nom du joueur : " + this.player1.name + "\n";
    	PlacementCouleur();
        for (int numeroDeLigne = 0; numeroDeLigne < NOMBRE_DE_LIGNES; numeroDeLigne++) {
            for (int numeroDeColonne = 0; numeroDeColonne < NOMBRE_DE_COLONNES; numeroDeColonne++) {
                plateauAsciiArt += this.cases[numeroDeLigne][numeroDeColonne] + " ";
            }
            plateauAsciiArt += "\n";
        }
        plateauAsciiArt += verification();
        return plateauAsciiArt;
    }

}