import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        countUp(-5);
    }

    public static void countUp(int max) {
        if (max > 10) {
            System.out.println("Cannot be greater than 10:");
        } else if (max < 0) {
            System.out.println("Cannot be less than 0:");
        } else {
            for (int i = 0; i < max; i++) {
                System.out.println(i);
            }
        }
    }
}