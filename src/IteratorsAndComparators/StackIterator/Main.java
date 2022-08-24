package IteratorsAndComparators.StackIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StackIterator<Integer> stack = new StackIterator<>();
        String command = scan.nextLine();

        while(!command.equals("END")){
            String[] tokens = command.split("\\s+");

            if(tokens[0].equals("Push")){
                int[] numbers = Arrays.stream(tokens[1].split(",")).mapToInt(Integer::parseInt).toArray();
                for (int number : numbers) {
                    stack.push(number);
                }

            }else if(tokens[0].equals("Pop")){
                try{
                    System.out.println(stack.pop());
                }catch (Exception exception){
                    System.out.println("No elements");
                }
            }
            command = scan.nextLine();
        }

        System.out.println();

        for (Integer integer : stack) {
            System.out.println(integer);
        }
    }
}
/*
Input:
Push 1,2,3,4
Pop
Pop
END

Output:
4
3

2
1
*/

/*
Input:
Push 1,2,3,4
Pop
Pop
Pop
Pop
Pop
END

Output:
4
3
2
1
No elements
*/