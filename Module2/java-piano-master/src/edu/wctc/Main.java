package edu.wctc;

public class Main {

    public static void main(String[] args) {
        Key c = new Key(Note.C, NoteType.NATURAL);
        Key cSharp = new Key(Note.C, NoteType.SHARP);
        Key d = new Key(Note.D, NoteType.NATURAL);
        Key dSharp = new Key(Note.D, NoteType.SHARP);

        c.setRight(cSharp);
        cSharp.setLeft(c);
        cSharp.setRight(d);
        d.setLeft(cSharp);
        d.setRight(dSharp);
        dSharp.setLeft(d);

        Piano piano = new Piano();
        piano.setCurrentKey(c);

        // play a 100(ish)-note song
        for (int i = 0; i < 100; i++) {
            System.out.println(piano.playCurrentKey());
            if (Math.random() < 0.5)
                piano.goLeft();
            else
                piano.goRight();
        }
    }
}
