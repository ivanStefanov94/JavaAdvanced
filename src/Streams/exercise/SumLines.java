package Streams.exercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class SumLines {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\ivans\\Desktop\\exercise resourses\\input.txt";

        FileInputStream fileStream = new FileInputStream(path);

        Scanner scan = new Scanner(fileStream);

        while(scan.hasNext()){
            String line = scan.nextLine();

            int sum = 0;

            for (int i = 0; i < line.length(); i++) {
                char letter = line.charAt(i);
                sum+= (int)letter;
            }
            System.out.println(sum);

        }

    }
}
