package koala;

public class Pizza {
    String impasto;
    String mozzarella;
    String pomodoro;
    String pizzaiolo;

    Pizza(String impasto, String mozzarella, String pomodoro, String pizzaiolo) {
        this.impasto = impasto;
        this.mozzarella = mozzarella;
        this.pomodoro = pomodoro;
        this.pizzaiolo = pizzaiolo;
        System.out.println(impasto + mozzarella + pomodoro + pizzaiolo);
    }
}
