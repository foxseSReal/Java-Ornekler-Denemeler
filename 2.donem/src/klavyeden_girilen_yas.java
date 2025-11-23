import java.util.*;
public class klavyeden_girilen_yas {
	

	public static void main(String[] args) {
		System.out.println("BİR YAŞ GİRİNİZ");
		Scanner a=new Scanner(System.in);
		int b =a.nextInt();
		if(b<3)System.out.println("BEBEK");
		if (b>=4 & b<=15)System.out.println("ÇOCUK");
		if(b>=16& b<=18)System.out.println("ERGEN");
		if (b>=19) System.out.println("YETİŞKİN");
		a.close();
	}

}
