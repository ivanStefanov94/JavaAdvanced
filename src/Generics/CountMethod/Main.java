package Generics.CountMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        CountBox<Double> countBox = new CountBox<>();

        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scan.nextLine());;
            countBox.add(number);

        }
        double input = Double.parseDouble(scan.nextLine());

        System.out.println(countBox.countGreaterThan(input));

    }
}
