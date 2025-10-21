public class ElektronikShop {
    // Schreiben Sie eine Methode, welche die billigste Tastatur zurückgibt.
    public static int getBilligsteTastatur(int[] tastaturen) {
        if (tastaturen.length == 0)
            throw new IllegalArgumentException("Das Array darf nicht null oder leer sein.");

        int minPreis = tastaturen[0];

        for (int i = 1; i < tastaturen.length; i++)
            if (tastaturen[i] < minPreis)
                minPreis = tastaturen[i];

        return minPreis;
    }

    // Schreiben Sie eine Methode, welche den teuersten Gegenstand zurückgibt.
    public static int getTeuersteGegenstand(int[] tastaturen, int[] usb) {
        if (tastaturen.length == 0)
            throw new IllegalArgumentException("Das Array darf nicht null oder leer sein.");
        if (usb.length == 0)
            throw new IllegalArgumentException("Das Array darf nicht null oder leer sein.");

        int maxPreis = tastaturen[0];
        for (int i = 1; i < tastaturen.length; i++)
            if (tastaturen[i] > maxPreis)
                maxPreis = tastaturen[i];

        for (int i = 0; i < usb.length; i++)
            if (usb[i] > maxPreis)
                maxPreis = usb[i];

        return maxPreis;
    }
}
