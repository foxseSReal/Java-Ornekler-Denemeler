package LEVEL_1;
import java.util.Scanner;
public class soru_3 {

	public static void main(String[] args) {
		int top=0;
		Scanner a = new Scanner (System.in);
	for(int i=1; i<21; i++)
	{	System.out.println(i+". Sayıyı girin");
		
		int b=a.nextInt();
		top=top+b;
	}
	System.out.println("Toplam= "+top);
	System.out.println("Ortalama= "+top/20);
	a.close();
	}
	
}
