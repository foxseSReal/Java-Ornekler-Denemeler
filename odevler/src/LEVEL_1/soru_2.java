package LEVEL_1;
import java.util.Scanner;
public class soru_2 {

	public static void main(String[] args) {
		int sayac=0;
		Scanner N =new Scanner(System.in);
		for (int i=1; i <21;i++) {
			System.out.println(i+".sayıyı girin");
			int b=N.nextInt();
			 if (b<30)
			 {
				 sayac++;
			 }
		}
		System.out.println(sayac+" kadar sayı 30 dan küçüktür");	
		N.close();
		
		
		
		
	}

}
