package string;

import java.util.Scanner;

public class Multplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero per avere la tua tabellina: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {

            int result = number * i;

            System.out.println(number + " * " + i + " = " + result );
        }
    }
}
