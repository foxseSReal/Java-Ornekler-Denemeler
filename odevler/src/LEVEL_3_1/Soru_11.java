package LEVEL_3_1;
import java.util.Scanner;
public class Soru_11 {

	public static void main(String[] args) {
		 Scanner a = new Scanner(System.in);
	        String enKucukKelime = "";
	        String enBuyukKelime = "";

	        System.out.println("Lütfen 10 kelime girin:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print((i + 1) + ". kelime: ");
	            String kelime = a.next();

	            // İlk kelimeyi varsayılan olarak atıyoruz
	            if (i == 0) {
	                enKucukKelime = kelime;
	                enBuyukKelime = kelime;
	            }

	            // En küçük kelimeyi bulma
	            if (kelime.length() < enKucukKelime.length()) {
	                enKucukKelime = kelime;
	            }

	            // En büyük kelimeyi bulma
	            if (kelime.length() > enBuyukKelime.length()) {
	                enBuyukKelime = kelime;
	            }
	        }

	        System.out.println("\n En küçük kelime: " + enKucukKelime);
	        System.out.println("En büyük kelime: " + enBuyukKelime);

	        a.close();
	}

}
