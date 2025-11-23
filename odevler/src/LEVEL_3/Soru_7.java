package LEVEL_3;
import java.util.Scanner;
public class Soru_7 {

	public static void main(String[] args) {
		System.out.println("Bir cümle yazın");
		Scanner a=new Scanner(System.in);
		String cumle=a.nextLine();
		 for(int i=0;i<cumle.length();i++) {
			 System.out.println(cumle.substring(i,i+1));
		 }
		a.close();
	}
}
