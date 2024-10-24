package string;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero per verificare se  è palindromo");

        int numero = scanner.nextInt();

        int numeroOriginale = numero;

        int numeroInverso = 0;

        while (numero > 0) {

            int ultimaCifra = numero % 10;

            numeroInverso = numeroInverso * 10 + ultimaCifra;

            numero = numero / 10;


        }
        if (numeroOriginale == numeroInverso) {
            System.out.println("Il numero è palindromo");
        } else {
            System.out.println("Il numero non è palindromo");
        }


    }

}
//124