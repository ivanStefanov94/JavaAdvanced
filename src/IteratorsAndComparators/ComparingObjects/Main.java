package IteratorsAndComparators.ComparingObjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        String input = scan.nextLine();

        while(!input.equals("END")){
            String[] tokens = input.split("\\s+");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String town = tokens[2];

            Person person = new Person(name, age, town);
            people.add(person);

            input = scan.nextLine();
        }

        int index = Integer.parseInt(scan.nextLine());
        Person searchedPerson = people.get(index - 1);



        int matchesCount = 0;

        for (Person p : people) {
            if(searchedPerson.compareTo(p) == 0){
                matchesCount++;
            }
        }

        if(matchesCount == 1){
            System.out.println("No matches");
        }else{
            System.out.println(matchesCount + " " + (people.size() - matchesCount) + " " + people.size());
            //                {number of equal people} {number of not equal people} {total number of people}
        }
    }

}
/*
Input:
Peter 22 Varna
George 14 Sofia
END
2

Output:
No matches
*/

/*
Input:
Peter 22 Varna
George 22 Varna
George 22 Varna
END
2

Output:
2 1 3
*/