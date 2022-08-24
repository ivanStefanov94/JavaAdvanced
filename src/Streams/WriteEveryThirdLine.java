package Streams;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\ivans\\Desktop\\Streams resources\\Resources\\input.txt";

        FileReader reader = new FileReader(path);
        Scanner scan = new Scanner(reader);

        PrintStream printStream = new PrintStream("third-line-out.txt");

        int lineNumber = 0;

        while(scan.hasNext()){
            lineNumber++;
            if(lineNumber%3==0){

                printStream.println(scan.nextLine());
            }else{
                scan.nextLine();
            }

        }
    }
}
