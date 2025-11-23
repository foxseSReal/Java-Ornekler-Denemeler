package  test2;
import java.util.*;
public class test2 {
	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		int N=0;
		while(N<1000 || N>9999)
		N=giris.nextInt();
		int ILK=N/100;
		int SON=N-(ILK*100);
		if((ILK+SON)*(ILK+SON)==N)
		System.out.println("ORİJİNAL");
		else System.out.println("ORİJİNAL DEĞİL");
		giris.close();
		}	
}