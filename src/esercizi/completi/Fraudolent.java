package esercizi.completi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Fraudolent {
    //leggere il file
    //dal file ricavare una Lista di string
    //calcolare l'importo totale delle singole operazioni
    //sommare gli importi totali degli acquisti
    //sommare gli importi totali delle vendite
    //mostrare il numero di operazioni totali + le due somme -> “Op: (nn) Buy: (bb) Sell: (ss)”

    public static List<String> getOperations() {
        String filePath = "C:/Users/Matteo/fraudolent.txt";
        Stream<String> lines = null;

        List<String> operations = new ArrayList<>();

        try {
            lines = Files.lines(Paths.get(filePath));
            lines.forEach(operation -> {
                operations.add(operation);
            });
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (lines != null) {
                lines.close(); // Chiudere lo stream manualmente
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        List<String> operations = getOperations();

        double totalAmountBuy = 0;
        double totalAmountSell = 0;

        for (String operation : operations) {
            String[] opSplit = operation.split(" ");

            double actionCost = Double.parseDouble(opSplit[1]);
            int actionQty = Integer.parseInt(opSplit[2]);
            boolean isBuy = opSplit[3].equals("B");

            double amount = actionQty * actionCost;

            if (isBuy) {
                totalAmountBuy += amount;
            } else {
                totalAmountSell += amount;
            }
        }

        System.out.println("Op: (" + operations.size() + ") Buy: (" + totalAmountBuy + ") Sell: (" + totalAmountSell + ")");

    }
}
