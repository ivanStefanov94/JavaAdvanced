package Streams;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\ivans\\Desktop\\Streams resources\\Resources\\input.txt";

        FileReader reader = new FileReader(path);

        Scanner scan = new Scanner(reader);

        while(scan.hasNext()){
            if(scan.hasNextInt()) {

                System.out.println(scan.nextInt());
            }
            scan.next();
        }


    }
}
