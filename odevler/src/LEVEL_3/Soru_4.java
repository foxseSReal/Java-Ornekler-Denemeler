package LEVEL_3;
import java.util.Scanner;
public class Soru_4 {

	public static void main(String[] args) {
		System.out.println("Bir cümle yazın");
		Scanner a =new Scanner(System.in);
		String cumle =a.nextLine();
		System.out.println(" Karakter sayısı= "+cumle.length());
		a.close();	
	}
}
