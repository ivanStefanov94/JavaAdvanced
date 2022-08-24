package SetsAndMaps;

import java.util.*;

public class ContinentCountryCity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        Map<String, LinkedHashMap<String, List<String>>> infoTable = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String[] tokens = scan.nextLine().split(" ");

            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

                infoTable.putIfAbsent(continent, new LinkedHashMap<>());
                LinkedHashMap<String,List<String>> innerMap = infoTable.get(continent);
                innerMap.putIfAbsent(country, new ArrayList<>());
                innerMap.get(country).add(city);


        }
        for (Map.Entry<String, LinkedHashMap<String, List<String>>> entry : infoTable.entrySet()) {
            String continent = entry.getKey();
            LinkedHashMap<String, List<String>> innerMap =  entry.getValue();

            System.out.println(continent + ":");
            for (Map.Entry<String, List<String>> innerEntry : innerMap.entrySet()) {
                System.out.println(" "+innerEntry.getKey() + " -> " + String.join(", ", innerEntry.getValue()));
            }
        }
    }
}

//        9
//        Europe Bulgaria Sofia
//        Asia China Beijing
//        Asia Japan Tokyo
//        Europe Poland Warsaw
//        Europe Germany Berlin
//        Europe Poland Poznan
//        Europe Bulgaria Plovdiv
//        Africa Nigeria Abuja
//        Asia China Shanghai
//
//        Europe:
//         Bulgaria -> Sofia, Plovdiv
//         Poland -> Warsaw, Poznan
//         Germany -> Berlin
//        Asia:
//         China -> Beijing, Shanghai
//         Japan -> Tokyo
//        Africa:
//         Nigeria -> Abuja