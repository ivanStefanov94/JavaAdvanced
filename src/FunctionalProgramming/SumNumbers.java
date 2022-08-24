package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] tokens = scan.nextLine().split(", ");

        //функция за мапване
        Function<String[], Stream<Integer>> map = arr -> Arrays.stream(arr)
                .map(Integer::parseInt);

        //функция за намиране на сумата на мапнатите tokens
        Function<Stream<Integer>, Integer> sum = str -> str
                .mapToInt(e->e).sum();

        //функция за преброяване на мапнатите tokens(count връща Long)
        Function<Stream<Integer>, Long> count = str -> str
                .mapToInt(e->e).count();


        System.out.println("Count = " + count.apply(map.apply(tokens)));
        System.out.println("Sum = " + sum.apply(map.apply(tokens)));

    }
}
