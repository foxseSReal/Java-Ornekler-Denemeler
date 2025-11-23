package keyif;
import java.util.Scanner;
public class ardışık_20sayı {

	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		System.out.println("1. sayıyı girin");
		int n=a.nextInt();
		int ek=n,eb=n;
		for	(int i=2;i<=20;i++)
		{	
			System.out.println(i+". sayıyı girin");
			
			int y=a.nextInt();
			if(y>eb)
			{
				eb=y;
			}
			else if(y<ek)
			{
				ek=y;	
			}
			
		}
		System.out.println(eb+" - "+ek);
		a.close();
		
	}

}
