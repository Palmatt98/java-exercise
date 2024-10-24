package esercizi.completi;
//Scrivere la funzione caffeina(int n) che prende un numero positivo come argomento e:
//Se il numero è divisibile per 3, stampa “Java”
//Se il numero è divisibile per 3 e per 4, stampa “Coffee”
//Se il numero appartiene ad uno dei due casi precedenti ed è pari, aggiunge “Script” in fondo alla stringa
//Se non appartiene a nessuno dei casi precedenti stampa “match_missed!”

public class Caffeina {
    public static void caffeina(int n) {
        boolean onlyBy3 = false;
        boolean by3AndBy4 = false;
        if (n % 3 == 0 && n % 4 == 0) {
            System.out.print("coffe");
            by3AndBy4 = true;
        } else if (n % 3 == 0) {
            System.out.print("java");
            onlyBy3 = true;
        }
        if ((onlyBy3 || by3AndBy4) && n % 2 == 0) {
            System.out.print(" script");
        } else if (!onlyBy3) {
            System.out.println("match_missed!");
        }

    }

    public static void main(String[] args) {
        caffeina(11);
    }
}
