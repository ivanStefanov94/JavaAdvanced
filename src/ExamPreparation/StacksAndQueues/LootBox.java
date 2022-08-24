package ExamPreparation.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class LootBox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] firstSequence = Arrays.stream(scan.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        int[] secondSequence = Arrays.stream(scan.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> firstLootBox = new ArrayDeque<>(); //queue offer/poll
        ArrayDeque<Integer> secondLootBox = new ArrayDeque<>(); //stack push/pop

        for (int i : firstSequence) {
            firstLootBox.offer(i);
        }
        for (int i : secondSequence) {
            secondLootBox.push(i);
        }

        int finalValueSum = 0;

        // може и с isEmpty()
        while(firstLootBox.size() > 0 && secondLootBox.size() > 0){
            if((firstLootBox.peek() + secondLootBox.peek()) % 2 == 0){
                int firstBoxPoll = firstLootBox.poll();
                int secondBoxPop = secondLootBox.pop();
                finalValueSum+= firstBoxPoll + secondBoxPop;
            }else{
                int secondBoxPop = secondLootBox.pop();
                firstLootBox.offer(secondBoxPop);
            }
        }
        if (firstLootBox.size() == 0){
            System.out.println("First lootbox is empty");
        }else{
            System.out.println("Second lootbox is empty");
        }

        if(finalValueSum >= 100){
            System.out.println("Your loot was epic! Value: " + finalValueSum);
        }else{
            System.out.println("Your loot was poor... Value: " + finalValueSum);
        }
    }
}

/*
Input:
10 11 8 13 5 6
0 4 7 3 6 23 3

Output:
Second lootbox is empty
Your loot was poor... Value: 42
*/