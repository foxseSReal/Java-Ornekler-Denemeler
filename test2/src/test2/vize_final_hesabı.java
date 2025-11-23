package test2;
import java.util.Scanner;  //java.util.*; yazarak bütün kütüphaneyi ekledik fazla yer kaplar
public class vize_final_hesabı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	Scanner a=new Scanner(System.in);
		int v;
		int f;
		System.out.println("Vize notunuzu girin");
		v=a.nextInt();
		System.out.println("Final notunu girin");
		f=a.nextInt();
		double ort = v *40/100d + f *60/100d;
		if(ort>=60 && f>=50)
		{
			System.out.println("Dersten geçtiniz: "+ort);
		}
		else 
		{
			System.out.println("KALDI "+f);
		}
		
	
		
		String sonuc=(f>=50&&ort>=60)?"Geçtiniz "+ort:"Kaldınız "+ort;
				
		System.out.println(sonuc);
										*/
				
		//-------1 den N e kadar olan sayıların ekrana yazdıran akış diagramı ve Java kodu
		
		System.out.println("Bir sayı girin");
		Scanner a =new Scanner(System.in);
			int b;
			b=a.nextInt();		
			int toplam =0;
			for (int i = 1; i <= b; i++)
			{
				toplam=toplam+i;
			}
			System.out.println(toplam);
			a.close();
	}

}
