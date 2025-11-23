package Bayram_Ödevi;
import java.util.Scanner;
public class Soru3 {

	public static void main(String[] args) {
		System.out.println("Bir Sayı Girin!");
		Scanner a =new Scanner(System.in);
		int b =a.nextInt();
		int yuzb,onb,bin,yuz,on,bir;
	/*	int onb;
		int bin;
		int yuz;
		int on;
		int bir;*/
		if(b>0) {
			if(b>999999) System.out.println("SINIRLARA UYGUN SAYI GİRİN!") ;
				
			while(b<=999999) {
				bir=b%10;
				on=(b/10)%10;
				yuz=(b/100)%10;
				bin=(b/1000)%10;
				onb=(b/10000)%10;
				yuzb=b/100000;
				System.out.println(
						" Birler:"+bir
						+"\n Onlar:"+on
						+"\n Yüzler:"+yuz
						+"\n Binler:"+bin
						+"\n Onbinler:"+onb
						+"\n Yüzbinler:"+yuzb);
			/*	System.out.println("Onlar: "+on);
				System.out.println("Yüzler: "+yuz);
				System.out.println("Binler: "+bin);
				System.out.println("Onbinler: "+onb);
				System.out.println("Yüzbinler: "+yuzb);	*/
				break;
				}
			}
		else System.out.print("Lütfen negatif sayı girmeyin");
		
		a.close();
	}
}
