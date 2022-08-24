package SetsAndMaps.exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        LinkedHashSet<String> usernames = new LinkedHashSet<>();

        for (int i = 0; i < number; i++) {
            String entry = scan.nextLine();

            usernames.add(entry);
        }
        for (String username : usernames) {
            System.out.println(username);
        }
    }
}
