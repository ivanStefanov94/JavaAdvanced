package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int s = scan.nextInt();
        int x = scan.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stack.push(scan.nextInt());
        }
        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if(stack.contains(x)){
            System.out.println("true");
        }else{
            if (stack.size()>0){
                System.out.println(Collections.min(stack));
            }else{
                System.out.println("0");
            }
        }

    }
}
