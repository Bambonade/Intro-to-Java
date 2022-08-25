package edu.wctc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lastName;
        String firstName;
        String middleInitial;
        int month;
        int day;
        int year;
        String gender;

        System.out.print("Last Name >> ");
        firstName = scanner.nextLine();
        System.out.print("First Name >> ");
        lastName = scanner.nextLine();
        System.out.print("Middle Initial >> ");
        middleInitial = scanner.nextLine();
        System.out.print("Month of birth (1 - 12) >> ");
        month = scanner.nextInt();
        System.out.print("Day of birth (1 - 31) >> ");
        day = scanner.nextInt();
        System.out.print("Year of birth (YYYY) >> ");
        year = scanner.nextInt();
        System.out.print("Gender (M/F) >> ");
        gender = scanner.nextLine();

        DriversLicense driversLicense = new DriversLicense();
        driversLicense.setSSSS(lastName);
        //driversLicense.setFFF();
        driversLicense.setYY(year);
        driversLicense.setDDD(month+day+(((month-1)*40)+day));
        if(gender.toUpperCase().equals("F")){
            driversLicense.setDDD(driversLicense.getDDD()+500);
        }
        driversLicense.setNN(0);


        System.out.println("\nWisconsin: ");
        System.out.println("Florida: ");
    }
}