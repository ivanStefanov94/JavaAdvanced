package ExamPreparation.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class DatingApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scan.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        int[] arr2 = Arrays.stream(scan.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> males = new ArrayDeque<>();   //stack -> push/pop
        ArrayDeque<Integer> females = new ArrayDeque<>(); //queue -> offer/poll

        for (int i : arr1) {
            males.push(i);
        }
        for (int i : arr2) {
            females.offer(i);
        }

        int matches = 0;

        while(males.size()>0 && females.size()>0){
            if(males.peek() <= 0){
                males.pop();
            }else if(females.peek() <= 0){
                females.poll();
            }
            if(males.peek()%25 ==0){
                males.pop();
                males.pop();
            }else if(females.peek()%25 == 0){
                females.poll();
                females.poll();
            }

            if(males.peek() == females.peek()){
                males.pop();
                females.poll();
                matches++;
            }else{
                females.poll();
                int newMale = males.pop() - 2;
                if(newMale > 0){
                males.push(newMale);}
            }
        }

        System.out.println("Matches: " + matches);

        if(males.size() < 1){
            System.out.println("Males left: none");
        }else{
            StringBuilder builder = new StringBuilder();
            builder.append("Males left: ");
            for (Integer male : males) {
                builder.append(male).append(", ");
            }
            builder.deleteCharAt(builder.length()-2);
            System.out.println(builder.toString());
        }

        if(females.size() < 1){
            System.out.println("Females left: none");
        }else{
            StringBuilder builder = new StringBuilder();
            builder.append("Females left: ");
            for (Integer female : females) {
                builder.append(female).append(", ");
            }
            builder.deleteCharAt(builder.length()-2);
            System.out.println(builder.toString());
        }


    }
}

/*
Input:
3 0 3 6 9 0 12
12 9 6 1 2 3 15 13 4

Output:
Matches: 4
Males left: none
Females left: 15, 13,

*/