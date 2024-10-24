package string;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 2, 4, 18, 13, 48};
        int maxNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
               maxNumber =  numbers[i];
            }

        }
        System.out.println(maxNumber);
    }
}
