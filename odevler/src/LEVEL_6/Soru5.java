package LEVEL_6;
import java.io.*;
import java.util.Scanner;
public class Soru5 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Kullanıcının masaüstü dizinini al
	        String desktopPath = System.getProperty("user.home") + "/Desktop/ogrenci.txt";

	        // Öğrencilerin verilerini dosyaya yazma
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(desktopPath))) {
	            for (int i = 1; i <= 20; i++) {
	                System.out.print(i + ". Öğrencinin adını girin: ");
	                String ad = scanner.nextLine();

	                System.out.print(i + ". Öğrencinin vize notunu girin: ");
	                double vize = scanner.nextDouble();

	                System.out.print(i + ". Öğrencinin final notunu girin: ");
	                double finalNotu = scanner.nextDouble();
	                scanner.nextLine(); // Bu satır, nextDouble() sonrası satırın doğru şekilde alınmasını sağlar.

	                // Öğrencinin bilgilerini dosyaya yazma
	                writer.write(ad + "," + vize + "," + finalNotu);
	                writer.newLine(); // Her öğrenci verisini bir satıra yaz
	            }
	            System.out.println("Öğrenciler başarıyla masaüstüne 'ogrenci.txt' dosyasına yazıldı.");
	        } catch (IOException e) {
	            System.out.println("Dosya yazma hatası: " + e.getMessage());
	        }

	        // Öğrencilerin verilerini dosyadan okuma ve ekrana yazdırma
	        System.out.println("\nDosyadaki Öğrenci Bilgileri:");
	        try (BufferedReader reader = new BufferedReader(new FileReader(desktopPath))) {
	            String satir;
	            while ((satir = reader.readLine()) != null) {
	                String[] veriler = satir.split(","); // Her öğrencinin bilgilerini virgülle ayır
	                System.out.println("Ad: " + veriler[0] + ", Vize: " + veriler[1] + ", Final: " + veriler[2]);
	            }
	        } catch (IOException e) {
	            System.out.println("Dosya okuma hatası: " + e.getMessage());
	        }
scanner.close();
	}

}
