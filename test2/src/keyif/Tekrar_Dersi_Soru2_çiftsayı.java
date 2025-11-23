package keyif;
import java.util.Scanner;
public class Tekrar_Dersi_Soru2_çiftsayı {

	public static void main(String[] args) {
		System.out.println("1. sayıyı girin");
		Scanner a=new Scanner(System.in);
		int b;
		b=a.nextInt();
		int s =0;
		
		for(int i=1; i<=b; i++)
		{
			if(i%2==0)
			{
				++s;
				System.out.println(s+". - "+i);
			}
		}
		System.out.println(s+"  Adet çift sayı vardır");
		a.close();
		
	}

}
