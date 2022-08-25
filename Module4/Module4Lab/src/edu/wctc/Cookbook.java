package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Cookbook {
    private List<Record> records = null;

    public Cookbook() {
        records = new ArrayList<>();
    }

    public void addRecord(String s) {
        String[] elements = s.split(",");
        records.add(new Record(elements[0], elements[1], Double.parseDouble(elements[2])));
    }

    //Average
    //Minimum
    //Max
    //Median
    public void doBreakControl() {
        String oldMealType = "FIRST";
        double avgCalories = 0;
        double totalDailyHours = 0;
        double grandTotal = 0;
        int count = 0;
        int typeCount = 0;
        double theMax = Double.MIN_VALUE;
        double theMin = Double.MAX_VALUE;
        List<Double> calories = new ArrayList<>();
        for (Record r : records) {
            if (!oldMealType.equals(r.getmealType()) && (!oldMealType.equals("Yesterday"))){
                System.out.println(oldMealType + " " + totalDailyHours + " " + (totalDailyHours/typeCount));
                totalDailyHours = 0;
                typeCount = 0;
            }
            calories.add(r.getcalories());
            if(theMax < r.getcalories()) theMax = r.getcalories();
            if(theMin > r.getcalories()) theMin = r.getcalories();
            count++;
            totalDailyHours += r.getcalories();
            grandTotal += r.getcalories();
            oldMealType = r.getmealType();
        }
        System.out.println(oldMealType + " " + totalDailyHours + " " + (totalDailyHours/typeCount));
        System.out.println("Grand Total " + grandTotal);
        System.out.println("Average calories " + (grandTotal/count));
        System.out.println("The Max is " + theMax);
        System.out.println("The Min is " + theMin);

    }
}