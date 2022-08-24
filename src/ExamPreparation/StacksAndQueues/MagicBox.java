package ExamPreparation.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MagicBox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scan.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        int[] arr2 = Arrays.stream(scan.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque <Integer> firstBox = new ArrayDeque<>(); //queue - offer/poll
        ArrayDeque <Integer> secondBox = new ArrayDeque<>(); //stack - push/pop

        for (int i : arr1) {
            firstBox.offer(i);
        }
        for (int i : arr2) {
            secondBox.push(i);
        }

        int finalSum = 0;

        while(firstBox.size() > 0 && secondBox.size() > 0){
            int secondBoxValue = secondBox.pop();
            int sum = secondBoxValue + firstBox.peek();
            if(sum % 2 == 0){
                firstBox.poll();
                finalSum+= sum;
            }else{
                firstBox.offer(secondBoxValue);
            }
        }
        if(firstBox.size() < 1){
            System.out.println("First magic box is empty.");
        }else {
            System.out.println("Second magic box is empty.");
        }

        if(finalSum >= 90){
            System.out.println("Wow, your prey was epic! Value: " + finalSum);
        }else{
            System.out.println("Poor prey... Value: " + finalSum);
        }
    }
}
/*
Input:
20 40 60 80 100
10 20 30 40 50 60

Output:
First magic box is empty.
Wow, your prey was epic! Value: 500
*/