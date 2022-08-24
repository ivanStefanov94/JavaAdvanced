package FunctionalProgramming.exercise;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = scan.nextLine().split("\\s+");

        Consumer<String[]> print = array ->{
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        };

        print.accept(names);

    }
}
