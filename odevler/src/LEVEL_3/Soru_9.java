package LEVEL_3;
import java.util.Scanner;
public class Soru_9 {

	public static void main(String[] args) {
		   Scanner a = new Scanner(System.in);
	        System.out.print("Bir cümle giriniz: ");
	        String cumle = a.nextLine();
	        
	        for (int i = 1; i <= cumle.length(); i++) {
	            System.out.println(cumle.substring(0, i));
	        }
	        a.close();
	}
}