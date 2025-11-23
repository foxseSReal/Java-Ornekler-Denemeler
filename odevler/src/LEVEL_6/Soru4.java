package LEVEL_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Soru4 {

	public static void main(String[] args) {
		 // Programın bulunduğu klasördeki metin dosyasının adı
        String dosyaAdi = "metinBelgesi.txt"; // Burayı dosyanın adıyla değiştirin

        try (BufferedReader reader = new BufferedReader(new FileReader(dosyaAdi))) {
            String satir;
            int satirNumarasi = 1;
            boolean bulundu = false;
            
            // Satırları oku ve "merhaba" kelimesini kontrol et
            while ((satir = reader.readLine()) != null) {
                if (satir.toLowerCase().contains("merhaba")) { // "merhaba" kelimesini kontrol et
                    System.out.println("Kelime 'merhaba' " + satirNumarasi + ". satırda geçiyor.");
                    bulundu = true;
                }
                satirNumarasi++;
            }

            if (!bulundu) {
                System.out.println("'merhaba' kelimesi dosyada bulunamadı.");
            }

        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }

	}

}
