package SetsAndMaps.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String,String> phonebook = new HashMap<>();

        while(!input. equals("search")){

            String[] tokens = input.split("-");
            String name = tokens[0];
            String phoneNumber = tokens[1];

            phonebook.put(name, phoneNumber);

            input = scan.nextLine();
        }
        String input2 = scan.nextLine();

        while(!input2.equals("stop")){

            if(phonebook.containsKey(input2)){
                for (Map.Entry<String, String> entry : phonebook.entrySet()) {
                    if(entry.getKey().equals(input2)) {
                        System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());

                    }
                }
            }else{
                System.out.printf("Contact %s does not exist.%n", input2);
            }

            input2 = scan.nextLine();
        }
    }
}
/*
Input:
        John-00359888001122
        Peter-0040333111000
        George-0049112233
        Samuel-0047123123123
        search
        Samuel
        samuel
        PeTeR
        Peter
        stop

Output:
        Samuel -> 0047123123123
        Contact samuel does not exist.
        Contact PeTeR does not exist.
        Peter -> 0040333111000

 */