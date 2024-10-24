package string;

public class IsCrescente {



    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 3, 5, 4, 6};
        int[] array3 = {1, 5, 4, 5, 6};
        System.out.println(isCrescente(array1)); // true
        System.out.println(isCrescente(array2)); // false
        System.out.println(isCrescente(array3)); // true

    }
    public static boolean isCrescente(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] > array[i + 1]){
                return false;
            }

        }

        return true;
    }
}
