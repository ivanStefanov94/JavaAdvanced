package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class countUpperCaseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Predicate<String> startsWithCapitalLetter = str -> Character.isUpperCase(str.charAt(0));

        String[] words = Arrays.stream(scan.nextLine().split("\\s+"))
                .filter(startsWithCapitalLetter)
                .toArray(String[]::new);

        System.out.println(words.length);

        Arrays.stream(words)
                .forEach(System.out::println);
    }
}

//        The following example shows how to use Predicate
//
//        2
//        The
//        Predicate