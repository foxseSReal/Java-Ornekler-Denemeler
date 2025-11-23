package test2;
import java.util.Scanner;   //klavyeden veri almak için gerekli!!!!
public class test2_1_degiskenler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			String sehir;
			float num;
			Scanner giris =new Scanner(System.in) ;	
			System.out.println("Bir şehir ismi giriniz");
			sehir=giris.nextLine();
		//nextLine() String bilgiler için kullanılır.
			System.out.println("Bir sayı giriniz");
		num=giris.nextFloat();
		System.out.println("Girişini yaptığınız şehir ismi: "+sehir);
		System.out.println("Girişni yaptığınız sayı: "+num);
		giris.close();
		
		
	}

}
