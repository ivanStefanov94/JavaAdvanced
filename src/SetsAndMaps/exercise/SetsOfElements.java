package SetsAndMaps.exercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] tokens = Arrays.stream(scan.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        int firstSetLength = tokens[0];
        int secondSetLength = tokens[1];

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();
//        LinkedHashSet<Integer> repeatingNumbers = new LinkedHashSet<>();

        for (int i = 0; i < firstSetLength; i++) {
            int numbersFirst = Integer.parseInt(scan.nextLine());
            firstSet.add(numbersFirst);
        }
        for (int i = 0; i < secondSetLength; i++) {
            int numbersSecond = Integer.parseInt(scan.nextLine());
            secondSet.add(numbersSecond);
        }

        firstSet.retainAll(secondSet);

        for (Integer entry : firstSet) {
            System.out.print(entry + " ");
        }
    }
}
