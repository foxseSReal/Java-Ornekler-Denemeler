package LEVEL_2_1;
import java.util.Scanner;
public class Soru_12 {

	public static void main(String[] args) {
		System.out.print("Bir Sayı Girin  ");
		Scanner a =new Scanner(System.in);
		int x =a.nextInt();
		int sayac = 0;
		for (int i = 2; i <= x; i++) {
			sayac=0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {	//Eğer katlarından birisi bölüyorsa asal değildir.
                					//Asalsa sadece= 1 ve Kendisine bölünürse sayaç 2 olacak.
                    sayac++;
                }
            }
		}
		 if (sayac == 2)   System.out.print(x + " Sayısı asaldır");
         else System.out.print(x+ " Sayısısı asal değil");
		 a.close();
	}
}