package SetsAndMaps;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();

        String input = scan.nextLine();

        while(!input.equals("END")){

            String[] tokens = input.split(", ");
            String command = tokens[0];
            String carNumber = tokens[1];

            if(command.equals("IN")){

                parkingLot.add(carNumber);


            }else if(command.equals("OUT")){
                parkingLot.remove(carNumber);
            }

            input = scan.nextLine();
        }

        if(parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String lot : parkingLot) {
                System.out.println(lot);
            }
        }

    }
}
