import javax.lang.model.util.SimpleElementVisitor7;
import java.util.Scanner;

//Scrivere un programma Concatena che chiede all’utente di inserire tre singole parole e le ristampa interponendovi un asterisco. Per esempio, se l’utente inserisce “gatto”, “cane” e “topo” il programma stamperà “gatto*cane*topo”
public class Concatena {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("inserisci la prima parola");

        String prima = input.nextLine();



        System.out.println("inserisci la seconda parola");

        String seconda = input.nextLine();

        System.out.println("inserisci la terza parola");


        String terza = input.nextLine();

        String result = prima  + "*" + seconda + "*" + terza;
        System.out.println("il risultato delle tue parole sono " + "\n" + result);



    }
}
