package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int command = scan.nextInt();
            if (command == 1){
                int push = scan.nextInt();
                stack.push(push);
            }else if(command == 2){
                stack.pop();
            }else if (command == 3){
                System.out.println(Collections.max(stack));
            }
        }


    }
}
