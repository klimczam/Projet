
package fr.iutvalence.klimzur.mastermind;

/**
 * @author klimczam
 *
 */
public class Player {
	
	/**
	 * the name of the player 1
	 */
	String name1;
	/**
	 * the name of the player 2
	 */
	String name2;
	/*
	 * the secret of the game
	 */
	String secret;
	
	public Player(String name1, String name2, String secret){
		this.name1 = name1;
		this.name2 = name2;
		this.secret =secret;
	}

}
