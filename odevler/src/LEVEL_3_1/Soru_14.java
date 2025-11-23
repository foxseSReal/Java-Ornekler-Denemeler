package LEVEL_3_1;
import java.util.Scanner;
public class Soru_14 {

	public static void main(String[] args) {
		 Scanner a = new Scanner(System.in);

	        // Kullanıcıdan cümleyi al
	        System.out.print("Bir cümle girin: ");
	        String cumle = a.nextLine();

	        String satir1 = "";
	        String satir2 = "";

	        // Harfleri indekslerine göre ayır
	        for (int i = 0; i < cumle.length(); i++) {
	            if (i % 2 == 0) {
	                satir1 += cumle.charAt(i) + " "; // Çift indeksler (0, 2, 4, ...)
	            } else {
	                satir2 += cumle.charAt(i) + " "; // Tek indeksler (1, 3, 5, ...)
	            }
	        }

	        // Sonucu ekrana yazdır
	        System.out.println(satir1);
	        System.out.println(satir2);

	        a.close();

	}

}
