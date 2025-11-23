package LEVEL_2;
import java.util.Scanner;
public class Soru_4 {

	public static void main(String[] args) {
		System.out.println("1.sayı");
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		System.out.println("2.sayı");
		int b=x.nextInt();
        int k=a%b;
		System.out.println("Bölünen= "+a+" Bölen= "+b+" Bölüm= " + a/b+" Kalan= "+k);
		//System.out.println("Bölen= "+b);
		//System.out.println(" Bölüm= " + a/b);
		//System.out.println(" Kalan= "+a%b);
		x.close();
	}

}
