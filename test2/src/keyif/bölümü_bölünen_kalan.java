package keyif;
import java.util.Scanner;
public class bölümü_bölünen_kalan {

	public static void main(String[] args) {
		int x,y;
		System.out.println("1.sayi");
		Scanner a = new Scanner(System.in);
		x=a.nextInt();
		System.out.println("2.sayi");
		Scanner b = new Scanner(System.in);
		y=b.nextInt();
		System.out.println("Bölünen= "+x+" bölüm= "+y+" kalan= "+x%y);
		a.close();
		b.close();
	}

}
