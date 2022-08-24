package FunctionalProgramming.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;


public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        Consumer<int[]> getMin = array -> System.out.println(Arrays.stream(array).min().orElse(0));

        getMin.accept(numbers);
    }
}


//        1 4 3 2 1 7 13
//
//        1
