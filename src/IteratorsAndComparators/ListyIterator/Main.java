package IteratorsAndComparators.ListyIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        List<String> data = Arrays.stream(scan.nextLine().split("\\s+"))
                .skip(1)
                .collect(Collectors.toList());

        ListyIterator listyIterator = new ListyIterator(data);

        String input = scan.nextLine();

        while(!input.equals("END")){

            if (input.equals("Move")) {
                System.out.println(listyIterator.move());
            } else if (input.equals("Print")) {
                listyIterator.print();
            } else if (input.equals("HasNext")) {
                System.out.println(listyIterator.hasNext());
            }else if(input.equals("PrintAll")){
                listyIterator.printAll();
            }

            input = scan.nextLine();
        }

    }
}
/*
Input:
Create Sam George Peter
PrintAll
Move
Move
Print
HasNext
END


Output:
Sam George Peter
true
true
Peter
false


*/