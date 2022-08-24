package FunctionalProgramming.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FindSmallestElementIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream (scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Consumer<List<Integer>> printMinElement = list -> {
          int min = Integer.MAX_VALUE;

            for (Integer number : list) {
                if(number < min){
                    min = number;
                }
            }
            System.out.println(list.lastIndexOf(min));
        };

        printMinElement.accept(numbers);
    }
}

//        1 2 3 0 4 5 6
//
//        3