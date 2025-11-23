package keyif;
import java.util.Scanner;
public class cift_sayı_adeti {

	 public static void main(String[] args) {
	/*	Scanner a= new Scanner(System.in);
		int b=a.nextInt();
	int s=0;
	for(int i=1;i<b;i++) {
		if(i%2==0) {
			s++;
		}
	}
	System.out.println(s+"Kadar sayı çifttir");
	a.close();  */
		 Scanner giris=new Scanner(System.in);
		 int n =0;
		 int s =0;
		 while(n<1) {
			 System.out.println("Lütfen pozitif sayı girin.");
			 n=giris.nextInt();
			 
		 }
		 for(int i=1;i<n;i++) { 
			 if(i%2==0) { 
				 s++; 
			 } 
		 } 
		 System.out.println(s+ " Adet çift sayı vardır.");
		 giris.close();
	}
	

}
