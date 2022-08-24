package Streams.exercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class AllCapitals {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\ivans\\Desktop\\exercise resourses\\input.txt";

        FileInputStream fileStream = new FileInputStream(path);

        Scanner scan = new Scanner(fileStream);

        while(scan.hasNext()){
            String line = scan.nextLine().toUpperCase();
            System.out.println(line);
        }
    }
}


