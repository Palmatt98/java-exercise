package overloading;

public class Main {
    public static void main(String[] args) {
        Integer num = 3;
        num = fly(num);
        System.out.println(num);
    }
    public static Integer fly(Integer numMiles) {
        numMiles = 4;
        return numMiles;
    }

    public static void fly(int numMiles) { }


    public void fly(int numMiles, int potato) {
        System.out.println("public void fly(int numMiles, int potato)");
    }

    public void fly() {
        System.out.println("public void fly()");
    }

    public int fly(int numMiles, int potato, String onion) {
        System.out.println("public void fly(int numMiles)");
        return numMiles;
    }

    private void fly(int numMiles, int potato, int onion) {
        System.out.println("public void fly(int numMiles)");
    }
}
