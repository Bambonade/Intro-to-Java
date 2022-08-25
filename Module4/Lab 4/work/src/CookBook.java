import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CookBook {
    private List<Record> records = null;

    public CookBook() {
        records= new ArrayList<>();
    }

    public void addRecord(String s) {
        String[] elements = s.split(",");
        records.add(new Record(elements[0],elements[1],Double.parseDouble(elements[2])));
    }

    //Average ("mean") calories
    //Minimum calories
    //Maximum calories
    //Median calories
    public void doControlBreak() {
        String oldMealType = "FIRST";
        double totalDailyHours = 0;
        double grandTotal = 0;
        int count = 0;
        int typeCount = 0;
        double theMin = Double.MAX_VALUE;
        double theMax = Double.MIN_VALUE;
        for (Record r: records) {
            if (!oldMealType.equals(r.getmealType()) && !oldMealType.equals("FIRST")) {
                System.out.println(oldMealType + " " + totalDailyHours + " " + (totalDailyHours / typeCount));
                totalDailyHours = 0;
                typeCount = 0;
            }
            if (theMax < r.getcalories()) theMax = r.getcalories();
            if (theMin > r.getcalories()) theMin = r.getcalories();
            count++;
            typeCount++;
            totalDailyHours += r.getcalories();
            grandTotal += r.getcalories();
            oldMealType = r.getmealType();
        }
        System.out.println(oldMealType + " " + totalDailyHours + " " + (totalDailyHours / typeCount));
        System.out.println("Grand Total " + grandTotal);
        System.out.println("Average calories " + (grandTotal / count));
        System.out.println("The Max is " + theMax);
        System.out.println("The Min is " + theMin);

    }
}
