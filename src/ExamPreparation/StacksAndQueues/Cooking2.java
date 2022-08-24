package ExamPreparation.StacksAndQueues;

import java.util.*;

public class Cooking2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> liquids = new ArrayDeque<>(); // queue - offer/poll
        ArrayDeque<Integer> ingredients = new ArrayDeque<>();// stack - push/pop

        for (int num : arr1) {
            liquids.offer(num);
        }

        for (int num : arr2) {
            ingredients.push(num);
        }

        int breadCounter = 0;
        int cakeCounter = 0;
        int pastryCounter = 0;
        int fruitPieCounter = 0;

        while(liquids.size() > 0 && ingredients.size() > 0){
            int liquid = liquids.poll();
            int ingredient = ingredients.pop();
            int sum = liquid+ingredient;

            if(sum == 25){
                breadCounter++;
            }else if(sum == 50){
                cakeCounter++;
            }else if(sum == 75){
                pastryCounter++;
            }else if(sum == 100){
                fruitPieCounter++;
            }else{
                int newIngredient = ingredient + 3;
                ingredients.push(newIngredient);
            }
        }

        StringBuilder builder = new StringBuilder();

        if(breadCounter > 0 && cakeCounter > 0 && pastryCounter> 0 && fruitPieCounter > 0){
            builder.append("Wohoo! You succeeded in cooking all the food!");
        }else{
            builder.append("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }

        builder.append(System.lineSeparator());
        builder.append("Liquids left: ");

        if(liquids.isEmpty()){
            builder.append("none");
        }else{
            for (Integer liquid : liquids) {
                builder.append(liquid).append(", ");
            }
        }

        builder.append(System.lineSeparator());
        builder.append("Liquids left: ");

        if(ingredients.isEmpty()){
            builder.append("none");
        }else{
            for (Integer ingredient : ingredients) {
                builder.append(ingredient).append(", ");
            }
        }

        builder.append(System.lineSeparator());
        builder.append(String.format(" Bread:%d%n Cake:%d%n Fruit pie:%d%n Pastry:%d%n",
                breadCounter, cakeCounter, fruitPieCounter, pastryCounter));

        System.out.println(builder);
    }
}
/*
Input:
1 25 50 50
50 25 25 24

Output:
Wohoo! You succeeded in cooking all the food!
Liquids left: none
Liquids left: none
 Bread:1
 Cake:1
 Fruit pie:1
 Pastry:1


*/