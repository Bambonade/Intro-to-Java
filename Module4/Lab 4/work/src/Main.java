import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filename = "data.csv";
        Scanner inputFile = null;
        try {
            inputFile = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        CookBook cookBook = new CookBook();
        while (inputFile.hasNext()) {
            cookBook.addRecord(inputFile.nextLine());
        }
        cookBook.doControlBreak();
    }
}
