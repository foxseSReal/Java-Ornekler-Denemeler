package LEVEL_2;
import java.util.Scanner;
public class Soru_5 {

	public static void main(String[] args) {
		System.out.println("Bir sayı girin");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		if(b%2==0)
		{
			System.out.println("Girdiğiniz sayi çifttir. --> "+b);
		}
		else
		{
			System.out.println("Girdiğiniz sayi tektir.	 -->"+b);
		}
		a.close();
	}

}
