package LEVEL_6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Soru2 {

	public static void main(String[] args) {
		 try (Scanner scanner = new Scanner(System.in)) {
			// Kullanıcının masaüstü dizinini bulma
	        String desktopPath = System.getProperty("user.home") + "/Desktop/sayilar.txt";

	        try (FileWriter writer = new FileWriter(desktopPath)) {
	            for (int i = 1; i <= 10; i++) {
	                System.out.print(i + ". sayıyı girin: ");
	                int sayi = scanner.nextInt();
	                writer.write(sayi + "\n"); // Her sayıyı yeni satıra yaz
	            }
	            System.out.println("Sayılar masaüstüne 'sayilar.txt' dosyasına yazıldı.");
	        } catch (IOException e) {
	            System.out.println("Dosya yazma hatası: " + e.getMessage());
	        }
		}
	}

}
