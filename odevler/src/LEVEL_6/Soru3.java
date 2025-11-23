package LEVEL_6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		 try (Scanner scanner = new Scanner(System.in)) {
			// Kullanıcının masaüstü dizinini bulma
	        String desktopPath = System.getProperty("user.home") + "/Desktop/sayilar.txt";

	        try (FileWriter writer = new FileWriter(desktopPath, true)) {  // true parametresi eklemeyi sağlar
	            System.out.println("Mevcut dosyanın devamına yeni sayılar ekleniyor...");
	            for (int i = 1; i <= 10; i++) {
	                System.out.print(i + ". sayıyı girin: ");
	                int sayi = scanner.nextInt();
	                writer.write(sayi + "\n"); // Her sayıyı yeni satıra yaz
	            }
	            System.out.println("Sayılar başarıyla 'sayilar.txt' dosyasının sonuna eklendi.");
	        } catch (IOException e) {
	            System.out.println("Dosya yazma hatası: " + e.getMessage());
	        }
		}

	}

}
