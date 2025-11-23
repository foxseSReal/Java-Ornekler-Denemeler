package Bayram_Ödevi;
import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("1. Kat Sayıyı girin:");
        int a = x.nextInt();
        System.out.println("2. Kat Sayıyı girin:");
        int b = x.nextInt();
        System.out.println("3. Sabit Sayıyı girin:");
        int c = x.nextInt();
        
        int delta = (b * b) - (4 * a * c);
        System.out.println("Delta: " + delta);
        
        if (delta > 0) {  // Reelde çift kök var
            double kok1 = (-b - Math.sqrt(delta)) / (2 * a);
            double kok2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Gerçek kökler: " + kok1 + " ve " + kok2);
        } 
        else if (delta == 0) {  // Tek kök var
            double kok = -b / (2 * a);
            System.out.printf("Delta: %d Gerçek tek kök: %.2f%n", delta, kok);
        } 
        else {  // Karmaşık kökler var
            double gercek = -b / (2 * a);
            double sanal = Math.sqrt(-delta) / (2 * a);
            System.out.println("Karmaşık kökler= "+gercek+" "+ Math.abs(sanal) + "i kök2= "+gercek +" "+ Math.abs(sanal) + "i");
        }
        x.close();
    }
}