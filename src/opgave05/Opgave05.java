package opgave05;

import java.util.Scanner;

public class Opgave05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast nypris: ");
        int price = input.nextInt();
        double registrationFee = calculateFee(price);
        System.out.println("En bil der koster " + price + " uden registreringsafgift, skal man betale " +
                registrationFee + " i registreringsafgift.");
    }

    public static double calculateFee(double price) {

        if (price <= 67_800) {

            return price*0.25;

        } else if (price > 67_800 && price < 210_600) {

            double price_low = 67_800*0.25;

            double price_mid = price-67_800;


            price_mid =  (price_mid * 0.85);

            return price_low + price_mid;

        } else {

            double price_low = 67_800*0.25;

            double price_mid = (210_600-67_800)*0.85;

            double price_high = (price - 210_600)*1.5;

            return price_high + price_low + price_mid;

        }


    }
}
