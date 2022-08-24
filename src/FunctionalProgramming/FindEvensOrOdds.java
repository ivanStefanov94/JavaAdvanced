package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] tokens = scan.nextLine().split(" ");

        int lower = Integer.parseInt(tokens[0]);
        int upper = Integer.parseInt(tokens[1]);

        String oddOrEven = scan.nextLine();

        Predicate<Integer> filter = getFilter(oddOrEven);

        for (int i = lower; i <= upper; i++) {
            if (filter.test(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static Predicate<Integer> getFilter (String oddOrEven){
        if(oddOrEven.equals("odd")){
            return n -> n%2 == 1;
        }
        return n -> n%2 == 0;
    }
}

//        20 30
//        even
//
//        20 22 24 26 28 30