package LEVEL_7;
public class Soru5 {

	public static void main(String[] args) {
		  // Sayıların alacağı maksimum değeri belirliyoruz
        int maxDeger = 100;

        // 1'den 100'e kadar olan sayıları deneyeceğiz
        for (int x = 1; x < maxDeger; x++) {

            // 3 tane sayı tanımlıyoruz: x, x, x (aynı sayıyı 3 kez alıyoruz)
            int[] sayilar = new int[3];
            for (int i = 0; i < 3; i++) {
                sayilar[i] = x;
            }
            
            // Toplamı hesaplıyoruz
            int toplam = 0;
            for (int i = 0; i < sayilar.length; i++) {
                toplam = toplam + sayilar[i];
            }
            
            // Şartı kontrol etmek için bayrak (flag) değişkeni
            boolean sart = true;

            // Her bir sayı için diğerlerinin toplamını kontrol ediyoruz
            for (int i = 0; i < sayilar.length; i++) {
                // Diğer sayıların toplamı = genel toplam - o sayı
                int digerToplam = toplam - sayilar[i];

                // Eğer sayı, diğerlerinin yarısı değilse, şart sağlanmamıştır
                if (sayilar[i] != digerToplam / 2) {
                    sart = false;
                    break; // kontrol etmeye gerek yok, çık
                }
            }

            // Şartı sağlayan ilk sayıları bulduk, yazdır ve çık
            if (sart) {
                System.out.print("Şartı sağlayan sayılar: ");
                for (int i = 0; i < sayilar.length; i++) {
                    System.out.print(sayilar[i] + " ");
                }
                toplam-=x;
                System.out.println("\nToplam: " + toplam);
                //break;
            }
        }
	}
}