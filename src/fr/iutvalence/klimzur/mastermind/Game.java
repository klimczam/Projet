package fr.iutvalence.klimzur.mastermind;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Game {

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
	private final Color[] secret;

	/**
	 * The constructor of the game
	 */
	public Game(String nickname) {
		this.player1 = new Player(nickname);
		this.board = new Board();
		this.secret = new Color[] { Color.YELLOW, Color.ORANGE, Color.GREEN,
				Color.BLUE };
	}

	public void play() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Joueur : " + player1.toString());
		System.out.println(this.board);

		
		boolean win = false;
		for (int round = 0; round < NUMBER_OF_ROUND; round++) {
			System.out.println("Tour : " + (round + 1));
			
			Color[] guess = new Color[4];
			for (int i = 0; i < guess.length; i++) {
				System.out.println("Entrez votre couleur: ");
				String str = sc.nextLine();
				// TODO try
				guess[i] = Color.valueOf(str);
				this.board.setCases(round, i, guess[i]);
			}
			
			System.out.println(this.board);
			String victory = verification(guess);

			System.out.println(victory);
			if (victory.equals("Gagné !")) {
				win = true;
				break;
			}
		}
		if (win) {
			// TODO Texte de victoire
		} else {
			System.out.println("Perdu ! La bonne combinaison est :"
					+ Arrays.toString(secret));
		}

	}
	
	private String verification(Color[] proposition) {
		int NombreDeCouleurBienPlacee = 0;
		int BonneCouleur = 0;
		for (int CouleurSecrete = 0; CouleurSecrete < 4; CouleurSecrete++) {
			for (int CouleurJouee = 0; CouleurJouee < 4; CouleurJouee++) {
				if (this.secret[CouleurSecrete] == proposition[CouleurJouee]
						&& CouleurJouee == CouleurSecrete) {
					NombreDeCouleurBienPlacee++;
				}
				if (this.secret[CouleurSecrete] == proposition[CouleurJouee]
						&& CouleurJouee != CouleurSecrete) {
					BonneCouleur++;
				}
			}
		}
		if (NombreDeCouleurBienPlacee == 4)
			return "Gagné !";
		else {
			return "Nombre De Couleur Bien Placée : "
					+ NombreDeCouleurBienPlacee
					+ " | Couleur correcte, mauvais placement : "
					+ BonneCouleur;
		}
	}

}