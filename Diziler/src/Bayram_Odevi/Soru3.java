package Bayram_Odevi;

public class Soru3 {
			//Soru3: adında yada soy adının herhangi bir yerinde 
				//"er" yada "sal" bulunan kişilerin bilgilerini yaz
	public static void main(String[] args) {
		String [][] veri={ 
				{"1","Emirhan","Sal",     "65413245215"},
				{"2","Bayram Yiğit","Er","68512452215"},
				{"3","Adahan","Karadeniz",  "63913245215"},
				{"4","Rümeysa","Güven",     "38413245215"},
				{"5","Yusuf","Erdoğan",     "35413245215"},
				{"6","Hüseyin","Yüce",      "94432452155"},
				{"7","Serhat Semi","Akyüz", "90013245215"},
				{"8","Miraç","Alaca",       "15213245215"},
				{"9","Davut","Güney",       "18882545215"},
				{"10","Murat","Sezer",      "40413245215"},
				{"11","Semik","KALK",       "47413245215"}
			};
		
		for(int i=0;i<veri.length;i++) {
			if(veri[i][1].contains("er") || veri[i][1].contains("sal")
					||veri[i][1].contains("Er") || veri[i][1].contains("Sal")) {
				System.out.println("Adı= "+veri[i][1]+
									" Soyadı= "+veri[i][2]);
			}
			if(veri[i][2].contains("er") || veri[i][2].contains("sal")
					||veri[i][2].contains("Er") || veri[i][2].contains("Sal")) {
				System.out.println("Adı= "+veri[i][1]+
									" Soyadı= "+veri[i][2]);
			}
			
		}
	}

}
