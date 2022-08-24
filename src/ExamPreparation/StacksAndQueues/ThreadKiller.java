package ExamPreparation.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ThreadKiller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scan.nextLine().split(", "))
                                .mapToInt(Integer::parseInt).toArray();

        int[] arr2 = Arrays.stream(scan.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        int killer = Integer.parseInt(scan.nextLine());

        ArrayDeque<Integer> tasks = new ArrayDeque<>(); //queue - push/pop
        ArrayDeque<Integer> threads = new ArrayDeque<>();  //stack - offer/poll

        for (int i : arr1) {
            tasks.push(i);
        }
        for (int i : arr2) {
            threads.offer(i);
        }

        while(tasks.peek() != killer){
            int threadValue = threads.poll();

            if(threadValue >= tasks.peek()){
                tasks.pop();
            }
        }
        System.out.printf("Thread with value %d killed task %d%n", threads.peek(), tasks.peek());
        for (Integer thread : threads) {
            System.out.print(thread + " ");
        }
    }
}
