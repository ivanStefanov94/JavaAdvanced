package Generics.GenericSwapMethodStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        GenericBox<Integer> box = new GenericBox<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scan.nextLine());
            box.add(numbers);
        }
        String[] command = scan.nextLine().split("\\s+");
        int index1 = Integer.parseInt(command[0]);
        int index2 = Integer.parseInt(command[1]);

        box.swap(index1, index2);

        System.out.println(box.toString());
    }
}
