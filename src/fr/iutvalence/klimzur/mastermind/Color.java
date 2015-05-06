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

    /**
     * Allow to display the color
     * @param disp
     */
    Color(final String disp) {
        this.display = disp;
    }

    /**
     * Display the color
     */
    @Override
    public String toString() {
        return this.display;
    }
}
