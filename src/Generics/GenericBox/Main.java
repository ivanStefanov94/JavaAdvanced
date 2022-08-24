package Generics.GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        //can insert any type in <>
        Box<Integer> box = new Box<>();

        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scan.nextLine());

            box.add(numbers);
        }

        System.out.println(box.toString());
    }
}
