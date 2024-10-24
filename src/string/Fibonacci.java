package string;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        int num1 = 0, num2 = 1;
        System.out.print("Ecco la squenza di fibonacci per 10 elementi: " + num1 + " " + num2);

        for (int i = 0; i < n; i++) {
            int nextNum = num1 + num2;
            System.out.print(" " + nextNum);
            num1 = num2;
            num2 = nextNum;
        }
    }
}
