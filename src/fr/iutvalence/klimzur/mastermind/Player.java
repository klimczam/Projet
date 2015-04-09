package fr.iutvalence.klimzur.mastermind;

/* TODO JAVADOC. */
public class Player {
    /* TODO Player is only one player not two!!! class ≠ instance!!! */
    /** The name of the player 1. */
    String name1;
    /** The name of the player 2. */
    String name2;
    /* TODO Why the secret is here??? */
    /** The secret of the game. */
    String secret;

    public Player(String name1, String name2, String secret) {
        this.name1 = name1;
        this.name2 = name2;
        this.secret = secret;
    }
}
