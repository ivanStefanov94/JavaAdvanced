package SetsAndMaps.exercise;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<String, LinkedHashSet<String>> map = new LinkedHashMap<>();

        while(!input.equals("JOKER")){

            String[] tokens = input.split(": ");
            String name = tokens[0];

            String[] tokens2 = tokens[1].split(", ");

            if(!map.containsKey(name)){

            map.put(name, new LinkedHashSet<>());

            for (int i = 0; i < tokens2.length; i++) {
                String cards = tokens2[i];
                map.get(name).add(cards);

            }}else {
                for (int i = 0; i < tokens2.length; i++) {
                    String cards = tokens2[i];
                    map.get(name).add(cards);
                }
            }
            input = scan.nextLine();
        }

        for (Map.Entry<String, LinkedHashSet<String>> player : map.entrySet()) {
            int pointss = getCardPoints(player.getValue());
            System.out.println(player.getKey() + ": " + pointss);
        }
    }

    private static int getCardPoints(LinkedHashSet<String> cards) { //пресмята точките на картите на всеки участник
        int sum = 0;

        Map<Character, Integer> pointsValues = getPointsValues();

        for (String card : cards) {

            int points = 0;
            if(card.contains("10")){
                char strength  = card.charAt(2);
                points = 10 * pointsValues.get(strength);
            }else{
                char number = card.charAt(0);
                char strength = card.charAt(1);
                points = pointsValues.get(number) * pointsValues.get(strength);
            }
            sum+=points;
        }
        return sum;
    }

    private static Map<Character, Integer> getPointsValues() { //определя точките на всяка карта
        Map<Character, Integer>  points = new HashMap<>();

        points.put('1', 1);
        points.put('2', 2);
        points.put('3', 3);
        points.put('4', 4);
        points.put('5', 5);
        points.put('6', 6);
        points.put('7', 7);
        points.put('8', 8);
        points.put('9', 9);
        points.put('J', 11);
        points.put('Q', 12);
        points.put('K', 13);
        points.put('A', 14);
        points.put('S', 4);
        points.put('H', 3);
        points.put('D', 2);
        points.put('C', 1);

        return points;
    }
}

//Input:
//        Peter: 2C, 4H, 9H, AS, QS
//        Slav: 3H, 10S, JC, KD, 5S, 10S
//        Alex: QH, QC, QS, QD
//        Slav: 6H, 7S, KC, KD, 5S, 10C
//        Alex: QH, QC, JS, JD, JC
//        Peter: JD, JD, JD, JD, JD, JD
//        JOKER
//
//Output:
//        Peter: 167
//        Slav: 175
//        Alex: 197