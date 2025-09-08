package opgave04;

import java.util.Random;
import java.util.Scanner;


public class Opgave04 {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Indtast et tal mellem 0 - 2: ");
        int slag = input1.nextInt();

        Random random = new Random();
        int pc_slag = random.nextInt(3);
        System.out.println("Pc'en slog: " + pc_slag);

        if (pc_slag == slag) {
            System.out.println("Uafgjort");

        } else if (pc_slag == 0 && slag == 1 || pc_slag == 1 && slag == 2 || pc_slag == 2 && slag == 0) {

            System.out.println("Computeren vandt");
        }
        else {
            System.out.println("Du vandt");
        }
    }
}

