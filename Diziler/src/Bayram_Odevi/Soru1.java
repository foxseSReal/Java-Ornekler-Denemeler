package Bayram_Odevi;

public class Soru1 {
	//Soru1: adında yada soy adında a harfi taşıyan kişilerin 
	//büyük küçük önemli değil hepsini yazdır

	public static void main(String[] args) {
		String [][] veri={ 
				{"1","Emir","Torun",     "65413245215"},
				{"2","Bayram Yiğit","Sütçü","68512452215"},
				{"3","Adahan","Karadeniz",  "63913245215"},
				{"4","Rümeysa","Güven",     "38413245215"},
				{"5","Yusuf","Erdoğan",     "35413245215"},
				{"6","Hüseyin","Yüce",      "94432452155"},
				{"7","Serhat Semi","Akyüz", "90013245215"},
				{"8","Miraç","Alaca",       "15213245215"},
				{"9","Davut","Güney",       "18882545215"},
				{"10","Murat","Sezen",      "40413245215"},
				{"11","Semih","Saygıner",   "47413245215"}
			};
		for(int i=0;i<veri.length;i++) {
			if(veri[i][1].contains("a")||veri[i][1].contains("A") || 
					veri[i][2].contains("a")||veri[i][2].contains("A")) {
				System.out.println(" Adı= "+veri[i][1]
									+" Soyadı= "+veri[i][2]+
										" TC= "+veri[i][3]);
			}			
		}
	}
}