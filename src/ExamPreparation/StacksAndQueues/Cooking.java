package ExamPreparation.StacksAndQueues;

import java.util.*;

public class Cooking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] liquids = Arrays.stream(scan.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        int[] ingredients = Arrays.stream(scan.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> liquidCollectionQueue = new ArrayDeque<>();
        ArrayDeque<Integer> ingredientCollectionStack = new ArrayDeque<>();

        for (int j : liquids) {
            liquidCollectionQueue.offer(j);
        }
        for (int j : ingredients) {
            ingredientCollectionStack.push(j);
        }

        Map<String, Integer> foodValue = new TreeMap<>();
        Map<String, Integer> foodQuantity = new TreeMap<>();

        foodValue.put("Bread", 25);
        foodValue.put("Cake", 50);
        foodValue.put("Pastry", 75);
        foodValue.put("Fruit Pie", 100);

        foodQuantity.put("Bread", 0);
        foodQuantity.put("Cake", 0);
        foodQuantity.put("Pastry", 0);
        foodQuantity.put("Fruit Pie", 0);

        while(liquidCollectionQueue.size()>0 && ingredientCollectionStack.size()>0 ) {
            if(foodValue.get("Bread")==(liquidCollectionQueue.peek()+ingredientCollectionStack.peek())){
                if(!foodQuantity.containsKey("Bread")){
                    foodQuantity.put("Bread", 1);
                    liquidCollectionQueue.poll();
                    ingredientCollectionStack.pop();
                }else{
                    foodQuantity.put("Bread", foodQuantity.get("Bread") + 1);
                    liquidCollectionQueue.poll();
                    ingredientCollectionStack.pop();
                }
            }else if (foodValue.get("Cake")==(liquidCollectionQueue.peek()+ingredientCollectionStack.peek())){
                if(!foodQuantity.containsKey("Cake")){
                    foodQuantity.put("Cake", 1);
                    liquidCollectionQueue.poll();
                    ingredientCollectionStack.pop();
                }else{
                    foodQuantity.put("Cake", foodQuantity.get("Cake") + 1);
                    liquidCollectionQueue.poll();
                    ingredientCollectionStack.pop();
                }
            }else if (foodValue.get("Pastry")==(liquidCollectionQueue.peek()+ingredientCollectionStack.peek())){
                if(!foodQuantity.containsKey("Pastry")){
                    foodQuantity.put("Pastry", 1);
                    liquidCollectionQueue.poll();
                    ingredientCollectionStack.pop();
                }else{
                    foodQuantity.put("Pastry", foodQuantity.get("Pastry") + 1);
                    liquidCollectionQueue.poll();
                    ingredientCollectionStack.pop();
                }
            }else if (foodValue.get("Fruit Pie")==(liquidCollectionQueue.peek()+ingredientCollectionStack.peek())){
                if(!foodQuantity.containsKey("Fruit Pie")){
                    foodQuantity.put("Fruit Pie", 1);
                    liquidCollectionQueue.poll();
                    ingredientCollectionStack.pop();
                }else{
                    foodQuantity.put("Fruit Pie", foodQuantity.get("Fruit Pie") + 1);
                    liquidCollectionQueue.poll();
                    ingredientCollectionStack.pop();
                }
            }else{
                liquidCollectionQueue.poll();
                int newIngredientValue = ingredientCollectionStack.pop() + 3;
                ingredientCollectionStack.push(newIngredientValue);
            }
        }

        if(foodQuantity.get("Bread")>0 && foodQuantity.get("Cake")>0 && foodQuantity.get("Pastry")>0 && foodQuantity.get("Fruit Pie")>0){
            System.out.println("Wohoo! You succeeded in cooking all the food!");
            if(liquidCollectionQueue.size() < 1){
                System.out.println("Liquids left: none");
            }else{
//!!!!!!!!!!!!!!!!!!!!stream().map(String::valueOf).collect(Collectors.joining(, ) !!!!!!!!!!!!!!!!!!!!
                StringBuilder builder = new StringBuilder();
                builder.append("Liquids left: ");
                for (Integer liquid : liquidCollectionQueue) {
                    builder.append(liquid).append(", ");
                }
                builder.deleteCharAt(builder.length()-2);
                System.out.println(builder.toString());
            }
            if(ingredientCollectionStack.size() < 1){
                System.out.println("Ingredients left: none");
            }else{
                StringBuilder builder = new StringBuilder();
                builder.append("Ingredients left: ");
                for (Integer ingredient : ingredientCollectionStack) {
                    builder.append(ingredient).append(", ");
                }
                builder.deleteCharAt(builder.length()-2);
                System.out.println(builder.toString());
            }
        }else{
            System.out.println("Ugh, what a pity! You didn't have enough materials to to cook everything.");

            if(liquidCollectionQueue.size() < 1){
                System.out.println("Liquids left: none");
            }else{
                StringBuilder builder = new StringBuilder();
                builder.append("Liquids left: ");
                for (Integer liquid : liquidCollectionQueue) {
                    builder.append(liquid).append(", ");
                }
                builder.deleteCharAt(builder.length()-2);
                System.out.println(builder.toString());
            }
            if(ingredientCollectionStack.size() < 1){
                System.out.println("Ingredients left: none");
            }else{
                StringBuilder builder = new StringBuilder();
                builder.append("Ingredients left: ");
                for (Integer ingredient : ingredientCollectionStack) {
                    builder.append(ingredient).append(", ");
                }
                builder.deleteCharAt(builder.length()-2);
                System.out.println(builder.toString());
            }
        }

        for (Map.Entry<String, Integer> entry : foodQuantity.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}

//10 20 30 40 50
//50 40 30 30 15
//
//        Ugh, what a pity! You didn't have enough materials to cook everything.
//        Liquids left: none
//        Ingredients left: 39, 40, 50
//        Bread: 1
//        Cake: 1
//        Fruit Pie: 0
//        Pastry: 0

/*
Input:
1 25 50 50
50 25 25 24

Output:
Wohoo! You succeeded in cooking all the food!
Liquids left: none
Ingredients left: none
Bread: 1
Cake: 1
Fruit Pie: 1
Pastry: 1
*/