package Generics.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        CustomList<String> customList = new CustomList<>();

        while(!input.equals("END")){

            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            if(command.equals("Add")){
                customList.add(tokens[1]);

            }else if (command.equals("Remove")){
                customList.remove(Integer.parseInt(tokens[1]));

            }else if (command.equals("Contains")){
                System.out.println(customList.contains(tokens[1]));

            }else if (command.equals("Swap")){
                int index1 = Integer.parseInt(tokens[1]);
                int index2 = Integer.parseInt(tokens[2]);
                customList.swap(index1, index2);

            }else if (command.equals("Greater")){
                System.out.println(customList.countGreaterThan(tokens[1]));

            }else if (command.equals("Max")){
                System.out.println(customList.getMax());

            }else if (command.equals("Min")){
                System.out.println(customList.getMin());

            }else if(command.equals("Sort")){
             Sorter.sort(customList);

            }else if (command.equals("Print")){
                System.out.print(customList.toString());
            }
            input = scan.nextLine();
        }
    }
}
