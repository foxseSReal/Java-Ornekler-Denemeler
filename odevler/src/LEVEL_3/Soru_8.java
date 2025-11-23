package LEVEL_3;
import java.util.Scanner;
public class Soru_8 {

	public static void main(String[] args) {
		System.out.print("Bir cümle girin: ");
		Scanner a = new Scanner(System.in);
        String cumle = a.nextLine().toLowerCase();
        String sesli = "aeıioöuü";
        int sesliSayi= 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (sesli.indexOf(cumle.charAt(i)) != -1) {
            	 sesliSayi++;
            }
        }
        System.out.println("Sesli harf sayısı: " + sesliSayi);
        a.close();
	}
}
