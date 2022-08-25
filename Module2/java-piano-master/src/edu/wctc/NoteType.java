package edu.wctc;

/*
https://www.fileformat.info/info/unicode/char/266d/index.htm
 */
public enum NoteType {
    SHARP("\u266F"),
    FLAT("\u266D"),
    NATURAL("\u266E");

    private String symbol;

    NoteType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
