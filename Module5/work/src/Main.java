import java.math.BigDecimal;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double num1 = 34.567898876;
        double num2 = 34.2234;
        double sum1 = num1 + num2;
        System.out.println(sum1);
        BigDecimal bd1 = new BigDecimal("34.56789876");
        BigDecimal bd2 = new BigDecimal("34.2234");

        System.out.println(sum);
        System.out.println(bd1.compareTo(bd2));
    }
    public static void numGen(){
        Random generator = new Random();
        int numberOfTimes = 1000000;
        int countTrue = 0;

        for(int i = 0; i < numberOfTimes; i++){
            if (generator.nextBoolean())countTrue++;
        }
        System.out.println("Percent True " + (100*(countTrue /(double)numberOfTimes)));
    }
}