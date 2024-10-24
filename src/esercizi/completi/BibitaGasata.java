package esercizi.completi;

public class BibitaGasata {

    public static int calculateRemainingDays(int content, int evapPerDay, int threshold) {
        int maxPercentage = 100;
        int remainingDays = 0;
        while (maxPercentage >= threshold) {
            maxPercentage = maxPercentage - evapPerDay;
            remainingDays++;
        }
        return remainingDays;
    }

    public static void main(String[] args) {
        int content = 5_000;
        int evapPerDay = 5;
        int threshold = 70;

        int remainingDays = calculateRemainingDays(content, evapPerDay, threshold);
        System.out.println("giorni rimanenti: " + remainingDays);
    }
}
