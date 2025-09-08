package opgave01;

import java.util.Scanner;

public class Opgave01 {

    public static final int MINIMUM_AGE = 16;

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Indtast din alder: ");
        int alder = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Indtast alkoholprocenten: ");
        double alkoholprocent = input2.nextDouble();

        if (alder < 16 && alkoholprocent > 1.2 || alder < 18 && alkoholprocent > 16.5){

            System.out.println("Du er for ung til at købe dette produkt");
    }else{
            System.out.println("Du kan købe produktet");
        }
}
}
