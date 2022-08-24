package Streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\ivans\\Desktop\\Streams resources\\Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        Scanner scan = new Scanner(inputStream);

        int nextByte = inputStream.read();

        while(nextByte != -1){

            System.out.print(Integer.toBinaryString(nextByte) + " ");
            nextByte = inputStream.read();
        }
    }
}
