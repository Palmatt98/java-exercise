package string;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " fizz");
            }else if (i % 5 == 0) {
                System.out.println(i + " buzz");
            } else {
                System.out.println(i + " i numeri non sono divisibili ne per 3 ne per 5 e ne per 3 e per 5");
            }
        }
    }
}
