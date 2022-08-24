package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class AddVat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //парсваме към Double  и умножаваме по процента
        Function<String, Double> mapWithVat =  str -> Double.parseDouble(str) * 1.2;

        System.out.println("Prices with VAT:");

         Arrays.stream(scan.nextLine().split(", "))
                 .map(mapWithVat)
                 .forEach(e -> System.out.printf("%.2f%n", e));
    }
}

//        Prices with VAT:
//        1.38, 2.56, 4.4
//        1,66
//        3,07
//        5,28