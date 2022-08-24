package FunctionalProgramming.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream (scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt(scan.nextLine());

        //премахване на числата, които се делят на n
        Predicate<Integer> filter = numb -> numb % n == 0;

        //обръщане на реда
        Collections.reverse(numbers);
        numbers.removeIf(filter);

        //принтиране
        Consumer<List<Integer>> print = e -> e.forEach(b -> System.out.print(b + " "));
        print.accept(numbers);
    }
}

//        20 10 40 30 60 50
//        3
//
//        50 40 10 20