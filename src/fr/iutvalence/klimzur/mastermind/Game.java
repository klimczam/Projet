package fr.iutvalence.klimzur.mastermind;

import java.util.Iterator;
import java.util.Scanner;

public class Game {
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



	public void play() {
		System.out.println(this.board);
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < proposition.length; i++) {
			System.out.println("Entrez votre couleur: ");
			String str = sc.nextLine();
			if ( str.equals("BLUE")){
				this.proposition[i]=Color.BLUE;
			}
			this.board.setCases(round, i, this.proposition[i]);
		}
		
		System.out.println(this.board);
		/*while(true){
			// If gagner, break;
		}*/
		
	}

}