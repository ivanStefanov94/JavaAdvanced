package SetsAndMaps.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        int counter = 0;
        String material = "";


        while(!input. equals("stop")){
            counter++;

            int quantity = 0;
            if(counter%2 == 1){
                material = input;
            }else{
                quantity = Integer.parseInt(input);
            }

            if(!map.containsKey(material)){
                map.put(material, quantity);
            }else{
                map.put(material, map.get(material) + quantity);
            }

            input = scan.nextLine();
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}


//        Gold
//        15555555
//        Silver
//        10000000
//        Copper
//        17000000
//        Copper
//        1700
//        stop
//
//        Gold -> 15555555
//        Silver -> 10000000
//        Copper -> 17001700