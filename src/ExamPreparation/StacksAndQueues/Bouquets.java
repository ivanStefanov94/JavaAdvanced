package ExamPreparation.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Bouquets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scan.nextLine().split(", "))
                                .mapToInt(Integer::parseInt).toArray();

        int[] arr2 = Arrays.stream(scan.nextLine().split(", "))
                                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> daffodils = new ArrayDeque<>(); //queue - offer/poll
        ArrayDeque<Integer> tulips = new ArrayDeque<>(); //stack - push/pop

        for (int i : arr1) {
            daffodils.offer(i);
        }
        for (int i : arr2) {
            tulips.push(i);
        }

        int finalSum = 0;
        int storage = 0;

        while(daffodils.size() > 0 && tulips.size() > 0){

            int sum = daffodils.peek() + tulips.peek();


            if(sum == 15){
                daffodils.poll();
                tulips.pop();
                finalSum++;
            }else if(sum > 15){
                int newTulips = tulips.pop() - 2;
                tulips.push(newTulips);
            } else{
                storage+=sum;
                daffodils.poll();
                tulips.pop();
            }
        }

        finalSum += storage/15;

        if(finalSum >=5){
            System.out.printf("You made it! You go to the competition with %d bouquets!", finalSum);
        }else{
            System.out.printf("You failed... You need more %d bouquets.", 5 - finalSum);
        }
    }
}
/*
Input:
10, 5, 3, 7, 8
5, 10, 8, 7, 6

Output:
You failed... You need more 1 bouquets.

*/