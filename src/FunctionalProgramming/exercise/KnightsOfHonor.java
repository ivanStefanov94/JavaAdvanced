package FunctionalProgramming.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        String[] names = scan.nextLine().split("\\s+");
//
//        Consumer<String[]> titles = array ->{
//
//            for (int i = 0; i < array.length  ; i++) {
//                System.out.println("Sir " + array[i]);
//            }
//        } ;
//
//        titles.accept(names);

        Arrays.stream(scan.nextLine().split("\\s+"))
                .forEach(e -> System.out.println("Sir " + e));
    }
}

//        Alex George Peter
//
//        Sir Alex
//        Sir George
//        Sir Peter