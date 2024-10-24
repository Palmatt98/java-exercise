package string;

public class Sequence {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("     ");

            for (int s = 6 - i + 1; s >= 1; s--) {
                System.out.print(s);

            }
            System.out.println();
        }
    }
}
//1
//