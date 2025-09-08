package opgave02;

public class FizzBuzz {
    public static void main(String[] args) {
        int currentNumber = 1;
        int x;
        int y;
        while (currentNumber <= 40) {
            //Indsæt din implementering af FizzBuzz her.
            x = currentNumber % 3;
            y = currentNumber % 5;

            if (x == 0 && y == 0){
                System.out.println("fizzbuzz");
            }
            else if (x == 0){
                System.out.println("fizz");
            }
            else if (y == 0){
                System.out.println("buzz");
            }
            else {
                System.out.println(currentNumber);
            }
            currentNumber++;

    }
}
}

