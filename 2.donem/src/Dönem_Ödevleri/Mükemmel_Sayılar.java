package Dönem_Ödevleri;

public class Mükemmel_Sayılar {

	public static void main(String[] args) {
		for (int i=2;i<10001;i++) {
            int toplam=0;
            for (int j=1;j<=i/2;j++) {
                if (i%j==0) toplam=toplam+j; }
            if (toplam==i) System.out.println(i+" Mükemmel bir sayıdır.");
        }
	}
}