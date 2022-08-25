package edu.wctc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filename = "input.csv";
        Scanner inputFile = null;
        try{
            inputFile = new Scanner(new File(filename));
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        Cookbook cookbook = new Cookbook();
        while(inputFile.hasNext()){
            cookbook.addRecord(inputFile.nextLine());
        }
        cookbook.doBreakControl();
    }
}