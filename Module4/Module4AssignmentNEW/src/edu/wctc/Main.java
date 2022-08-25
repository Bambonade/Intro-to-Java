package edu.wctc;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final Scanner keyboard = new Scanner(System.in);
    private static final PaintCalculator paintCalculator = new PaintCalculator();

    private static void printMenu() {
        System.out.println("1: Add room");
        System.out.println("2: View rooms");
        System.out.println("3: Read rooms from file");
        System.out.println("4: Write rooms to file");
        System.out.println("5: Exit program\n");
    }

    private static double promptForDimension(String dimensionName) {
        System.out.println("Enter the dimension");
        dimensionName = keyboard.nextLine();
        return Double.parseDouble(dimensionName);
    }

    private static void createRoom() {
        System.out.print("Enter the room's length: ");
        double length = keyboard.nextDouble();
        System.out.print("Enter the room's width: ");
        double width = keyboard.nextDouble();
        System.out.print("Enter the room's height: ");
        double height = keyboard.nextDouble();
        paintCalculator.addRoom(length, width, height);
        System.out.println("Room successfully created.\n");
    }

    private static void readFile() throws FileNotFoundException {
        File file = new File ("data.txt");
        if(!file.exists()){
            System.out.println("Error!");
        }
        Scanner inputFile = new Scanner(file);
        while(inputFile.hasNext()){
            String line = inputFile.nextLine();
            System.out.println(line);
        }
    }

    private static void writeFile() throws IOException {
        FileWriter fwriter = new FileWriter("data.txt",true);
        PrintWriter outputFile = new PrintWriter(fwriter);
        outputFile.println(paintCalculator);
        outputFile.close();
    }

    public static void main(String[] args) throws IOException {
        printMenu();
        System.out.print("Enter selection: ");
        int input = keyboard.nextInt();
        do {
            switch (input) {
                case 1 -> {
                    createRoom();
                    printMenu();
                    System.out.print("Enter selection: ");
                    input = keyboard.nextInt();
                }
                case 2 -> {
                    System.out.println(paintCalculator.toString());
                    printMenu();
                    System.out.print("Enter selection: ");
                    input = keyboard.nextInt();
                }
                case 3 -> {
                    readFile();
                    printMenu();
                    System.out.print("Enter selection: ");
                    input = keyboard.nextInt();
                }
                case 4 -> {
                    writeFile();
                    printMenu();
                    System.out.print("Enter selection: ");
                    input = keyboard.nextInt();
                }
            }
        } while (input != 5);
    }
}