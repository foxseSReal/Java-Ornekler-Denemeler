package String_İşlemleri;

public class İşlem3 {

	public static void main(String[] args) {
					//String değerleri karşılaştirma
		//equals(Parametre); ==> Değişkenin parametrede verilen ifadeye eşit olup olmadığını karşılaştırlır.
		//equalsIgnoreCase(Parametre);==>Değişkenin parametrede verilen ifadeye eşit
		// olup olmadığını duyarsız şekilde karşılaştırlır.
		//startsWith(Parametre);==>Değişkenin parametrede belirtilen ifade ile başlayıp 
		//başlamadığını karşılaştırır
		//endsWith(Parametre);==>Değişkenin parametrede belirtilen ifade ile bitip bitmediğin karşılaştırır.
		//contains(Parametre);==>Değişkenin parametrede belirtilen ifadeyi içerip içermediği karşılaştırır.
		
		String [][] bilgi={ 
			{"1","Emirhan","Torun",     "65413245215"},
			{"2","Bayram Yiğit","Sütçü","68512452215"},
			{"3","Adahan","Karadeniz",  "63913245215"},
			{"4","Rümeysa","Güven",     "38413245215"},
			{"5","Yusuf","Erdoğan",     "35413245215"},
			{"6","Hüseyin","Yüce",      "94432452155"},
			{"7","Serhat Semi","Akyüz", "90013245215"},
			{"8","Miraç","Alaca",       "15213245215"},
			{"9","Davut","Güney",       "18882545215"},
			{"10","Murat","Sezen",      "40413245215"}
		};
		
		//SORU1:TC kimlik numarası "6" ile başlayan kişilerin tüm bilgilerini ekrana yazdırın.
		for(int i=0;i<bilgi.length;i++) {
				if(bilgi[i][3].startsWith("6")) {
					 System.out.println("No: " + bilgi[i][0] +
							 ", Adı: " + bilgi[i][1] +
							 ", Soyadı: " + bilgi[i][2] +
							 ", TC: " + bilgi[i][3]);
			}
		}
		System.out.println();
		
		//SORU2=İsmini ilk harfi "M" ile başlayan kişilerin ad soyadlarını ekrana yazdıran JAVA kodu...
		for(int i=0;i<bilgi.length;i++) {
			if(bilgi[i][1].startsWith("M")) {
				System.out.println("Adı: "+ bilgi[i][1]+" Soyadı: "+bilgi[i][2]);
				
			}
		}
		System.out.println();
		
		//SORU3=Soyadında "e"(Duyarsız) Harfi bulunan kişilerin ad ve soyadlarını ekrana jazdırna JAVA kodları...
		for(int i=0;i<bilgi.length;i++) {
			if(bilgi[i][2].contains("e") || bilgi[i][2].contains("E") ) {
				System.out.println("Adı: "+ bilgi[i][1]+" Soyadı: "+bilgi[i][2]);
			}
			
			
		}
		
				
	}

}
