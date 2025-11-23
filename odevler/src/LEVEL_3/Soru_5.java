package LEVEL_3;
import java.util.*;
public class Soru_5 {

	public static void main(String[] args) {
		System.out.println("Bir cümle yazın");
		Scanner a =new Scanner(System.in);
		String cumle=a.nextLine();
		String cumle1 =new StringBuilder(cumle).reverse().toString();
		System.out.println(cumle1);
		a.close();
	}
}
