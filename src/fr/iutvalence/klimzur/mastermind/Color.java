package fr.iutvalence.klimzur.mastermind;

/* TODO JAVADOC. */
public enum Color {
    /** The color red. */
    RED("RED"),
    /** The color green. */
    GREEN("GRE"),
    /** The color blue. */
    BLUE("BLU"),
    /** The color yellow. */
    YELLOW("YEL"),
    /** The color brown. */
    BROWN("BRO"),
    /** The color orange. */
    ORANGE("ORA"),
    /** The color pink. */
    PINK("PIN"),
    /** The color cyan. */
    CYAN("CYA"),
    /** The color black. */
    BLACK("BLA"),
    /** The color white. */
    WHITE("WHI");
    /* TODO JAVADOC. */
    private final String display;

    /* TODO JAVADOC. */
    Color(final String disp) {
        display = disp;
    }

    /* TODO JAVADOC. */
    @Override
    public String toString() {
        return display;
    }
}
