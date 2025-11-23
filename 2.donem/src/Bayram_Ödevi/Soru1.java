package Bayram_Ödevi;
import java.util.Scanner;
public class Soru1 {

	
		public static void main(String[] args) {
			 Scanner a = new Scanner(System.in);
	        int[] dizi = {2,4,5,15,25,30,48,50}; // Örnek dizi
	       
	       
	        System.out.print("Bir sayı girin: ");
	        int N = a.nextInt();
	        int index = -1; // Sayı bulunursa indeksi saklayacak
	        for (int i = 0; i < dizi.length; i++) {
	            if (dizi[i] == N) {
	                index = i;
	                break;}
	        }
	        if (index != -1) {
	            System.out.println("Girilen sayı dizide mevcut: " + N);
	        } 
	        else {
	            int yakınSayı = bulYakınSayı(dizi,N);
	            System.out.println("Girilen sayı dizide yok, En yakın sayı: " + yakınSayı);
	        }

	        a.close();
	    }

	    public static int bulYakınSayı(int[] dizi, int N) {
	    	int yakın = dizi[0];
	    	int fark = Math.abs(N - yakın);
	    	int x;

	    	for (int i = 0; i < dizi.length; i++) { // Klasik for döngüsü ile diziyi dolaşıyoruz
	    	    x = Math.abs(N - dizi[i]);
	    	    if (x < fark) {	
	    	        fark = x;
	    	        yakın = dizi[i];
	    	    }
	    	}
	    	return yakın;
	}
}
