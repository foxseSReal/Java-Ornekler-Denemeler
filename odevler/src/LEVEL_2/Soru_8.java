package LEVEL_2;
import java.util.Scanner;
public class Soru_8 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		int b=0; int cs=0,ts=0,cift=0,tek=0;
		for(int i=1;i<11;i++) {
			System.out.println(i+". Sayıyı girin");
			b=a.nextInt();
			if(b%2==0) {
				cs++;
				cift+=b;
			}

			else {
				tek+=b;
				ts++;
			}
				
				}
		System.out.println("Çift sayıların toplamı= "+cift);
		System.out.println("Tek sayıların toplamı= "+tek);
		System.out.println(ts+" Kadar tek sayı var.");
		System.out.println(cs+" Kadar çift sayı var.");
		a.close();
	}

}
