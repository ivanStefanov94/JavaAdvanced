package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Voina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        LinkedHashSet<Integer> player1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> player2 = new LinkedHashSet<>();

        for (int i = 0; i < input.length; i++) {
            int numberToAdd = Integer.parseInt(input[i]);
            if(i%2==0){
                player1.add(numberToAdd);
            }else{
                player2.add(numberToAdd);
            }
        }

        int rounds = 50;

        while(rounds-- > 0){
            int firstCard = 0;
            int secondCard = 0;

            for (Integer card : player1) {
                firstCard = card;
                break;
            }
            for (Integer card : player2) {
                secondCard = card;
                break;
            }

            player1.remove(firstCard);
            player2.remove(secondCard);

            if(firstCard>secondCard){
                player1.add(firstCard);
                player1.add(secondCard);
            }else{
                player2.add(firstCard);
                player2.add(secondCard);
            }

            if (player1.isEmpty() || player2.isEmpty()){
                break;
            }
        }

        if(player1.size()>player2.size()){
            System.out.println("First player win!");
        }else if(player1.size()<player2.size()){
            System.out.println("Second player win!");
        }else{
            System.out.println("Draw!");
        }
    }
}
