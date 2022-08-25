package us.Brandonnelson;

public class Main {
    public static void main(String[] args) {
        Triplet<String> sue = new Triplet<>("Sue", "Anne","Que");
        Triplet<Integer> today = new Triplet<>(8, 1, 2022);
        Triplet<Double> balances = new Triplet<>(34.65,76384.12,5433.54);
        System.out.println(sue);
        System.out.println(today);
        System.out.println(balances);

    }
}