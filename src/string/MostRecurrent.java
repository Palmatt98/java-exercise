//Scrivere il metodo: “public int mostRecurrent(int [] array)” , che trova l’elemento più ricorrente in un array. Il metodo restituisce l’elemento trovato
package string;

public class MostRecurrent {
    public static int[] array = {4, 3, 3, 5, 3, 3, 12, 3, 14, 15, 3, 4, 4, 4, 4};

    public static int mostRecurrent() {

        int maxCount = 0;
        int mostFrequentNumber = array[0];


        for (int i = 0; i < array.length; i++) {
            int numCurrent = array[i];
            int counter = 0;


            for (int j = 0; j < array.length; j++) {
                if (array[j] == numCurrent) {
                    counter++;

                }
            }
            System.out.println(numCurrent);
        }
        return mostFrequentNumber;
    }


    public static void main(String[] args) {
        System.out.println("Il numero piú ricorrente é il " + mostRecurrent());

    }
}
