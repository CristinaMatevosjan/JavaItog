public enum Comands {
    STOP("Stop"),
    VOICE("Voice"),
    TO_ME("To me"),
     FORWARD("Forward"),
    BUT_BUT("But but"),
    GO_AHEAD("Go ahead"),
    YOU_STUPID_BRUTE("You stupid brute"),
    JUMP("Jump"),
    SIT("Sit"),
    GIVE_ME_A_PAW("Give me a paw"),
    SPIT("Spit");

    private final String textRepresentation;

    private Comands(String textRepresentation) {
        this.textRepresentation = textRepresentation;
    }

    @Override public String toString() {
        return textRepresentation;
    }
}
