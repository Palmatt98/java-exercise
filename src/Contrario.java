import java.util.Scanner;

//Scrivere un programma Contrario che, data una stringa, la stampa al contrario. Per esempio, la stringa “Viva Java!” verrà “!avaJ aviV
public class Contrario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci una frase");

        String parola = scanner.nextLine();

        for (int i = parola.length() -1; i >= 0; i--) {
            System.out.print(parola.charAt(i));
        }
        scanner.close();


    }
}
