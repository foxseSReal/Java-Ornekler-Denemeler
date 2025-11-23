package LEVEL_1;
import java.util.Scanner;
public class Soru_1 {

	public static void main(String[] args) {
		System.out.println("1. Sayıyı girin");
		Scanner n =new Scanner(System.in);
		int b;
		int eb=n.nextInt();
		int ek=eb;
		for(int i=2;i<21;i++) {
			System.out.println(i+". Sayıyı girin");
			b=n.nextInt();
			if(b>eb) eb=b;
			else if(b<ek) ek=b;
		}
		System.out.println("En büyük= "+eb+"      "+"\n En küçük= "+ek);
		n.close();
		
	}

}
