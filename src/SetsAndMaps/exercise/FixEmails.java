package SetsAndMaps.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String,String> mailCollection = new LinkedHashMap<>();
        int counter = 0;
        String names = "";
        String mails = "";

        while(!input.equals("stop")){
            counter++;

            if(counter%2 == 1){
                names = input;
            }else{
                mails = input;
            }
                mailCollection.put(names, mails);

            input = scan.nextLine();
        }

        for (Map.Entry<String, String> entry : mailCollection.entrySet()) {
            if (!entry.getValue().contains(".us") && !entry.getValue().contains(".uk")
            && !entry.getValue().contains(".com")){
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }}
    }
}

//Input:
//        John
//        johnDoe@softuni.org
//        Peter Smith
//        smith.peter@softuni.org
//        Taylor Baker
//        baker@gmail.com
//        stop
//
//Output:
//        John -> johnDoe@softuni.org
//        Peter Smith -> smith.peter@softuni.org