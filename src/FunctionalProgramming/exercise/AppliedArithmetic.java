package FunctionalProgramming.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        Function<int[], int[]> add = array -> Arrays.stream(array).map(e -> e+=1).toArray();
        Function<int[], int[]> multiply = array -> Arrays.stream(array).map(e -> e= e*2).toArray();
        Function<int[], int[]> subtract = array -> Arrays.stream(array).map(e -> e-=1).toArray();
        Consumer<int[]> print = array -> Arrays.stream(array).forEach(e -> System.out.print(e + " "));

        String input = scan.nextLine();

        while(!input.equals("end")){

            if(input.equals("add")){
                numbers = add.apply(numbers);

            }else if(input.equals("multiply")){
                numbers = multiply.apply(numbers);

            }else if(input.equals("subtract")){
                numbers = subtract.apply(numbers);

            }else if(input.equals("print")){
                print.accept(numbers);
                System.out.println();
            }

            input = scan.nextLine();
        }
    }
}

//        1 2 3 4 5
//        add
//        add
//        print
//        end
//
//        3 4 5 6 7
