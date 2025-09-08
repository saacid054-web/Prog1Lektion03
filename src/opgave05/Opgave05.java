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

        if (price < 67_800) {

            return 0;
        } else if (price > 67_800 && price < 210_600) {

            double price1 = (price - 67_800);
            double price2 = price-price1;

            price1 =  (price1*0.25);
            price2 =  (price2 * 0.85);


        } else {


        }


        return 15000;

    }
}
