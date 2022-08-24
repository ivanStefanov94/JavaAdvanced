package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //филтриране на четни числа
        int[] numbers = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .filter(e -> e%2 == 0)
                .toArray();

        //принтиране на числата със запетая, без последното (4, 2, 4, 2, 12)
        String evenNumbers =
                Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(evenNumbers);

        //принтиране на горните числа по големина(от най-малко към най-голямо) (2, 2, 4, 4, 12)
        String sortedNumbers =
                Arrays.stream(numbers)
                .sorted() // без да слагаме нищо в скобите, сортира по големина
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(sortedNumbers);



//        StringBuilder out = new StringBuilder();
//
//        //принтиране на числата със запетая, без последното (4, 2, 4, 2, 12)
//        for (int i = 0; i < numbers.length; i++) {
//            out.append(numbers[i]);
//            if(i < numbers.length-1){
//                out.append(", ");
//            }
//        }
//
//        System.out.println(out.toString());
    }
}
