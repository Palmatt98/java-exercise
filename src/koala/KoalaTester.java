package koala;

import static java.util.Arrays.asList;

public class KoalaTester {

    public KoalaTester() {
        System.out.println("Sono nel costruttore: " + name);
    }

    {
        System.out.println("Sono nel blocco");
    }

    private static int count = 5;
    static {
        System.out.println("Sono nel blocco static");
        System.out.println("Sono nel blocco static: count = " + count);
    }
    private String name = "nome";

    public void setCount(int count) {
        KoalaTester.count = count;
    }
    public void arrampica() {
        System.out.println("Mi arrampico " + count + " volta/e");
        asList();
    }
}
