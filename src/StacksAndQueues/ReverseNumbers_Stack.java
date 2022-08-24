package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbers_Stack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] numberArray = scan.nextLine().split("\\s+");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

//        for (int i = 0; i < numberArray.length; i++) {
//            int separateNumbers = Integer.parseInt(numberArray[i]);
//            numbers.push(separateNumbers);
//        }
        for (String number : numberArray) {
            numbers.push(Integer.parseInt(number));
        }

        while(!numbers.isEmpty()){
            System.out.print(numbers.pop() + " ");
        }


    }
}


//1 2 3 4 5
//5 4 3 2 1
