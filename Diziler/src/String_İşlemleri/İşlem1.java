package String_İşlemleri;
import java.util.Scanner;
public class İşlem1 {

	public static void main(String[] args) {
					//JAVA da String Metotları
//char ==> Sadece tek karakter barındıran değişken tipi
//String ==> İçerisinde char tipi bulundurabilen değişken tipidir.Bir ya da daha fazla karakter tipi bulunduran değişken tipi.
//lenght(); ==> String değişkenin içinde barındırdığı karakter sayısını geri döndürür.
//indexOf("Parametre"); ==>Paramterede belirtilen karakterin String içerisinde ilk defa karşılaşıldığı
	//index numarasını geri döndürür.
	//substring(başlangıç indexi-1, bitiş indexi); ==>Değişkenin başlangıç indexdesinden bitiş indexsine kadar kısmı geri döndürür.
	//toLowerCase();==> Değişkeni küçük harfe dönüştürür.
	//toUpperCase(); ==> Değişkeni büyük harfe dönüştürür.
		Scanner oku=new Scanner(System.in);
	String aylar="OcakŞubatMartNisanMayısHaziranTemmuzAğustosEylülEkimKasımAralık";	
		System.out.println(aylar.length());			//aylar Stringinin uzunlupunu bulmak istiyoruz.
		System.out.println(aylar.indexOf("Mayıs")); //Mayısın başlangıç indexini bulmak istiyoruz.
		System.out.println(aylar.substring(23,30));  //Haziranı çıkartmak istiyoruz.//İndexten başlıyor ama sonuncuyu bir fazlası vermek gereki
		System.out.println(aylar.toUpperCase());
		System.out.println(aylar.toLowerCase());
		System.out.println("Lütfen bir şehir ismi giriniz.");
		String sehir=oku.next();
		System.out.println("Girdiğiniz Şehirin harf sayısı: "+sehir.length());
		System.out.println("Girdiğiniz Şehirdeki ilk A harfi "+(sehir.toUpperCase().indexOf("A")+1)+". Sıradadır");
		System.out.println("Girdiğiniz Şehirind 3-5 arası karakterleri: "+sehir.substring(2,5));
		System.out.println("Girdiğiniz Şehirin büyük harfli yazılışı: "+sehir.toUpperCase());
		System.out.println("Girdiğiniz Şehirin büyük harfli yazılışı: "+sehir.toLowerCase());
		oku.close();
		char a =';';
		System.out.println(a);
	}

}
