package LEVEL_3;
import java.util.Scanner;
public class Soru_1 {

	public static void main(String[] args) {
		System.out.println("Bir cümle girin.");
		Scanner a = new Scanner(System.in);
		String N=a.nextLine();
		System.out.println("Yazdığınız cümle "+N.length()+" karakterden oluşmaktadaır.");
		a.close();
	}

}