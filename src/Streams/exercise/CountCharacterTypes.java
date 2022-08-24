package Streams.exercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\ivans\\Desktop\\exercise resourses\\input.txt";

        FileInputStream fileStream = new FileInputStream(path);

        Scanner scan = new Scanner(fileStream);
        int vowelsSum = 0;
        int consonantsSum = 0;
        int punctuationSum = 0;

        while(scan.hasNext()){
            String line = scan.nextLine();

            for (int i = 0; i < line.length(); i++) {
                char separate = line.charAt(i);

                if(separate == 'a' || separate == 'e' || separate == 'i' || separate == 'o'
                || separate == 'u'){
                    vowelsSum++;
                }else if(separate == '?' || separate == '.' || separate == ',' || separate == '!'){
                    punctuationSum++;
                }else if (!Character.isWhitespace(separate)){
                    consonantsSum++;
                }

            }

        }
        System.out.println("Vowels: " + vowelsSum);
        System.out.println("Consonants: " + consonantsSum);
        System.out.println("Punctuation: " + punctuationSum);

    }
}
