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
        List<Record> records = new ArrayList<>();
        while (inputFile.hasNext()) {
            String[] elements = inputFile.nextLine().split(",");
            records.add(new Record(elements[0], elements[1], Double.parseDouble(elements[2])));
        }
        String oldDay = "Yesterday";
        double totalDailyHours = 0;
        double grandTotal = 0;
        for (Record r : records) {
            if (!oldDay.equals(r.getDay()) && (!oldDay.equals("Yesterday"))) {
                System.out.println(oldDay + " " + totalDailyHours);
                totalDailyHours = 0;
            }
            totalDailyHours += r.getHours();
            grandTotal += r.getHours();
            oldDay = r.getDay();
        }
        System.out.println(oldDay + " " + totalDailyHours);
        System.out.println("Grand Total " + grandTotal);
    }
}
