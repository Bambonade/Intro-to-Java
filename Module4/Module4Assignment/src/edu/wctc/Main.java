package edu.wctc;

import java.util.Scanner;

public class Main {
    private Scanner keyboard = new Scanner(System.in);
    private PaintCalculator paintCalculator = new PaintCalculator();

    private void printMenu(){
        System.out.println("1: Add room");
        System.out.println("2: View rooms");
        System.out.println("3: Read rooms from file");
        System.out.println("4: Write rooms to file");
        System.out.println("5: Exit program");
    }
    private double promptForDimension(String dimensionName){
        System.out.println("Enter the dimension");
        dimensionName = keyboard.nextLine();
        return Double.parseDouble(dimensionName);
    }
    private void createRoom(){
        System.out.println("Enter length, width, and height");
        double length = keyboard.nextDouble();
        double width = keyboard.nextDouble();
        double height = keyboard.nextDouble();
        PaintCalculator newRoom = new PaintCalculator();
        newRoom.addRoom(length,width,height);
    }
    private void readFile(){
        StreamReader sr= new StreamReader();
    }
    private void writeFile(){

    }
    public static void main(String[] args) {
    }
}