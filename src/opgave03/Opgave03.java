package opgave03;

import java.util.Scanner;

public class Opgave03 {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Indtast et tal mellem 0 og 6: ");
        int input = input1.nextInt();


        int day = input % 7;

        dag(day);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Indtast et tal mellem 0 og 6: ");
        int input3 = input2.nextInt();

        day = day + input3;

        dag(day);

    }
    public static void dag(int day) {

        if(day == 0)
            System.out.println("Mandag");

        else if (day == 1) {
            System.out.println("Tirsdag");

        }
        else if (day == 2) {
            System.out.println("Onsdag");

        } else if (day == 3) {
            System.out.println("Torsdag");

        } else if (day == 4) {
            System.out.println("Fredag");

        } else if (day == 5) {
            System.out.println("Lørdag");

        } else if (day == 6) {
            System.out.println("Søndag");
        }
        else if(day > 6){

            System.out.println("du indtastede et for stort tal");
            System.exit(0);
        }

    }
}


