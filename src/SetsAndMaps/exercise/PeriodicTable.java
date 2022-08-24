package SetsAndMaps.exercise;

import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number  = Integer.parseInt(scan.nextLine());

        TreeSet <String> compounds = new TreeSet<>();

        for (int i = 0; i < number; i++) {
            String[] elements = scan.nextLine().split(" ");

            for (int j = 0; j < elements.length; j++) { //
                String separate = elements[j];          // == Collections.addAll(compounds, elements);
                compounds.add(separate);                //
            }
        }
        for (String compound : compounds) {
            System.out.print(compound + " ");
        }
    }
}
