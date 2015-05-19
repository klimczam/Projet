package fr.iutvalence.klimzur.mastermind;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import fr.iut.valence.exceptions.InvalidExceptions;
/**
 * Class which can start the game
 * */
public class Game {

	/**
	 * Constant which define the number of round
	 */
	private final int NUMBER_OF_ROUND = 8;
	/**
	 * The board displays
	 */
	private Board board;
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
	private Color[] secret;

	/**
	 * The constructor of the game
	 */
	public Game(String nickname) {
		this.player1 = new Player(nickname);
		this.board = new Board();
		this.secret = new Color[4];
		
	}

	/**
	 * start the game / allow to play
	 */
	public void play() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player1 put your secret :");
		this.secret = putYourColor(0);
		
		System.out.println("There are the different color which can you choose : Blue, Green, Yellow, Orange, Red, Cyan, Brown, Pink \n");
		System.out.println("Player : " + player1.name);
		System.out.println(this.board);
		
		boolean win = false;
		for (int round = 1; round < NUMBER_OF_ROUND+1; round++) {
			System.out.println("Round : " + (round));
			
			Color[] guess = putYourColor(round);
			
			System.out.println(this.board);
			String victory = verification(guess);

			System.out.println(victory);
			if (victory.equals("Victory !")) {
				win = true;
				break;
			}
		}
		if (win) {
			System.out.println("You have won the game ! " );
		} else {
			System.out.println("Game over! The secret was :"
					+ Arrays.toString(secret));
		}

	}
	
	/**
	 * Method which allow to put a line of color for the secret and the search
	 * @param round
	 * @return a table of color
	 */
	private Color[] putYourColor(int round) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		Color[] guess = new Color[4];
		while (i < guess.length) {
			System.out.println("Put your color " + (i+1) +" : ");
			String str = sc.nextLine();
			try {
				guess[i] = stringToColor(str);
				if (round!=0)
					this.board.setCases(round-1, i, guess[i]);
			}
			catch (InvalidExceptions e) {
				//e.printStackTrace();
				System.err.println("Invalid color : " + e.getLocalizedMessage());
				i--;
			}
			i++;
		}
		return guess;
	}

	/**
	 * throws exception if the color is forbidden or if the color is an unknown color
	 * @param str
	 * @return color
	 * @throws InvalidExceptions
	 */
	private static Color stringToColor(String str) throws InvalidExceptions {
		final Color color;
		
		try {
			color = Color.valueOf(str);

		}
		catch (IllegalArgumentException e) {
			throw new InvalidExceptions(str + " is an unknown color.", e);
		}
		
		if (color == Color.BLACK || color == Color.WHITE) {
			throw new InvalidExceptions(color + " is forbidden.");
		}
		
		return color;

	}

	/**
	 * verification of the result + display result after every round
	 * @param proposition
	 * @return the result
	 */
	private String verification(Color[] proposition) {
		int NumberOfColorWithGoodPlacement = 0;
		int GoodColor = 0;
		for (int SecretColor = 0; SecretColor < 4; SecretColor++) {
			for (int ColorPlayed = 0; ColorPlayed < 4; ColorPlayed++) {
				if (this.secret[SecretColor] == proposition[ColorPlayed]
						&& ColorPlayed == SecretColor) {
					NumberOfColorWithGoodPlacement++;
				}
				if (this.secret[SecretColor] == proposition[ColorPlayed]
						&& ColorPlayed != SecretColor) {
					GoodColor++;
				}
			}
		}
		if (NumberOfColorWithGoodPlacement == 4)
			return "Victory !";
		else {
			return "Number of color with the good localisation : "
					+ NumberOfColorWithGoodPlacement
					+ " | Good color, bad localisation : "
					+ GoodColor;
		}
	}

}
