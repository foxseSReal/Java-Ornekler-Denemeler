package String_İşlemleri;
import java.util.Scanner;
public class İşlem2 {

	public static void main(String[] args) {
		char ch='a';
		//acaba a karakterinin ASCII kodu nedir? 
		int asciikod=ch;
		System.out.println("a:"+asciikod);
		int castascii=(int) ch;
		System.out.println("a:"+castascii);
		System.out.println("Bir isim girin");
		Scanner oku=new Scanner(System.in);
	//	int rakam=oku.nextInt();
	//	System.out.println("Girdiğiniz rakamın ascii karakteri: "+(char)rakam);
		
								/*UYGULAMA*/
		//Klavyeden girilen bir cümlenin her bir karakterini tek tek alıp büyütüp
		//yukarıdan aşağıya ekrana yazdıran Java kodunu tasarlayınız.
		String isim=oku.nextLine();
		System.out.println("Bir isim girin");
		
		for(int i =0;i<isim.length();i++) {
			System.out.println(isim.substring(i,i+1).toUpperCase());
		}
		oku.close();
	}
}
