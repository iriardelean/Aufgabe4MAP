public class ElektronikShop {
    // hilfsmethode
    public static void checkArray(int[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Das Array darf nicht null oder leer sein.");
    }
    // Schreiben Sie eine Methode, welche die billigste Tastatur zurückgibt.
    public static int getBilligsteTastatur(int[] tastaturen) {
        checkArray(tastaturen);

        int minPreis = tastaturen[0];

        for (int i = 1; i < tastaturen.length; i++)
            if (tastaturen[i] < minPreis)
                minPreis = tastaturen[i];

        return minPreis;
    }

    // Schreiben Sie eine Methode, welche den teuersten Gegenstand zurückgibt.
    public static int getTeuersteGegenstand(int[] tastaturen, int[] usb) {
        checkArray(tastaturen);
        checkArray(usb);

        int maxPreis = tastaturen[0];
        for (int i = 1; i < tastaturen.length; i++)
            if (tastaturen[i] > maxPreis)
                maxPreis = tastaturen[i];

        for (int i = 0; i < usb.length; i++)
            if (usb[i] > maxPreis)
                maxPreis = usb[i];

        return maxPreis;
    }

    // Schreiben Sie eine Methode, welche das teuerste USB Laufwerk, das Markus kaufen kann, zurückgibt.
    public static int getTeuersteUsbInBudget(int[] preise, int budget) {
        checkArray(preise);

        int maxKaufbar = -1;

        for (int i = 0; i < preise.length; i++) {
            int preis = preise[i];

            if (preis <= budget)
                if (preis > maxKaufbar)
                    maxKaufbar = preis;
        }

        return maxKaufbar;
    }

    // Finden Sie, anhand Markus’ Budget und der Preislisten für die Tastaturen und USB-Laufwerke, den maximalen Geldbetrag,
    // der von Markus ausgegeben wird. Wenn er nicht genug für beide hat, geben Sie stattdessen -1 zurück.
    // Er kauft nur die zwei benötigten Gegenstände.
    public static int getMaximalAusgabe(int budget, int[] tastaturen, int[] usb) {
        checkArray(tastaturen);
        checkArray(usb);

        int maxAusgabe = -1;

        for (int i = 0; i < tastaturen.length; i++)
            for (int j = 0; j < usb.length; j++) {

                int tPreis = tastaturen[i];
                int uPreis = usb[j];
                int summe = tPreis + uPreis;

                if (summe <= budget)
                    if (summe > maxAusgabe)
                        maxAusgabe = summe;
            }

        return maxAusgabe;
    }
}
