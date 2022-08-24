package FunctionalProgramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge_methodFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String,Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(", ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            people.put(name,age);
        }

        String ageCondition = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String format = scan.nextLine();



        people.entrySet().stream()
                .filter(getAgeFilter(age, ageCondition))
                .forEach(getFormat(format));

    }

    private static Predicate<Map.Entry<String, Integer>> getAgeFilter(int age, String ageCondition) {
        if(ageCondition.equals("older")){
            return e -> e.getValue() >= age;
        }else{
            return e -> e.getValue() <= age;
        }

    }
    public static Consumer<Map.Entry<String, Integer>> getFormat(String format){

            if (format.equals("name age")){
               return entry -> System.out.println(entry.getKey() + " - " + entry.getValue());
            }else if(format.equals("name")){
                return entry -> System.out.println(entry.getKey());
            }
                return entry -> System.out.println(entry.getValue());

    }
}

//          без Predicate метод
//                people.entrySet().stream()
//                .filter(e -> {
//                    if(ageCondition.equals("older")){
//                        return e.getValue() >= age;
//                    }else{
//                        return  e.getValue() <= age;
//                    }
//                })
//                .forEach(entry -> {
//                    if (format.equals("name age")){
//                        System.out.println(entry.getKey() + " - " + entry.getValue());
//                    }else if(format.equals("name")){
//                        System.out.println(entry.getKey());
//                    }else if(format.equals("age")){
//                        System.out.println(entry.getValue());
//                    }
//                });


//        5
//        Pesho, 20
//        Gosho, 18
//        Mimi, 29
//        Ico, 31
//        Simo, 16
//        older
//        20
//        name age
//
//        Pesho - 20
//        Mimi - 29
//        Ico - 31