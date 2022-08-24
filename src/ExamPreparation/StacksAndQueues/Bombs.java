package ExamPreparation.StacksAndQueues;

import java.util.*;

public class Bombs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array1 = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        int[] array2 = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> effect = new ArrayDeque<>(); //queue -> offer/poll
        ArrayDeque<Integer> casing = new ArrayDeque<>(); //stack -> push/pop

        for (int i : array1) {
            effect.offer(i);
        }
        for (int i : array2) {
            casing.push(i);
        }

        Map<String, Integer> bombValues = new TreeMap<>();
        Map<String, Integer> bombQuantity = new TreeMap<>();

        bombValues.put("Datura Bombs", 40);
        bombValues.put("Cherry Bombs", 60);
        bombValues.put("Smoke Decoy Bombs", 120);

        bombQuantity.put("Datura Bombs", 0);
        bombQuantity.put("Cherry Bombs", 0);
        bombQuantity.put("Smoke Decoy Bombs", 0);

        //Effect -------queue -> offer/poll
        //Casing -------stack -> push/pop
        while (!effect.isEmpty() && !casing.isEmpty()) {
            if (bombValues.get("Datura Bombs") == (effect.peek() + casing.peek())) {
                if (!bombQuantity.containsKey("Datura Bombs")) {
                    bombQuantity.put("Datura Bombs", 1);
                    effect.poll();
                    casing.pop();
                } else {
                    bombQuantity.put("Datura Bombs", bombQuantity.get("Datura Bombs") + 1);
                    effect.poll();
                    casing.pop();
                }
            } else if (bombValues.get("Cherry Bombs") == (effect.peek() + casing.peek())) {
                if (!bombQuantity.containsKey("Cherry Bombs")) {
                    bombQuantity.put("Cherry Bombs", 1);
                    effect.poll();
                    casing.pop();
                } else {
                    bombQuantity.put("Cherry Bombs", bombQuantity.get("Cherry Bombs") + 1);
                    effect.poll();
                    casing.pop();
                }
            }else if (bombValues.get("Smoke Decoy Bombs") == (effect.peek() + casing.peek())) {
                if (!bombQuantity.containsKey("Smoke Decoy Bombs")) {
                    bombQuantity.put("Smoke Decoy Bombs", 1);
                    effect.poll();
                    casing.pop();
                } else {
                    bombQuantity.put("Smoke Decoy Bombs", bombQuantity.get("Smoke Decoy Bombs") + 1);
                    effect.poll();
                    casing.pop();
                }
            }else{
                int newCasingValue = casing.pop() - 5;
                casing.push(newCasingValue);
            }
        }

        if(bombQuantity.get("Datura Bombs")>2 && bombQuantity.get("Cherry Bombs")>2 && bombQuantity.get("Smoke Decoy Bombs")>2){
            System.out.println("Bene! You have successfully filled the bomb pouch!");

            if(effect.size()<1){
                System.out.println("Bomb Effects: empty");
            }else{
                StringBuilder builder = new StringBuilder();
                builder.append("Bomb Effects: ");
                for (Integer integer : effect) {
                    builder.append(integer).append(", ");
                }
                builder.deleteCharAt(builder.length()-2);
                System.out.println(builder.toString());
            }
            if(casing.size()<1){
                System.out.println("Bomb Casings: empty");
            }else{
                StringBuilder builder = new StringBuilder();
                builder.append("Bomb Casings: ");
                for (Integer integer : casing) {
                    builder.append(integer).append(", ");
                }
                builder.deleteCharAt(builder.length()-2);
                System.out.println(builder.toString());
            }
        }else{
            System.out.println("You don't have enough materials to fill the bomb pouch.");
            if(effect.size()<1){
                System.out.println("Bomb Effects: empty");
            }else{
                StringBuilder builder = new StringBuilder();
                builder.append("Bomb Effects: ");
                for (Integer integer : effect) {
                    builder.append(integer).append(", ");
                }
                builder.deleteCharAt(builder.length()-2);
                System.out.println(builder.toString());
            }
            if(casing.size()<1){
                System.out.println("Bomb Casings: empty");
            }else{
                StringBuilder builder = new StringBuilder();
                builder.append("Bomb Casings: ");
                for (Integer integer : casing) {
                    builder.append(integer).append(", ");
                }
                builder.deleteCharAt(builder.length()-2);
                System.out.println(builder.toString());
            }
        }
        for (Map.Entry<String, Integer> entry : bombQuantity.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(), entry.getValue());
        }
    }
    }
/*
Input:
5, 25, 50, 115
5, 15, 25, 35

Output:
You don't have enough materials to fill the bomb pouch.
Bomb Effects: empty
Bomb Casings: empty
Cherry Bombs: 1
Datura Bombs: 2
Smoke Decoy Bombs: 1
*/