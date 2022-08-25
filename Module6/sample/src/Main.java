import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NameCalculator theCalc = (String name) -> {
            int nameCalc = 0;
            for (int i = 0; i < name.length(); i++) {
                nameCalc+=(int)name.charAt(i);
            }
            return nameCalc;
        };
        Scanner keyboard = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        String name;
        do {
            System.out.println("Please enter the next name (NA to quit: ? ");
            name = keyboard.nextLine();
            if (!name.equals("NA")) names.add(name);
        } while (!name.equals("NA"));
        names.forEach(System.out::println);
        for (String n : names) {
            System.out.println(n + " " + theCalc.calcName(n));
        }
    }

    public static int calcName(String name) {
        int nameCalc = 0;
        for (int i = 0; i < name.length(); i++) {
            nameCalc+=(int)name.charAt(i);
        }
        return nameCalc;
    }
}