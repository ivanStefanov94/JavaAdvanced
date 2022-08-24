package Streams.exercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LineNumbers {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\ivans\\Desktop\\exercise resourses\\inputLineNumbers.txt";

        FileInputStream fileStream = new FileInputStream(path);

        Scanner scan = new Scanner(fileStream);

        int counter = 1;

        while(scan.hasNext()){
            String line = scan.nextLine();

            System.out.println(counter + ". " + line);

            counter++;

        }
    }
}


