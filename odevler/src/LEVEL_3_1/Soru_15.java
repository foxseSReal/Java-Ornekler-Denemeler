package LEVEL_3_1;
import java.util.Scanner;
public class Soru_15 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

        // Kullanıcıdan kelime al
        System.out.print("Bir şey yazın: ");
        String girdi = a.nextLine();

        // Sayı olup olmadığını kontrol et
        if (girdi.matches("[0-9]+")) { // Sadece rakamlardan oluşuyorsa
            System.out.println("Bu bir SAYI ifadesidir.");
        } else {
            System.out.println("Bu bir STRING ifadesidir.");
        }

        a.close();

	}

}
