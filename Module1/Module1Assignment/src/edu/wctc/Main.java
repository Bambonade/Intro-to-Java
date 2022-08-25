package edu.wctc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner
        Scanner scanner = new Scanner(System.in);
        //vars
        List<Integer> num = new ArrayList<>();
        String[] choices = {"Do you prefer mild or spicy?", "Do you prefer tea or coffee?", "Do you prefer breakfast or brunch?", "Do you prefer summer or winter?", "Do you prefer paper or plastic?"};
        int input;
        int point = 0;
        boolean replay = false;
        //user inputs
        while (replay == false) {
            System.out.println("Welcome to the Preference Quiz!");
            System.out.println(choices[0] + "\nEnter 0 for the preference on the left\nEnter 1 for the preference on the right");
            input = scanner.nextInt();
            num.add(input);
            while (input != 0 & input != 1) {
                System.out.println("Please enter a 0 or 1");
                input = scanner.nextInt();
                num.add(input);
            }
            if (input == 1) {
                point++;
            }
            System.out.println(choices[1] + "\nEnter 0 for the preference on the left\nEnter 1 for the preference on the right");
            input = scanner.nextInt();
            num.add(input);
            while (input != 0 & input != 1) {
                System.out.println("Please choose with 0 or 1");
                input = scanner.nextInt();
                num.add(input);
            }
            if (input == 1) {
                point++;
            }
            System.out.println(choices[2] + "\nEnter 0 for the preference on the left\nEnter 1 for the preference on the right");
            input = scanner.nextInt();
            num.add(input);
            while (input != 0 & input != 1) {
                System.out.println("Please enter a 0 or 1");
                input = scanner.nextInt();
                num.add(input);
            }
            if (input == 1) {
                point++;
            }
            System.out.println(choices[3] + "\nEnter 0 for the preference on the left\nEnter 1 for the preference on the right");
            input = scanner.nextInt();
            num.add(input);
            while (input != 0 & input != 1) {
                System.out.println("Please enter a 0 or 1");
                input = scanner.nextInt();
                num.add(input);
            }
            if (point == 1) {
                point++;
            }
            System.out.println(choices[4] + "\nEnter 0 for the preference on the left\nEnter 1 for the preference on the right");
            input = scanner.nextInt();
            num.add(input);
            while (input != 0 & input != 1) {
                System.out.println("Please enter a 0 or 1");
                input = scanner.nextInt();
                num.add(input);
            }
            if (input == 1) {
                point++;
            }
            //message
            printMessage(point);
            //replay
            System.out.println("Again? Enter 1 to play again, or 0 exit");
            input = scanner.nextInt();
            num.add(input);
            while (input != 0 & input != 1) {
                System.out.println("Please enter a 0 or 1");
                input = scanner.nextInt();
                num.add(input);
            }
            if (input == 1) {
                replay = false;
            } else {
                replay = true;
            }
        }
    }

    public static int printMessage(int point) {
        if (point < 3) {
            System.out.println("You prefer life to be calm and organized");
        } else if (point == 3) {
            System.out.println("You prefer a good balance in life.");
        } else {
            System.out.println("You prefer life to be spontaneous and active");
        }
        return point;
    }
}