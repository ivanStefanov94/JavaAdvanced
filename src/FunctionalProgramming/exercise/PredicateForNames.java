package FunctionalProgramming.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        String[] names = scan.nextLine().split("\\s+");

        Predicate<String> checkLength = name -> name.length()<=number;

        Arrays.stream(names)
        .filter(checkLength)
        .forEach(System.out::println);
    }
}

//        4
//        George Peter Zara Sara
//
//        Zara
//        Sara