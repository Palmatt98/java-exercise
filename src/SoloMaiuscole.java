import java.util.Arrays;

//Scrivere un programma StampaMaiuscole che, dato un array di stringhe, ne stampa solo quelle con la prima lettera maiuscola
public class SoloMaiuscole {
    public static void main(String[] args) {
    String[] cars = {"Bmw", "audi", "Fiat", "mercedes", "Peugeot"};
        System.out.println("le parole con la prima lettera maiuscola sono ");

        for (String car : cars) {
            if(Character.isUpperCase(car.charAt(0))){
            System.out.println(car);

            }

        }

    }

}
