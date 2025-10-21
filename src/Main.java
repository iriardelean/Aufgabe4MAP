import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // aufgabe 1
        int[] tastaturPreise1 = {40, 35, 70, 15, 45};
        System.out.println("Aufgabe 1 - Billigste Tastatur aus " + Arrays.toString(tastaturPreise1) + ":");
        System.out.println("Ergebnis: " + ElektronikShop.getBilligsteTastatur(tastaturPreise1));

        // aufgabe 2
        int[] tastaturPreise2 = {15, 20, 10, 35};
        int[] usbPreise2 = {20, 15, 40, 15};
        System.out.println("Aufgabe 2 - Teuerster Gegenstand aus " + Arrays.toString(tastaturPreise2) + " und " + Arrays.toString(usbPreise2) + ":");
        System.out.println("Ergebnis: " + ElektronikShop.getTeuersteGegenstand(tastaturPreise2, usbPreise2));
    }
}