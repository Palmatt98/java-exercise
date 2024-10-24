package exception;

public class Main {
    public static void fall() {
        throw new RuntimeException();
    }

    public static void main(String[] args) throws Exception {
        try {
            System.out.println("test1");
            //fall();
            System.out.println("Non arrivi qui");
        } catch (RuntimeException e) {
            System.out.println("Siamo nel catch");
            throw e;
        } finally {
            System.out.println("Siamo nel finally");
        }
        System.out.println("Siamo fuori dal try catch");
    }
}
