package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeSet<String> vip = new TreeSet<>();

        String guests = scan.nextLine();

        while (!guests.equals("PARTY")){

            vip.add(guests);

            guests = scan.nextLine();
        }

        String partyGuests = scan.nextLine();

        while(!partyGuests.equals("END")){

            if(vip.contains(partyGuests)){
                vip.remove(partyGuests);
            }

            partyGuests = scan.nextLine();
        }

        System.out.println(vip.size());

        for (String s : vip) {
            System.out.println(s);
        }

    }
}
