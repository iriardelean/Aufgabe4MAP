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

        // aufgabe 3
        int[] usbPreise3 = {15, 45, 20};
        int budget3 = 30;
        System.out.println("Aufgabe 3 - Teuerstes USB aus " + Arrays.toString(usbPreise3) + " mit Budget " + budget3 + ":");
        System.out.println("   Ergebnis: " + ElektronikShop.getTeuersteUsbInBudget(usbPreise3, budget3));

        // aufgabe 4
        int budget4_1 = 60;
        int[] tastaturen4_1 = {40, 50, 60};
        int[] usb4_1 = {8, 12};
        System.out.println("Aufgabe 4.1 - Maximale Ausgabe (Budget: " + budget4_1 + ", T: " + Arrays.toString(tastaturen4_1) + ", U: " + Arrays.toString(usb4_1) + "):");
        System.out.println("   Ergebnis: " + ElektronikShop.getMaximalAusgabe(budget4_1, tastaturen4_1, usb4_1));

        int budget4_2 = 60;
        int[] tastaturen4_2 = {60};
        int[] usb4_2 = {8, 12};
        System.out.println("Aufgabe 4.2 - Maximale Ausgabe (Budget: " + budget4_2 + ", T: " + Arrays.toString(tastaturen4_2) + ", U: " + Arrays.toString(usb4_2) + "):");
        System.out.println("   Ergebnis: " + ElektronikShop.getMaximalAusgabe(budget4_2, tastaturen4_2, usb4_2));

        int budget4_3 = 60;
        int[] tastaturen4_3 = {40, 60};
        int[] usb4_3 = {8, 12};
        System.out.println("Aufgabe 4.3 - Maximale Ausgabe (Budget: " + budget4_3 + ", T: " + Arrays.toString(tastaturen4_3) + ", U: " + Arrays.toString(usb4_3) + "):");
        System.out.println("   Ergebnis: " + ElektronikShop.getMaximalAusgabe(budget4_3, tastaturen4_3, usb4_3));
    }
}