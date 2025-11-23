package LEVEL_3_1;
import java.util.*;
public class Soru_17_opsiyonel {

	public static void main(String[] args) 
		throws InterruptedException {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Bir kelime giriniz: ");
	        String kelime = scanner.nextLine();
	        scanner.close();

	        int width = 80; // Terminal genişliği
	        int height = 24; // Terminal yüksekliği
	        int delay = 100; // Bekleme süresi (milisaniye)

	        // Solundan sağına kaydırma
	        for (int i = 0; i <= width - kelime.length(); i++) {
	            System.out.print("\r" + " ".repeat(i) + kelime);
	            Thread.sleep(delay);
	        }

	        // Yukarıdan aşağıya kaydırma
	        for (int i = 0; i < height; i++) {
	            clearScreen();
	            System.out.print("\r" + " ".repeat(width - kelime.length()) + kelime);
	            System.out.println();
	            Thread.sleep(delay);
	        }

	        // Sağından soluna kaydırma
	        for (int i = width - kelime.length(); i >= 0; i--) {
	            System.out.print("\r" + " ".repeat(i) + kelime);
	            Thread.sleep(delay);
	        }

	        // Aşağıdan yukarıya kaydırma
	        for (int i = height - 1; i >= 0; i--) {
	            clearScreen();
	            System.out.print("\r" + " ".repeat(width - kelime.length()) + kelime);
	            System.out.println();
	            Thread.sleep(delay);
	        }
	    }

	    private static void clearScreen() {
	        System.out.print("\033[H\033[2J");
	        System.out.flush();


	}

}
