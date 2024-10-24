import java.util.Scanner;

//Scrivere un programma SoloVocali che, data una stringa, ne stampa le sole vocali
public class SoloVocali {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("inserisci una parola o una frase");
    String input = scanner.nextLine();
        System.out.println("Le vocali presenti della parola/frase  " + input + " sono le seguenti");
            int count = 0;

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                System.out.println(c);
                count++;
            }

        }
                System.out.println(" il numero di volcali trovate sono: " + count);

            scanner.close();





    }

}
