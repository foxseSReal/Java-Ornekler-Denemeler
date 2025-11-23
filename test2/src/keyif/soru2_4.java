package keyif;
import java.util.Scanner;
public class soru2_4 {

	public static void main(String[] args) {
		System.out.println("1.sayı");
		Scanner a =new Scanner(System.in);
		int x=a.nextInt();
		System.out.println("2.sayı");
		int y=a.nextInt();
		System.out.println("Bölen= "+x);
		System.out.println("Bölüm= " + x/y);
		System.out.println("Kalan= "+x%y);
		a.close();

	}

}
