package edu.wctc;

public class Key {
    private final Note note;
    private final NoteType noteType;

    private Key left;
    private Key right;

    public Key(Note note, NoteType noteType) {
        this.note = note;
        this.noteType = noteType;
    }

    @Override
    public String toString() {
        return note.toString() + noteType.getSymbol();
    }

    public Key getLeft() {
        return left;
    }

    public void setLeft(Key left) {
        this.left = left;
    }

    public Key getRight() {
        return right;
    }

    public void setRight(Key right) {
        this.right = right;
    }

    public Note getNote() {
        return note;
    }

    public NoteType getNoteType() {
        return noteType;
    }


}
