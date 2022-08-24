package ExamPreparation.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] flowers1 = Arrays.stream(scan.nextLine().split(", "))
                                .mapToInt(Integer::parseInt).toArray();

        int[] flower2 = Arrays.stream(scan.nextLine().split(", "))
                                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> lilies = new ArrayDeque<>(); //stack push/pop
        ArrayDeque<Integer> roses = new ArrayDeque<>(); //queue offer/poll

        for (int i : flowers1) {
            lilies.push(i);
        }
        for (int i : flower2) {
            roses.offer(i);
        }

        int wreathCount = 0;
        int storage = 0;

        while(lilies.size() > 0 && roses.size() > 0){
            int sum = lilies.peek() + roses.peek();
            if(sum == 15){
                lilies.pop();
                roses.poll();
                wreathCount++;
            }else if(sum > 15){
                int newLily = lilies.pop() - 2;
                lilies.push(newLily);
            } else {
                int store = lilies.pop() + roses.poll();
                storage += store;
            }
        }

        if(storage / 15 > 0){
            int left = storage/15;
            wreathCount+=left;
        }

        if(wreathCount >=5 ){
            System.out.printf("You made it, you are going to the competition with %d wreaths!", wreathCount);
        }else{
            int needed = 5 - wreathCount;
            System.out.printf("You didn't make it, you need %d wreaths more!", needed);
        }

    }
}
/*
Input:
10, 15, 2, 7, 9, 13
2, 10, 8, 12, 0, 5

Output:
You made it, you are going to the competition with 5 wreaths!

*/