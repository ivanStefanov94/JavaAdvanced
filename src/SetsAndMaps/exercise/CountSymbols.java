package SetsAndMaps.exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        Map<Character, Integer> map = new TreeMap<>();


        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            int counter = 1;

            if(!map.containsKey(character)){
                map.put(character, counter);
            }else{
                map.put(character, map.get(character) + counter);
            }

        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
