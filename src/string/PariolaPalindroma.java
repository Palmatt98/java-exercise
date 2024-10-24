package string;

import java.util.Scanner;

public class PariolaPalindroma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci una parola per vedere se è palindroma ");

        String parola = scanner.nextLine();

        String parolaInversa = "";

        for (int i = parola.length() - 1; i >= 0 ; i--) {
            parolaInversa += parola.charAt(i);
        }
        if (parola.equals(parolaInversa)) {
            System.out.println("la parola è palindroma");
        }else {
            System.out.println("la parola non è palindroma");
        }
    }
}
